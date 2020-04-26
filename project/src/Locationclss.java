import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

//import javazoom.jl.decoder.JavaLayerException;
//import javazoom.jl.player.Player;

import javax.swing.ScrollPaneConstants;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListModel;

import java.awt.ComponentOrientation;
import javax.swing.JList;

class FieldIncomplete extends Exception {
	private static final long serialVersionUID = 1L;

	public FieldIncomplete() {
		super();
	}
}




public class Locationclss {

	private JFrame frame;
	private JFrame framesig;
	private JFrame frameinfocl;
	private JFrame frameinfocar;
	private JTextField saisieduree;
	private JTextField txtnom;
	private JTextField txtnumtel;
	private JTextField txtserie;
	private JTextField txtncin;
	private JTextField txtadr;
	private JTextField txtprenom;
	private JPanel addlocpan;
	private JPanel showocccarpan;
	private JPanel panellist;
	private JPanel signpan;
	private JPanel menupan;
	private JTextField textnumserie;
	private JPanel addcarpan;
	private JPanel searchclpan;
	private JPanel searchcarpan;
	private JPanel freecarpan;
	private JPanel showfreecarpan;
	private JPanel ajustpricpan;
	private JPanel loged = new JPanel();
	private JPanel carinfopan = new JPanel();
	private JPanel welcpanaft = new JPanel();
	private JPanel settingpan;
	private JPanel historypan;

	private JTextField textfnumserie;
	private JTextField textfserie;
	private JTextField textfmarq;
	private JTextField textfColor;
	private JTextField textftarf;
	private JTextField textFieldncin;
	private JButton searchbtn;
	private JButton btnNewButton;
	private JButton btnHistoriqueDeLa;
	private JButton btnHistoriqueDuClient;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnAfiichier;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel errField;
	private JLabel labelstate;
	private JLabel txtErrfield;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_19;
	private JLabel errField2;
	private JLabel txtErr;
	private JLabel txtErr2;
	private Vector<Client>ens_NCIN;
	private JLabel texterr;
	private JLabel label_1;
	private JLabel label_20;
	private JLabel labelclientdis;
	private JPanel SupVoit;
	private JTextField textserie;
	private JTextField textnumser;
	private JLabel textField_4;
	private JPanel welcpan;
	private JLabel lblMatricule_3;
	private JTable table;
	private JTable table2;
	private JList<String> list;
	private DefaultTableModel model;
	private DefaultTableModel model2;
	private DefaultTableModel modelx;
	private DefaultTableModel modelcldis;
	private DefaultTableModel modelcardis;
	private DefaultTableModel modelcarinfo;
	private DefaultTableModel modelinfocl;
	private JTextField textField_8;
	private JTextField txtnomutil;
	private JTextField txtclef;
	private JPasswordField pwdMotDePasse_1;
	private JPasswordField passwordFieldcomf;
	private JLabel labelerr;
	private JLabel lblNop;
	private String clef;
	private Vector<String[]> ens_u;
	private JPasswordField pwdMotDePasse;
	private JTextField txtnomutils;
	private String[] currentUser = new String[3];
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JLabel label_3 = new JLabel();
	private JLabel label_4 = new JLabel();
	private Date currdate = new Date();
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	private JButton freecarbtn = new JButton("           Liberer Voiture                            ");
	private JButton  clientsearchbnt = new JButton("           Chercher Client                            ");
	private JButton  showocccar = new JButton("           Voiture Occuper                        ");
	private JButton  addcarbnt = new JButton("           Ajouter Voiture                         ");
	private JButton  ajustpricbtn = new JButton("             Ajuster Prix                               ");
	private JButton  btnSupprimerVoiture = new JButton("        Supprimer Voiture                         ");
	private JButton   btnVoituresDisponibles = new JButton("        Voitures disponibles                         ");
	private JButton  showfreecarbtn = new JButton("              Voiture Libre                           ");
	private JButton addlocationbnt = new JButton("          Nouvelle Location                      ");
	private JButton  searchcarbnt = new JButton("           Chercher Voiture                        ");
	private JButton  btnClientDisponible = new JButton("           Clients disponibles                  ");
	private JPanel manageaccts;
	private JTable table_1;
	private JScrollPane scrollPane_2;
	private String m;
	private String ptype;
	private String spath;
	private JTextArea textArea;
	private JPanel notificpan;
	private JTextArea textArea_1;
	private JScrollPane scrollPane_3;
	private JScrollPane scrollPane_9 = new JScrollPane();
	private JButton mnNotification;
	private JButton mnAdministration;
	private JButton mnMenu;
	private JButton mnAcceuil;
	private JPanel menuBar;
	private JPanel connectedpan;
	private JPanel mainpan;
	private JPanel menuadmin;
	private JPanel menucompte = new JPanel();;
	private JPanel editablepan;
	private JLabel label_7;
	private JScrollPane scrollPane_1;
	private JButton mntmBilan;
	private int x = 0;
	private int y = 0;
	private boolean b;
	private boolean icon;
	private boolean userext;
	private boolean showpwd = false;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_12;
	private JLabel labelcontourUsrname;
	private JPanel panel;
	private JLabel label_13;
	private JLabel labeladdloc;
	private JLabel labelajoutv;
	private JLabel labellibvoit;
	private JLabel labelprix;
	private JLabel labelsearchcar;
	private JLabel labelshowfreec;
	private JLabel labelshowoccc;
	private JLabel labelsearchcl;
	private JLabel labelsuppvoit;
	private JLabel label_5;
	private JTextField textField_9;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JPanel bilanpan;
	private JPanel clientdispan;
	private JTable table_2;
	private JPanel voituredispan;
	private JTable table_3;
	private JLabel lblPhotoDeLa;
	private JLabel labelimage;
	private JPanel clientinfopan;
	private JLabel labelncin;
	private JTextField txtncinp;
	private JTextField txtnomp;
	private JTextField txtprenomp;
	private JTextField txtnumtelp;
	private JTextField txtadrp;
	private JTable table_4;
	private JTextField txtkilom;
	private JButton affichevoitdisp;
	private JButton affichecldisp;
	private JTextField serie;
	private JTextField txtkilo;
	private JTextField txtmarq;
	private JTextField txtcol;
	private JLabel lblPrixjour;
	private JTextField txtpr;
	private JTable table_5;
	private JScrollPane scrollPane_8;
	private JScrollPane scrollPane_7;
	private JLabel label_26;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;
	private JLabel label_33;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel label_37;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_45;
	private JLabel label_46;
	private JLabel label_47;
	private JLabel label_48;
	private JLabel label_49;
	private JLabel label_50;
	private JLabel label_51;
	private JLabel label_52;
	private JLabel label_53;
	private JLabel label_54;
	private JLabel label_55;
	private JLabel label_56;
	private JLabel label_57;
	private JLabel label_58;
	private JLabel label_59;
	private JLabel label_60;
	private JLabel label_61;
	private JLabel label_62;
	private JLabel label_63;
	private JLabel label_64;
	private JLabel label_65;
	private JLabel label_66;
	private JLabel label_67;
	private JLabel label_68;
	private JLabel label_69;
	private JLabel label_70;
	private JLabel label_71;
	private JLabel label_72;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel label_73;
	private JLabel label_74;
	private JLabel label_75;
	private JLabel label_76;
	private JLabel label_77;
	private JLabel label_78;
	private JLabel label_80;
	private JLabel label_81;
	private JLabel label_82;
	private JTextField txtkiloapre;
	private JButton btnAfficher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Locationclss window = new Locationclss();
					DataBase.CreateConnection();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Locationclss() {
		initialize();
	}

	public static void mouselistener(JTextField textf, JLabel errfield) {
		textf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				errfield.setText(null);
			}
		});
	}
	 public ImageIcon ResizeImage(String imgPath,JLabel label){
	        ImageIcon MyImage = new ImageIcon(imgPath);
	        Image img = MyImage.getImage();
	        Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
	        ImageIcon image = new ImageIcon(newImage);
	        return image;
	    }
	 public ImageIcon ResizeImage(ImageIcon imag,JLabel label){
	        
	        Image img = imag.getImage();
	        Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
	        ImageIcon image = new ImageIcon(newImage);
	        return image;
	    }


	public static void focuslistenerpass(JPasswordField passtxt, String s,JLabel errfield) {
		passtxt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (passtxt.getText().equals(s)) {
					passtxt.setText("");
					if (passtxt instanceof JPasswordField) {
						passtxt.setEchoChar('●');
					}
					passtxt.setFont(new Font("Tahoma", Font.BOLD, 13));
					passtxt.setForeground(Color.black);
				}
				passtxt.setBackground(Color.white);
				passtxt.setBorder(new LineBorder(new Color(178, 34, 34), 2));
				if(errfield.getText()!="")
				errfield.setText(null);

			}

			public void focusLost(FocusEvent e) {
				passtxt.setBorder(new LineBorder(Color.gray));
			}
		});
	}
	public static void blocktext(JTextField txtfield)
	{
		txtfield.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(!Character.isDigit(c))
					e.consume();
			}
		});
	}

	public static void focuslistenertext(JTextField txtfield, String s, JLabel errfield) {
		txtfield.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				if (txtfield.getText().equals(s)) {
					txtfield.setText("");
					txtfield.setFont(new Font("Tahoma", Font.BOLD, 13));
					txtfield.setForeground(Color.black);
				}
				txtfield.setBorder(new LineBorder(new Color(178, 34, 34), 2));
				errfield.setText(null);
				txtfield.setBackground(Color.white);
			}
			

			public void focusLost(FocusEvent e) {
				txtfield.setBorder(new LineBorder(Color.gray));
			}
		});
		txtfield.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				txtfield.setBorder(new LineBorder(new Color(178, 34, 34), 2));
				errfield.setText(null);
				txtfield.setBackground(Color.white);
			}
			
		});
		
	}

	public static void mouselistenerblur(JTextField textf, JLabel errfield) {
		textf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				errfield.setText(null);
				textf.setBorder(new LineBorder(new Color(178, 34, 34), 2));
				if (textf.isOpaque())
					textf.setOpaque(false);
			}
		});
	}

	public void connect(Agence ag) {
		boolean b = false;
		try {
			ens_u = DataBase.getuser();
			for (int i = 0; i < ens_u.size(); i++) {
				if (ens_u.elementAt(i)[0].equals(textField_8.getText())) {
					b = true;
					if (ens_u.elementAt(i)[1].equals(String.valueOf(pwdMotDePasse.getPassword()))) {
						connectedpan.setVisible(true);
						welcpan.setVisible(false);
						menuBar.setVisible(true);
						loged.setVisible(true);
						frame.setResizable(true);
						panel.setVisible(true);
						currentUser[0] = textField_8.getText();
						currentUser[1] = String.valueOf(pwdMotDePasse.getPassword());
						currentUser[2] = ens_u.elementAt(i)[2];
						txtnomutils.setText(currentUser[0]);
						mnAcceuil.setBackground(new Color(178, 34, 34));
						mnAcceuil.setText("<html><u> Acceuil </u></html>");
						mnMenu.setText(currentUser[0]);
						ag.checknotif(mnNotification);
						menuBar.setVisible(true);
						frame.setResizable(true);
						if (currentUser[2].equals("Admin") || currentUser[2].equals("Root"))
							mnAdministration.setVisible(true);
						else
							mnAdministration.setVisible(false);
						initialiser();
						Logs.setLogs("Utilisateur:"+ currentUser[0]+" s'est connecté");
						pwdMotDePasse.setText(null);

					} else {
						lblNop.setText("Mot de passe incorrect , réessayer");
						pwdMotDePasse.setOpaque(true);
						pwdMotDePasse.setBorder(new LineBorder(Color.red, 2));
					}

				}
			}
			if (!b) {
				lblNop.setText("Aucun compte avec ce nom n'est disponible");
				textField_8.setOpaque(true);
				textField_8.setBorder(new LineBorder(Color.red, 2));
			}
		} catch (SQLException | ClassNotFoundException ee) {
			JOptionPane.showMessageDialog(frame, "L'application necessite un reseau internet,veuillez se connecter!",
					"Erreur", 0);

		}
		Locationclss.mouselistenerblur(textField_8, lblNop);
		Locationclss.mouselistenerblur(pwdMotDePasse, lblNop);
	}

	public void initialiser() {
		if (Agence.notif.isEmpty())
			mnNotification.setText("Notification");
		else
			mnNotification.setText("Notification (" + Agence.notif.size() + ")");
		mnAdministration.setText("Administration");
		mnAcceuil.setText("<html><u> Acceuil </u></html>");
		mnAcceuil.setBackground(new Color(178, 34, 34));
		mnAdministration.setBackground(new Color(40, 39, 38));
		mnMenu.setBackground(new Color(40, 39, 38));
		mnNotification.setBackground(new Color(40, 39, 38));
		mnMenu.setText(currentUser[0]);
		freecarbtn.setBorder(null);
		freecarbtn.setFocusable(false);
		clientsearchbnt.setBorder(null);
		clientsearchbnt.setFocusable(false);
		showocccar.setFocusable(false);
		showocccar.setBorder(null);
		addcarbnt.setBorder(null);
		addcarbnt.setFocusable(false);
		ajustpricbtn.setFocusable(false);
		ajustpricbtn.setBorder(null);
		btnSupprimerVoiture.setFocusable(false);
		btnSupprimerVoiture.setBorder(null);
		showfreecarbtn.setFocusable(false);
		showfreecarbtn.setBorder(null);
		btnClientDisponible.setBorder(null);
		btnClientDisponible.setFocusable(false);
		addlocationbnt.setBorder(null);
		searchcarbnt.setBorder(null);
		searchcarbnt.setFocusable(false);
		btnVoituresDisponibles.setFocusable(false);
		btnVoituresDisponibles.setBorder(null);
		addlocationbnt.setForeground(Color.WHITE);
		addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
		addcarbnt.setForeground(Color.WHITE);
		addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
		clientsearchbnt.setForeground(Color.WHITE);
		clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
		searchcarbnt.setForeground(Color.WHITE);
		searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
		freecarbtn.setForeground(Color.WHITE);
		freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		ajustpricbtn.setForeground(Color.WHITE);
		ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimerVoiture.setForeground(Color.WHITE);
		btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoituresDisponibles.setForeground(Color.WHITE);
		showocccar.setForeground(Color.WHITE);
		showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
		showfreecarbtn.setForeground(Color.WHITE);
		showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClientDisponible.setForeground(Color.WHITE);
		btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
		addlocationbnt.setOpaque(false);
		addlocationbnt.setFocusable(false);
		addcarbnt.setOpaque(false);
		clientsearchbnt.setOpaque(false);
		searchcarbnt.setOpaque(false);
		freecarbtn.setOpaque(false);
		ajustpricbtn.setOpaque(false);
		btnSupprimerVoiture.setOpaque(false);
		btnVoituresDisponibles.setOpaque(false);
		btnClientDisponible.setOpaque(false);
		showocccar.setOpaque(false);
		showfreecarbtn.setOpaque(false);
		ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
		showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
		clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
		addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
		searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
		freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
		addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
		btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
		btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
		showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
		showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
		btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));
		mainpan.setVisible(true);
		welcpanaft.setVisible(true);
		notificpan.setVisible(false);
		settingpan.setVisible(false);
		historypan.setVisible(false);
		manageaccts.setVisible(false);
		bilanpan.setVisible(false);
		welcpanaft.setVisible(true);
		addlocpan.setVisible(false);
		clientdispan.setVisible(false);
		addcarpan.setVisible(false);
		voituredispan.setVisible(false);
		searchclpan.setVisible(false);
		showfreecarpan.setVisible(false);
		showocccarpan.setVisible(false);
		searchcarpan.setVisible(false);
		freecarpan.setVisible(false);
		SupVoit.setVisible(false);
		welcpanaft.setVisible(false);
		showfreecarpan.setVisible(false);
		ajustpricpan.setVisible(false);
		textField_2.setText(null);
		textField_3.setText(null);
		textField.setText(null);
		textField_1.setText(null);
		textFieldncin.setText(null);
		textfserie.setText(null);
		textfnumserie.setText(null);
		textfmarq.setText(null);
		textfColor.setText(null);
		textftarf.setText(null);
		txtserie.setText(null);
		textnumserie.setText(null);
		saisieduree.setText(null);
		textField_2.setText(null);
		textField_3.setText(null);
		textnumser.setText(null);
		textserie.setText(null);
		txtncin.setText(null);
		txtnom.setText(null);
		txtprenom.setText(null);
		txtadr.setText(null);
		txtnumtel.setText(null);
		txtErrfield.setText(null);
		txtkilom.setText(null);
		errField.setText(null);
		errField2.setText(null);
		txtErr.setText(null);
		txtErr2.setText(null);
		texterr.setText(null);
		textField_4.setText(null);
		textField_7.setText(null);
		textField_5.setText(null);
		textField_6.setText(null);
		label_3.setText(null);
		label_4.setText(null);
		lblNop.setText(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Agence ag = new Agence();
		ens_u = new Vector<String[]>();
		frame = new JFrame("Géstionnaire de location");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
			try {
				Logs.setLogs("Utilisateur:"+ currentUser[0]+" s'est déconnecté");
				System.exit(0);
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(frame,"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);
				System.exit(0);
			}
			frame.setDefaultCloseOperation(0);
			}
		});
		framesig = new JFrame("Crée un Compte");
		frameinfocl = new JFrame("Infomation du client");
		frameinfocar=new JFrame("Information de la vehicule");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images\\frameicon.png"));
		frameinfocar.setIconImage(Toolkit.getDefaultToolkit().getImage("images\\frameicon.png"));
		framesig.setIconImage(Toolkit.getDefaultToolkit().getImage("images\\frameicon.png"));
		frameinfocl.setIconImage(Toolkit.getDefaultToolkit().getImage("images\\frameicon.png"));
		mnNotification = new JButton();
		mnNotification.setBounds(149, 0, 138, 53);
		mnNotification.setFocusable(false);
		JButton mntmHistorique = new JButton("Historique");
		mntmHistorique.setBounds(0, 0, 171, 35);
		mntmHistorique.setFocusable(false);
		mntmHistorique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Agence.notif.isEmpty())
					mnNotification.setText("Notification");
				else
					mnNotification.setText("Notification (" + Agence.notif.size() + ")");
				mnMenu.setText(currentUser[0]);
				mnAdministration.setText("<html><u> Administrations </u></html>");
				mnAcceuil.setText("Acceuil");
				mnAdministration.setBackground(new Color(178, 34, 34));
				mnMenu.setBackground(new Color(40, 39, 38));
				mnAcceuil.setBackground(new Color(40, 39, 38));
				mnNotification.setBackground(new Color(40, 39, 38));
				manageaccts.setVisible(false);
				bilanpan.setVisible(false);
				settingpan.setVisible(false);
				historypan.setVisible(true);
				notificpan.setVisible(false);
				mainpan.setVisible(false);
				menuadmin.setVisible(false);
	
			}
		});
		mntmHistorique.setForeground(Color.WHITE);
		mntmHistorique.setBackground(new Color(40, 39, 38));
		mntmHistorique.setBorder(null);
		JButton mntmParametre = new JButton("Paramétre");
		mntmParametre.setBounds(0, 0, 171, 35);
		mntmParametre.setFocusable(false);
		mntmParametre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				manageaccts.setVisible(false);
				settingpan.setVisible(true);
				bilanpan.setVisible(false);
				historypan.setVisible(false);
				notificpan.setVisible(false);
				mainpan.setVisible(false);
				menucompte.setVisible(false);
				if (Agence.notif.isEmpty())
					mnNotification.setText("Notification");
				else
					mnNotification.setText("Notification (" + Agence.notif.size() + ")");
				mnAdministration.setText("Administrations");
				mnMenu.setText("<html><u>" +currentUser[0]+" </u></html>");
				mnAcceuil.setText("Acceuil");
				mnMenu.setBackground(new Color(178, 34, 34));
				mnAdministration.setBackground(new Color(40, 39, 38));
				mnAcceuil.setBackground(new Color(40, 39, 38));
				mnNotification.setBackground(new Color(40, 39, 38));

			}
		});
		mntmParametre.setBackground(new Color(40, 39, 38));
		mntmParametre.setForeground(Color.WHITE);
		mntmParametre.setBorder(null);
		JButton dec = new JButton("Déconnexion");
		dec.setBounds(0, 36, 171, 35);
		dec.setFocusable(false);
		dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				label_1.setIcon(new ImageIcon("images\\showpw.png"));
				textField_8.setText("Nom d'utilisateur");
				textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
				textField_8.setForeground(Color.gray);
				textField_8.setOpaque(false);
				pwdMotDePasse.setText("Mot de passe");
				pwdMotDePasse.setForeground(Color.gray);
				pwdMotDePasse.setOpaque(false);
				pwdMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 13));
				pwdMotDePasse.setEchoChar((char) 0);
				manageaccts.setVisible(false);
				settingpan.setVisible(false);
				historypan.setVisible(false);
				bilanpan.setVisible(false);
				notificpan.setVisible(false);
				mainpan.setVisible(false);
				connectedpan.setVisible(false);
				welcpan.setVisible(true);
				menucompte.setVisible(false);
				menuBar.setVisible(false);
				frame.setResizable(false);
				initialiser();
				Logs.setLogs("Utilisateur:"+ currentUser[0]+" s'est déconnecté");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		dec.setBackground(new Color(40, 39, 38));
		dec.setForeground(Color.WHITE);
		dec.setBackground(new Color(40, 39, 38));
		dec.setBorder(null);
		mnMenu = new JButton(currentUser[0]);
		mnMenu.setBounds(309, 0, 138, 53);
		mnMenu.setFont(new Font("Tahoma", Font.BOLD, 11));
		mnMenu.setFocusable(false);
		mnAcceuil = new JButton("Acceuil");
		mnAcceuil.setFocusable(false);
		mnAcceuil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (mainpan.isVisible())
					mnAcceuil.setBackground(mnAcceuil.getBackground());
				else
					mnAcceuil.setBackground(new Color(64, 63, 63));
			}

			public void mouseExited(MouseEvent e) {
				if (mainpan.isVisible())
					mnAcceuil.setBackground(mnAcceuil.getBackground());
				else
					mnAcceuil.setBackground(new Color(40, 39, 38));
			}
		});
		btnClientDisponible.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				addlocationbnt.setForeground(Color.WHITE);
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.black);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 12));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(true);
				labelclientdis.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\clientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				labelclientdis.setOpaque(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				labelclientdis.setOpaque(false);
			}
		});
		mnAcceuil.setBounds(0, 0, 120, 53);
		mnAcceuil.setFont(new Font("Tahoma", Font.BOLD, 11));
		mnNotification.setFont(new Font("Tahoma", Font.BOLD, 11));
		mnAdministration = new JButton("Administration");
		mntmBilan = new JButton("Bilan");
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setColumns(10);
		mntmBilan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				manageaccts.setVisible(false);
				settingpan.setVisible(false);
				historypan.setVisible(false);
				notificpan.setVisible(false);
				mainpan.setVisible(false);
				menuadmin.setVisible(false);
				bilanpan.setVisible(true);
				double somme=0;
				try {
					Vector<Location>ens_loc=DataBase.getdatalocs();
					String s="";
					for(int i=0;i<ens_loc.size();i++)
					{
						s+="L"+ens_loc.elementAt(i).getDate()+" la voiture "+ens_loc.elementAt(i).get_mat()+" a été louer pour une facture:"+ens_loc.elementAt(i).getFacture()+"\n";
						somme+= ens_loc.elementAt(i).getFacture();
						
					}
					textArea_2.setText(s+"Totale des sommes: "+somme);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				
			}
			
			
		}
		);
		mnAdministration.setBounds(482, 0, 155, 53);
		mnAdministration.setFocusPainted(false);
		mnAdministration.setFont(new Font("Tahoma", Font.BOLD, 11));
		JButton mntmGrerlescompte = new JButton("Gérer les comptes");
		mntmGrerlescompte.setBounds(0, 36, 171, 35);
		mntmGrerlescompte.setFocusable(false);
		JButton btnSeConnecter = new JButton("Se connecter");
		btnSeConnecter.setBounds(453, 493, 125, 35);
		btnSeConnecter.setFocusable(false);
		btnSeConnecter.setForeground(Color.white);
		btnSeConnecter.setBackground(new Color(178,34,34));
		btnSeConnecter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSeConnecter.setBorder(null);
		JButton btnCre = new JButton("S'inscrire");
		btnCre.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCre.setFocusable(false);
		btnCre.setForeground(Color.WHITE);
		btnCre.setBackground(new Color(178, 34, 34));
		btnCre.setBounds(59, 406, 249, 34);
		btnCre.setBorder(null);
		mntmGrerlescompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					ens_u = DataBase.getuser();
					menuadmin.setVisible(false);
					modelx = new DefaultTableModel(new Object[][] {},
							new String[] { "Utilisateur", "Mot de passe", "Accés" });
					table_1.setModel(modelx);
					for (int i = 0; i < ens_u.size(); i++) {

						Object[] row = new Object[3];
						row[0] = ens_u.elementAt(i)[0];
						row[1] = ens_u.elementAt(i)[1];
						row[2] = ens_u.elementAt(i)[2];

						modelx.addRow(row);
					}
				} catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame,"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
				if (Agence.notif.isEmpty())
					mnNotification.setText("Notification");
				else
					mnNotification.setText("Notification (" + Agence.notif.size() + ")");
				mnMenu.setText(currentUser[0]);
				mnAdministration.setText("<html><u> Administrations </u></html>");
				mnAdministration.setBackground(new Color(178, 34, 34));
				mnMenu.setBackground(new Color(40, 39, 38));
				mnAcceuil.setBackground(new Color(40, 39, 38));
				mnNotification.setBackground(new Color(40, 39, 38));
				mnAcceuil.setText("Acceuil");
				manageaccts.setVisible(true);
				bilanpan.setVisible(false);
				settingpan.setVisible(false);
				historypan.setVisible(false);
				notificpan.setVisible(false);
				mainpan.setVisible(false);

			}
		});
		mntmGrerlescompte.setBackground(new Color(40, 39, 38));
		mntmGrerlescompte.setFont(new Font("Tahoma", Font.BOLD, 11));
		mntmGrerlescompte.setForeground(Color.WHITE);
		mntmGrerlescompte.setBorder(null);
		mntmGrerlescompte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menuadmin.setVisible(true);
				mntmGrerlescompte.setBackground(new Color(64, 63, 63));
			}

			public void mouseExited(MouseEvent e) {
				menuadmin.setVisible(false);
				mntmGrerlescompte.setBackground(new Color(40, 39, 38));
			}
		});
		mntmBilan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menuadmin.setVisible(true);
				mntmBilan.setBackground(new Color(64, 63, 63));
			}

			public void mouseExited(MouseEvent e) {
				menuadmin.setVisible(false);
				mntmBilan.setBackground(new Color(40, 39, 38));
			}
		});
		framesig.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ee) {
				labelerr.setText(null);
				txtclef.setText(null);
				passwordFieldcomf.setText(null);
				pwdMotDePasse_1.setText(null);
				txtnomutil.setText(null);
			}
		});
		frameinfocar.addWindowListener(new WindowAdapter() { // amir
			public void windowClosing(WindowEvent ee) {
				frameinfocar.dispose();
				icon=true;
				scrollPane_8.setVisible(false);
				table_5.setVisible(false);
				btnHistoriqueDeLa.setVisible(false);
				label_22.setIcon(new  ImageIcon("images\\officon.png"));
				table_5.setModel(modelcarinfo=new DefaultTableModel(null, new String[] { "Date de Location","Date fin de location","durée", "NCIN du locataire", "Nom", "prénom","Num Telephone" }));
			}

		});
		frameinfocl.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ee) {
				frameinfocl.dispose();
				icon=true;
				scrollPane_7.setVisible(false);
				table_4.setVisible(false);
				btnHistoriqueDuClient.setVisible(false);
				label_23.setIcon(new  ImageIcon("images\\officon.png"));
				table_4.setModel(modelinfocl=new DefaultTableModel(null, new String[] { "Matricule", "date de location","date fin de location", "durée", "facture" }));
			}

		});
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			
			

		} catch (Exception e) {
		}
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		welcpan = new JPanel();
		welcpan.setFocusable(true);
		frame.getContentPane().add(welcpan, "name_717388709148939");
		welcpan.setVisible(true);

		welcpan.setBackground(Color.RED);
		lblNop = new JLabel("");
		lblNop.setBounds(333, 466, 373, 28);
		lblNop.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNop.setHorizontalAlignment(SwingConstants.CENTER);
		lblNop.setForeground(new Color(255, 0, 0));

		btnSeConnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				connect(ag);
			}

		});

		JLabel lblNewLabel_13 = new JLabel("Vous faite partie de l'agenceتونس, Crée un compte en cliquant ici");
		lblNewLabel_13.setBounds(302, 661, 444, 22);
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framesig.setResizable(false);
				framesig.setLocation(140, 140);
				framesig.setVisible(true);
				framesig.setSize(373, 473);
				framesig.getContentPane().setLayout(new CardLayout(0, 0));
				framesig.getContentPane().add(signpan, "name_37723043014788");
				txtnomutil.setText("Nom d'utilisateur");
				pwdMotDePasse_1.setText("Mot de passe");
				passwordFieldcomf.setText("Comfirmer le mot de passe");
				txtclef.setText("Clé de validation");
				txtnomutil.setBorder(new LineBorder(Color.gray));
				txtnomutil.setCaretColor(Color.BLACK);
				txtnomutil.setFont(new Font("Tahoma", Font.PLAIN, 13));
				txtnomutil.setBounds(72, 161, 219, 34);
				txtnomutil.setForeground(Color.gray);
				txtnomutil.setColumns(10);
				pwdMotDePasse_1.setCaretColor(Color.BLACK);
				pwdMotDePasse_1.setBorder(new LineBorder(Color.gray));
				pwdMotDePasse_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
				pwdMotDePasse_1.setEchoChar((char)0);
				pwdMotDePasse_1.setBounds(72, 216, 219, 34);
				pwdMotDePasse_1.setForeground(Color.gray);
				passwordFieldcomf.setCaretColor(Color.BLACK);
				passwordFieldcomf.setEchoChar((char)0);
				passwordFieldcomf.setBorder(new LineBorder(Color.gray));
				passwordFieldcomf.setFont(new Font("Tahoma", Font.PLAIN, 13));
				passwordFieldcomf.setBounds(72, 273, 219, 34);
				passwordFieldcomf.setForeground(Color.gray);
				txtclef.setCaretColor(Color.BLACK);
				txtclef.setBorder(new LineBorder(Color.gray));
				txtclef.setFont(new Font("Tahoma", Font.PLAIN, 13));
				txtclef.setBounds(72, 331, 219, 34);
				txtclef.setForeground(Color.gray);
				txtclef.setColumns(10);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_13.setForeground(new Color(227, 12, 12));
			}

			public void mouseExited(MouseEvent e) {
				lblNewLabel_13.setForeground(new Color(178,34,34));
			}
		});
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setForeground(new Color(178,34,34));

		label_8 = new JLabel("");
		label_8.setBounds(372, 289, 38, 35);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setIcon(new ImageIcon("images\\usernameico.png"));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(458, 337, 115, 9);
		separator.setForeground(Color.WHITE);
		separator.setBackground(Color.WHITE);
								textField_8 = new JTextField("Nom d'utilisateur");
								textField_8.setBounds(415, 289, 207, 35);
								textField_8.setHorizontalAlignment(SwingConstants.CENTER);
								textField_8.setCaretColor(Color.BLACK);
								textField_8.setOpaque(false);
								textField_8.setBackground(new Color(252, 194, 185));
								textField_8.setBorder(null);
								textField_8.setForeground(Color.gray);
								textField_8.addFocusListener(new FocusAdapter() {
									@Override
									public void focusGained(FocusEvent e) {
										if (textField_8.getText().equals("Nom d'utilisateur")) {
											textField_8.setText("");
											textField_8.setFont(new Font("Tahoma", Font.BOLD, 13));
											textField_8.setForeground(Color.black);
										}
										textField_8.setBorder(new LineBorder(new Color(178, 34, 34),2));
									}
									public void focusLost(FocusEvent e)
									{
										textField_8.setBorder(null);
									}
								});
								textField_8.addKeyListener(new KeyAdapter() {
									@Override
									public void keyPressed(KeyEvent e) {
										if (e.getKeyCode() == KeyEvent.VK_ENTER) {
											connect(ag);
										}
									}
								});
								
										textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
										textField_8.setColumns(10);
								
									    label_1 = new JLabel("");
									    label_1.setBounds(624, 357, 35, 35);
									    label_1.setHorizontalAlignment(SwingConstants.CENTER);
									    label_1.addMouseListener(new MouseAdapter() {
									    	@Override
									    	public void mouseClicked(MouseEvent e) {
									    		if (!pwdMotDePasse.getText().equals("Mot de passe"))
									    			if (!showpwd) {
									    				label_1.setIcon(new ImageIcon("images\\hidepw.png"));
									    				pwdMotDePasse.setEchoChar((char) 0);
									    				showpwd = true;
									    			} else {
									    				label_1.setIcon(new ImageIcon("images\\showpw.png"));
									    				pwdMotDePasse.setEchoChar('●');
									    				showpwd = false;
									    			}

									    	}
									    });
									    label_1.setIcon(new ImageIcon("images\\showpw.png"));
								
										label_9 = new JLabel("");
										label_9.setBounds(372, 357, 38, 35);
										label_9.setHorizontalAlignment(SwingConstants.CENTER);
										label_9.setIcon(new ImageIcon("images\\passicon.png"));
								pwdMotDePasse = new JPasswordField("Mot de passe");
								pwdMotDePasse.setEchoChar((char)0);
								pwdMotDePasse.setBounds(415, 357, 207, 35);
								pwdMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
								pwdMotDePasse.setCaretColor(Color.BLACK);
								pwdMotDePasse.setOpaque(false);
								pwdMotDePasse.setForeground(Color.GRAY);
								pwdMotDePasse.setBorder(null);
								pwdMotDePasse.setBackground(new Color(252, 194, 185));
								pwdMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 13));
								pwdMotDePasse.addFocusListener(new FocusAdapter() {
									@Override
									public void focusGained(FocusEvent e) {
										if (pwdMotDePasse.getText().equals("Mot de passe")) {
											pwdMotDePasse.setText("");
											pwdMotDePasse.setEchoChar('●');
											pwdMotDePasse.setFont(new Font("Tahoma", Font.BOLD, 13));
											pwdMotDePasse.setForeground(Color.black);
										}
										pwdMotDePasse.setBorder(new LineBorder(new Color(178, 34, 34), 2));

									}

									public void focusLost(FocusEvent e) {
										pwdMotDePasse.setBorder(new LineBorder(Color.LIGHT_GRAY));
									}
								});
								pwdMotDePasse.addKeyListener(new KeyAdapter() {
									@Override
									public void keyPressed(KeyEvent e) {
										if (e.getKeyCode() == KeyEvent.VK_ENTER) {
											connect(ag);
										}
									}
								});
								
								lblNewLabel_14 = new JLabel("");
								lblNewLabel_14.setBounds(0, 0, 1041, 693);
								lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
								lblNewLabel_14.setIcon(new ImageIcon("images\\loginimage.jpg"));
								
	    labelcontourUsrname = new JLabel("");
	    labelcontourUsrname.setBounds(372, 289, 287, 35);
	    labelcontourUsrname.setOpaque(true);

	    labelcontourUsrname.setBackground(new Color(255, 255, 255, 200));
								
								label_12 = new JLabel("");
								label_12.setBounds(372, 357, 287, 35);
								label_12.setOpaque(true);
								label_12.setBackground(new Color(255, 255, 255, 200));
								welcpan.setLayout(null);
								welcpan.add(textField_8);
								welcpan.add(separator);
								welcpan.add(lblNop);
								welcpan.add(lblNewLabel_13);
								welcpan.add(label_1);
								welcpan.add(label_8);
								welcpan.add(label_9);
								welcpan.add(pwdMotDePasse);
								welcpan.add(label_12);
								welcpan.add(btnSeConnecter);
								welcpan.add(labelcontourUsrname);
								welcpan.add(lblNewLabel_14);
		signpan = new JPanel();
		signpan.setFocusable(true);
		frame.getContentPane().add(signpan, "name_717388789057172");
		signpan.setBackground(new Color(235, 235, 235));
		labelerr = new JLabel("");
		labelerr.setBounds(23, 381, 303, 25);
		labelerr.setHorizontalAlignment(SwingConstants.CENTER);
		labelerr.setForeground(Color.RED);
		labelerr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnCre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean b = false;
				try {
					ens_u = DataBase.getuser();
     				clef= DataBase.getclef();
					if (pwdMotDePasse_1.getPassword().equals(null) || txtnomutil.getText().equals("")
							|| txtclef.getText().equals("") || passwordFieldcomf.getPassword().equals(null))
						throw new FieldIncomplete();

					for (int i = 0; i < ens_u.size(); i++)
						if (ens_u.elementAt(i)[0].equals(txtnomutil.getText()))
							b = true;
					if (!b) {
						if (String.valueOf(pwdMotDePasse_1.getPassword())
								.equals(String.valueOf(passwordFieldcomf.getPassword()))) {
							if (txtclef.getText().equals(clef)) {
								String flag;
								if (ens_u.isEmpty())
									flag = "Root";
								else
									flag = "Utilisateur";
								String[] s = { txtnomutil.getText(), String.valueOf(pwdMotDePasse_1.getPassword()),
										flag };
								DataBase.setdatauser(s);
								ens_u.add(s);
								labelerr.setForeground(Color.green);
								labelerr.setText("Le compte a été ajouter");
								txtclef.setText(null);
								passwordFieldcomf.setText(null);
								pwdMotDePasse_1.setText(null);
								txtnomutil.setText(null);
							} else {
								labelerr.setForeground(Color.red);
								labelerr.setText("La cléf de validation est incorrect ");
								txtclef.setBorder(new LineBorder(Color.red,2));
								txtclef.setBackground(new Color(252, 194, 185));
								
							}
						} else {
							labelerr.setForeground(Color.red);
							labelerr.setText("les mots de passe ne correspondent pas. réessayer");
						pwdMotDePasse_1.setBorder(new LineBorder(Color.red,2));
						pwdMotDePasse_1.setBackground(new Color(252, 194, 185));
						passwordFieldcomf.setBorder(new LineBorder(Color.red,2));
						passwordFieldcomf.setBackground(new Color(252, 194, 185));
						}
					} else {
						labelerr.setForeground(Color.red);
						labelerr.setText("Ce compte existe deja.");
						txtnomutil.setBorder(new LineBorder(Color.red,2));
						txtnomutil.setBackground(new Color(252, 194, 185));
					}

				} catch (FieldIncomplete E) {
					labelerr.setForeground(Color.red);
					labelerr.setText("Remplir toutes les informations.");
				} catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}
		});
		signpan.setLayout(null);
		signpan.add(labelerr);
		signpan.add(btnCre);
		txtclef = new JTextField("Clé de validation");
		Locationclss.focuslistenertext(txtclef, "Clé de validation",labelerr);
		signpan.add(txtclef);
		
				txtnomutil = new JTextField("Nom d'utilisateur");
				Locationclss.focuslistenertext(txtnomutil, "Nom d'utilisateur",labelerr);
				signpan.add(txtnomutil);
				pwdMotDePasse_1=new JPasswordField("Mot de passe");
						Locationclss.focuslistenerpass(pwdMotDePasse_1,"Mot de passe",labelerr);
						signpan.add(pwdMotDePasse_1);

								passwordFieldcomf = new JPasswordField("Comfirmer le mot de passe");
								Locationclss.focuslistenerpass(passwordFieldcomf,"Comfirmer le mot de passe",labelerr);
								signpan.add(passwordFieldcomf);
								
								label_5 = new JLabel("");
								label_5.setIcon(new ImageIcon("images\\newaccicon.png"));
								label_5.setBounds(123, 25, 113, 113);
								signpan.add(label_5);

		connectedpan = new JPanel();
		connectedpan.setOpaque(false);
		frame.getContentPane().add(connectedpan, "name_741656454510923");

		menuadmin = new JPanel();
		menuadmin.setBorder(null);
		menuadmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menuadmin.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menuadmin.setVisible(false);
			}
		});
		menuadmin.setVisible(false);
		mntmHistorique.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				mntmHistorique.setBackground(new Color(64, 63, 63));
				menuadmin.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menuadmin.setVisible(false);
				mntmHistorique.setBackground(new Color(40, 39, 38));
			}
		});

		menucompte.setBorder(null);
		menucompte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menucompte.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menucompte.setVisible(false);
			}
		});
		menucompte.setVisible(false);
		mntmParametre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				mntmParametre.setBackground(new Color(64, 63, 63));
				menucompte.setVisible(true);
			}

			public void mouseExited(MouseEvent e) {
				menucompte.setVisible(false);
				mntmParametre.setBackground(new Color(40, 39, 38));

			}
		});
		dec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				menucompte.setVisible(true);
				dec.setBackground(new Color(64, 63, 63));
			}

			public void mouseExited(MouseEvent e) {
				menucompte.setVisible(false);
				dec.setBackground(new Color(40, 39, 38));

			}
		});
		mnAdministration.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuadmin.setVisible(true);
				}
			public void mouseEntered(MouseEvent e)
			{
				if (historypan.isVisible() || manageaccts.isVisible())
					mnAdministration.setBackground(mnAdministration.getBackground());
				else
					mnAdministration.setBackground(new Color(64, 63, 63));
			}

			public void mouseExited(MouseEvent e) {
				if (historypan.isVisible() || manageaccts.isVisible())
					mnAdministration.setBackground(mnAdministration.getBackground());
				else
					mnAdministration.setBackground(new Color(40, 39, 38));
				menuadmin.setVisible(false);
			}

		});
		mnAdministration.setBorder(null);

		mnMenu.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				menucompte.setVisible(true);
			}
			public void mouseEntered(MouseEvent e)
			{
				if (settingpan.isVisible())
					mnMenu.setBackground(mnMenu.getBackground());
				else
				mnMenu.setBackground(new Color(64, 63, 63));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				menucompte.setVisible(false);
				if (settingpan.isVisible())
					mnMenu.setBackground(mnMenu.getBackground());
				else
					mnMenu.setBackground(new Color(40, 39, 38));
			}
		});
		mnMenu.setBorder(null);
		mnAcceuil.setBorder(null);

		mnAcceuil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				initialiser();
			}
		});

		mnNotification.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manageaccts.setVisible(false);
				settingpan.setVisible(false);
				historypan.setVisible(false);
				bilanpan.setVisible(false);
				notificpan.setVisible(true);
				mainpan.setVisible(false);
				menuadmin.setVisible(false);
				textArea_1.setText(Agence.updatetext());
				mnNotification.setText("<html><u>" + mnNotification.getText() + "</u></html>");
				mnAdministration.setText("Administrations");
				mnAcceuil.setText("Acceuil");
				mnMenu.setText(currentUser[0]);
				mnNotification.setBackground(new Color(178, 34, 34));
				mnMenu.setBackground(new Color(40, 39, 38));
				mnAcceuil.setBackground(new Color(40, 39, 38));
				mnAdministration.setBackground(new Color(40, 39, 38));

			}
		});
		mnNotification.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (notificpan.isVisible())
					mnNotification.setBackground(mnNotification.getBackground());
				else
					mnNotification.setBackground(new Color(64, 63, 63));
			}

			public void mouseExited(MouseEvent e) {
				if (notificpan.isVisible())
					mnNotification.setBackground(mnNotification.getBackground());
				else
					mnNotification.setBackground(new Color(40, 39, 38));
			}
		});
		mnNotification.setBorder(null);

		menuBar = new JPanel();
		menuBar.setVisible(false);
		menuBar.setBackground(new Color(40, 39, 38));
		mnAcceuil.setIcon(new ImageIcon("images\\acceuil.png"));
		mnAcceuil.setForeground(Color.WHITE);
		mnAcceuil.setBackground(new Color(40, 39, 38));

		mnNotification.setIcon(new ImageIcon("images\\notification.png"));
		mnNotification.setForeground(Color.WHITE);
		mnNotification.setBackground(new Color(40, 39, 38));

		mnMenu.setIcon(new ImageIcon("images\\settings.png"));
		mnMenu.setBackground(new Color(40, 39, 38));
		mnMenu.setForeground(Color.WHITE);

		mnAdministration.setIcon(new ImageIcon("images\\administration.png"));
		mnAdministration.setBackground(new Color(40, 39, 38));
		mnAdministration.setForeground(Color.WHITE);
		loged.setOpaque(false);
		loged.setVisible(false);
		loged.setLayout(new CardLayout(0, 0));

		mainpan = new JPanel();
		mainpan.setOpaque(false);
		mainpan.setFocusable(false);
		loged.add(mainpan, "name_741921448020304");
		editablepan = new JPanel();
		editablepan.setOpaque(false);
		editablepan.setLayout(new CardLayout(0, 0));
		welcpanaft.setOpaque(false);
		editablepan.setFocusable(false);

		editablepan.add(welcpanaft, "name_215998788394895");
		welcpanaft.setVisible(true);
		welcpanaft.setBackground(new Color(218,218,218));
		welcpanaft.setLayout(null);

		label_7 = new JLabel("");
		label_7.setBounds(225, 0, 0, 105);
		welcpanaft.add(label_7);
		addlocpan = new JPanel();
		editablepan.add(addlocpan, "name_28347291607732");
		addlocpan.setBackground(new Color(218, 218, 218));
		addlocpan.setVisible(false);
		
		txtErrfield = new JLabel();
		txtErrfield.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		txtErrfield.setHorizontalAlignment(SwingConstants.CENTER);
		txtErrfield.setForeground(Color.RED);
		txtErrfield.setBackground(new Color(218, 218, 218));
		txtErrfield.setBorder(null);
		
		txtnumtel = new JTextField();
		txtnumtel.setColumns(10);
		Locationclss.blocktext(txtnumtel);
		Locationclss.focuslistenertext(txtnumtel, null,txtErrfield);

		saisieduree = new JTextField();
		saisieduree.setColumns(10);
		Locationclss.blocktext(saisieduree);
		Locationclss.focuslistenertext(saisieduree, null,txtErrfield);
		
		textnumserie = new JTextField();
		textnumserie.setColumns(10);
		Locationclss.blocktext(textnumserie);
		Locationclss.focuslistenertext(textnumserie, null,txtErrfield);
		
		txtserie = new JTextField();
		txtserie.setColumns(10);
		Locationclss.blocktext(txtserie);
		Locationclss.focuslistenertext(txtserie, null,txtErrfield);
		
		txtadr = new JTextField();
		txtadr.setColumns(10);
		Locationclss.focuslistenertext(txtadr, null,txtErrfield);

		txtprenom = new JTextField();
		txtprenom.setColumns(10);
		Locationclss.focuslistenertext(txtprenom, null,txtErrfield);

		txtncin = new JTextField();
		txtncin.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String s;
				DefaultListModel<String> m = new DefaultListModel<String>();
				if(Character.isDigit(e.getKeyChar())|| e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
				{
				if(e.getKeyCode()!=KeyEvent.VK_BACK_SPACE) 
				s=(txtncin.getText()+e.getKeyChar());
				else {
					if(txtncin.getText().length()>0) {
					s=(String) txtncin.getText().subSequence(0, txtncin.getText().length()-1);
					}
					else
						s="";
				}
				if(s.equals(""))
				{
					for(int i=0;i<ens_NCIN.size();i++) 
						{
							m.addElement(String.valueOf(ens_NCIN.elementAt(i).getNCIN()));
						}
				}
				else {
				for(int i=0;i<ens_NCIN.size();i++) {
				 if(String.valueOf(ens_NCIN.elementAt(i).getNCIN()).contains(s))
				{
					m.addElement(String.valueOf(ens_NCIN.elementAt(i).getNCIN()));
				}
				}
				}
				if(s.equals("")) {
					panellist.setBounds(panellist.getX(), panellist.getY(), 155, 0);
					scrollPane_9.setBounds(0, 0, 148, 0);
				}
				else
				{
					if(m.getSize()*20>80)
					{
						panellist.setBounds(panellist.getX(), panellist.getY(), 155, 80);
					scrollPane_9.setBounds(0, 0, 148, 80);
					}
					else
					{
						panellist.setBounds(panellist.getX(), panellist.getY(), 155, m.getSize()*20);
					scrollPane_9.setBounds(0, 0, 148,  m.getSize()*20);
					}
				}
				list.setModel(m);
				}
			}
			
		});
		txtncin.setColumns(10);
		Locationclss.blocktext(txtncin);
		Locationclss.focuslistenertext(txtncin, null,txtErrfield);

		txtnom = new JTextField();
		txtnom.setColumns(10);
		Locationclss.focuslistenertext(txtnom, null,txtErrfield);

		JButton btnTerminer = new JButton("Terminer");
		btnTerminer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTerminer.setForeground(Color.BLACK);
		btnTerminer.setBackground(new Color(167, 148, 116));
		btnTerminer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (txtserie.getText().equals("") || textnumserie.getText().equals("")
							|| saisieduree.getText().equals("") || txtncin.getText().equals("")
							|| txtnom.getText().equals("") || txtprenom.getText().equals("")
							|| txtnumtel.getText().equals("") || txtadr.getText().equals("")||spath==null)
						throw new FieldIncomplete();
					Voiture v = DataBase.getdatavoit(textnumserie.getText() + "TN" + txtserie.getText());
					Location l;
					if ( v != null) {
						if (v.getState()) {
							 l=new Location(textnumserie.getText() + "TN" + txtserie.getText(),
									sdf.format(currdate).toString(), 
									ag.editDate(Integer.parseInt(saisieduree.getText())),
									Integer.parseInt(saisieduree.getText()),
									Integer.parseInt(saisieduree.getText())*v.getTarif(),
									true,
									txtncin.getText());
							DataBase.setdataloca(l);
							DataBase.updatecarDatastate(v.get_mat(), v.getKilo(), false);
						
							if (!DataBase.getdatacl(l.getNCIN())) {
								if(spath!="done")
								DataBase.setdataclient(new Client(txtncin.getText(), txtnom.getText(), txtprenom.getText(), txtadr.getText(),txtnumtel.getText(),null),spath);
							}
							JOptionPane.showMessageDialog(editablepan, "La location a été ajouter", "Message", 1);
							String s = "utilisateur: " + currentUser[0] + " a ajouté une nouvelle locaction "+l.toString();
							Logs.setLogs(s);
							txtserie.setText(null);
							textnumserie.setText(null);
							saisieduree.setText(null);
							txtncin.setText(null);
							txtnom.setText(null);
							txtprenom.setText(null);
							txtadr.setText(null);
							txtnumtel.setText(null);
							txtErrfield.setText(null);
							labelimage.setIcon(new ImageIcon("images\\galeryicon.png"));
							spath=null;
						
						} else
							JOptionPane.showMessageDialog(editablepan, "La voiture est occupée", "Erreur", 0);
					}
					else
					JOptionPane.showMessageDialog(editablepan, "La voiture associer a cet matricule:"+ textnumserie.getText() + "TN" + txtserie.getText() + " n'éxiste pas.", "Erreur", 0);
				} catch (FieldIncomplete er) {
					txtErrfield.setText("Remplir toutes les informations");
				}catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}

		});

		JLabel lblNewLabel = new JLabel("Matricule");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.black);

		JLabel lblTn = new JLabel("تونس");
		lblTn.setFont(new Font("Dialog", Font.BOLD, 17));
		lblTn.setForeground(Color.black);

		JLabel lblDur = new JLabel("Durée");
		lblDur.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDur.setForeground(Color.black);

		JLabel lblNewLabel_1 = new JLabel("NCIN du client");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.black);

		JLabel lblNewLabel_2 = new JLabel("Nom");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.black);

		JLabel lblNewLabel_3 = new JLabel("Prenom");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(Color.black);

		JLabel lblNewLabel_4 = new JLabel("NUM téléphone");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(Color.black);

		JLabel lblNewLabel_5 = new JLabel("Adresse");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setForeground(Color.black);

		searchclpan = new JPanel();
		editablepan.add(searchclpan, "name_28347367673322");
		searchclpan.setBackground(new Color(218, 218, 218));

		errField2 = new JLabel();
		errField2.setHorizontalAlignment(SwingConstants.CENTER);
		errField2.setBorder(null);
		errField2.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		errField2.setForeground(Color.RED);
		errField2.setBackground(new Color(218, 218, 218));
		
		textFieldncin = new JTextField();
		Locationclss.blocktext(textFieldncin);
		Locationclss.focuslistenertext(textFieldncin, null,errField2);
		textFieldncin.setColumns(10);

		searchbtn = new JButton("Chercher");
		searchbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		searchbtn.setForeground(Color.BLACK);
		searchbtn.setBackground(new Color(167, 148, 116));
		searchbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//to edit
				try {
					if (textFieldncin.getText().equals(""))
						throw new FieldIncomplete();
	      			String query="SELECT * FROM `client` WHERE `dbncin`="+textFieldncin.getText();
						Connection c= DataBase.con;
						Statement st =c.createStatement();
						ResultSet res=st.executeQuery(query);
						if(res.next()) 
				        		{
				        			byte[] img =res.getBytes(6);
				        			ImageIcon im= new ImageIcon(img);
				        			labelncin.setIcon(ResizeImage(im,labelncin));
				        			frameinfocl.setResizable(true);
									frameinfocl.setVisible(true);
									frameinfocl.setSize(580, 600);
									frameinfocl.getContentPane().setLayout(new CardLayout(0, 0));
									frameinfocl.getContentPane().add(clientinfopan, "name_886319709938242");
									txtncinp.setText(res.getString(1));
									txtnomp.setText(res.getString(2));
									txtprenomp.setText(res.getString(3));
									txtnumtelp.setText(res.getString(5));
									txtadrp.setText(res.getString(4));
				        			
								} 
						else
					JOptionPane.showMessageDialog(editablepan, "Le client associer a ce NCIN:" + textFieldncin.getText() + " n'éxiste pas");
				} catch (FieldIncomplete err) {
					errField2.setText("Remplir toutes les informations");
					textFieldncin.setBackground(new Color (252, 194, 185));
					textFieldncin.setBorder(new LineBorder(Color.red));
				} catch (SQLException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}

		});
		JLabel lblNcinDuClient = new JLabel("NCIN du client");
		lblNcinDuClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNcinDuClient.setForeground(Color.BLACK);
		
		label_69 = new JLabel("");
		
		label_70 = new JLabel("");
		
		label_71 = new JLabel("");
		
		label_72 = new JLabel("");
		GroupLayout gl_searchclpan = new GroupLayout(searchclpan);
		gl_searchclpan.setHorizontalGroup(
			gl_searchclpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_searchclpan.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNcinDuClient, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_69, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(textFieldncin, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_70, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_searchclpan.createSequentialGroup()
					.addGap(270)
					.addComponent(errField2, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
					.addGap(270))
				.addGroup(gl_searchclpan.createSequentialGroup()
					.addGap(10)
					.addComponent(label_72, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(searchbtn, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_71, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_searchclpan.setVerticalGroup(
			gl_searchclpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_searchclpan.createSequentialGroup()
					.addGap(201)
					.addGroup(gl_searchclpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_searchclpan.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNcinDuClient, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_searchclpan.createSequentialGroup()
							.addGap(5)
							.addComponent(label_69, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(textFieldncin, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_searchclpan.createSequentialGroup()
							.addGap(5)
							.addComponent(label_70, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGap(73)
					.addComponent(errField2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(gl_searchclpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_searchclpan.createSequentialGroup()
							.addGap(5)
							.addComponent(label_72, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(searchbtn, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_searchclpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_71, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))))
		);
		searchclpan.setLayout(gl_searchclpan);

		searchcarpan = new JPanel();
		editablepan.add(searchcarpan, "name_28347426867081");
		searchcarpan.setBackground(new Color(218, 218, 218));
		
		txtErr = new JLabel();
		txtErr.setHorizontalAlignment(SwingConstants.CENTER);
		txtErr.setBorder(null);
		txtErr.setForeground(Color.RED);
		txtErr.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		txtErr.setBackground(new Color(218, 218, 218));
		
		textField = new JTextField();
		textField.setColumns(10);
		Locationclss.blocktext(textField);
		Locationclss.focuslistenertext(textField, null,txtErr);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		Locationclss.blocktext(textField_1);
		Locationclss.focuslistenertext(textField_1, null,txtErr);
		
		btnNewButton = new JButton("Chercher");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.black);
		btnNewButton.setBackground(new Color(167, 148, 116));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (textField.getText().equals("") || textField_1.getText().equals(""))
						throw new FieldIncomplete();
					String query="SELECT * FROM `voiture` WHERE `dbmatricule`=?";
					PreparedStatement ps;
					ps=DataBase.con.prepareStatement(query);
					ps.setString(1, textField.getText() + "TN" + textField_1.getText());
					ResultSet res=ps.executeQuery();
					if(res.next())
			        		{
						byte[] img =res.getBytes(6);
	        			ImageIcon im= new ImageIcon(img);
	        			label_20.setIcon(ResizeImage(im,label_20));
	        			frameinfocar.setResizable(true);
	        			frameinfocar.setVisible(true);
						frameinfocar.setSize(580, 600);
						frameinfocar.getContentPane().setLayout(new CardLayout(0, 0));
						frameinfocar.getContentPane().add(carinfopan, "name_972138540795020");
						serie.setText(res.getString(1).split("TN")[1]+" تونس "+res.getString(1).split("TN")[0]);//alo
						txtkilo.setText(res.getString(7));
					  	txtpr.setText(res.getString(4));
						txtmarq.setText(res.getString(2));
						txtcol.setText(res.getString(3));
						if(res.getString(5).equals("libre"))
						{
						    labelstate.setIcon(new  ImageIcon("images\\libre.png"));
						}
						else 
							labelstate.setIcon(new  ImageIcon("images\\occ.png"));
							
			        			
							} 
					else 
					JOptionPane.showMessageDialog(editablepan,"la voiture associer a cet matricule n'existe pas.", "Message", 1);
				} catch (FieldIncomplete err) {
					txtErr.setText("Remplir toutes les informations");
				} catch (SQLException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}
		});

		JLabel lblMatricule = new JLabel("Matricule");
		lblMatricule.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatricule.setForeground(Color.black);

		JLabel lblNewLabel_9 = new JLabel("تونس");
		lblNewLabel_9.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_9.setForeground(Color.black);
		
		label_65 = new JLabel("");
		
		label_66 = new JLabel("");
		
		label_67 = new JLabel("");
		
		label_68 = new JLabel("");
		GroupLayout gl_searchcarpan = new GroupLayout(searchcarpan);
		gl_searchcarpan.setHorizontalGroup(
			gl_searchcarpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_searchcarpan.createSequentialGroup()
					.addGap(20)
					.addComponent(lblMatricule, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_65, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label_66, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_searchcarpan.createSequentialGroup()
					.addGap(279)
					.addComponent(txtErr, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addGap(280))
				.addGroup(gl_searchcarpan.createSequentialGroup()
					.addGap(20)
					.addComponent(label_68, GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_67, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_searchcarpan.setVerticalGroup(
			gl_searchcarpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_searchcarpan.createSequentialGroup()
					.addGap(201)
					.addGroup(gl_searchcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_searchcarpan.createSequentialGroup()
							.addGap(5)
							.addComponent(lblMatricule, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_searchcarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_65, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_searchcarpan.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_searchcarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_66, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(82)
					.addComponent(txtErr, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_searchcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_searchcarpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_68, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_searchcarpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_67, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
		);
		searchcarpan.setLayout(gl_searchcarpan);
		
		clientinfopan = new JPanel();
		clientinfopan.setBackground(new Color(218, 218, 218));
		editablepan.add(clientinfopan, "name_886319709938242");
		clientinfopan.setLayout(null);
		
		labelncin = new JLabel("");
		labelncin.setBounds(222, 44, 229, 116);
		clientinfopan.add(labelncin);
		
		JLabel lblNcin = new JLabel("NCIN");
		lblNcin.setForeground(Color.BLACK);
		lblNcin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNcin.setBounds(44, 187, 117, 16);
		clientinfopan.add(lblNcin);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setForeground(Color.BLACK);
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNom.setBounds(44, 228, 117, 16);
		clientinfopan.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setForeground(Color.BLACK);
		lblPrenom.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrenom.setBounds(44, 274, 117, 16);
		clientinfopan.add(lblPrenom);
		
		JLabel lblAdresse = new JLabel("Num Télephone");
		lblAdresse.setForeground(Color.BLACK);
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdresse.setBounds(44, 324, 117, 16);
		clientinfopan.add(lblAdresse);
		
		JLabel lblAdresse_1 = new JLabel("Adresse");
		lblAdresse_1.setForeground(Color.BLACK);
		lblAdresse_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdresse_1.setBounds(44, 366, 117, 16);
		clientinfopan.add(lblAdresse_1);
		
		txtncinp = new JTextField();
		txtncinp.setEditable(false);
		txtncinp.setBorder(null);
		txtncinp.setBackground(null);
		txtncinp.setBounds(305, 177, 110, 26);
		clientinfopan.add(txtncinp);
		txtncinp.setColumns(10);
		
		txtnomp = new JTextField();
		txtnomp.setEditable(false);
		txtnomp.setColumns(10);
		txtnomp.setBorder(null);
		txtnomp.setBackground(null);
		txtnomp.setBounds(305, 218, 110, 26);
		clientinfopan.add(txtnomp);
		
		txtprenomp = new JTextField();
		txtprenomp.setEditable(false);
		txtprenomp.setColumns(10);
		txtprenomp.setBorder(null);
		txtprenomp.setBackground(null);
		txtprenomp.setBounds(305, 264, 110, 26);
		clientinfopan.add(txtprenomp);
		
		txtnumtelp = new JTextField();
		txtnumtelp.setEditable(false);
		txtnumtelp.setColumns(10);
		txtnumtelp.setBackground(null);
		txtnumtelp.setBorder(null);
		txtnumtelp.setBounds(305, 314, 110, 26);
		clientinfopan.add(txtnumtelp);
		
		txtadrp = new JTextField();
		txtadrp.setEditable(false);
		txtadrp.setColumns(10);
		txtadrp.setBackground(null);
		txtadrp.setBorder(null);
		txtadrp.setBounds(305, 356, 110, 26);
		clientinfopan.add(txtadrp);
	    btnHistoriqueDuClient = new JButton("Historique du Client");
		btnHistoriqueDuClient.setVisible(false);
		btnHistoriqueDuClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				Vector<Location> ens_loc=DataBase.getdatalocs(txtncinp.getText());
				table_4.setModel(modelinfocl=new DefaultTableModel(null, new String[] { "Matricule", "date de location","date fin de location", "durée", "facture" }));

					for (int i = 0; i < ens_loc.size(); i++) {

						Object[] row = new Object[5];
						row[0] = ens_loc.elementAt(i).get_mat();
						row[1] = ens_loc.elementAt(i).getDate();
						row[2] = ens_loc.elementAt(i).getDatefin();
						row[3] = ens_loc.elementAt(i).getDuree();
						row[4]=ens_loc.elementAt(i).getFacture();

						modelinfocl.addRow(row);
					}
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
				}
				
			}
		});
		btnHistoriqueDuClient.setBounds(273, 588, 125, 26);
		clientinfopan.add(btnHistoriqueDuClient);
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.setVisible(false);
		scrollPane_7.setBounds(105, 440, 432, 127);
		clientinfopan.add(scrollPane_7);
		
		table_4 = new JTable();
	    modelinfocl=new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Matricule", "date de location","date fin de location", "durée", "facture"
			}
		);
		table_4.setModel(modelinfocl);
		scrollPane_7.setViewportView(table_4);
		
		JLabel lblPhotoNcin = new JLabel("Photo NCIN");
		lblPhotoNcin.setForeground(Color.BLACK);
		lblPhotoNcin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhotoNcin.setBounds(44, 97, 117, 16);
		clientinfopan.add(lblPhotoNcin);
		
		 label_23 = new JLabel("");
		label_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(icon)
				{
					label_23.setIcon(new  ImageIcon("images\\onicon.png"));
					scrollPane_7.setVisible(true);
					table_4.setVisible(true);
					btnHistoriqueDuClient.setVisible(true);
					icon=false;
					
				}
				else
				{
					label_23.setIcon(new  ImageIcon("images\\officon.png"));
					scrollPane_7.setVisible(false);
					table_4.setVisible(false);
					btnHistoriqueDuClient.setVisible(false);
					icon=true;
				}
				
			}
		});
		label_23.setIcon(new ImageIcon("images\\officon.png"));
		label_23.setBounds(44, 393, 35, 35);
		clientinfopan.add(label_23);

		freecarpan = new JPanel();
		freecarpan.setForeground(Color.black);
		editablepan.add(freecarpan, "name_28347440580447");
		freecarpan.setBackground(new Color(218, 218, 218));
		

		txtErr2 = new JLabel();
		txtErr2.setBorder(null);
		txtErr2.setForeground(Color.RED);
		txtErr2.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		txtErr2.setHorizontalAlignment(SwingConstants.CENTER);
		txtErr2.setBackground(new Color(218, 218, 218));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		Locationclss.blocktext(textField_2);
		Locationclss.focuslistenertext(textField_2, null,txtErrfield);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		Locationclss.blocktext(textField_3);
		Locationclss.focuslistenertext(textField_3, null,txtErrfield);

		JButton btnLiberer = new JButton("Liberer");
		btnLiberer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLiberer.setForeground(Color.black);
		btnLiberer.setBackground(new Color(167, 148, 116));
		btnLiberer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (textField_2.getText().equals("") || textField_3.getText().equals(""))
						throw new FieldIncomplete();
					int tst = ag.liberervoit(textField_2.getText() + "TN" + textField_3.getText(),txtkiloapre.getText());
					if (tst == 1) {
						JOptionPane.showMessageDialog(editablepan, "La voiture a été libérer", "Message", 1);
						String s = "Utilisateur: " + currentUser[0] + " a libéré la voiture : " + textField_2.getText()
								+ "TN" + textField_3.getText();
						Logs.setLogs(s);
					} else if (tst == 0)
						JOptionPane.showMessageDialog(editablepan, "La voiture n'est pas occupée", "Erreur", 0);
					else if(tst==-2)
						JOptionPane.showMessageDialog(editablepan, "Le kilométrage taper est incorrecte","Erreur", 0);
					else
						JOptionPane.showMessageDialog(editablepan, "Aucune voiture associée a cette matricule","Erreur", 0);
					for (int i = 0; i < Agence.notif.size(); i++)
						if (Agence.notif.elementAt(i).contains(textField_2.getText() + "TN" + textField_3.getText())) {
							Agence.notif.removeElementAt(i);
							DataBase.deleteData("notification", "dbmatricule",textField_2.getText() + "TN" + textField_3.getText());
							if (!Agence.notif.isEmpty())
								mnNotification.setText("Notification (" + Agence.notif.size() + ")");
							else
								mnNotification.setText("Notification");
							textArea_1.setText(Agence.updatetext());

						}
					textField_2.setText(null);
					textField_3.setText(null);
					txtkiloapre.setText(null);
					txtErr2.setText(null);
				} catch (FieldIncomplete err) {
					txtErr2.setText("Remplir toutes les informations");
				} catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}
		});

		JLabel lblNewLabel_10 = new JLabel("تونس");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_10.setForeground(Color.black);

		JLabel lblMatricule_1 = new JLabel("Matricule");
		lblMatricule_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatricule_1.setForeground(Color.black);
		
		label_55 = new JLabel("");
		
		label_56 = new JLabel("");
		
		label_57 = new JLabel("");
		
		label_58 = new JLabel("");
		
		JLabel lblKilomtrage_1 = new JLabel("Kilométrage");
		lblKilomtrage_1.setForeground(Color.BLACK);
		lblKilomtrage_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtkiloapre = new JTextField();
		txtkiloapre.setColumns(10);
		
		JLabel label_40 = new JLabel("");
		
		JLabel label_41 = new JLabel("");
		GroupLayout gl_freecarpan = new GroupLayout(freecarpan);
		gl_freecarpan.setHorizontalGroup(
			gl_freecarpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_freecarpan.createSequentialGroup()
					.addGap(18)
					.addComponent(label_58, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnLiberer, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_57, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_freecarpan.createSequentialGroup()
					.addGap(260)
					.addComponent(txtErr2, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
					.addGap(261))
				.addGroup(gl_freecarpan.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_freecarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_freecarpan.createSequentialGroup()
							.addComponent(lblKilomtrage_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_40, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
							.addGap(9)
							.addComponent(txtkiloapre, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_41, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
							.addGap(99))
						.addGroup(gl_freecarpan.createSequentialGroup()
							.addComponent(lblMatricule_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_55, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addGroup(gl_freecarpan.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_freecarpan.createSequentialGroup()
									.addGap(92)
									.addComponent(label_56, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)))
							.addGap(10))))
		);
		gl_freecarpan.setVerticalGroup(
			gl_freecarpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_freecarpan.createSequentialGroup()
					.addGap(201)
					.addGroup(gl_freecarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_freecarpan.createSequentialGroup()
							.addGap(5)
							.addComponent(lblMatricule_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_freecarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_freecarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(52)
					.addGroup(gl_freecarpan.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label_40, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_freecarpan.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtkiloapre, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addComponent(label_41, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addComponent(lblKilomtrage_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGap(74)
					.addComponent(txtErr2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_freecarpan.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnLiberer, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_58, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(224))
		);
		freecarpan.setLayout(gl_freecarpan);

		showfreecarpan = new JPanel();
		editablepan.add(showfreecarpan, "name_28347488657842");
		showfreecarpan.setBackground(new Color(218, 218, 218));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		model = new DefaultTableModel(null, 
				new String[] { "Photo", "Matricule", "Marque", "Couleur", "Tarif" });
		table.setModel(model);
		table.setBackground(Color.WHITE);
		scrollPane.setViewportView(table);
		btnAfiichier = new JButton("Afficher");
		btnAfiichier.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAfiichier.setForeground(Color.black);
		btnAfiichier.setBackground(new Color(167, 148, 116));
		btnAfiichier.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				Vector<Voiture> ens_v = ag.voiturelib();
				model = new DefaultTableModel(null, 
						new String[] { "Photo", "Matricule", "Marque", "Couleur", "Tarif" });
				table.setModel(model);
				table.getColumnModel().getColumn(0).setCellRenderer(new ImageCellRenderer());

				 DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		        table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
		        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
		        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
				if (ens_v != null)
				 {
					for (int i = 0; i < ens_v.size(); i++) {
						Object[] row = new Object[5];
						ImageIcon img= new ImageIcon(ens_v.elementAt(i).get_image());
						row[0]= img;
						row[1] = ens_v.elementAt(i).get_mat().split("TN")[1] +" تونس "+ ens_v.elementAt(i).get_mat().split("TN")[0];
						row[2] = ens_v.elementAt(i).getMarque();
						row[3] = ens_v.elementAt(i).getColor();
						row[4] = ens_v.elementAt(i).getTarif()+" DT";
						model.addRow(row);

					}

				}
			

			}
		});
		GroupLayout gl_showfreecarpan = new GroupLayout(showfreecarpan);
		gl_showfreecarpan.setHorizontalGroup(
			gl_showfreecarpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_showfreecarpan.createSequentialGroup()
					.addGap(27)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
					.addGap(27))
				.addGroup(gl_showfreecarpan.createSequentialGroup()
					.addGap(195)
					.addComponent(btnAfiichier, GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
					.addGap(195))
		);
		gl_showfreecarpan.setVerticalGroup(
			gl_showfreecarpan.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_showfreecarpan.createSequentialGroup()
					.addGap(49)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
					.addGap(39)
					.addComponent(btnAfiichier, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(44, Short.MAX_VALUE))
		);
		showfreecarpan.setLayout(gl_showfreecarpan);
	    showocccarpan = new JPanel();
		showocccarpan.setBackground(new Color(218, 218, 218));
		editablepan.add(showocccarpan, "name_110556344059404");
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		table2 = new JTable();
		model2 = new DefaultTableModel(new Object[][] {},
				new String[] { "Date de Location", "Date Fin Location", "NCIN Locataire", "Matricule" });
		table2.setModel(model2);
		table2.setFont(new Font("Tahoma", Font.BOLD, 11));
		table2.setBackground(Color.WHITE);
		scrollPane2.setViewportView(table2);

		JButton button = new JButton("Afficher");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Vector<Location> ens_loc = ag.voitureocc(true);
				
				if(ens_loc!=null) {
					model2 = new DefaultTableModel(new Object[][] {},
							new String[] { "Date de Location", "Date Fin Location", "NCIN Locataire", "Matricule" });
					table2.setModel(model2);
					for (int i = 0; i < ens_loc.size(); i++) {
						Object[] row = new Object[5];
						row[0] = ens_loc.elementAt(i).getDate();
						row[1] = ens_loc.elementAt(i).getDatefin();
						row[2] = ens_loc.elementAt(i).getNCIN();
						row[3] = ens_loc.elementAt(i).get_mat().split("TN")[1] + " تونس "
								+ ens_loc.elementAt(i).get_mat().split("TN")[0];
						model2.addRow(row);
					}
				}

			}
		});

		button.setForeground(Color.black);
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(new Color(167, 148, 116));
		GroupLayout gl_showocccarpan = new GroupLayout(showocccarpan);
		gl_showocccarpan.setHorizontalGroup(
			gl_showocccarpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_showocccarpan.createSequentialGroup()
					.addGap(27)
					.addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
					.addGap(27))
				.addGroup(gl_showocccarpan.createSequentialGroup()
					.addGap(195)
					.addComponent(button, GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
					.addGap(195))
		);
		gl_showocccarpan.setVerticalGroup(
			gl_showocccarpan.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_showocccarpan.createSequentialGroup()
					.addContainerGap(49, Short.MAX_VALUE)
					.addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 516, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(37))
		);
		showocccarpan.setLayout(gl_showocccarpan);

		ajustpricpan = new JPanel();
		editablepan.add(ajustpricpan, "name_28347504463008");
		ajustpricpan.setBackground(new Color(218, 218, 218));
		
		texterr = new JLabel();
		texterr.setFont(new Font("Tahoma", Font.ITALIC, 13));
		texterr.setHorizontalAlignment(SwingConstants.CENTER);
		texterr.setBorder(null);
		texterr.setBackground(new Color(218, 218, 218));
		texterr.setForeground(Color.RED);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		Locationclss.blocktext(textField_5);
		Locationclss.focuslistenertext(textField_5, null,txtErrfield);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		Locationclss.blocktext(textField_6);
		Locationclss.focuslistenertext(textField_6, null,txtErrfield);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(textField_7.getText().contains(".")) {
				if(!Character.isDigit(c))
					e.consume();
				}
				else
				{
					if(!Character.isDigit(c)&&c!='.')
						e.consume();
				}
			
			}
		});
		Locationclss.focuslistenertext(textField_7, null,txtErrfield);
		
		lblPhotoDeLa = new JLabel("Photo de la Carte identité");
		lblPhotoDeLa.setForeground(Color.BLACK);
		lblPhotoDeLa.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		labelimage = new JLabel("");
		labelimage.setHorizontalAlignment(SwingConstants.CENTER);
		labelimage.setIcon(new ImageIcon("images\\galeryicon.png"));
		
	    panellist = new JPanel();
		panellist.setLayout(null);
		
		scrollPane_9.setBounds(0, 0, 148, 0);
		panellist.add(scrollPane_9);
		
		list = new JList<String>();
		list.setBorder(null);
		list.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		String query="SELECT * FROM `client` WHERE `dbncin`="+list.getSelectedValue();
				Connection c;
				try {
					c = DataBase.con;
			
				Statement st =c.createStatement();
				ResultSet res=st.executeQuery(query);
				if(res.next()) 
		        		{
		        			byte[] img =res.getBytes(6);
		        			ImageIcon im= new ImageIcon(img);
		        			labelimage.setIcon(ResizeImage(im,labelimage));
		        			txtncin.setText(res.getString(1));
							txtnom.setText(res.getString(2));
							txtprenom.setText(res.getString(3));
							txtnumtel.setText(res.getString(5));
							txtadr.setText(res.getString(4));
							list.setModel(new DefaultListModel<String>());
							panellist.setBounds(panellist.getX(), panellist.getY(), 155, 0);
							scrollPane_9.setBounds(0, 0, 148, 0);
		        			
						} 
				spath="done";
				}
				 catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	    	}
	    });
		scrollPane_9.setViewportView(list);
		scrollPane_9.setBorder(null);
		
		JLabel label = new JLabel("");
		
		JLabel label_6 = new JLabel("");
		
		JLabel label_21 = new JLabel("");
		
		JLabel label_24 = new JLabel("");
		
		JLabel label_25 = new JLabel("");
		
		label_26 = new JLabel("");
		
		label_28 = new JLabel("");
		
		label_29 = new JLabel("");
		
		label_30 = new JLabel("");
		
		label_31 = new JLabel("");
		
		label_32 = new JLabel("");
		
		label_33 = new JLabel("");
		
		label_34 = new JLabel("");
		
		label_35 = new JLabel("");
		
		label_36 = new JLabel("");
		
		label_37 = new JLabel("");
		
		label_38 = new JLabel("");
		
		label_39 = new JLabel("");
		
		JLabel label_79 = new JLabel("");
		GroupLayout gl_addlocpan = new GroupLayout(addlocpan);
		gl_addlocpan.setHorizontalGroup(
			gl_addlocpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel)
					.addGap(4)
					.addComponent(label, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(textnumserie, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(lblTn, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(txtserie, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(label_30, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(79)
							.addComponent(label_25, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
					.addGap(1)
					.addComponent(txtncin, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panellist, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_24, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
					.addGap(9)
					.addComponent(txtnom, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label_36, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(75)
							.addComponent(label_26, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addComponent(txtprenom, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label_34, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(87)
							.addComponent(label_28, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)))
					.addGap(5)
					.addComponent(txtnumtel, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(label_33, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addComponent(label_37, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
							.addGap(12)
							.addComponent(btnTerminer, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(label_38, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(221)
							.addComponent(txtErrfield, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
							.addGap(217)))
					.addGap(18))
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(label_29, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(txtadr, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label_35, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDur, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(57)
									.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
							.addGap(11))
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addComponent(lblPhotoDeLa, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
									.addGap(83))
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(161)
									.addComponent(label_21, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(3)))
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(17)
							.addComponent(saisieduree, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_39, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addComponent(labelimage, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
							.addGap(43)
							.addComponent(label_32, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
					.addGap(10))
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addGap(222)
					.addComponent(label_79, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(552, Short.MAX_VALUE))
		);
		gl_addlocpan.setVerticalGroup(
			gl_addlocpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addlocpan.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_79, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textnumserie, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTn, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtserie, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(17)
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(4)
									.addComponent(lblDur, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(saisieduree, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
							.addGap(5)
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(17)
									.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_addlocpan.createSequentialGroup()
											.addGap(73)
											.addComponent(lblPhotoDeLa, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_addlocpan.createSequentialGroup()
											.addGap(43)
											.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_addlocpan.createSequentialGroup()
											.addGap(33)
											.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(6)
									.addComponent(labelimage, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(12)
									.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
										.addComponent(panellist, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_addlocpan.createSequentialGroup()
											.addGap(5)
											.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
										.addComponent(txtncin, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(5)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(1)
									.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtnom, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(1)
									.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
							.addGap(17)
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
										.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_addlocpan.createSequentialGroup()
											.addGap(4)
											.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))))
								.addComponent(txtprenom, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(1)
									.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
							.addGap(17)
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(5)
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtnumtel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
							.addGap(17)
							.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(5)
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_addlocpan.createSequentialGroup()
									.addGap(9)
									.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtadr, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addGap(59))
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_addlocpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(24)
							.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(24)
							.addComponent(btnTerminer, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_addlocpan.createSequentialGroup()
							.addGap(24)
							.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtErrfield, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(52))
		);
		addlocpan.setLayout(gl_addlocpan);
		
		JButton btnNewButton_1 = new JButton("Ajuster");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.black);
		btnNewButton_1.setBackground(new Color(167, 148, 116));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (textField_5.getText().equals("") || textField_6.getText().equals("")
							|| textField_7.getText().equals(""))
						throw new FieldIncomplete();
					if (ag.ajusttarif(textField_6.getText() + "TN" + textField_5.getText(),
							Double.parseDouble(textField_7.getText()))) {
						String s = "Utilisateur: " + currentUser[0] + " a changé le prix de la voiture : "
								+ textField_5.getText() + "TN" + textField_6.getText() + " à " + textField_7.getText()
								+ "DT";
						Logs.setLogs(s);
						JOptionPane.showMessageDialog(editablepan, "Le prix a été ajusté", "Message", 1);
						textField_5.setText(null);
						textField_6.setText(null);
						textField_7.setText(null);
						texterr.setText(null);

					} else
						JOptionPane.showMessageDialog(editablepan, "Aucune Voiture associe a cette matricule", "Erreur",
								0);
				} catch (FieldIncomplete err) {
					texterr.setText("Remplir toutes les informations");
				}catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}

		});

		JLabel lblMatricule_2 = new JLabel("Matricule");
		lblMatricule_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatricule_2.setForeground(Color.black);

		JLabel lblPrix = new JLabel("Prix");
		lblPrix.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrix.setForeground(Color.black);

		JLabel lblNewLabel_11 = new JLabel("تونس");
		lblNewLabel_11.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_11.setForeground(Color.black);
		
		label_59 = new JLabel("");
		
		label_60 = new JLabel("");
		
		label_61 = new JLabel("");
		
		label_62 = new JLabel("");
		
		label_63 = new JLabel("");
		
		label_64 = new JLabel("");
		GroupLayout gl_ajustpricpan = new GroupLayout(ajustpricpan);
		gl_ajustpricpan.setHorizontalGroup(
			gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ajustpricpan.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMatricule_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ajustpricpan.createSequentialGroup()
							.addGap(58)
							.addComponent(label_59, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
					.addGap(10)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addGroup(gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ajustpricpan.createSequentialGroup()
							.addGap(37)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(label_62, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_ajustpricpan.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ajustpricpan.createSequentialGroup()
							.addGap(58)
							.addComponent(label_60, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
						.addComponent(lblPrix, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(label_63, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_ajustpricpan.createSequentialGroup()
					.addGap(244)
					.addComponent(texterr, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
					.addGap(244))
				.addGroup(gl_ajustpricpan.createSequentialGroup()
					.addGap(10)
					.addComponent(label_61, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_64, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_ajustpricpan.setVerticalGroup(
			gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ajustpricpan.createSequentialGroup()
					.addGap(151)
					.addGroup(gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ajustpricpan.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMatricule_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_ajustpricpan.createSequentialGroup()
									.addGap(1)
									.addComponent(label_59, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))))
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ajustpricpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_62, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addGap(24)
					.addGroup(gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ajustpricpan.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_ajustpricpan.createSequentialGroup()
									.addGap(1)
									.addComponent(label_60, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblPrix, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ajustpricpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_63, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addGap(83)
					.addComponent(texterr, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addGroup(gl_ajustpricpan.createParallelGroup(Alignment.LEADING)
						.addComponent(label_61, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ajustpricpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))))
		);
		ajustpricpan.setLayout(gl_ajustpricpan);

		SupVoit = new JPanel();
		editablepan.add(SupVoit, "name_28347519260031");
		SupVoit.setBackground(new Color(218, 218, 218));
		
		textField_4 = new JLabel();
		textField_4.setForeground(Color.RED);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		textField_4.setBackground(new Color(218, 218, 218));
		textField_4.setBorder(null);

		textserie = new JTextField();
		textserie.setColumns(10);
		Locationclss.blocktext(textserie);
		Locationclss.focuslistenertext(textserie, null,textField_4);

		textnumser = new JTextField();
		textnumser.setColumns(10);
		Locationclss.blocktext(textnumser);
		Locationclss.focuslistenertext(textnumser, null,textField_4);

		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSupprimer.setForeground(Color.black);
		btnSupprimer.setBackground(new Color(167, 148, 116));
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (textserie.getText().equals("") || textnumser.getText().equals(""))
						throw new FieldIncomplete();
					if (ag.suppvoit(textserie.getText() + "TN" + textnumser.getText())) {
						String s = "Utilisateur: " + currentUser[0] + " a supprimé la voiture : " + textserie.getText()
								+ "TN" + textnumser.getText();
						Logs.setLogs(s);
						JOptionPane.showMessageDialog(editablepan, "La Voiture a ete supprimer", "Message", 1);
						textserie.setText(null);
						textnumser.setText(null);
						textField_4.setText(null);
					} else
						JOptionPane.showMessageDialog(editablepan, "Aucune voiture associe a cet matricule", "Erreur",
								0);

				} catch (FieldIncomplete err) {
					textField_4.setText("Remplir toutes les informations");
				} catch (Exception err) {
					JOptionPane.showMessageDialog(editablepan, "Format de saisie incorrect", "Erreur", 0);
				}

			}
		});

		JLabel lblNewLabel_12 = new JLabel("تونس");
		lblNewLabel_12.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_12.setForeground(Color.black);

		lblMatricule_3 = new JLabel("Matricule");
		lblMatricule_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatricule_3.setForeground(Color.black);
		
		lblNewLabel_15 = new JLabel("");
		
		label_73 = new JLabel("");
		
		label_74 = new JLabel("");
		
		label_75 = new JLabel("");
		GroupLayout gl_SupVoit = new GroupLayout(SupVoit);
		gl_SupVoit.setHorizontalGroup(
			gl_SupVoit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SupVoit.createSequentialGroup()
					.addGap(25)
					.addComponent(lblMatricule_3, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(lblNewLabel_15, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(textserie, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addGroup(gl_SupVoit.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_SupVoit.createSequentialGroup()
							.addGap(39)
							.addComponent(textnumser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addComponent(label_73, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_SupVoit.createSequentialGroup()
					.addGap(280)
					.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addGap(281))
				.addGroup(gl_SupVoit.createSequentialGroup()
					.addGap(10)
					.addComponent(label_75, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_74, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_SupVoit.setVerticalGroup(
			gl_SupVoit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_SupVoit.createSequentialGroup()
					.addGap(201)
					.addGroup(gl_SupVoit.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_SupVoit.createSequentialGroup()
							.addGap(5)
							.addComponent(lblMatricule_3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_SupVoit.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(textserie, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_SupVoit.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addComponent(textnumser, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_SupVoit.createSequentialGroup()
							.addGap(6)
							.addComponent(label_73, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGap(80)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addGroup(gl_SupVoit.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_SupVoit.createSequentialGroup()
							.addGap(10)
							.addComponent(label_75, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnSupprimer, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_SupVoit.createSequentialGroup()
							.addGap(10)
							.addComponent(label_74, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))))
		);
		SupVoit.setLayout(gl_SupVoit);
		addcarpan = new JPanel();
		editablepan.add(addcarpan, "name_28433537676169");
		addcarpan.setBackground(new Color(218, 218, 218));

		errField = new JLabel();
		errField.setHorizontalAlignment(SwingConstants.CENTER);
		errField.setFont(new Font("Lucida Grande", Font.ITALIC, 13));
		errField.setBackground(new Color(218, 218, 218));
		errField.setForeground(Color.RED);
		errField.setBorder(null);
		
		textfnumserie = new JTextField();
		textfnumserie.setColumns(10);
		Locationclss.blocktext(textfnumserie);
		Locationclss.focuslistenertext(textfnumserie, null,errField);

		textfserie = new JTextField();
		textfserie.setColumns(10);
		Locationclss.blocktext(textfserie);
		Locationclss.focuslistenertext(textfserie, null,errField);

		textfmarq = new JTextField();
		textfmarq.setColumns(10);
		Locationclss.focuslistenertext(textfmarq, null,errField);

		textfColor = new JTextField();
		textfColor.setColumns(10);
		Locationclss.focuslistenertext(textfColor, null,errField);

		textftarf = new JTextField();
		textftarf.setColumns(10);
		textftarf.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(textftarf.getText().contains(".")) {
				if(!Character.isDigit(c))
					e.consume();
				}
				else
				{
					if(!Character.isDigit(c)&&c!='.')
						e.consume();
				}
			
			}
		});
		Locationclss.focuslistenertext(textftarf, null,errField);

		JButton btnadd = new JButton("Ajouter");
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnadd.setForeground(Color.black);
		btnadd.setBackground(new Color(167, 148, 116));
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (textfserie.getText().equals("") || textfnumserie.getText().equals("")
							|| textfmarq.getText().equals("") || textfColor.getText().equals("")
							|| textftarf.getText().equals("")|| txtkilom.getText().equals("") || spath==null)
						throw new FieldIncomplete();
					Voiture v = new Voiture(textfnumserie.getText() + "TN" + textfserie.getText(),txtkilom.getText() ,textfmarq.getText(),
							textfColor.getText(), Double.parseDouble(textftarf.getText()), true,null);
					if (ag.ajoutVoit(v)) {
						String s = "Utilisateur: " + currentUser[0] + " a ajouté une nouvelle voiture: "
								+ new Voiture(textfnumserie.getText() + "TN" + textfserie.getText(),txtkilom.getText(),
										textfmarq.getText(), textfColor.getText(),
										Double.parseDouble(textftarf.getText()), true,null).toString();// to return
						Logs.setLogs(s);
						JOptionPane.showMessageDialog(editablepan, "La voiture a été ajouté", "Message", 1);
						DataBase.setdatacar(v,spath);
						textfserie.setText(null);
						textfnumserie.setText(null);
						textfmarq.setText(null);
						textfColor.setText(null);
						textftarf.setText(null);
						errField.setText(null);
						txtkilom.setText(null);
						spath=null;
					    label_19.setIcon(new ImageIcon("images\\geleryicon.png"));
					} else {
						JOptionPane.showMessageDialog(editablepan,
								"la voiture " + textfnumserie.getText() + "TN" + textfserie.getText() + " éxiste deja.",
								"Erreur", 0);
					}
				    
				    
				    
				} catch (FieldIncomplete er) {
					errField.setText("Remplir toutes les informations");
				} catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}
		});

		JLabel lblNewLabel_6 = new JLabel("Matricule");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setForeground(Color.black);

		JLabel lblNewLabel_7 = new JLabel("تونس");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_7.setForeground(Color.black);

		JLabel lblNewLabel_8 = new JLabel("Marque");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setForeground(Color.black);

		JLabel lblCouleur = new JLabel("Couleur");
		lblCouleur.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCouleur.setForeground(Color.black);

		JLabel lblTarif = new JLabel("Tarif");
		lblTarif.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTarif.setForeground(Color.black);
		
		JLabel lblPhoto = new JLabel("Kilométrage");
		lblPhoto.setForeground(Color.BLACK);
		lblPhoto.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtkilom = new JTextField();
		txtkilom.setColumns(10);
		
	    label_19 = new JLabel("");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setIcon(new ImageIcon("images\\galeryicon.png"));
		
		JLabel lblPhoto_1 = new JLabel("Photo");
		lblPhoto_1.setForeground(Color.BLACK);
		lblPhoto_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel label_10 = new JLabel("");
		
		JLabel label_27 = new JLabel("");
		
		JLabel label_42 = new JLabel("");
		
		label_43 = new JLabel("");
		
		label_44 = new JLabel("");
		
		label_45 = new JLabel("");
		
		label_46 = new JLabel("");
		
		label_47 = new JLabel("");
		
		label_48 = new JLabel("");
		
		label_49 = new JLabel("");
		
		label_50 = new JLabel("");
		
		label_51 = new JLabel("");
		
		label_52 = new JLabel("");
		
		label_53 = new JLabel("");
		
		label_54 = new JLabel("");
		GroupLayout gl_addcarpan = new GroupLayout(addcarpan);
		gl_addcarpan.setHorizontalGroup(
			gl_addcarpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(74)
							.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
						.addComponent(lblPhoto_1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_27, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(99)
							.addComponent(label_42))
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(75)
							.addComponent(label_43, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
					.addGap(36)
					.addComponent(textfnumserie, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(37)
							.addComponent(textfserie, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
					.addGap(6)
					.addComponent(label_51, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(label_44, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
					.addGap(54)
					.addComponent(textfmarq, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_47, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGap(35)
					.addComponent(lblCouleur, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(label_52, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
					.addGap(54)
					.addComponent(textfColor, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_48, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPhoto, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(75)
							.addComponent(label_45, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
					.addGap(53)
					.addComponent(txtkilom, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_49, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGap(35)
					.addComponent(lblTarif, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(label_46, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
					.addGap(53)
					.addComponent(textftarf, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_50, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGap(10)
					.addComponent(label_53, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnadd, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_54, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGap(279)
					.addComponent(errField, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
					.addGap(279))
		);
		gl_addcarpan.setVerticalGroup(
			gl_addcarpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_addcarpan.createSequentialGroup()
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(68)
							.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_addcarpan.createSequentialGroup()
									.addGap(64)
									.addComponent(lblPhoto_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(88)
							.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(97)
							.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
								.addComponent(label_42)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_addcarpan.createSequentialGroup()
									.addGap(1)
									.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
						.addComponent(textfnumserie, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(textfserie, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_51, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_44, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textfmarq, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_47, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(5)
							.addComponent(lblCouleur, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_52, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textfColor, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(6)
							.addComponent(label_48, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(13)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPhoto, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_addcarpan.createSequentialGroup()
									.addGap(1)
									.addComponent(label_45, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
						.addComponent(txtkilom, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_49, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(7)
							.addComponent(lblTarif, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_46, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textftarf, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_50, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(117)
					.addComponent(errField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_addcarpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnadd, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_addcarpan.createSequentialGroup()
							.addGap(15)
							.addComponent(label_54, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
		);
		addcarpan.setLayout(gl_addcarpan);

		menupan = new JPanel();
		menupan.setOpaque(false);
		menupan.setVisible(true);
		menupan.setPreferredSize(new Dimension(500, 400));
		menupan.setBackground(new Color(255,255,255,100));
		GroupLayout gl_mainpan = new GroupLayout(mainpan);
		gl_mainpan.setHorizontalGroup(
			gl_mainpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainpan.createSequentialGroup()
					.addComponent(menupan, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
					.addGap(0))
				.addGroup(gl_mainpan.createSequentialGroup()
					.addGap(258)
					.addComponent(editablepan, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
		);
		gl_mainpan.setVerticalGroup(
			gl_mainpan.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_mainpan.createSequentialGroup()
					.addGroup(gl_mainpan.createParallelGroup(Alignment.TRAILING)
						.addComponent(editablepan, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
						.addComponent(menupan, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
					.addGap(0))
		);
		
		clientdispan = new JPanel();
		editablepan.add(clientdispan, "name_870263610358717");
		clientdispan.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(49, 78, 685, 452);
		clientdispan.add(scrollPane_5);
		
		table_2 = new JTable();
		table_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		modelcldis = new DefaultTableModel(new Object[][] {},
				new String[] { "Photo","NCIN","Nom","Prenom","Num Telephone","Adresse"});
		table_2.setModel(modelcldis);
		scrollPane_5.setViewportView(table_2);
		 DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	        centerRenderer.setHorizontalAlignment(JLabel.CENTER);


		affichecldisp = new JButton("Afficher");
		affichecldisp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelcldis = new DefaultTableModel(new Object[][] {},
						new String[] { "Photo","NCIN","Nom","Prenom","Num Telephone","Adresse"});
				table_2.setModel(modelcldis);

				try {
					Vector<Client> ens_cl = DataBase.getdataallcl();
					if(!ens_cl.isEmpty())
					for (int i = 0; i < ens_cl.size(); i++) {
						Object[] row = new Object[6];
						row[0] = new ImageIcon(ens_cl.elementAt(i).getImage());
						row[1] = ens_cl.elementAt(i).getNCIN();
						row[2] = ens_cl.elementAt(i).getnom();
						row[3] = ens_cl.elementAt(i).getPrenom();
						row[4] = ens_cl.elementAt(i).getNumtel();
						row[5] = ens_cl.elementAt(i).getAdr();
				        table_2.getColumnModel().getColumn(0).setCellRenderer(new ImageCellRenderer());
				        table_2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
				        table_2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
			       table_2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
			       table_2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
			       table_2.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
			       table_2.setRowHeight(60);
						modelcldis.addRow(row);
					}
					else
						JOptionPane.showMessageDialog(null, "Il n'y a aucun client disponible.", "Message", 1);
						
						
				} catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}
		});
		affichecldisp.setForeground(Color.BLACK);
		affichecldisp.setFont(new Font("Tahoma", Font.BOLD, 12));
		affichecldisp.setBackground(new Color(167, 148, 116));
		affichecldisp.setBounds(258, 573, 266, 29);
		clientdispan.add(affichecldisp);
		
		voituredispan = new JPanel();
		editablepan.add(voituredispan, "name_880062700559877");
		voituredispan.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(56, 55, 671, 488);
		voituredispan.add(scrollPane_6);
		
		table_3 = new JTable();
		table_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		table_3.setBackground(Color.WHITE);
		 modelcardis = new DefaultTableModel(null,
				new String[] {"Photo", "Matricule","Marque","Couleur","Prix","Etat"});
		table_3.setModel(modelcardis);
		table_3.getColumnModel().getColumn(0).setPreferredWidth(186);
		

	
		scrollPane_6.setViewportView(table_3);
		affichevoitdisp = new JButton("Afficher");
		affichevoitdisp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Vector<Voiture> ens_v = DataBase.getdatavoit();
					 modelcardis = new DefaultTableModel(null,
								new String[] {"Photo", "Matricule","Marque","Couleur","Prix","Etat"});
						table_3.setModel(modelcardis);
						 DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();

				for (int i = 0; i < ens_v.size(); i++) {

					Object[] row = new Object[6];
					row[0]= new ImageIcon(ens_v.elementAt(i).get_image());
					row[1] = ens_v.elementAt(i).get_mat();
					row[2] = ens_v.elementAt(i).getMarque();
					row[3] = ens_v.elementAt(i).getColor();
					row[4] = ens_v.elementAt(i).getTarif();
					if(ens_v.elementAt(i).getState())
					row[5]= "Libre";
					else
						row[5]="Occupée";
					

					modelcardis.addRow(row);
				}
			        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
				table_3.getColumnModel().getColumn(0).setCellRenderer(new ImageCellRenderer());
		        table_3.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		        table_3.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
		        table_3.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
		        table_3.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
		        table_3.getColumnModel().getColumn(5).setCellRenderer(new IconCellRendered());
			     table_3.setRowHeight(60);
			} catch (SQLException | ClassNotFoundException ee) {
				JOptionPane.showMessageDialog(frame,
						"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

			}
			}
		});
		affichevoitdisp.setForeground(Color.BLACK);
		affichevoitdisp.setFont(new Font("Tahoma", Font.BOLD, 12));
		affichevoitdisp.setBackground(new Color(167, 148, 116));
		affichevoitdisp.setBounds(277, 578, 229, 29);
		voituredispan.add(affichevoitdisp);
		
		carinfopan.setLayout(null);
		carinfopan.setBackground(new Color(218, 218, 218));
		editablepan.add(carinfopan, "name_972138540795020");
		
	    label_20 = new JLabel("");
		label_20.setBounds(224, 28, 229, 116);
		carinfopan.add(label_20);
		
		JLabel lblMatricule_4 = new JLabel("Matricule");
		lblMatricule_4.setForeground(Color.BLACK);
		lblMatricule_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMatricule_4.setBounds(44, 170, 60, 16);
		carinfopan.add(lblMatricule_4);
		
		JLabel lblKilomtrage = new JLabel("Kilométrage");
		lblKilomtrage.setForeground(Color.BLACK);
		lblKilomtrage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKilomtrage.setBounds(44, 218, 69, 16);
		carinfopan.add(lblKilomtrage);
		
		JLabel lblMarque = new JLabel("Marque");
		lblMarque.setForeground(Color.BLACK);
		lblMarque.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMarque.setBounds(44, 287, 54, 16);
		carinfopan.add(lblMarque);
		
		JLabel lblCouleur_1 = new JLabel("Couleur");
		lblCouleur_1.setForeground(Color.BLACK);
		lblCouleur_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCouleur_1.setBounds(44, 324, 54, 16);
		carinfopan.add(lblCouleur_1);
		
		JLabel lblEtat = new JLabel("Etat");
		lblEtat.setForeground(Color.BLACK);
		lblEtat.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEtat.setBounds(44, 366, 41, 16);
		carinfopan.add(lblEtat);
		
		serie = new JTextField();
		serie.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		serie.setHorizontalAlignment(SwingConstants.LEFT);
		serie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		serie.setEditable(false);
		serie.setColumns(10);
		serie.setBorder(null);
		serie.setBackground(null);
		serie.setBounds(342, 165, 111, 26);
		carinfopan.add(serie);
		
		txtkilo = new JTextField();
		txtkilo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtkilo.setEditable(false);
		txtkilo.setColumns(10);
		txtkilo.setBorder(null);
		txtkilo.setBackground(null);
		txtkilo.setBounds(343, 213, 110, 26);
		carinfopan.add(txtkilo);
		
		txtmarq = new JTextField();
		txtmarq.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtmarq.setEditable(false);
		txtmarq.setColumns(10);
		txtmarq.setBorder(null);
		txtmarq.setBackground(null);
		txtmarq.setBounds(343, 282, 110, 26);
		carinfopan.add(txtmarq);
		
		txtcol = new JTextField();
		txtcol.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtcol.setBackground(null);
		txtcol.setEditable(false);
		txtcol.setColumns(10);
		txtcol.setBorder(null);
		txtcol.setBounds(343, 319, 110, 26);
		carinfopan.add(txtcol);
		
	    btnHistoriqueDeLa = new JButton("Afficher");
		btnHistoriqueDeLa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnHistoriqueDeLa.setBackground(new Color(167, 148, 116));
		btnHistoriqueDeLa.setVisible(false);
		btnHistoriqueDeLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 try {
				 
				 Vector<Object[]> ens_Obj=DataBase.getdatalocmat(textField.getText()+ "TN"+ textField_1.getText());
				table_5.setModel(modelcarinfo=new DefaultTableModel(null, new String[] { "Date de Location","Date fin de location","durée", "NCIN du locataire", "Nom", "prénom","Num Telephone" }));
				for(int i=0;i<ens_Obj.size();i++)
				{
					Object[] row=new Object[7];
					row[0]=((Location)( ens_Obj.elementAt(i)[0])).getDate();
					row[1]=((Location)( ens_Obj.elementAt(i)[0])).getDatefin();
					row[2]=((Location)( ens_Obj.elementAt(i)[0])).getDuree();
					row[3]=((Client)( ens_Obj.elementAt(i)[1])).getNCIN();
					row[4]=((Client)( ens_Obj.elementAt(i)[1])).getnom();
					row[5]=((Client)( ens_Obj.elementAt(i)[1])).getPrenom();
					row[6]=((Client)( ens_Obj.elementAt(i)[1])).getNumtel();
					modelcarinfo.addRow(row);
				}
			} catch (ClassNotFoundException | SQLException e1) {
			}
			}
		});
		btnHistoriqueDeLa.setBounds(328, 603, 125, 26);
		carinfopan.add(btnHistoriqueDeLa);
		
		JLabel lblPhotoDeVhicule = new JLabel("Photo de véhicule");
		lblPhotoDeVhicule.setForeground(Color.BLACK);
		lblPhotoDeVhicule.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPhotoDeVhicule.setBounds(44, 66, 117, 26);
		carinfopan.add(lblPhotoDeVhicule);
		
		lblPrixjour = new JLabel("Prix (/jour)");
		lblPrixjour.setForeground(Color.BLACK);
		lblPrixjour.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrixjour.setBounds(44, 245, 69, 26);
		carinfopan.add(lblPrixjour);
		
		txtpr = new JTextField();
		txtpr.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpr.setEditable(false);
		txtpr.setColumns(10);
		txtpr.setBorder(null);
		txtpr.setBackground((Color) null);
		txtpr.setBounds(343, 248, 110, 26);
		carinfopan.add(txtpr);
		
		scrollPane_8 = new JScrollPane();
		scrollPane_8.setVisible(false);
		scrollPane_8.setBounds(33, 458, 727, 125);
		carinfopan.add(scrollPane_8);
		
		table_5 = new JTable();
		modelcarinfo=new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			"Date de Location","Date fin de location","durée", "NCIN du locataire", "Nom", "prénom","Num Telephone"
			}
		);
		table_5.setModel(modelcarinfo);
		scrollPane_8.setViewportView(table_5);
		
	    label_22 = new JLabel("");
		icon=true;
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(icon)
				{
					scrollPane_8.setVisible(true);
					table_5.setVisible(true);
					btnHistoriqueDeLa.setVisible(true);
					label_22.setIcon(new  ImageIcon("images\\onicon.png"));
					icon=false;
					
				}
				else
				{
					scrollPane_8.setVisible(false);
					table_5.setVisible(false);
					btnHistoriqueDeLa.setVisible(false);
					label_22.setIcon(new  ImageIcon("images\\officon.png"));
					icon=true;
				}
				
				
				 
			}
		});
		label_22.setIcon(new  ImageIcon("images\\officon.png"));
		label_22.setBounds(44, 393, 35, 35);
		carinfopan.add(label_22);
		
	    labelstate = new JLabel("");
		labelstate.setBounds(382, 357, 41, 40);
		carinfopan.add(labelstate);
		showocccar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addlocpan.setVisible(false);
				addcarpan.setVisible(false);
				welcpanaft.setVisible(false);
				searchclpan.setVisible(false);
				searchcarpan.setVisible(false);
				freecarpan.setVisible(false);
				clientdispan.setVisible(false);
				SupVoit.setVisible(false);
				voituredispan.setVisible(false);
				ajustpricpan.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(true);
			}
		});
		showocccar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				labelshowoccc.setOpaque(true);
			}

			public void mouseExited(MouseEvent e) {
				labelshowoccc.setOpaque(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				addlocationbnt.setForeground(Color.WHITE);
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.black);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 12));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(true);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				labelshowoccc.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\voitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));
				
			}
		});
		
				showfreecarbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						addlocpan.setVisible(false);
						addcarpan.setVisible(false);
						welcpanaft.setVisible(false);
						searchclpan.setVisible(false);
						searchcarpan.setVisible(false);
						freecarpan.setVisible(false);
						clientdispan.setVisible(false);
						SupVoit.setVisible(false);
						voituredispan.setVisible(false);
						ajustpricpan.setVisible(false);
						showfreecarpan.setVisible(true);
						showocccarpan.setVisible(false);
		
					}
				});
				showfreecarbtn.addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						labelshowfreec.setOpaque(true);
					}

					public void mouseExited(MouseEvent e) {
						labelshowfreec.setOpaque(false);
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						addlocationbnt.setForeground(Color.WHITE);
						addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
						addcarbnt.setForeground(Color.WHITE);
						addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
						clientsearchbnt.setForeground(Color.WHITE);
						clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
						searchcarbnt.setForeground(Color.WHITE);
						searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
						freecarbtn.setForeground(Color.WHITE);
						freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
						ajustpricbtn.setForeground(Color.WHITE);
						ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
						btnSupprimerVoiture.setForeground(Color.WHITE);
						btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
						btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
						btnVoituresDisponibles.setForeground(Color.WHITE);
						showocccar.setForeground(Color.WHITE);
						showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
						showfreecarbtn.setForeground(Color.black);
						showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
						btnClientDisponible.setForeground(Color.WHITE);
						btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
						addlocationbnt.setOpaque(false);
						addcarbnt.setOpaque(false);
						clientsearchbnt.setOpaque(false);
						searchcarbnt.setOpaque(false);
						freecarbtn.setOpaque(false);
						ajustpricbtn.setOpaque(false);
						btnSupprimerVoiture.setOpaque(false);
						btnVoituresDisponibles.setOpaque(false);
						showocccar.setOpaque(false);
						showfreecarbtn.setOpaque(true);
						btnClientDisponible.setOpaque(false);
						ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
						showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
						clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
						addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
						searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
						freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
						addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
						btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
						btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
						showfreecarbtn.setIcon(new ImageIcon("images\\freecar.png"));
						showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
						btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));
					}
				});
		
		labeladdloc = new JLabel("");
		labeladdloc.setBackground(new Color(255,255,255,100));
		
		labelajoutv = new JLabel("");
		labelajoutv.setBackground(new Color(255, 255, 255, 100));
		labellibvoit = new JLabel("");
		labellibvoit.setBackground(new Color(255, 255, 255, 100));
		labelprix = new JLabel("");
		labelprix.setBackground(new Color(255, 255, 255, 100));
		labelsearchcar = new JLabel("");
		labelsearchcar.setBackground(new Color(255, 255, 255, 100));
		labelshowfreec = new JLabel("");
		labelshowfreec.setBackground(new Color(255, 255, 255, 100));
		labelshowoccc = new JLabel("");
		labelshowoccc.setBackground(new Color(255, 255, 255, 100));
		labelsearchcl = new JLabel("");
		labelsearchcl.setBackground(new Color(255, 255, 255, 100));
		labelsuppvoit = new JLabel("");
		labelsuppvoit.setBackground(new Color(255, 255, 255, 100));
		
		btnClientDisponible.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addlocpan.setVisible(false);
				addcarpan.setVisible(false);
				searchclpan.setVisible(false);
				welcpanaft.setVisible(false);
				searchcarpan.setVisible(false);
				voituredispan.setVisible(false);
				freecarpan.setVisible(false);
				SupVoit.setVisible(false);
				ajustpricpan.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(false);
				clientdispan.setVisible(true);
			}
		});
		
	    labelclientdis = new JLabel("");
		labelclientdis.setBackground(new Color(255, 255, 255, 100));
		
		JLabel label_18 = new JLabel("");
		label_18.setIcon(null);
		label_18.setBackground(new Color(255, 255, 255, 100));
		
		btnVoituresDisponibles.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addlocationbnt.setForeground(Color.WHITE);
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnVoituresDisponibles.setForeground(Color.black);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(true);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\carsicon.png"));
				label_18.setOpaque(false);
			}
			public void mouseEntered(MouseEvent e)
			{
				label_18.setOpaque(true);
			}
			public void mouseExited(MouseEvent e)
			{
				label_18.setOpaque(false);
			}
		});
		btnVoituresDisponibles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					addlocpan.setVisible(false);
					addcarpan.setVisible(false);
					searchclpan.setVisible(false);
					welcpanaft.setVisible(false);
					searchcarpan.setVisible(false);
					freecarpan.setVisible(false);
					SupVoit.setVisible(false);
					ajustpricpan.setVisible(false);
					showfreecarpan.setVisible(false);
					showocccarpan.setVisible(false);
					clientdispan.setVisible(false);
					voituredispan.setVisible(true);
			}
		});
		GroupLayout gl_menupan = new GroupLayout(menupan);
		gl_menupan.setHorizontalGroup(
			gl_menupan.createParallelGroup(Alignment.LEADING)
				.addComponent(addlocationbnt, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labeladdloc, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(addcarbnt, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labelajoutv, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(freecarbtn, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labellibvoit, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labelprix, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(ajustpricbtn, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labelsearchcar, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(searchcarbnt, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labelsearchcl, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(clientsearchbnt, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labelshowfreec, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(showfreecarbtn, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labelshowoccc, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(showocccar, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labelclientdis, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnClientDisponible, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnVoituresDisponibles, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnSupprimerVoiture, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addComponent(labelsuppvoit, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
		);
		gl_menupan.setVerticalGroup(
			gl_menupan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menupan.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(addlocationbnt, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(labeladdloc, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(addcarbnt, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(labelajoutv, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(freecarbtn, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(labellibvoit, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(labelprix, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(ajustpricbtn, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(labelsearchcar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(searchcarbnt, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(labelsearchcl, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(clientsearchbnt, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(labelshowfreec, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(showfreecarbtn, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(labelshowoccc, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(showocccar, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(labelclientdis, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnClientDisponible, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVoituresDisponibles, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_menupan.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSupprimerVoiture, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(labelsuppvoit, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(43))
		);
		menupan.setLayout(gl_menupan);

		searchcarbnt.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				addlocationbnt.setForeground(Color.WHITE);
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.BLACK);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 12));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(true);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\searchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));

			}

			public void mouseEntered(MouseEvent e) {
				labelsearchcar.setOpaque(true);
				
			}

			public void mouseExited(MouseEvent e) {
				labelsearchcar.setOpaque(false);
			}
		});
		searchcarbnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addlocpan.setVisible(false);
				addcarpan.setVisible(false);
				searchclpan.setVisible(false);
				welcpanaft.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(false);
				searchcarpan.setVisible(true);
				clientdispan.setVisible(false);
				voituredispan.setVisible(false);
				freecarpan.setVisible(false);
				SupVoit.setVisible(false);
				ajustpricpan.setVisible(false);
				textField_2.setText(null);
				textField_3.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textFieldncin.setText(null);
				textfserie.setText(null);
				textfnumserie.setText(null);
				textfmarq.setText(null);
				textfColor.setText(null);
				textftarf.setText(null);
				txtserie.setText(null);
				textnumserie.setText(null);
				saisieduree.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textnumser.setText(null);
				textserie.setText(null);
				txtncin.setText(null);
				txtnom.setText(null);
				txtprenom.setText(null);
				txtadr.setText(null);
				txtnumtel.setText(null);
				txtErrfield.setText(null);
				errField.setText(null);
				errField2.setText(null);
				txtErr.setText(null);
				txtErr2.setText(null);
				texterr.setText(null);
				textField_4.setText(null);
				textField_7.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);

			}
		});
		addlocationbnt.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				addlocationbnt.setForeground(Color.BLACK);
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 12));
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(true);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\ico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				labeladdloc.setOpaque(true);
			}

			public void mouseExited(MouseEvent e) {
				labeladdloc.setOpaque(false);
			}
		});
		addlocationbnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addlocpan.setVisible(true);
				addcarpan.setVisible(false);
				searchclpan.setVisible(false);
				searchcarpan.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(false);
				freecarpan.setVisible(false);
				clientdispan.setVisible(false);
				voituredispan.setVisible(false);
				SupVoit.setVisible(false);
				welcpanaft.setVisible(false);
				showfreecarpan.setVisible(false);
				ajustpricpan.setVisible(false);
				textField_2.setText(null);
				textField_3.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textFieldncin.setText(null);
				textfserie.setText(null);
				textfnumserie.setText(null);
				textfmarq.setText(null);
				textfColor.setText(null);
				textftarf.setText(null);
				txtserie.setText(null);
				textnumserie.setText(null);
				saisieduree.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textnumser.setText(null);
				textserie.setText(null);
				txtncin.setText(null);
				txtnom.setText(null);
				txtprenom.setText(null);
				txtadr.setText(null);
				txtnumtel.setText(null);
				txtErrfield.setText(null);
				errField.setText(null);
				errField2.setText(null);
				txtErr.setText(null);
				txtErr2.setText(null);
				texterr.setText(null);
				textField_4.setText(null);
				textField_7.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				try {
					ens_NCIN=DataBase.getdataallcl();
					DefaultListModel<String> m = new DefaultListModel<String>();
					for(int i=0;i<ens_NCIN.size();i++)
					{
						m.addElement(String.valueOf(ens_NCIN.elementAt(i).getNCIN()));
					}
					
					list.setModel(m);
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		btnSupprimerVoiture.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setForeground(Color.WHITE);
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.BLACK);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(true);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\deletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));

			}

			public void mouseEntered(MouseEvent e) {
				labelsuppvoit.setOpaque(true);
			}

			public void mouseExited(MouseEvent e) {
				labelsuppvoit.setOpaque(false);
			}
		});
		btnSupprimerVoiture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addlocpan.setVisible(false);
				addcarpan.setVisible(false);
				searchclpan.setVisible(false);
				searchcarpan.setVisible(false);
				voituredispan.setVisible(false);
				clientdispan.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(false);
				freecarpan.setVisible(false);
				welcpanaft.setVisible(false);
				clientdispan.setVisible(false);
				ajustpricpan.setVisible(false);
				SupVoit.setVisible(true);
				textField_2.setText(null);
				textField_3.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textFieldncin.setText(null);
				textfserie.setText(null);
				textfnumserie.setText(null);
				textfmarq.setText(null);
				textfColor.setText(null);
				textftarf.setText(null);
				txtserie.setText(null);
				textnumserie.setText(null);
				saisieduree.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textnumser.setText(null);
				textserie.setText(null);
				txtncin.setText(null);
				txtnom.setText(null);
				txtprenom.setText(null);
				txtadr.setText(null);
				txtnumtel.setText(null);
				txtErrfield.setText(null);
				errField.setText(null);
				errField2.setText(null);
				txtErr.setText(null);
				txtErr2.setText(null);
				texterr.setText(null);
				textField_4.setText(null);
				textField_7.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
			}
		});

		ajustpricbtn.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setForeground(Color.WHITE);
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.BLACK);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(true);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\dollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));

			}

			public void mouseEntered(MouseEvent e) {
				labelprix.setOpaque(true);
			}

			public void mouseExited(MouseEvent e) {
				labelprix.setOpaque(false);
			}
		});
		ajustpricbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addlocpan.setVisible(false);
				addcarpan.setVisible(false);
				welcpanaft.setVisible(false);
				searchclpan.setVisible(false);
				searchcarpan.setVisible(false);
				freecarpan.setVisible(false);
				clientdispan.setVisible(false);
				SupVoit.setVisible(false);
				voituredispan.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(false);
				ajustpricpan.setVisible(true);
				textField_2.setText(null);
				textField_3.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textFieldncin.setText(null);
				textfserie.setText(null);
				textfnumserie.setText(null);
				textfmarq.setText(null);
				textfColor.setText(null);
				textftarf.setText(null);
				txtserie.setText(null);
				textnumserie.setText(null);
				saisieduree.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textnumser.setText(null);
				textserie.setText(null);
				txtncin.setText(null);
				txtnom.setText(null);
				txtprenom.setText(null);
				txtadr.setText(null);
				txtnumtel.setText(null);
				txtErrfield.setText(null);
				errField.setText(null);
				errField2.setText(null);
				txtErr.setText(null);
				txtErr2.setText(null);
				texterr.setText(null);
				textField_4.setText(null);
				textField_7.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
			}
		});

		addcarbnt.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				addlocationbnt.setForeground(Color.WHITE);
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addcarbnt.setForeground(Color.BLACK);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 12));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(true);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\addcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));

			}

			public void mouseEntered(MouseEvent e) {
				labelajoutv.setOpaque(true);
			}

			public void mouseExited(MouseEvent e) {
				labelajoutv.setOpaque(false);
			}
		});
		addcarbnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addlocpan.setVisible(false);
				addcarpan.setVisible(true);
				searchclpan.setVisible(false);
				searchcarpan.setVisible(false);
				voituredispan.setVisible(false);
				freecarpan.setVisible(false);
				SupVoit.setVisible(false);
				welcpanaft.setVisible(false);
				clientdispan.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(false);
				ajustpricpan.setVisible(false);
				textField_2.setText(null);
				textField_3.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textFieldncin.setText(null);
				textfserie.setText(null);
				textfnumserie.setText(null);
				textfmarq.setText(null);
				textfColor.setText(null);
				textftarf.setText(null);
				txtserie.setText(null);
				textnumserie.setText(null);
				saisieduree.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textnumser.setText(null);
				textserie.setText(null);
				txtncin.setText(null);
				txtnom.setText(null);
				txtprenom.setText(null);
				txtadr.setText(null);
				txtnumtel.setText(null);
				txtErrfield.setText(null);
				errField.setText(null);
				errField2.setText(null);
				txtErr.setText(null);
				txtErr2.setText(null);
				texterr.setText(null);
				textField_4.setText(null);
				textField_7.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);

			}
		});
		clientsearchbnt.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				addlocationbnt.setForeground(Color.WHITE);
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.BLACK);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 12));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.WHITE);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(true);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(false);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\searchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));

			}

			public void mouseEntered(MouseEvent e) {
				labelsearchcl.setOpaque(true);
			}

			public void mouseExited(MouseEvent e) {
				labelsearchcl.setOpaque(false);
			}
		});
		clientsearchbnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				addlocpan.setVisible(false);
				addcarpan.setVisible(false);
				searchclpan.setVisible(true);
				clientdispan.setVisible(false);
				voituredispan.setVisible(false);
				searchcarpan.setVisible(false);
				freecarpan.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(false);
				welcpanaft.setVisible(false);
				SupVoit.setVisible(false);
				ajustpricpan.setVisible(false);
				textField_2.setText(null);
				textField_3.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textFieldncin.setText(null);
				textfserie.setText(null);
				textfnumserie.setText(null);
				textfmarq.setText(null);
				textfColor.setText(null);
				textftarf.setText(null);
				txtserie.setText(null);
				textnumserie.setText(null);
				saisieduree.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textnumser.setText(null);
				textserie.setText(null);
				txtncin.setText(null);
				txtnom.setText(null);
				txtprenom.setText(null);
				txtadr.setText(null);
				txtnumtel.setText(null);
				txtErrfield.setText(null);
				errField.setText(null);
				errField2.setText(null);
				txtErr.setText(null);
				txtErr2.setText(null);
				texterr.setText(null);
				textField_4.setText(null);
				textField_7.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
			}

		});

		freecarbtn.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				addlocationbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setForeground(Color.WHITE);
				addcarbnt.setForeground(Color.WHITE);
				addcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				clientsearchbnt.setForeground(Color.WHITE);
				clientsearchbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				searchcarbnt.setForeground(Color.WHITE);
				searchcarbnt.setFont(new Font("Tahoma", Font.BOLD, 11));
				freecarbtn.setForeground(Color.black);
				freecarbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
				ajustpricbtn.setForeground(Color.WHITE);
				ajustpricbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnSupprimerVoiture.setForeground(Color.WHITE);
				btnSupprimerVoiture.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnVoituresDisponibles.setForeground(Color.WHITE);
				showocccar.setForeground(Color.WHITE);
				showocccar.setFont(new Font("Tahoma", Font.BOLD, 11));
				showfreecarbtn.setForeground(Color.WHITE);
				showfreecarbtn.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnClientDisponible.setForeground(Color.WHITE);
				btnClientDisponible.setFont(new Font("Tahoma", Font.BOLD, 11));
				addlocationbnt.setOpaque(false);
				addcarbnt.setOpaque(false);
				clientsearchbnt.setOpaque(false);
				searchcarbnt.setOpaque(false);
				freecarbtn.setOpaque(true);
				ajustpricbtn.setOpaque(false);
				btnSupprimerVoiture.setOpaque(false);
				btnVoituresDisponibles.setOpaque(false);
				showocccar.setOpaque(false);
				showfreecarbtn.setOpaque(false);
				btnClientDisponible.setOpaque(false);
				ajustpricbtn.setIcon(new ImageIcon("images\\wdollar.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				clientsearchbnt.setIcon(new ImageIcon("images\\wsearchcl.png"));
				addcarbnt.setIcon(new ImageIcon("images\\waddcar.png"));
				searchcarbnt.setIcon(new ImageIcon("images\\wsearchcar.png"));
				freecarbtn.setIcon(new ImageIcon("images\\freecar.png"));
				addlocationbnt.setIcon(new ImageIcon("images\\wico.png"));
				btnSupprimerVoiture.setIcon(new ImageIcon("images\\wdeletecar.png"));
				btnClientDisponible.setIcon(new  ImageIcon("images\\wclientsicon.png"));
				showfreecarbtn.setIcon(new ImageIcon("images\\wfreecar.png"));
				showocccar.setIcon(new ImageIcon("images\\wvoitureoccicon.png"));
				btnVoituresDisponibles.setIcon(new ImageIcon("images\\wcarsicon.png"));

			}

			public void mouseEntered(MouseEvent e) {
				labellibvoit.setOpaque(true);
			}

			public void mouseExited(MouseEvent e) {
				labellibvoit.setOpaque(false);
			}
		});
		freecarbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addlocpan.setVisible(false);
				addcarpan.setVisible(false);
				searchclpan.setVisible(false);
				clientdispan.setVisible(false);
				voituredispan.setVisible(false);
				welcpanaft.setVisible(false);
				searchcarpan.setVisible(false);
				showfreecarpan.setVisible(false);
				showocccarpan.setVisible(false);
				freecarpan.setVisible(true);
				SupVoit.setVisible(false);
				ajustpricpan.setVisible(false);
				textField_2.setText(null);
				textField_3.setText(null);
				textField.setText(null);
				textField_1.setText(null);
				textFieldncin.setText(null);
				textfserie.setText(null);
				textfnumserie.setText(null);
				textfmarq.setText(null);
				textfColor.setText(null);
				textftarf.setText(null);
				txtserie.setText(null);
				textnumserie.setText(null);
				saisieduree.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textnumser.setText(null);
				textserie.setText(null);
				txtncin.setText(null);
				txtnom.setText(null);
				txtprenom.setText(null);
				txtadr.setText(null);
				txtnumtel.setText(null);
				txtErrfield.setText(null);
				errField.setText(null);
				errField2.setText(null);
				txtErr.setText(null);
				txtErr2.setText(null);
				texterr.setText(null);
				textField_4.setText(null);
				textField_7.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
			}
		});
		mainpan.setLayout(gl_mainpan);
		bilanpan = new JPanel();
		loged.add(bilanpan, "name_694190121696352");
		bilanpan.setVisible(false);
		JScrollPane scrollPane_4 = new JScrollPane();
		textArea_2.setEditable(false);
		scrollPane_4.setViewportView(textArea_2);
		textArea_2.setText("");
		GroupLayout gl_bilanpan = new GroupLayout(bilanpan);
		gl_bilanpan.setHorizontalGroup(
			gl_bilanpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bilanpan.createSequentialGroup()
					.addGap(214)
					.addComponent(scrollPane_4, GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
					.addGap(215))
		);
		gl_bilanpan.setVerticalGroup(
			gl_bilanpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bilanpan.createSequentialGroup()
					.addGap(71)
					.addComponent(scrollPane_4, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(284, Short.MAX_VALUE))
		);
		bilanpan.setLayout(gl_bilanpan);

		notificpan = new JPanel();
		notificpan.setOpaque(false);
		notificpan.setFocusable(true);
		loged.add(notificpan, "name_742438026756526");
		notificpan.setBackground(new Color(218, 218, 218));

		scrollPane_3 = new JScrollPane();

		textArea_1 = new JTextArea();
		textArea_1.setForeground(Color.BLACK);
		textArea_1.setEditable(false);
		textArea_1.setBackground(new Color(218, 218, 218));
		scrollPane_3.setBorder(null);
		scrollPane_3.setViewportView(textArea_1);
		GroupLayout gl_notificpan = new GroupLayout(notificpan);
		gl_notificpan.setHorizontalGroup(gl_notificpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_notificpan.createSequentialGroup().addGap(23)
						.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE).addGap(24)));
		gl_notificpan.setVerticalGroup(gl_notificpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_notificpan.createSequentialGroup().addGap(30)
						.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE).addGap(30)));
		notificpan.setLayout(gl_notificpan);

		historypan = new JPanel();
		loged.add(historypan, "name_741850752495244");
		historypan.setForeground(Color.WHITE);
		historypan.setBackground(new Color(218, 218, 218));

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(null);

		textArea = new JTextArea();
		textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPane_1.setViewportView(textArea);
		textArea.setTabSize(8);
		textArea.setEditable(false);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textArea.setForeground(Color.black);
		textArea.setBackground(new Color(218, 218, 218));
		
		btnAfficher = new JButton("rafraîchir");
		btnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Vector<String> hist;
				try {
					hist = DataBase.getdatalogs();
				if (!hist.isEmpty()) {
					String s = "";
					for (int i = 0; i < hist.size(); i++) {
						s += " " + hist.elementAt(i) + "\n";
					}
					textArea.setText(s);
				} else {
					textArea.setText("Aucune historique disponible pour le moments");
				}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAfficher.setForeground(Color.BLACK);
		btnAfficher.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAfficher.setBackground(new Color(167, 148, 116));
		
		JLabel label_83 = new JLabel("");
		
		JLabel label_84 = new JLabel("");
		GroupLayout gl_historypan = new GroupLayout(historypan);
		gl_historypan.setHorizontalGroup(
			gl_historypan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_historypan.createSequentialGroup()
					.addGap(41)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
					.addGap(41))
				.addGroup(gl_historypan.createSequentialGroup()
					.addGap(10)
					.addComponent(label_83, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
					.addGap(4)
					.addComponent(btnAfficher, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(label_84, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_historypan.setVerticalGroup(
			gl_historypan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_historypan.createSequentialGroup()
					.addGap(52)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
					.addGap(13)
					.addGroup(gl_historypan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_historypan.createSequentialGroup()
							.addGap(10)
							.addComponent(label_83, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnAfficher, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_84, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(11))
		);
		historypan.setLayout(gl_historypan);

		manageaccts = new JPanel();
		manageaccts.setOpaque(false);
		manageaccts.setFocusable(true);
		loged.add(manageaccts, "name_741850730294233");
		manageaccts.setBackground(new Color(218, 218, 218));
		manageaccts.setVisible(false);

		JLabel lblGrerLesUtilisateur = new JLabel("Géstionnaire des utilisateurs");
		lblGrerLesUtilisateur.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGrerLesUtilisateur.setForeground(Color.WHITE);

		scrollPane_2 = new JScrollPane();
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		table_1.setShowVerticalLines(false);
		table_1.setShowHorizontalLines(false);
		table_1.setShowGrid(false);
		scrollPane_2.setViewportView(table_1);
		table_1.setBackground(Color.LIGHT_GRAY);

		JButton btnSupprimer_1 = new JButton("Supprimer");
		btnSupprimer_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_1.setBackground(new Color(178,34,34));
		JLabel lblClDeValidation = new JLabel("Clé de validation");
		lblClDeValidation.setForeground(Color.WHITE);
		lblClDeValidation.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(textField_9.getText().equals("")) throw new FieldIncomplete();
						DataBase.setclef(textField_9.getText());
				
				}
				catch(FieldIncomplete err)
				{
					
				}
				catch (ClassNotFoundException | SQLException e1)
				{
					JOptionPane.showMessageDialog(frame, "L'application necessite un reseau internet,veuillez se connecter!","Erreur", 0);
				}
			}
		});
		btnModifier.setBackground(new Color(178,34,34));
		
		label_14 = new JLabel("");
		
		label_15 = new JLabel("");
		
		label_16 = new JLabel("");
		
		label_17 = new JLabel("");
		GroupLayout gl_manageaccts = new GroupLayout(manageaccts);
		gl_manageaccts.setHorizontalGroup(
			gl_manageaccts.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_manageaccts.createSequentialGroup()
					.addGroup(gl_manageaccts.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_manageaccts.createSequentialGroup()
							.addComponent(label_15, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
							.addGap(45)
							.addComponent(btnSupprimer_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_16, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
							.addGap(5))
						.addGroup(gl_manageaccts.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_manageaccts.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_manageaccts.createSequentialGroup()
									.addComponent(lblClDeValidation, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_14, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(161)
									.addComponent(btnModifier, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_17, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
								.addComponent(lblGrerLesUtilisateur, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_manageaccts.setVerticalGroup(
			gl_manageaccts.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_manageaccts.createSequentialGroup()
					.addGroup(gl_manageaccts.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_manageaccts.createSequentialGroup()
							.addGap(49)
							.addComponent(lblGrerLesUtilisateur, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_manageaccts.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_manageaccts.createSequentialGroup()
									.addGap(73)
									.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_manageaccts.createSequentialGroup()
									.addGap(29)
									.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_manageaccts.createSequentialGroup()
							.addGap(157)
							.addGroup(gl_manageaccts.createParallelGroup(Alignment.TRAILING)
								.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSupprimer_1))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_manageaccts.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_manageaccts.createSequentialGroup()
							.addGap(40)
							.addGroup(gl_manageaccts.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnModifier)
								.addComponent(lblClDeValidation, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_manageaccts.createSequentialGroup()
							.addGap(41)
							.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(90, Short.MAX_VALUE))
		);
		manageaccts.setLayout(gl_manageaccts);
		
		settingpan = new JPanel();
		settingpan.setOpaque(false);
		loged.add(settingpan, "name_741850707259524");
		settingpan.setBackground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		label_3.setForeground(Color.RED);
		
		txtnomutils = new JTextField();
		txtnomutils.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Locationclss.focuslistenertext(txtnomutils, null, label_4);
		
		JLabel lblNomDutilisateur_2 = new JLabel("Nom d'utilisateur");
		lblNomDutilisateur_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomDutilisateur_2.setForeground(Color.WHITE);

		JLabel lblMotDePass = new JLabel("Mot de passe");
		lblMotDePass.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMotDePass.setForeground(Color.WHITE);
		txtnomutils.setColumns(10);
		JLabel lblEditer = new JLabel("<html><u> Modifier </u></html>");
		lblEditer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblEditer.setForeground(new Color(167, 148, 116));
				lblEditer.setFont(new Font("Tahoma", Font.BOLD, 11));
				try {
					ens_u = DataBase.getuser();
					userext=false;
					for (int i = 0; i < ens_u.size(); i++) {
						if (ens_u.elementAt(i)[0].equals(txtnomutils.getText())) {
							userext=true;
						}
					}
					if(userext)
					{
						label_4.setForeground(Color.red);
						txtnomutils.setBackground(new Color(252, 194, 185));
						txtnomutils.setBorder(new LineBorder(Color.red,2));
						label_4.setText("Ce nom d'utilisateur existe déja");
						
					}
					else
					{
						DataBase.updateusersData(txtnomutils.getText(), currentUser[1], currentUser[2], currentUser[0]);
						currentUser[0] = txtnomutils.getText();
						label_4.setForeground(Color.green);
						label_4.setText("Le nom d'utilisateur a été changer");
					}
				} catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblEditer.setForeground(new Color(228, 192, 131));
				lblEditer.setFont(new Font("Tahoma", Font.BOLD, 11));
			}
			public void mousePressed(MouseEvent e)
			{
				lblEditer.setForeground(new Color(167, 148, 116));
				lblEditer.setFont(new Font("Tahoma", Font.BOLD, 12));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblEditer.setForeground(new Color(167, 148, 116));
				lblEditer.setFont(new Font("Tahoma", Font.BOLD, 11));
			}

			public void mouseReleased(MouseEvent e) {
				lblEditer.setForeground(new Color(167, 148, 116));
				lblEditer.setFont(new Font("Tahoma", Font.BOLD, 11));
			}
		});
		lblEditer.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEditer.setForeground(new Color(167, 148, 116));

		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Locationclss.focuslistenertext(passwordField_2, null, label_3);

		JLabel lblAncienMotDe = new JLabel("Ancien mot de passe");
		lblAncienMotDe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAncienMotDe.setForeground(Color.WHITE);
		lblAncienMotDe.setBackground(new Color(240, 240, 240));

		passwordField_3 = new JPasswordField();
		passwordField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		passwordField_3.setText("*******");
		Locationclss.focuslistenertext(passwordField_3, null, label_3);
		
		
		JLabel label_2 = new JLabel("<html><u> Modifier </u></html>");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label_2.setForeground(new Color(167, 148, 116));
				label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
				try {
					ens_u = DataBase.getuser();
					if (String.valueOf(passwordField_3.getPassword()).equals(currentUser))
						for (int i = 0; i < ens_u.size(); i++) {
							if (ens_u.elementAt(i)[0].equals(currentUser[0])) {
								label_3.setText(null);
								currentUser[1] = String.valueOf(passwordField_2.getPassword());
								String[] s = { currentUser[0], currentUser[1], currentUser[2] };
								DataBase.updateusersData(currentUser[0], currentUser[1], currentUser[2], currentUser[0]);
								ens_u.set(i, s);
								label_3.setForeground(Color.green);
								label_3.setText("Le mot de passe a été changer");
							}
						}
					else {
						label_3.setForeground(Color.red);
						passwordField_3.setBackground(new Color(252, 194, 185));
						passwordField_3.setBorder(new LineBorder(Color.red,2));
						label_3.setText("L'ancien mot de passe est incorrect");

					}
				} catch (SQLException | ClassNotFoundException ee) {
					JOptionPane.showMessageDialog(frame, "L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}
			public void mousePressed(MouseEvent e) {
				label_2.setForeground(new Color(167, 148, 116));
				label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			}
			public void mouseEntered(MouseEvent e) {
				label_2.setForeground(new Color(228, 192, 131));
				label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				label_2.setForeground(new Color(167, 148, 116));
				label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			}
			public void mouseReleased(MouseEvent e) {
				label_2.setForeground(new Color(167, 148, 116));
				label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(167, 148, 116));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		label_76 = new JLabel("");
		
		label_77 = new JLabel("");
		
		label_78 = new JLabel("");
		
		label_80 = new JLabel("");
		
		label_81 = new JLabel("");
		
		label_82 = new JLabel("");
		GroupLayout gl_settingpan = new GroupLayout(settingpan);
		gl_settingpan.setHorizontalGroup(
			gl_settingpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_settingpan.createSequentialGroup()
					.addGap(98)
					.addComponent(lblNomDutilisateur_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_76, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
					.addGap(9)
					.addComponent(txtnomutils, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(157)
					.addComponent(lblEditer, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(label_80, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_settingpan.createSequentialGroup()
					.addGap(410)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_settingpan.createSequentialGroup()
					.addGap(98)
					.addGroup(gl_settingpan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAncienMotDe, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(114)
							.addComponent(label_77, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
					.addGap(9)
					.addComponent(passwordField_3, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_82, GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
					.addGap(12))
				.addGroup(gl_settingpan.createSequentialGroup()
					.addGap(98)
					.addComponent(lblMotDePass, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(label_78, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(passwordField_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
					.addGap(157)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(label_81, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
					.addGap(7))
				.addGroup(gl_settingpan.createSequentialGroup()
					.addGap(399)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
		);
		gl_settingpan.setVerticalGroup(
			gl_settingpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_settingpan.createSequentialGroup()
					.addGap(83)
					.addGroup(gl_settingpan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNomDutilisateur_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_76, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtnomutils, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(11)
							.addComponent(lblEditer, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(16)
							.addComponent(label_80, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(75)
					.addGroup(gl_settingpan.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_settingpan.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAncienMotDe, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_settingpan.createSequentialGroup()
									.addGap(8)
									.addComponent(label_77, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_settingpan.createParallelGroup(Alignment.BASELINE)
							.addComponent(passwordField_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_82, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_settingpan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblMotDePass, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(8)
							.addComponent(label_78, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(2)
							.addComponent(passwordField_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(13)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_settingpan.createSequentialGroup()
							.addGap(15)
							.addComponent(label_81, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
		);
		settingpan.setLayout(gl_settingpan);
		GroupLayout gl_connectedpan = new GroupLayout(connectedpan);
		gl_connectedpan
				.setHorizontalGroup(
						gl_connectedpan.createParallelGroup(Alignment.LEADING)
								.addComponent(menuBar, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
								.addGroup(gl_connectedpan.createSequentialGroup().addGap(309)
										.addComponent(menucompte, GroupLayout.PREFERRED_SIZE, 171,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(249, Short.MAX_VALUE))
								.addGroup(gl_connectedpan.createSequentialGroup().addGap(487)
										.addComponent(menuadmin, GroupLayout.PREFERRED_SIZE, 171,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(71, Short.MAX_VALUE))
								.addComponent(loged, GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE));
		gl_connectedpan.setVerticalGroup(gl_connectedpan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_connectedpan.createSequentialGroup()
						.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_connectedpan.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_connectedpan.createSequentialGroup()
										.addComponent(menucompte, GroupLayout.PREFERRED_SIZE, 71,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(284, Short.MAX_VALUE))
								.addComponent(menuadmin, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
								.addComponent(loged, GroupLayout.PREFERRED_SIZE, 344, Short.MAX_VALUE))));
		
		
		menuadmin.setLayout(null);
		menuadmin.add(mntmHistorique);
		menuadmin.add(mntmGrerlescompte);
		mntmBilan.setForeground(Color.WHITE);
		mntmBilan.setFont(new Font("Tahoma", Font.BOLD, 11));
		mntmBilan.setFocusable(false);
		mntmBilan.setBorder(null);
		mntmBilan.setBackground(new Color(40, 39, 38));
		mntmBilan.setBounds(0, 72, 171, 35);
		menuadmin.add(mntmBilan);
		menucompte.setLayout(null);
		menucompte.add(mntmParametre);
		menucompte.add(dec);
		menuBar.setLayout(null);
		menuBar.add(mnAcceuil);
		menuBar.add(mnNotification);
		menuBar.add(mnMenu);
		menuBar.add(mnAdministration);
		connectedpan.setLayout(gl_connectedpan);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, "name_295103464750894");
		
		label_13 = new JLabel("");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setIcon(new  ImageIcon("images\\mainbackground.jpg"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 775, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 462, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
		try {
		ens_u = DataBase.getuser();
		}
		catch(Exception e)
		{}
		table_1.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				x = table_1.getSelectedRow();
				y = table_1.getSelectedColumn();
				if (currentUser[2].equals("Admin") && !modelx.getValueAt(x, 2).toString().equals("Root")
						&& !modelx.getValueAt(x, 2).toString().equals("Admin")
						|| currentUser[2].equals("Root") && !modelx.getValueAt(x, 2).toString().equals("Root")) {
					m = ens_u.elementAt(x)[0];
					ptype = modelx.getValueAt(x, 2).toString();
					b = true;
				} else {
					modelx.setValueAt(ens_u.elementAt(x)[y], x, y);
					JOptionPane.showMessageDialog(connectedpan, "Permission non accordée", "Erreur", 0);
				}

			}

			public void mouseEntered(MouseEvent e) {
				if (b) {
					try {
						if (table_1.isEditing()) {
							JOptionPane.showMessageDialog(manageaccts,
									"Veuillez terminer les changements avant de valider", "Erreur", 0);
						} else {
							if(x!=-1) {
							if (modelx.getValueAt(x, 2).toString().equals("Admin") && currentUser[2].equals("Root")
									|| modelx.getValueAt(x, 2).toString().equals("Utilisateur")) {
								String[] s = { modelx.getValueAt(x, 0).toString(), modelx.getValueAt(x, 1).toString(),
										modelx.getValueAt(x, 2).toString() };
								DataBase.updateusersData(modelx.getValueAt(x, 0).toString(),
										modelx.getValueAt(x, 1).toString(), modelx.getValueAt(x, 2).toString(), m);
								ens_u.setElementAt(s, x);
							} else if (ptype.equals("Utilisateur")
									&& (modelx.getValueAt(x, 2).toString().equals("Admin")
											|| modelx.getValueAt(x, 2).toString().equals("Root"))) {
								modelx.setValueAt(ens_u.elementAt(x)[y], x, y);
								JOptionPane.showMessageDialog(connectedpan, "Permission non accordée", "Erreur", 0);
							} else {
								modelx.setValueAt(ens_u.elementAt(x)[2], x, 2);
								JOptionPane.showMessageDialog(connectedpan, "L'accés est invalide", "Erreur", 0);
							}

						}
						}

					} catch (ClassNotFoundException | SQLException er) {
						JOptionPane.showMessageDialog(frame,
								"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

					}
				}
				b = false;

			}

		});
		btnSupprimer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (table_1.isEditing()) {
						JOptionPane.showMessageDialog(manageaccts, "Veuillez terminer les changements avant de valider",
								"Erreur", 0);
					} else if ((currentUser[2].equals("Root") && !modelx.getValueAt(x, 2).toString().equals("Root"))
							|| (currentUser[2].equals("Admin") && !modelx.getValueAt(x, 2).toString().equals("Root")
									&& !modelx.getValueAt(x, 2).toString().equals("Admin"))) {
						DataBase.deleteData("users", "dbusername", modelx.getValueAt(x, 0).toString());
						modelx.removeRow(x);
						x = -1;
					} else {
						JOptionPane.showMessageDialog(manageaccts, "Permission non accordée", "Erreur", 0);
					}
				} catch (ClassNotFoundException | SQLException er) {
					JOptionPane.showMessageDialog(frame,
							"L'application necessite un reseau internet,veuillez se connecter!", "Erreur", 0);

				}
			}
		});
		welcpanaft.setVisible(true);

		frame.setSize(1047, 722);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		labelimage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  JFileChooser fileChooser = new JFileChooser();
			         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
			         fileChooser.addChoosableFileFilter(filter);
			         int result = fileChooser.showSaveDialog(null);
			         if(result == JFileChooser.APPROVE_OPTION){
			             File selectedFile = fileChooser.getSelectedFile();
			             String path = selectedFile.getAbsolutePath();
			             labelimage.setIcon(ResizeImage(path,labelimage));
			             spath = path;
			         }
			}
		});
		label_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  JFileChooser fileChooser = new JFileChooser();
			         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
			         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
			         fileChooser.addChoosableFileFilter(filter);
			         int result = fileChooser.showSaveDialog(null);
			         if(result == JFileChooser.APPROVE_OPTION){
			             File selectedFile = fileChooser.getSelectedFile();
			             String path = selectedFile.getAbsolutePath();
			             label_19.setIcon(ResizeImage(path,labelimage));
			             spath = path;
			              }
			}
		});
	}
}
