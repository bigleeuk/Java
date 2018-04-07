
public class Person  {
    private String name;

    public Person()
    {
    	name="not yet";
    }
    public Person(String initialName)
    {
        this.name = initialName;
    }
    public void setName(String newName)
    {
    	this.name=newName;
    }
    public String getName()
    {
        return name;
    }
    public void writeOutput()
    {
        System.out.println("name: " + name);
    }
    public boolean equals(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
