import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class Vinsystem {
	private HashMap<String, Vin> liste = new HashMap<String, Vin>();
	
	public void lesFil(String filnavn) throws Exception {
		Scanner sc = new Scanner(new File(filnavn));
		
		while(sc.hasNextLine()) {
			String linje = sc.nextLine();
			boolean iKjeller = false;
			int poeng = 0;
			String navn = "";
			int aargang = 0;
			
			if(linje.startsWith("*")) {
				iKjeller = true;
				linje = linje.substring(1);
			}
			
			poeng = Integer.parseInt(linje.substring(0, 2));
			navn = linje.substring(3, linje.length()-5);
			aargang = Integer.parseInt(linje.substring(linje.length()-4));
			
			liste.put(navn, new Vin(navn, aargang, poeng, iKjeller));
		}
	}
	
	public void skrivInfo(String vin) {
		if(liste.containsKey(vin)) {
			liste.get(vin).skrivInfo();
		}
		else {
			System.out.println("Vinen finnes ikke i systemet.");
		}
	}
}




