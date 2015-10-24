
class Kake {
	private String hovedingr;
	private String farge;
	private double vekt;
	
	public Kake(String hovedingr, String farge, double vekt) {
		this.hovedingr = hovedingr;
		this.farge = farge;
		this.vekt = vekt;
	}
	
	public void taStykke(double stykkevekt) {
		if(stykkevekt <= vekt) {
			vekt -= stykkevekt;
		}
		else {
			vekt = 0;
		}
	}
	
	public String toString() {
		return "Kake: " + hovedingr + " " + farge + " " + vekt + "kg";
	}
}






