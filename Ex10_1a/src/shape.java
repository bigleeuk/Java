
public abstract class shape {
	double area;
	public shape (){
		this.area=0.0;
	}
	public abstract double getArea();
	public boolean equals(shape othershape) {
		System.out.println("this:"+this.area);
		System.out.println("shape boolean");
		System.out.println("other:"+othershape.area);
		return this.area==(othershape.area);
	}
}
