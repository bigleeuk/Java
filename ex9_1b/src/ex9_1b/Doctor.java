package ex9_1b;
public class Doctor extends pers {
	private String name,specif;
	private double fee1;
	public Doctor(){
		super();
	}
	public Doctor(String name,String spec,double fee){
		this.name=name;
		this.specif=spec;
		this.fee1=fee;
	}
	public void setname(String name1){
		this.name=name1;
	}
	public String getname(){
		return name;
	}

	public String toString(){
		return "name: " + super.getName()+"\nspecifly: "+ specif+"\nVisit fee: "+fee1;
	}
	public boolean equals(pers other) {
		Doctor otherPerson=(Doctor)other;
		return this.fee1==otherPerson.fee1&&this.specif.equalsIgnoreCase(otherPerson.specif);
	}
	public String getSpecif() {
		return specif;
	}
	public void setSpecif(String specif) {
		this.specif = specif;
	}
	public double getFee1() {
		return fee1;
	}
	public void setFee1(double fee1) {
		this.fee1 = fee1;
	}
}
