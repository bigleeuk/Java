public class Characteristic {
	private int rate1;
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	private String name1;
	public String description;
	Characteristic(String a){
		description=a;
		rate1=0;
	}
	public void setDescription(String description) {

		this.description = description;
	}
	public void setRating(int rate1){
		System.out.print("Enter the ratbing for"+" "+getDescription());
		if(isValid(rate1) == true)
		{
			this.rate1 = rate1;

		}

	}
	public double getRating(){
		return rate1;
	}
	private boolean isValid(int r1){
		this.rate1=r1;
		if(this.rate1<10 && this.rate1>0)
			return true;
		else{
			System.out.println("error!!");
			System.exit(0);
		}
		return false;
	}
	public String getDescription(){
		return description;
	}
	private boolean isMatch(Characteristic otherRating)
	{
		if(this.description.equals(otherRating.description))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	private double getCompatibilityMeasure(Characteristic otherRating)
	{
		if(this.rate1 == 0 && otherRating.rate1 == 0)
		{
			return 0;
		}
		else
		{
			double m = (double)(1 - (double)(otherRating.rate1 - this.rate1) * (double)(otherRating.rate1 - this.rate1) / (double)81);
			System.out.println("\nresult m:" +m);
			return m;       

		}


	}
	public double getCompatibility(Characteristic otherRating)
	{
		//System.out.println("??");
		if(isMatch(otherRating) == false)
		{
			return 0;
		}
		else
		{
			return getCompatibilityMeasure(otherRating);
		}
	}
	
}