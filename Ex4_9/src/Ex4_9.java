import java.util.Scanner;
public class Ex4_9 {

	public static void main(String[] args) {
		BasketballGame BG=new BasketballGame();
		String str,str2,team,state="";
		int num=0,num1;
		
		BG.teamOneScore=0;
		BG.teamTwoScore=0;
		BG.team1="Cats";
		BG.team2="Dogs";
		while (true){
			System.out.println("how state:");
			Scanner keyboard1 = new Scanner(System.in);
			team=keyboard1.nextLine(); //progress
			BG.setTeam(team);
			state=BG.getTeam();
			if(state.equals(BG.state2))
				break;
			System.out.println("Enter a score:");
			Scanner keyboard = new Scanner(System.in);
			str=keyboard.next();num=keyboard.nextInt();//������ ������ ���ھ ���� �Է¹����� ����
			BG.setScore1(num);
			BG.setWho(str);
			//num1�� str2��  ���� ����  ���õ� ���� ����
			num1=BG.getScore1();
			str2=BG.getWho();
			if(str2.equals(BG.team1)){
				BG.teamOneScore+=num1;
				BG.Statement();				
			}
			else if(str2.equals(BG.team2)){

				BG.teamTwoScore+=num1;
				BG.Statement();				
			}
		
		}
	}
}
