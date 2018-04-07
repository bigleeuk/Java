import java.util.Scanner;
public class Ex4_6 {
	public static void main(String[] args) {
		Purchase purch= new Purchase();
		String nameV,name;
		double priceV1,priceV2,price,total;
		int numberV,number,i=0;
		System.out.println("Calculation");
		while (i < 5) {
			Scanner keyboard = new Scanner(System.in);
			nameV = keyboard.nextLine();
			Scanner keyboard1 = new Scanner(System.in);
			priceV1 = keyboard.nextDouble();
			Scanner keyboard2 = new Scanner(System.in);
			priceV2 = keyboard.nextDouble();
			Scanner keyboard3 = new Scanner(System.in);
			numberV = keyboard.nextInt();
			purch.setName("fruit");
			purch.setPrice(priceV1, priceV2);
			purch.setNumberBought(numberV);
			purch.readInput();
			purch.writeOutput();
			name = purch.getName();
			price = purch.getUnitCost();
			number = purch.getNumberBought();
			total = purch.getTotalCost();
			System.out.println(name);
			System.out.println(price);
			System.out.println(number);
			System.out.println(total);
			System.out.println("----------------next--------------");
			i++;
		}
	}
}
