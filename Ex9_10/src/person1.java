public class person1 { 
	private String name; 
	public person1()   
	{       
		name = "No name yet";   
	}
	public person1(String initialName) 
	{       
		name = initialName; 
	} 
	public void setName(String newName)
	{       
		name = newName; 
	} 
	public String getName()    
	{ 
		return name;    
	} 
	public void writeOutput()    
	{      
		System.out.println("Name: " + name);   
	} 
	public boolean hasSameName(person1 otherPerson)   
	{ 
		return this.name.equalsIgnoreCase(otherPerson.name); 
	} 
}