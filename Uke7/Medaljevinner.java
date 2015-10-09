
class Medaljevinner {

	private String navn;
	private String gren;
	private int plass;
	
	public Medaljevinner(String navn, String gren, int plass) {
		this.navn = navn;
		this.gren = gren;
		this.plass = plass;
	}
	
	public int valoer() {
		return plass;
	}
	
	public String toString() {
		return "Navn: " + navn + " gren: " + gren + " plass: " + plass;
	}
}
