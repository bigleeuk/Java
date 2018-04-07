import java.util.Scanner;
public class Movie {
	private String movie_name;
	private String MPAA_rate;
	public double avg=0.0;
	public int count1=0,count2=0,count3=0,count4=0,count5=0;
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMPAA_rate() {
		return MPAA_rate;
	}
	public void setMPAA_rate(String mPAA_rate) {
		MPAA_rate = mPAA_rate;
	}
	public String evl_MPAA(String a){
		if(MPAA_rate.equals("g"))
			System.out.println("All ages admitted");
		else if(MPAA_rate.equals("nr"))
			System.out.println("Not yet");
		else if(MPAA_rate.equals("pg"))
			System.out.println("Some material may not be suitable for children");
		else if(MPAA_rate.equals("pg-13"))
			System.out.println("Some material may be inappropriate for children under 13");
		else if(MPAA_rate.equals("r"))
			System.out.println("Under 17 requires accompanying parent or adult gardian");
		else if(MPAA_rate.equals("nc-17"))
			System.out.println("NO one 17 and under admitted");
		return MPAA_rate;
	}
	public void addRating(){
		System.out.println("Write addrating");
		Scanner keyboard= new Scanner(System.in);
		while(true){
			String state=keyboard.next();
			if(state.equals("quit")){
				break;
			}
			else{
				switch(state){
				case "1":
					System.out.println("Terrible");
					count1++;
					break;
				case "2":
					System.out.println("Bad");
					count2++;
					break;
				case "3":
					System.out.println("OK");
					count3++;
					break;
				case "4":
					System.out.println("Good");
					count4++;
					break;
				case "5":
					System.out.println("Great");
					count5++;
					break;
				}	
			}
		}
		
	}
	public void getAverage(int c1,int c2,int c3,int c4,int c5){
		avg=((c1*1)+(c2*2)+(c3*3)+(c4*4)+(c5*5))/(c1+c2+c3+c4+c5);
		System.out.println("count1 is "+c1+"count2 is "+c2+"count3 is "+c3+"count4 is "+c4+"count5 is "+c5);
		System.out.println("average is: " + avg);
		
	}
	public boolean equals(Movie movie){
		return this.movie_name.equals(movie.movie_name);
		
	}
	public boolean equals1(Movie movie){
		return this.MPAA_rate.equals(movie.MPAA_rate);
		
	}
	public boolean equals2(Movie movie){
		return this.avg==movie.avg;
	}
}
