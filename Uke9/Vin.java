
public class Vin {
	
	private String navn;
	private int aargang;
	private int poeng;
	private boolean iKjeller;
	
	public Vin(String navn, int aargang, int poeng, boolean iKjeller) {
		this.navn = navn;
		this.aargang = aargang;
		this.poeng = poeng;
		this.iKjeller = iKjeller;
	}
	
	public void skrivInfo() {
		System.out.println("Navn: " + navn);
		System.out.println("Aargang: " + aargang);
		System.out.println("Poeng: " + poeng);
		System.out.print("I kjeller: ");
		if(iKjeller) {
			System.out.println("JA");
		} else {
			System.out.println("NEI");
		}
	}
}
