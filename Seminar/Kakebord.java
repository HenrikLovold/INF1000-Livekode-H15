import java.util.HashMap;

public class Kakebord {
	private HashMap<String, Kake> liste;
	private int antall;
	
	public Kakebord() {
		liste = new HashMap<String, Kake>();
		antall = 0;
	}
	
	public void settInnKake(String navn, Kake nykake) {
		liste.put(navn, nykake);
		antall++;
	}
	
	public void sePaaKakene() {
		
		for(String navn : liste.keySet()) {
			System.out.println(navn + ": " + liste.get(navn));
		}
		
	}
}
