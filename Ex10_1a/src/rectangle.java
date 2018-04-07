
public class rectangle extends shape{
	double area,height,width;
	@Override
	public double getArea(){
		area=(height*width);
		return area;
	}
	public rectangle(double newheight, double newwidth){
		super();
		this.height=newheight;
		this.width=newwidth;
	}
	
	@Override
	public boolean equals(shape other)
	{
		righttriangle others=(righttriangle)other;
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
