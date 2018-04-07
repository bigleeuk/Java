import java.lang.Comparable;
public class student extends Person implements Comparable {
	String name;
	private String firstName;
	private String lastName;
	private int studentNumber;
	public student()
	{
		super();
		studentNumber = 0;
	}
	public student(String initialName,int initialStudentNumber)
	{
		super(initialName);
		studentNumber=initialStudentNumber;
	}
	public student(String firstName, String lastName,int number) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setStudentNumber(number);
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public void writeOutput()
	{
		System.out.println("Name :"+getName());
		System.out.println("Student Number :"+studentNumber);
	}

	public String toString() {
		return lastName + ", " + firstName ;

	}
	public boolean equals(student otherStudent)
	{
		return this.hasSameName(otherStudent)&&(this.studentNumber==otherStudent.studentNumber);		
	}
	@Override
	public int compareTo(Object o) {
		int result;
		int inStudentN = ((student)o).getStudentNumber();
		return result = studentNumber - inStudentN;
	}

}



