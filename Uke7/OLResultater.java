import java.util.ArrayList;

class OLResultater {

	private ArrayList<Medaljevinner> pallplass = new ArrayList<Medaljevinner>();
	
	public void vinn(String navn, String gren, int plass) {
		Medaljevinner nyVinner = new Medaljevinner(navn, gren, plass);
		pallplass.add(nyVinner);
	}
	
	public int hentAntallMedaljer() {
		return pallplass.size();
	}
	
	public void printAlleVinnere() {
		for(int i = 0; i < pallplass.size(); i++) {
			System.out.println(pallplass.get(i));
		}
	}

}
