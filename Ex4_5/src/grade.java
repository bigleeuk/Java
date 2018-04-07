import java.util.Scanner;
public class grade {
	public static final double rate=2.0;
	public double ap,bp,cp,dp,fp;
	public int i;
	public String str1="*";
	public String str2="";
	public double total;
	public void populatior(){
		Scanner keyboard=new Scanner(System.in);
		int a=keyboard.nextInt();int b=keyboard.nextInt();
		int c=keyboard.nextInt();int d=keyboard.nextInt();
		int f=keyboard.nextInt();
		System.out.println(" population");
		System.out.println("0   10   20   30   40   50   60   70   80   90   100 ");
		System.out.println("|    |    |    |    |    |    |    |    |    |    |");
		System.out.println("***************************************************");
		total=a+b+c+d+f;
		//System.out.println("total"+total);
		ap=(a*50)/total;
		ap=Math.round(ap);
		for(i=0;i<ap;i++)
			str2+=str1;
		System.out.println(str2+"A");
		String str2="";
		//System.out.println("A percent"+ap);
		bp=(b*50)/total;
		bp=Math.round(bp);
		for(i=0;i<bp;i++)
			str2+=str1;
		System.out.println(str2+"B");
		String str21="";
		//System.out.println("B percent"+bp);
		cp=(c*50)/total;
		cp=Math.round(cp);
		for(i=0;i<cp;i++)
			str21+=str1;
		System.out.println(str21+"C");
		String str22="";
		//System.out.println("C percent"+cp);
		dp=(d*50)/total;
		dp=Math.round(dp);
		for(i=0;i<dp;i++)
			str22+=str1;
		System.out.println(str22+"D");
		String str23="";
		//System.out.println("D percent"+dp);
		fp=(f*50)/total;
		fp=Math.round(fp);
		for(i=0;i<fp;i++)
			str23+=str1;
		System.out.println(str23+"F");
		//System.out.println("F percent"+fp);
		
	}
}
