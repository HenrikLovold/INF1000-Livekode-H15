import java.util.Scanner;

class Bananer {
	public static void main(String[] args) {
		double kilopris = 7.5;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hvor mange kilo bananer skal du ha?");
		
		String input = in.nextLine();
		int kilo = Integer.parseInt(input);
		
		double pris = kilopris * kilo;
		
		System.out.println("Det kostet " + pris + " kroner.");
		
	}
}
