import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Petdemo {
	public static void main(String[] args){
	ArrayList myArrayList = new ArrayList<Pet>();
	Scanner keyboard = new Scanner(System.in);
	while(true){
		System.out.println("puts pet name");
		String name;
		int age;
		double weight;
		name = keyboard.next();
		System.out.println("puts pet's age");
		age = keyboard.nextInt();
		System.out.println("puts pet's weight");
		weight = keyboard.nextDouble();
		Pet p = new Pet(name,age,weight);
		myArrayList.add(p);
		System.out.println("Do you want more pet? o or x");
		String s;
		s = keyboard.next();
		if(s.equalsIgnoreCase("o"))
			continue;
		else
			break;
		}
	
	Pet[] myPet = new Pet[myArrayList.size()];
	Object[] o =  myArrayList.toArray();
	for(int i = 0 ; i < myArrayList.size(); i++){
		myPet[i] = new Pet();
		myPet[i] = (Pet)o[i];
	}
	for(Pet p : myPet)
	{
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getWeight());
	}
	Arrays.sort(myPet);
	
	
	for(Pet p : myPet)
	{
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getWeight());
	}
	
	
}
}
