public class faculty extends employ{

	private String facultytitle;
	public faculty(String title,int id, String department) {
		super(department,id);
		this.facultytitle=title;
		// TODO Auto-generated constructor stub
	}
	public String getFacultytitle() {
		return facultytitle;
	}
	public void setFacultytitle(String facultytitle) {
		this.facultytitle = facultytitle;
	}
	public void writeOutput(){
		super.writeOutput();
		System.out.println("facultytitle is: "+ facultytitle);
	}

}
