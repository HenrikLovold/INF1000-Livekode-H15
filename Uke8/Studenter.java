import java.util.*;

public class Studenter{
	public static void main(String[] args){
		HashMap<String, String> helene = new HashMap<String, String>();
		helene.put("Helene", "pizza");
		helene.put("Henrik", "faarikaal");
		helene.put("Anna", "taco");
		helene.put("Sigrid", "burger");
		helene.put("Sushant", "sushi");
		helene.put("Kai", "pasta kaibonara");
		helene.put("Dan", "banan");
		helene.put("Arne con Carne", "Chili con carne");
		
		for (String x : helene.keySet()){
			System.out.println(x + ": " + helene.get(x));
		}
		
		 
	
	}
}
