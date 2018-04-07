//import java.util.Scanner;
public class BasketballGame {
	public static final String state1="progress";
	public static final String state2="finished";
	private String team;
	private String who;
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String team1;
	public String team2;
	//team1 team2 이름 받기 
	public int teamOneScore;
	public int teamTwoScore;
	public int score;
	private int score1;
	public int getScore1() {
		return score1;
	}
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	public int CatScore(int score1,String a){
		team=a; 
		if(team==team1)
			teamOneScore+=score1;
		System.out.println(teamOneScore);
		return teamOneScore;
		
	}
	public int DogScore(int score1,String a){
		team=a;
		if(team==team2)
			teamTwoScore+=score1;
		return teamTwoScore;
	
	}
	
	public void Statement(){

		if(teamOneScore>teamTwoScore)
			System.out.println(team1+" "+teamOneScore+","+team2+" "+teamTwoScore+";"+" "+team1+" "+"are winning");
		else if(teamOneScore<teamTwoScore)
			System.out.println(team1+" "+teamOneScore+","+team2+" "+teamTwoScore+";"+" "+team2+" "+"are winning");
		else
			System.out.println(team1+" "+teamOneScore+","+team2+" "+teamTwoScore+";"+" "+team1+" and "+team2+" "+"are draw");
	}
 

}
