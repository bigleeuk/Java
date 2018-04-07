import java.util.HashMap;
import java.util.Scanner;
public class HashMapProgram {
	public static void main(String[] args)
	{
		int input;
		int num = 0;
		HashMap<Integer,Integer> myhashmap = new HashMap<Integer,Integer>();
		Scanner key = new Scanner(System.in);
		while(true){
			System.out.println("write number insert into hash map");
			System.out.println("If you write -1, program end");
			input = key.nextInt();
			if(input == -1){
				break;
			}
			if(myhashmap.containsKey(input))
				myhashmap.put(input, myhashmap.get(input) + 1);
			else
				myhashmap.put(input, 1);
			
		}
		printMap(myhashmap);
		
		
	}
	public static void printMap(HashMap<Integer,Integer> map) {
        System.out.println("HashMap contains:");
        for (int input : map.keySet()) {
            Integer count = map.get(input);
            System.out.println("The number " + input + " occurs " 
                + count.intValue() + " times." );
        }
        System.out.println();
    }


}
