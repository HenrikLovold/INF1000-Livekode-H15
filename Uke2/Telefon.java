import java.util.Scanner;

class Telefon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String tlf = "";
		
		System.out.print("Tast inn nummer 1: ");
		tlf = input.nextLine();
		
		ring(tlf);
		
		System.out.print("Tast inn nummer 2: ");
		tlf = input.nextLine();
		
		ring(tlf);
	}
	
	static void ring(String nummer) {
		System.out.println("Du ringte nummer " + nummer);
	}
}
