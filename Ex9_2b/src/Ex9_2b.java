
public class Ex9_2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		s.getArea();
		Shape[] shape=new Shape[]{new Rectangle(3.0,4.0), new RightTriangle(6.0,4.0), new Circle(2.0)};
		for(int i=0;i<3;i++){
			System.out.println(shape[i].getArea());
			}
		System.out.println("Triangle Rectangle: "+ shape[0].equals(shape[1]));
		System.out.println("Triangle Circle: "+ shape[1].equals(shape[2]));
		System.out.println("Circle Rectangle: "+ shape[2].equals(shape[0]));
		System.out.println("Rectangle: "+ shape[0].toString());
		System.out.println("Triangle: "+ shape[1].toString());
		System.out.println("Circle: "+ shape[2].toString());
	}

}
