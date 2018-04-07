import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class Ex14_2b {
		public static void printSet(HashSet<String> intSet) {
		        System.out.println("The set contains:");
		        for (Object obj : intSet.toArray()) {
		            String s = (String) obj;
		            System.out.println(s);
		        }
		    }
		 
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			HashSet<String> myhashset = new HashSet<String>();
			String s[] =new String[4];
			System.out.println("write String");
			for(int i=0 ;i<4;i++){
				s[i]=keyboard.nextLine();
			}
			myhashset= Ex14_2b.arrayToHashSet(s);
			System.out.println(" what remove?");
			String remove;
			remove=keyboard.nextLine();
			Ex14_2b.removeFromHashSet(myhashset, remove);
			Ex14_2b.printSet(myhashset);
		}
		public static HashSet<String>arrayToHashSet(String[] s){
			int i = 0;
			HashSet<String> myHashSet = new HashSet<String>();
			System.out.println("copy String");
			while(i < s.length)
			{
				String t = new String(s[i]);
				myHashSet.add(t);
			    i++;
			}
			Ex14_2b.printSet(myHashSet);
			
			return myHashSet;
		}
		public static void removeFromHashSet(HashSet<String>set,String s){
			set.remove(s);
		}
	}

