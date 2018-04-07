import java.util.HashMap;
public class Ex14_2a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        HashMap<String,Integer> mountains= new HashMap<String,Integer>();
	        mountains.put("everest",22222);
	        mountains.put("k2",33333);
	        mountains.put("kangchenjunga",44444);
	        mountains.put("denali",55555);
	        printMap(mountains);
	        
	        System.out.println("denali in the map: "+mountains.containsKey("denali"));
	        System.out.println();
	        System.out.println("changing height");
	        mountains.put("denali",12345);
	       
	        printMap(mountains);
	        System.out.println("Removing Kangchenjunga.");
	        mountains.remove("Kangchenjunga");
	        printMap(mountains);

	    }
	    public static void printMap(HashMap<String, Integer> map) {
	        System.out.println("Map contains:");
	        for (String mountainName : map.keySet()) {
	            Integer height = map.get(mountainName);
	            System.out.println(mountainName + " -> " 
	                + height.intValue() + " feet.");
	        }
	        System.out.println();
	    }


}
