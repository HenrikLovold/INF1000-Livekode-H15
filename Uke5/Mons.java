public class Mons {
	public static void main(String[] args) {
		
		// Kjoep nye matbokser
		Matboks storBoks = new Matboks(1000);
		Matboks litenBoks = new Matboks(500);
		
		storBoks.leggInn(4);
		litenBoks.leggInn(10);
		
		storBoks.taUt(2);
		litenBoks.taUt(3);
		
		System.out.print("Stor boks: ");
		storBoks.skrivAntall();
		System.out.print("Liten boks: ");
		litenBoks.skrivAntall();
	}
}
