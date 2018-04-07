public class Ex10_c {

	public static void main(String[] args) {
		
		RegularPay test1 =new RegularPay(2);
		
		System.out.println(test1.computePay(2));
		
		HazardPay test2 =new HazardPay(3);
		System.out.println(test2.computePay(3));

	}

}
