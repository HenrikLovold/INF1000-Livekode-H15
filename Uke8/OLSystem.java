import java.util.HashMap;
import java.util.ArrayList;

public class OLSystem {

	private HashMap<String, Resultat> ovelser = new HashMap<String, Resultat>();
	
	public void leggTilRes(String ovelse, ArrayList<String> res) {
		Resultat ny = new Resultat(ovelse, res);
		
		ovelser.put(ovelse, ny);
	}
	
	public void printAlleRes() {
		for(Resultat ovelse : ovelser.values()) {
			ovelse.printResultat();
		}
	}
	
	public void printOvelse(String ovelse) {
		ovelser.get(ovelse).printResultat();
	}
}
