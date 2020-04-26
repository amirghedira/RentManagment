import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;

class Agence  {
	public static Vector<String> notif = new Vector<String>();
	
	public boolean ajoutVoit(Voiture v) throws ClassNotFoundException, SQLException {
		if ((DataBase.getdatavoit(v.get_mat())) == null) {
			return true;
		}
		return false;
	}

	public int liberervoit(String mat , String kilo) throws SQLException, ClassNotFoundException {

		Voiture v;
		Location l;
		if ((v = DataBase.getdatavoit(mat)) != null) {
//			if (!(l=DataBase.getsgdataloc(mat)).getValidity()) {
			if(!v.getState()) {
				if(Double.parseDouble(kilo)<=Double.parseDouble(v.getKilo()))
					return -2;
				DataBase.disablelocData(v.get_mat());
				DataBase.updatecarDatastate(v.get_mat(), kilo, true);
				return 1;
			}
			return 0;
		}
		return -1;
	}

	public Vector<Voiture> voiturelib() {
		try {
			Vector<Voiture> v=null;
			if ((v = DataBase.getdatavoitstate(true)).isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Il n'y a aucune voiture disponible.", "Message", 1);
				return null;
			}
			else
				return v;
		} catch (SQLException | ClassNotFoundException ee) {
			JOptionPane.showMessageDialog(null, "L'application necessite un reseau internet,veuillez se connecter!","Erreur", 0);

		}
		return null;
	}

	public Vector<Location> voitureocc(boolean b) {
		Vector<Location> ens_loc=null;
		try {
			ens_loc=DataBase.getdatacuurentlocs();
			if (ens_loc.isEmpty()) {
				if(b)
				JOptionPane.showMessageDialog(null, "Il n'y a aucune voiture occupée.", "Message", 1);
			}
			return ens_loc;
		} catch (SQLException | ClassNotFoundException ee) {
			JOptionPane.showMessageDialog(null, "L'application necessite un reseau internet,veuillez se connecter!",
					"Erreur", 0);

		}
		return null;
	}

	public boolean ajusttarif(String m, double t) throws ClassNotFoundException, SQLException {
		Voiture v;
		if ((v = DataBase.getdatavoit(m)) != null) {
			DataBase.updatecarprix(m,t);
			return true;
		}
		return false;
	}

	public String editDate(int d) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		return sdf.format(c.getTime()).toString();

	}

	public boolean suppvoit(String m) throws ClassNotFoundException, SQLException {

		return DataBase.deleteData("voiture", "dbmatricule", m);
	}

	public void checknotif(JButton m) {

		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		try {
			notif  = DataBase.getNotifications();
			Collections.reverse(notif);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Vector<Location> v = voitureocc(false);
		if (v != null)
			for (int i = 0; i < v.size(); i++) {
				String mat = (v.elementAt(i).get_mat());
				if (sdf.format(c.getTime()).toString().equals(editDate(v.elementAt(i).getDuree()))) {
					boolean b = true;
					for (int j = 0; j < notif.size(); j++)
						if (notif.elementAt(j).contains(v.elementAt(i).get_mat())) {
							b = false;
						}
					if (b) {
						String s = "La location de la voiture " + mat + " par " + v.elementAt(i).getNCIN()+ " a été expiré";
						try {
							DataBase.setNotification(s);
						} catch (ClassNotFoundException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						notif.add(s);
					}
				}

			}
		if (notif.isEmpty())
			m.setText("Notification");
		else {
			m.setText("Notification (" + Agence.notif.size() + ")");
			//this is for playing a song when a notification appears
//			try {
//				FileInputStream f = new FileInputStream("notif.mp3");
//				Player player = new Player(f);
//				player.play();
//
//			} catch (FileNotFoundException | JavaLayerException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

	public static String updatetext() {
		if (!notif.isEmpty()) {
			String s = "";
			for (int i = 0; i < notif.size(); i++)
				s += notif.elementAt(i) + "\n";
			return s;
		}
		return "Aucune notification disponible pour le moment..";

	}
}