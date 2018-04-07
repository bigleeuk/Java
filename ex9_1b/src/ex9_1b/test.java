package ex9_1b;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doc=new Doctor("doctor","Medicine",67.5);
		Doctor doc1=new Doctor("he?","Surgery",78.9);
		System.out.println(doc.toString());
		System.out.println("");
		System.out.println(doc1.toString());
		System.out.println(doc.equals(doc1));

	}

}
