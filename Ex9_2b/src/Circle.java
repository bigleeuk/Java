
public class Circle extends Shape {
	double area,radius;
	public Circle(double newradius)
	{
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
	public boolean equals(Shape other)
	{
		Rectangle others=(Rectangle)other;
		System.out.println("this:"+this.area);
		System.out.println("circle boolean");
		System.out.println("other:"+others.area);
		return this.area==others.area;
	}
}
