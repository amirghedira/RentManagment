import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
public class DataBase {
	     
	   public static  Connection con = null;

		static public boolean getdatacl(String ncin) throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `client` WHERE `dbncin`="+ncin;
			Statement st =con.createStatement();
			ResultSet res=st.executeQuery(query);

			if(res.next()) 
	        		{
	        			return true;
	        			
					} 
	        		return false;
	        	
	    }
		static public Vector<Client> getdataallcl() throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `client`";
			Vector<Client> ens_cl=new Vector<Client>();
			Statement st =con.createStatement();
			ResultSet res=st.executeQuery(query);

			while(res.next()) 
	        		{
	        			 ens_cl.add(new Client(res.getString(1), res.getString(2) , res.getString(3) , res.getString(4) , res.getString(5),res.getBytes(6)));
	        			
					} 
	        		return ens_cl;
	        	
	    }
		static public Voiture getdatavoit(String info) throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `voiture` WHERE `dbmatricule`=?";
			PreparedStatement ps;
			ps=con.prepareStatement(query);
			ps.setString(1, info);
			ResultSet res=ps.executeQuery();
			if(res.next())
	        		{
	        			return new Voiture(res.getString(1),res.getString(7),res.getString(2),res.getString(3),Double.parseDouble(res.getString(4)),res.getBoolean(5),res.getBytes(6));
	        			
					} 
	        		return null;
	        	
	    }
		static public Vector<Voiture> getdatavoitstate(boolean info) throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `voiture` WHERE `dbstate`=?";
			PreparedStatement ps;
			ps=con.prepareStatement(query);
			ps.setBoolean(1, info);
			ResultSet res=ps.executeQuery();
			Vector<Voiture> voit = new Vector<Voiture>();
	        		while(res.next())
	        		{
	        			voit.add(new Voiture(res.getString(1) , res.getString(7) , res.getString(2) , res.getString(3) , Double.parseDouble(res.getString(4)),res.getBoolean(5),res.getBytes(6)));
					} 
	        		return voit;	        	
	    }
		static public Vector<Voiture> getdatavoit() throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `voiture`";
			PreparedStatement ps;
			ps=con.prepareStatement(query);
			ResultSet res=ps.executeQuery();
			Vector<Voiture> voit = new Vector<Voiture>();
	        		while(res.next())
	        		{
	        			voit.add(new Voiture(res.getString(1) , res.getString(7) , res.getString(2) , res.getString(3) , Double.parseDouble(res.getString(4)),res.getBoolean(5),res.getBytes(6)));
					} 
	        		return voit;	        	
	    }
//		static public Location getsgdataloc(String info) throws SQLException,ClassNotFoundException
//		{
//			String query="SELECT * FROM `location` WHERE `dbmatricule`=?";
//			PreparedStatement ps;
//			ps=con.prepareStatement(query);
//			ps.setString(1, info);
//			ResultSet res=ps.executeQuery();
//	        		if(res.next()) 
//	        		{
//	        			return new Location(res.getString(1),res.getString(2),res.getString(10),Integer.parseInt(res.getString(3)),Double.parseDouble(res.getString(4)),res.getBoolean(11),new Client(Integer.parseInt(res.getString(5)),res.getString(6),res.getString(7),res.getString(8),res.getString(9),null));
//	        			
//					} 
//	        		return null;
//	        	
//	    }
//		static public Location getvalideloc(String info) throws SQLException,ClassNotFoundException
//		{
//			String query="SELECT * FROM `location` WHERE `dbmatricule`=?";
//			PreparedStatement ps;
//			ps=con.prepareStatement(query);
//			ps.setString(1, info);
//			ResultSet res=ps.executeQuery();
//	        		while(res.next()) 
//	        		{
//	        			if(res.getBoolean(11))
//	        			return new Location(res.getString(1),res.getString(2),res.getString(10),Integer.parseInt(res.getString(3)),Double.parseDouble(res.getString(4)),res.getBoolean(11),new Client(Integer.parseInt(res.getString(5)),res.getString(6),res.getString(7),res.getString(8),res.getString(9),null));
//	        			
//					} 
//	        		return null;
//	        	
//	    }
		static public String getclef() throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `clef`";
			PreparedStatement ps;
			ps=con.prepareStatement(query);
			ResultSet res=ps.executeQuery();
	        		if(res.next()) 
	        		{
	        			return res.getString(1);
	        			
					} 
	        		return "";
	        	
	    }
		static public Vector<Location> getdatalocs() throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `location`";
			Vector<Location> ens_loc=new Vector<Location>();
			PreparedStatement ps;
			ps=con.prepareStatement(query);
			ResultSet res=ps.executeQuery();
	        		while(res.next()) 
	        		{
	        			 ens_loc.add(
	        					 new Location(res.getString(1),res.getString(2),res.getString(6),Integer.parseInt(res.getString(3)),Double.parseDouble(res.getString(4)),res.getBoolean(7),
	        					 res.getString(5)));
	        			
					} 
	        		return ens_loc;
	        	
	    }
//		static public Vector<Location> getdatalocvalid() throws SQLException,ClassNotFoundException
//		{
//			String query="SELECT * FROM `location`";
//			Vector<Location> ens_loc=new Vector<Location>();
//			PreparedStatement ps;
//			ps=con.prepareStatement(query);
//			ResultSet res=ps.executeQuery();
//	        		while(res.next()) 
//	        		{
//	        			if(res.getBoolean(11))
//	        			 ens_loc.add(new Location(res.getString(1),res.getString(2),res.getString(10),Integer.parseInt(res.getString(3)),Double.parseDouble(res.getString(4)),res.getBoolean(11),new Client(Integer.parseInt(res.getString(5)),res.getString(6),res.getString(7),res.getString(8),res.getString(9),null)));
//	        			
//					} 
//	        		return ens_loc;
//	        	
//	    }
		static public Vector<Location> getdatacuurentlocs() throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `location` WHERE `dbvalide`=?";
			Vector<Location> ens_loc=new Vector<Location>();
			PreparedStatement ps;
			ps=con.prepareStatement(query);
			ps.setBoolean(1, true);
			ResultSet res=ps.executeQuery();
	        		while(res.next()) 
	        		{
	        			 ens_loc.add(new Location(res.getString(1),res.getString(2),res.getString(6),Integer.parseInt(res.getString(3)),Double.parseDouble(res.getString(4)),res.getBoolean(7)
	        					 ,res.getString(5)));
	        			
					} 
	        		return ens_loc;
	        	
	    }
		static public Vector<Location> getdatalocs(String n) throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM `location` WHERE `dbncin`=?";
			Vector<Location> ens_loc=new Vector<Location>();
			PreparedStatement ps;
			ps=con.prepareStatement(query);
			ps.setString(1, n);
			ResultSet res=ps.executeQuery();
	        		while(res.next()) 
	        		{

	        			 ens_loc.add(new Location(res.getString(1),res.getString(2),res.getString(6),Integer.parseInt(res.getString(3)),Double.parseDouble(res.getString(4)),res.getBoolean(7),res.getString(5)));
					} 
	        		return ens_loc;
	        	
	    }
		static public Vector<Object[]> getdatalocmat(String mat) throws SQLException,ClassNotFoundException
		{
			String query="SELECT * FROM  client C , location L WHERE C.dbncin=L.dbncin and L.dbmatricule=?";
			Vector<Object[]> ens_loc=new Vector<Object[]>();
			PreparedStatement ps;
			ps=con.prepareStatement(query);
			ps.setString(1, mat);
			ResultSet res=ps.executeQuery();
	        		while(res.next()) 
	        		{

	        			Location location =new Location(res.getString(7),res.getString(8),res.getString(12),Integer.parseInt(res.getString(9)),Double.parseDouble(res.getString(10)),res.getBoolean(13),res.getString(11));
	        			 Client client=new Client(res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getBytes(6));
	        			Object[] tab = {location,client };
	        			ens_loc.add(tab);
					} 
	        		return ens_loc;
	    }
		 static public void setdatacar(Voiture v,String path) throws SQLException,ClassNotFoundException
		{
			 
			String query="INSERT INTO `voiture`(`dbmatricule`, `dbmarque`, `dbcolor`, `dbprice`, `dbstate` , `dbphoto`, `dbkilo`) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement ps;
			InputStream is=null;
			try {
				 is = new FileInputStream(new File(path));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				ps=con.prepareStatement(query);
				ps.setString(1, v.get_mat());
				ps.setString(2, v.getMarque());
				ps.setString(3, v.getColor());
				ps.setString(4, String.valueOf(v.getTarif()));
				ps.setBoolean(5, v.getState());
				ps.setBlob(6, is);
				ps.setString(7,v.getKilo());
				ps.executeUpdate();
	 
		}
		 static public void setclef(String s) throws SQLException,ClassNotFoundException
		{
			String query=" UPDATE `clef` SET `dbclef`=?";
			PreparedStatement ps;
				ps=con.prepareStatement(query);
				ps.setString(1, s);
				ps.executeUpdate();
	 
		}
		 static public void setdataloca(Location l) throws SQLException,ClassNotFoundException
		{
			String query="INSERT INTO `location`(`dbmatricule`, `dbdate`, `dbduree` , `tarif` , `dbncin` , `dbdatefinloc` , `dbvalide`) VALUES (?,?,?,?,?,?,?)";	
			PreparedStatement ps;
				ps=con.prepareStatement(query);
				ps.setString(1,l.get_mat());
				ps.setString(2, l.getDate());
				ps.setString(3, String.valueOf(l.getDuree()));
				ps.setString(4, String.valueOf(l.getFacture()));
				ps.setString(5, String.valueOf(l.getNCIN()));
				ps.setString(6, l.getDatefin());
				ps.setString(7, "1");
			    ps.executeUpdate();
			
		}
		 static public void setdatauser(String[] info) throws ClassNotFoundException, SQLException 
		{
			String query="INSERT INTO `users`(`dbusername`, `dbpass`, `dbtype`) VALUES (?,?,?)";
			PreparedStatement ps;
				ps=con.prepareStatement(query);
				ps.setString(1, info[0]);
				ps.setString(2, info[1]);
				ps.setString(3, info[2]);
				ps.executeUpdate();
		}
		 static public void setdataclient(Client c, String path) throws SQLException,ClassNotFoundException
		{
			String query="INSERT INTO `client`(`dbncin`, `dbnom`, `dbprenom`, `dbadresse`, `dbnumtel`, `dbncinphoto`) VALUES (?,?,?,?,?,?)";
			PreparedStatement ps;
			InputStream is=null;
			try {
				 is = new FileInputStream(new File(path));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				ps=con.prepareStatement(query);
				ps.setString(1, String.valueOf(c.getNCIN()));
				ps.setString(2, c.getnom());
				ps.setString(3, c.getPrenom());
				ps.setString(4, c.getAdr());
				ps.setString(5, c.getNumtel());
				ps.setBlob(6,is);
				ps.executeUpdate();
		}
		 static public void setdatalogs(String info) throws SQLException,ClassNotFoundException
		{
			String query="INSERT INTO `logs`(`datalogs`) VALUES (?)";
			PreparedStatement ps;
				ps=con.prepareStatement(query);
				ps.setString(1, info);
				ps.executeUpdate();
		}	
		 static public Vector<String> getdatalogs() throws SQLException,ClassNotFoundException 
		 {
					String querylog = "SELECT * FROM `logs`";
					Vector<String>hist=new Vector<String>();
					Statement st = DataBase.con.createStatement();
					ResultSet reslogs;
					reslogs = st.executeQuery(querylog);
					while (reslogs.next()) {
						hist.add(reslogs.getString("datalogs"));
					}
					return hist;
		 }
		 public static void updateusersData(String name,String pass,String type,String oldname) throws SQLException,ClassNotFoundException
		 {
			 String query="UPDATE `users` SET `dbusername`=?,`dbpass`=?,`dbtype`=? WHERE `dbusername`=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, name);
				ps.setString(2, pass);
				ps.setString(3, type);
				ps.setString(4, oldname);
				ps.executeUpdate();
		 }
		 public static void disablelocData(String mat) throws SQLException,ClassNotFoundException
		 {
			 String query="UPDATE `location` SET `dbvalide`=? WHERE `dbmatricule` =? and `dbvalide`=?";
				PreparedStatement ps=con.prepareStatement(query);
				
				ps.setBoolean(1, false);
		        ps.setString(2, mat);
		        ps.setBoolean(3,true);
				ps.executeUpdate();
		 }
		 public static void updatecarprix(String mat,double t) throws SQLException,ClassNotFoundException
		 {
    	String query="UPDATE `voiture` SET `dbprice`=? WHERE `dbmatricule`=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, String.valueOf(t));
				ps.setString(2, mat);
				ps.executeUpdate();		
	 }
     public static void updatecarDatastate(String mat,String kilo,boolean state) throws SQLException,ClassNotFoundException
		 {
    	String query="UPDATE `voiture` SET `dbstate`=?,`dbkilo`=? WHERE `dbmatricule`=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setBoolean(1, state);
				ps.setString(2, kilo);
				ps.setString(3, mat);
				ps.executeUpdate();
					
		
	 }
		 public static boolean deleteData(String from ,String cond,String val) throws SQLException,ClassNotFoundException
		 {
			 String query="DELETE FROM `"+from+"` WHERE "+cond+" =?";
				 PreparedStatement ps;
					ps=con.prepareStatement(query);
					ps.setString(1, val);
					if(ps.executeUpdate()>0)
					return true;
					return false;
			 
		 }
		 public static void setNotification(String notification)  throws ClassNotFoundException, SQLException {
			 
			 String query="INSERT INTO `notification`(`notif`) VALUES (?)";
				PreparedStatement ps;
					ps=con.prepareStatement(query);
					ps.setString(1, notification);
					ps.executeUpdate();
		 }
		 public static Vector<String> getNotifications()   throws ClassNotFoundException, SQLException {
			 
			 Vector<String> ens_notif = new Vector<String>();
			 String querynotification = "SELECT * FROM  notification";
				Statement st = DataBase.con.createStatement();
					ResultSet res = st.executeQuery(querynotification);
					while (res.next()) {
					
						ens_notif.add(res.getString(1));
					}
					return ens_notif;

		 }
		 public static Vector<String[]> getuser() throws ClassNotFoundException, SQLException
		 {
			 Vector<String[]>ens_u = new Vector<String[]>();
			 String queryuser = "SELECT * FROM `users`";
				Statement st = DataBase.con.createStatement();
				ResultSet res = st.executeQuery(queryuser);
				while (res.next()) {
					String[] tab = { res.getString("dbusername"), res.getString("dbpass"),
							res.getString("dbtype") };
					ens_u.add(tab);
				}
				return ens_u;
		 }
			public static void CreateConnection() 
			{
				String dbname="WyTHyyZMHm";
				String dbuser="WyTHyyZMHm";
				String dbpass="XY2ZBRdSgO";
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.print(e.getMessage());
				}
					try {
						con = DriverManager.getConnection("jdbc:mysql://remotemysql.com/"+dbname,dbuser,dbpass);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
					System.out.print(e.getMessage());
					}
			}
			public static void CloseConnection() {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			

	}
