
public class Ex10_1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new rectangle(3.0,4.0), new righttriangle(6.0,4.0), new circle(2.0)
		circle circle=new circle(2.0);
		rectangle rectangle = new rectangle(6.0,4.0);
		righttriangle righttriangle = new righttriangle(3.0,4.0);
		System.out.println(circle.getArea());
		System.out.println(rectangle.getArea());
		System.out.println(righttriangle.getArea());
		System.out.println("Triangle Rectangle: "+ rectangle.equals(righttriangle));
		System.out.println("Triangle Circle: "+ righttriangle.equals(circle));
		System.out.println("Circle Rectangle: "+ circle.equals(rectangle));
		System.out.println("Rectangle: "+ rectangle.toString());
		System.out.println("Triangle: "+ righttriangle.toString());
		System.out.println("Circle: "+ circle.toString());
		
	}

}
