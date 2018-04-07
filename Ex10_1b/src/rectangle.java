
class rectangle implements Ishape{
	double area,height,width;
	
	public rectangle(double newheight, double newwidth){
		super();
		this.height=newheight;
		this.width=newwidth;
	}
	@Override
	public double getArea(){
		area=(height*width);
		return area;
	}
	@Override
	public boolean equals(Ishape other)
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
