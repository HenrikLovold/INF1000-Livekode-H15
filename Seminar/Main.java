
public class Main {
	public static void main(String[] args) {
		Kakebord bord = new Kakebord();
		
		Kake sjoko = new Kake("Sjokolade", "brun", 2.4);
		Kake pavlova = new Kake("Eggehvitte", "hvit", 1.2);
		Kake bryllups = new Kake("Kremfloete", "hvit", 15.6);
		
		bord.settInnKake("Sjoko", sjoko);
		bord.settInnKake("Pavlova", pavlova);
		bord.settInnKake("Selveste bryllupskaka gitt", bryllups);
		
		bord.sePaaKakene();
	}
}
