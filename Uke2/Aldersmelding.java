import java.util.Scanner;

class Aldersmelding{
	public static void main(String [] args){
		Scanner tastatur = new Scanner(System.in);
		
		System.out.println("Hvor gammel er du?");
		
		String linje = tastatur.nextLine();
		int alder = Integer.parseInt(linje);

		if(alder < 20){
			System.out.println("Din alder er mellom 0 og 20 aar.");
		}

		else if(alder < 40){
			System.out.println("Din alder er mellom 20 og 40 aar.");
		}

		else if(alder < 60){
			System.out.println("Din alder er mellom 40 og 60 aar.");
		}

		else if(alder < 80){
			System.out.println("Din alder er mellom 60 og 80 aar.");
		}

		else {
			System.out.println("Du er over 80 år");
		}
	}
}

