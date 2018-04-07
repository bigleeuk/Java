
public class Truck extends Vehicle {
    private double load;
    private double towing;

    public Truck()
    {
   
        load = 0;
        towing = 0;
    }
    public Truck(double initialLoad, double initialTowing,String name,String manuf,int engin)
    {
    	super.setManufactName(manuf);
    	super.setEngine(engin);
    	super.setName(name);
        this.load=initialLoad;
        this.towing=initialTowing;
    }
    public void setLoad(double newLoad)
    {
        load = newLoad;
    }
    public void setTowing(double newTowing)
    {
        towing = newTowing;
    }
    public double getLoad()
    {
        return load;
    }
    public double getTowing()
    {
        return towing;
    }
    @Override
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Load: " + load);
        System.out.println("Towing: " + towing);
    }
    public boolean equals(Truck otherTruck){
    	return this.load == (otherTruck.load)&&
    			this.towing == (otherTruck.towing);
    }
//    public boolean hasSameLoad(Truck otherTruck)
//    {
//        return this.load == (otherTruck.load);
//    }
//    public boolean hasSameTowing(Truck otherTruck)
//    {
//        return this.towing == (otherTruck.towing);
//    }
}


