import java.util.Scanner;
public class Ex6_9 {
	public static void main(String[] args) 
	{
		Person p1=new Person("leewook",25);
		Person p2=new Person();
		Person p3=new Person();
		System.out.println(p1.getName()+p1.getAge());
		p2.setName("hyoung","lee");
		System.out.println(p2.getName());
		p2.setName("leehyoungwook");
		p2.setAge(25);
		System.out.println(p2.getName()+p2.getAge());
		p3=Person.createAdolescent();
		System.out.println(p3.getName() + p3.getAge());
		p3=Person.createAdult();
		System.out.println(p3.getName() + p3.getAge());
		p3=Person.createPreschooler();
		System.out.println(p3.getName() + p3.getAge());
		p3=Person.createTeenager();
		System.out.println(p3.getName() + p3.getAge());
		p3=Person.createToddler();
		System.out.println(p3.getName() + p3.getAge());

	}
}
