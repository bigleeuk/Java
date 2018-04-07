class righttriangle implements Ishape{

	double area,height,width;

	public righttriangle(double newheight, double newwidth)
	{
		super();
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
	public boolean equals(Ishape other)
	{
		circle others=(circle)other;
		System.out.println("this:"+this.area);
		System.out.println("triangle boolean");
		System.out.println("other:"+others.area);
		return this.area==others.area;
	}
}
