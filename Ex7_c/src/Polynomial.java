import java.util.Scanner;
public class Polynomial {
	private int degree;
	public int len=0;//상수 항의 개수 
	public double fresult;
	private double[]coefficient;
	//상수 0으로 생성자 초기화
	public Polynomial(int max){
		this.degree=max;
		len=max+1;
		coefficient=new double[len]; 
		for(int i=0; i< max+1;i++){
			coefficient[i]=0;
		}
		
	}
	//차수 설정 
	public int getDegree(int num){
		this.degree=num;
		return degree;
	}
	//항의 계수를 입력받아서 넣는다!
	public void setConstant(int i, int value){
		coefficient[i]=(double)value;
		System.out.println("coefficient is: " + coefficient[i]);
		this.coefficient[i]=coefficient[i];
	}
	//x값을 넣었을때 결과 출력
	public double evaluate(double x){
		double result=0,result1=1;
		for(int i=0; i<len; i++){
			result=coefficient[i];
			result1=Math.pow(x, i);
			fresult+=result*result1;
			result=0;
			result1=0;
		}
		return fresult;
	}	
}
