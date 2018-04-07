import java.util.Arrays;
import java.util.Comparator;
public class Ex10_11 {
	public static void main(String [] args){

		student[] Students =new student[] {new student("parkyoung",1005),
				new student("leehyoung",1003),new student("sonminubt",1010),
				new student("timberrre",1006),new student("kevinroni",1009)};
		 System.out.println("\nsorting using comparalble:");
		Arrays.sort(Students);
		for(student s : Students)
			   s.writeOutput();
		 Arrays.sort(Students, new comparePerson()); 
		    System.out.println("\nsorting using comparator:");
		    for (student s : Students) {
		    	 s.writeOutput();
		    }
	
	}	
}







