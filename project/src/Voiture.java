class Voiture {
	private String matc;
	private String marque;
	private String Color;
	private double tarif;
	private String kilo;
	private boolean state;
	private byte[] image;

	public Voiture(String mat, String k,String m, String c, double t, boolean s,byte[] img) {
		matc = mat;
		kilo=k;
		marque = m;
		Color = c;
		tarif = t;
		state = s;
		image=img;
	}
	public String get_mat() {
		return matc.toString();
	}

	public String getMarque() {
		return marque;
	}

	public String getColor() {
		return Color;
	}

	public double getTarif() {
		return tarif;
	}
	public String getKilo() {
		return kilo;
	}
	public boolean getState() {
		return state;
	}

	public void settarif(double t) {
		tarif = t;
	}

	public byte[] get_image() {
		return image;
	}

	public String toString() {
		return "Matricule:" + matc + " Marque:" + marque + " Couleur:" + Color + " Tarif:" + tarif;
	}
}