
public class Shape {
	double area;
	public double getArea()
	{
		area=0.0;
		return area;
	}
	public boolean equals(Shape othershape) {
		System.out.println("this:"+this.area);
		System.out.println("shape boolean");
		System.out.println("other:"+othershape.area);
		return this.area==(othershape.area);
	}
}
