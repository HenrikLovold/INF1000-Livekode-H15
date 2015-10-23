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
	
	public void meny() {
		Scanner tast = new Scanner(System.in);
		int valg = 0;
		
		System.out.println("\n\n=== MENY ===");
		System.out.println("1: Legg til ny vin");
		System.out.println("2: Info om en vin");
		System.out.println("9: Avslutt");
		
		while((valg = Integer.parseInt(tast.nextLine())) != 9) {			
			switch(valg) {
				case 1:
					leggTilNyVin();
					break;
				case 2:
					System.out.print("Soeketekst: ");
					skrivInfo(tast.nextLine());
					break;
				case 9:
					System.out.println("Velkommen tilbake ved en senere anledning");
					break;
				case 0:
					break;
				default:
					System.out.println("Ugyldig valg");
					break;
			}
		}
	}
	
	private void leggTilNyVin() {
		Scanner tast = new Scanner(System.in);
		
		System.out.print("\nNavn: ");
		String navn = tast.nextLine();
		
		System.out.print("Poeng: ");
		int aargang = Integer.parseInt(tast.nextLine());
		
		System.out.println("Navn: ");
		int poeng = Integer.parseInt(tast.nextLine());
		
		System.out.println("I kjeller (j hvis ja): ");
		boolean iKjeller = tast.nextLine().equals("j") ? true : false;
		
		liste.put(navn, new Vin(navn, aargang, poeng, iKjeller));
		System.out.println("Ny vin lagt til i liste: " + navn);
	}
	
	private void skrivInfo(String vin) {
		if(liste.containsKey(vin)) {
			liste.get(vin).skrivInfo();
		}
		else {
			System.out.println("Vinen finnes ikke i systemet.");
		}
	}
}




