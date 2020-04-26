
class Location {
	private String matc;
	private String date;
	private String datefin;
	private int duree;
	private Double facture;
	private String ncinloc;
	private boolean validity;

	public Location(String mat, String dat,String dat2, int d,double fact,boolean val, String ncinclient) {
		matc = mat;
		duree = d;
		date = dat;
		facture=fact;
		datefin=dat2;
		validity=val;
		ncinloc = ncinclient;
	}

	public String get_mat() {
		return matc;
	}
	public Double getFacture()
	{
		return facture;
	}
	public boolean getValidity()
	{
		return validity;
	}
	public void setValidity(boolean b)
	{
		validity=b;
	}
	public String getDatefin()
	{
		return datefin;
	}

	public String getDate() {
		return date;
	}

	public int getDuree() {
		return duree;
	}

	public String getNCIN() {
		return ncinloc;
	}

//	public Client getClient() {
//		return loc;
//	}


	public String toString() {
		return "Matricule:" + matc + " Date:" + date + " Durre:" + duree + " Louer A: " + ncinloc;
	}
}