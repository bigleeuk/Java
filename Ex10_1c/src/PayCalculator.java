	public abstract class PayCalculator {

		private double payrate;
		
		public PayCalculator(double newpayrate)
		{
			payrate=newpayrate;
		}
		public double computePay(double hours)
		{
			return payrate*hours;
		}
		
	}

