
class Client {
	private String NCIN;
	private String nom;
	private String pren;
	private String adr;
	private String numtel;
	private byte[] image;

	public Client(String n, String nom_, String p, String a, String numt, byte[] img) {
		nom = nom_;
		NCIN = n;
		pren = p;
		adr = a;
		numtel = numt;
		image=img;
	}

	public String getNCIN() {
		return NCIN;
	}

	public String getnom() {
		return nom;
	}

	public String getPrenom() {
		return pren;
	}

	public String getAdr() {
		return adr;
	}
	public byte[] getImage() {
		return image;
	}

	public String getNumtel() {
		return numtel;
	}


	public String toString() {
		return " NCIM:" + NCIN + " Nom:" + nom + " Prenom:" + pren + " NumTelephone:" + numtel + "  Adresse:" + adr;
	}
}