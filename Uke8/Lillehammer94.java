import java.util.ArrayList;

class Lillehammer94 {
	public static void main(String[] args) {
		OLSystem system = new OLSystem();
		
		ArrayList<String> storslalam = new ArrayList<String>();
		storslalam.add("Wasmeier");
		storslalam.add("Kalin");
		storslalam.add("Mayer");
		
		ArrayList<String> femtenjakt = new ArrayList<String>();
		femtenjakt.add("Daehlie");
		femtenjakt.add("Smirnov");
		femtenjakt.add("Fauner");
		
		ArrayList<String> skoyterfemten = new ArrayList<String>();
		skoyterfemten.add("Koss");
		skoyterfemten.add("Ritsma");
		skoyterfemten.add("Zandstra");
		
		system.leggTilRes("Storslalam", storslalam);
		system.leggTilRes("15km jaktstart", femtenjakt);
		system.leggTilRes("1500m skoyter", skoyterfemten);
		
		system.printAlleRes();
		
		System.out.println("Soker etter storslalam");
		
		system.printOvelse("Storslalam");		
		
	}
}


