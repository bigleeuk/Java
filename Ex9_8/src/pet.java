public class pet 
{ 
	private String name; 
	private int age; //in years 
	private double weight;//in pounds 	

	public pet(String initialName, int initialAge, double initialWeight) 
	{ 
		name = initialName; 
		if ((initialAge < 0) || (initialWeight < 0)) 
		{ 
			System.out.println("Error: Negative age or weight."); 
			System.exit(0); 
		} 
		else 
		{ 
			age = initialAge; 
			weight = initialWeight; 
		} 
	} 

	public void setPet(String newName, int newAge, double newWeight) 
	{ 
		name = newName; 
		if ((newAge < 0) || (newWeight < 0)) 
		{ 
			System.out.println("Error: Negative age or weight."); 
			System.exit(0); 
		} 
		else 
		{ 
			age = newAge; 
			weight = newWeight; 
		} 
	} 

	public pet(String initialName) 
	{ 
		name = initialName; 
		age = 0; 
		weight = 0; 
	} 

	public void setName(String newName) 
	{ 
		name = newName; //age and weight are unchanged. 
	} 

	public pet(int initialAge) 
	{ 
		name = "No name yet."; 
		weight = 0; 
		if (initialAge < 0) 
		{ 
			System.out.println("Error: Negative age."); 
			System.exit(0); 
		} 
		else 
			age = initialAge; 
	} 

	public void setAge(int newAge) 
	{ 
		if (newAge < 0) 
		{ 
			System.out.println("Error: Negative age."); 
			System.exit(0); 
		} 
		else 
			age = newAge; 
		//name and weight are unchanged. 
	} 

	public pet(double initialWeight) 
	{ 
		name = "No name yet"; 
		age = 0; 
		if (initialWeight < 0) 
		{ 
			System.out.println("Error: Negative weight."); 
			System.exit(0); 
		} 
		else 
			weight = initialWeight; 
	} 

	public void setWeight(double newWeight) 
	{ 
		if (newWeight < 0) 
		{ 
			System.out.println("Error: Negative weight."); 
			System.exit(0); 
		} 
		else 
			weight = newWeight; //name and age are unchanged. 
	} 

	public pet( ) 
	{ 
		name = "No name yet."; 
		age = 0; 
		weight = 0; 
	} 

	public String getName( ) 
	{ 
		return name; 
	} 

	public int getAge( ) 
	{ 
		return age; 
	} 

	public double getWeight( ) 
	{ 
		return weight; 
	} 

	public void writeOutput( ) 
	{ 
		if(age>=2){
			System.out.println("age is over 2");
		}
	} 
} 