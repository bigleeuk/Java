public class HazardPay extends PayCalculator {


	public HazardPay(double newpayrate)
	{
		super(newpayrate);

	}
	public double computePay(double hours)
	{
		return 1.5*super.computePay(hours);
	}
}


