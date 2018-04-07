import java.util.Scanner;
public class Ex7_c {
	public static void main(String[] args) {
		int i=0;
		double result;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("write degree!");
		int n = keyboard.nextInt();
		Polynomial p=new Polynomial(n);
		int degree=p.getDegree(n);
		System.out.println(degree);
		while(i<=degree){
			System.out.println("write i and value! first when  i=0");
			int value = keyboard.nextInt();
			p.setConstant(i, value);
			i++;
		}
		System.out.println("what? do you want to know? x");
		int n2 = keyboard.nextInt();
		result=p.evaluate(n2);
		System.out.println("result is : "+ result);
		
	}

}
