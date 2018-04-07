import java.util.Scanner;
public class doublearr {
	private static double sum=0;
	private static double average=0;
	public static double[][]number=new double[3][4];
	
	public void init(){
		Scanner keyboard = new Scanner(System.in);
		for(int i=0; i<number.length; i++){	
			for(int j=0; j<number[0].length; j++){
			double num1=keyboard.nextDouble();
			number[i][j]=num1;
			num1=0;	
			}
		}
	}
	public static double getSum(double [][]arr,int row) {
		for(int i=0; i<number[0].length; i++){
			sum=sum+number[row][i];	
		}
		return sum;
	}
	public static double getAverage(double[][]arr,int colum) {
		for(int j=0; j<number.length; j++){
			average=average+number[j][colum];	
		}
		average=average/number.length;
		return average;
	}
	
}
