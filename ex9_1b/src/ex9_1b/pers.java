package ex9_1b;

public class pers{
			private String name;
			public pers(){
				setName("lee hyoung wook");
				
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public boolean equals(pers otherPerson) {
				return this.name.equalsIgnoreCase(otherPerson.name);
			}
			
	}



