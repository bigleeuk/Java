class circle implements Ishape{
	double area,rad;
	public circle(double rad){
		super();
		this.rad= rad;
	}
	@Override
	public double getArea(){
		
		area=rad*rad*3.14;
		return area;
	}
	@Override
	public String toString(){
		return "rad: " +rad + "area: " + area;
	}
	@Override
	public boolean equals(Ishape other){
		rectangle others=(rectangle)other;
		System.out.println("this:"+this.area);
		System.out.println("circle boolean");
		System.out.println("other:"+ rectangle.class);
		return this.area==others.area;
	}
}
