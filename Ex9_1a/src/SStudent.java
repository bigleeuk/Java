
public class SStudent extends PPerson {
	private int studentNumber;

	public SStudent() {
		super();
		studentNumber = 0;
	}

	public SStudent(String initialName, int initialStudentNumber) {
		setName(initialName);
		studentNumber = initialStudentNumber;
	}

	public void reset(String newName, int newStudentNumber) {
		setName(newName);
		studentNumber = newStudentNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber;
	}

	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber);
	}

	public boolean equals(SStudent otherStudent) {
		return this.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber);
	}
}
