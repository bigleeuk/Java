import java.util.Scanner;
public class Person {
	private String name;
	private int age;
	public Person(){
		name="No name yet";
		age=0;
	}
	public Person(String n,int num){
		name=n;
		age=num;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String first, String last) {
		this.name = first + last;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static Person createAdult() {
	      Person Adult = new Person();
	      Adult.name = "An adult";
	      Adult.age = 21;
	      return Adult;
	   }
	public static Person createToddler() {
	      Person Toddler = new Person();
	      Toddler.name = "A Toddler";
	      Toddler.age = 2;
	      return Toddler;
	}
	public static Person createPreschooler() {
	      Person Preschooler = new Person();
	      Preschooler.name = "A Preschooler";
	      Preschooler.age = 5;
	      return Preschooler;
	}
	public static Person createAdolescent() {
	      Person Adolescent = new Person();
	      Adolescent.name = "A Adolescent";
	      Adolescent.age = 9;
	      return Adolescent;
	}
	public static Person createTeenager() {
	      Person Teenager = new Person();
	      Teenager.name = "A Teenager";
	      Teenager.age = 15;
	      return Teenager;
	}

	

}
