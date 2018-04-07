
public class PPerson {
	private String name;
 protected PPerson()
 {
	 name="No name yet";
 }
 public PPerson(String initialName)
 {
	 name=initialName;
 }
 public void setName(String newName)
 {
	 name=newName;
 }
 public String getName()
 {
	 return name;
 }
 public void writeOutput()
 {
	 System.out.println("Name: "+name);
 }
 public boolean hasSameName(PPerson otherPerson)
 {
	 return this.name.equalsIgnoreCase(otherPerson.name);
 }
}
