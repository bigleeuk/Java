
public class Vehicle extends Person {
    String manufactName;
    int engine;



    public Vehicle()
    {
        manufactName = "no name yet";
        engine = 0;
    }
    public Vehicle(String initialManufactName, int initialEngine)
    {
    	super();
        this.manufactName = initialManufactName;
        this.engine = initialEngine;
    }
    public void setManufactName(String newManufactName)
    {
        manufactName = newManufactName;
    }
    public void setEngine(int newEngine)
    {

        engine = newEngine;
    }
    public String getManufactName()
    {

        return manufactName;
    }
    public double getEngine()
    {
        return engine;
    }
    @Override
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Manufacturer: " + manufactName);
        System.out.println("Engine Cyclinders: " + engine);
    }
    public boolean equals(Vehicle otherVehicle){
    	return this.manufactName.equalsIgnoreCase(otherVehicle.manufactName)&&
    			this.engine == (otherVehicle.engine);
    }
//    public boolean hasSameManufactName(Vehicle otherVehicle)
//    {
//        return this.manufactName.equalsIgnoreCase(otherVehicle.manufactName);
//    }
//    public boolean hasSameEngine(Vehicle otherVehicle)
//    {
//        return this.engine == (otherVehicle.engine);
//    }
}
