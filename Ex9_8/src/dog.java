
public class dog extends pet {

	private String breed;
	private boolean boostshot;
	public dog(){
		super();
		setBreed("not yet");
		setBoostshot(false);
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public boolean isBoostshot() {
		return boostshot;
	}
	public void setBoostshot(boolean boostshot) {
		this.boostshot = boostshot;
	}
	public void writeOutput(){
		super.writeOutput();
		if(boostshot==false &&super.getAge()>=2){
			System.out.println("Name: " + super.getName()); 
			System.out.println("Age: " + super.getAge() + " years"); 
			System.out.println("Weight: " + super.getWeight() + " pounds");
			System.out.println("breed: " + breed);
			System.out.println("boostshot: " + boostshot);
		}
		if(boostshot!=false && super.getAge()>=2){
			System.out.println("but bootshot isnt false");			
		}
	}
	
	
}
