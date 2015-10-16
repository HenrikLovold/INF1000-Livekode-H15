import java.util.ArrayList;

public class Resultat {

	private String navn;
	private ArrayList<String> liste;
	
	public Resultat(String ovelse, ArrayList<String> liste) {
		this.navn = ovelse;
		this.liste = liste;
	}
	
	public void printResultat() {
		System.out.println("Resultat for: " + navn);
		for(String s : liste) {
			System.out.println(s);
		}
		System.out.println();
	}
}
