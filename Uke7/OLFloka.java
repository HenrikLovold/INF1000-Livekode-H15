
class OLFloka {
	public static void main(String[] args) {
		OLResultater resultater = new OLResultater();
		
		resultater.vinn("Johann Olav Koss", "Skoyter 10k", 1);
		resultater.vinn("Espen Bredesen", "Hopp normalbakke", 1);
		resultater.vinn("Kjetil Andre Aamodt", "Utfor", 2);
		resultater.vinn("Hilde Synnove Lid", "Hopp freestyle", 3);
		resultater.vinn("Stine Lise Hattestad", "Kulekjoering", 1);
		
		System.out.println("OL ER OVER, HER ER RESULTATENE:");
		
		System.out.println("Antall medaljer: " + resultater.hentAntallMedaljer());
		resultater.printAlleVinnere();
	}
}
