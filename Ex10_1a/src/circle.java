
public class circle extends shape {
	double area,radius;
	public circle(double newradius)
	{	
		super();
		this.radius=newradius;
	}
	@Override
	public double getArea()
	{
		area=radius*radius*3.14;
		return area;
	}
	@Override
	public String toString()
	{
		return "radius: "+radius+" area: "+area;
	}
	@Override
	public boolean equals(shape other)
	{
		rectangle others=(rectangle)other;
		System.out.println("this:"+this.area);
		System.out.println("circle boolean");
		System.out.println("other:"+others.area);
		return this.area==others.area;
	}

}
