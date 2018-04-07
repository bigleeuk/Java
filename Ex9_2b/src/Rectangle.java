
public class Rectangle extends Shape{
	
	
	double area,height,width;
	@Override
	public double getArea(){
		area=(height*width);
		return area;
	}
	public Rectangle(double newheight, double newwidth){
		this.height=newheight;
		this.width=newwidth;
	}
	
	@Override
	public boolean equals(Shape other)
	{
		RightTriangle others=(RightTriangle)other;
		System.out.println("this:"+this.area);
		System.out.println("rectangle boolean");
		System.out.println("others:"+others.area);
		return this.area==others.area;
	}
	@Override
	public String toString()
	{
		return "height: "+height+" width: "+width+" area: "+area;
	}

}
