
public class RightTriangle extends Shape{
	double area,height,width;

	public RightTriangle(double newheight, double newwidth)
	{
		this.height=newheight;
		this.width=newwidth;
	}
	@Override
	public double getArea()
	{
		area=(height*width)/2;
		return area;
	}
	@Override
	public String toString()
	{
		return "height: "+height+" width: "+width+" area: "+area;
	}
	@Override
	public boolean equals(Shape other)
	{
		Circle others=(Circle)other;
		System.out.println("this:"+this.area);
		System.out.println("triangle boolean");
		System.out.println("other:"+others.area);
		return this.area==others.area;
	}

}
