import java.util.Scanner;
public class Ex6_7 {
	public static void main(String[] args) {

		Characteristic Pat = new Characteristic(null);
		Scanner keyboard= new Scanner(System.in);
		Pat.setName1("park young jun");
		System.out.println(Pat.getName1());
		System.out.println("Please enter description and rating.");
		String Description = keyboard.nextLine();
		int Rating = keyboard.nextInt();
		Pat.setDescription(Description);
		Pat.getDescription();
		Pat.setRating(Rating); //same with set rating

		Characteristic Chris = new Characteristic(null);//same
		Scanner keyboard1= new Scanner(System.in);
		Chris.setName1("\nlee hyoung wook");
		System.out.println(Chris.getName1());
		System.out.println("\nPlease enter description and rating.");
		String Description1 = keyboard1.nextLine();
		int Rating1 = keyboard1.nextInt();
		Chris.setDescription(Description1);
		Chris.getDescription();
		Chris.setRating(Rating1);//here
		Chris.getCompatibility(Pat);


	}
}

