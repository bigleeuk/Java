import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;
public class Ex14_2c {
	public static LinkedList<String> arrayToLinkedList(String[]s){
		LinkedList<String> mylinkedlist =new LinkedList<String>();
		System.out.println("copy String");
		int i=0;
		while(i<s.length){
			String t =new String(s[i]);
			mylinkedlist.add(t);
			i++;
		}
		return mylinkedlist;
	}
	public static void removeFromLinkedList(LinkedList<String>mylinkedlist,String s){
		mylinkedlist.remove(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key =new Scanner(System.in);
		LinkedList<String> mylinkedlist = new LinkedList<String>();
		String []s=new String[4];
		System.out.println("write String");
		for(int i=0; i<4;i++){
			s[i]=key.nextLine();
		}
		mylinkedlist = Ex14_2c.arrayToLinkedList(s);
		System.out.println("Iterator");
		Iterator<String>listIterator= mylinkedlist.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
		
		System.out.println("what remove?");
		String remove;
		remove = key.nextLine();	
		Ex14_2c.removeFromLinkedList(mylinkedlist, remove);
		System.out.println("Iterator 2 ");
        Iterator<String> listIterator2 = mylinkedlist.listIterator();
        while (listIterator2.hasNext()) {
            System.out.println(listIterator2.next());
        }
	}

}
