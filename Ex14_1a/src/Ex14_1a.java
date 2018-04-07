import java.util.ArrayList;
import java.util.Scanner;
public class Ex14_1a {
	public static ArrayList<String> arrayToArrayList(String[]s){
		int i = 0;
		ArrayList<String> myArrayList = new ArrayList<String>();
		System.out.println("copy String_Array to arrayList");
		while(i < s.length)
		{
			String t = new String(s[i]);
			myArrayList.add(t);
		    i++;
		}
		for( i  = 0 ; i < myArrayList.size(); i++)
		{
			System.out.println(myArrayList.get(i));
		}
		return myArrayList;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> newArrayList = new ArrayList<String>();
		String[] s = new String[4];
		System.out.println("puts String");
		for(int i = 0 ; i < 4 ; i++)
		{
			s[i] = keyboard.nextLine();
		}
		
		newArrayList = Ex14_1a.arrayToArrayList(s);
		
		System.out.println(" what remove ?");
		String remove;
		remove = keyboard.nextLine();
		Ex14_1a a = new Ex14_1a();
		a.removeFromArrayList(newArrayList, remove);
		 int i = 0;
		while( i < newArrayList.size())
		{
			System.out.println(newArrayList.get(i));
			i ++;
		}
	}
	
	public static void removeFromArrayList(ArrayList<String>list,String s){
		list.remove(s);
	}
}
