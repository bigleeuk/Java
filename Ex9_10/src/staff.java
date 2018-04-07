import java.util.Scanner;
public class staff extends employ{
	private  int paygrade;
	public staff(int paygrade,int depart,String id){
		//super.setEmployeeID(id);
		super(id,depart);
		this.paygrade=paygrade;
	}
	public int getPaygrade() {
		return paygrade;
	}

	public void setPaygrade(int paygrade) {
		if(paygrade<=20 &&paygrade>=1)
			this.paygrade = paygrade;
		else{			
			Scanner keyboard = new Scanner(System.in);
			int number=keyboard.nextInt();
			setPaygrade(number);
			}
	}
	public void writeOutput(){
		super.writeOutput();
		System.out.println("paygrade: "+ paygrade);
	}
	
	
}
