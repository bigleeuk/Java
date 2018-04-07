import java.util.Scanner;
public class Ex7_7 {

   public static void main(String[] args) {
      Scanner keyboard=new Scanner(System.in);
      String[][] tic=new String[3][3];
      int i,j,count=0;
      String first,gar;
      for(i=0;i<3;i++){
         for(j=0;j<3;j++){
        	 tic[i][j]="@";
         }
      }
      while(true){
         for(i=0;i<3;i++){
            for(j=0;j<3;j++){
               System.out.print(tic[i][j]+" ");
            }
            System.out.println("");
         }
         System.out.println(" first : x");
         System.out.println(" start");
         while(true){
            tictactoe.xturn(tic);
            count++;
            if(count>=9){
               System.out.println("draw. again");
               count=0;
               break;
            }
            if(tictactoe.xwin(tic))
               break;
            tictactoe.oturn(tic);
            count++;
            if(count>=9){
               System.out.println("draw. again");
               count=0;
               break;
            }
            if(tictactoe.owin(tic))
               break;
         }
         if(tictactoe.xwin(tic)){
            System.out.println("x is win");
            count=0;
            for(i=0;i<3;i++){
               for(j=0;j<3;j++){
            	   tic[i][j]="@";
               }
            }
         }
         else if(tictactoe.owin(tic)){
            System.out.println("o is win");
            count=0;
            for(i=0;i<3;i++){
               for(j=0;j<3;j++){
            	   tic[i][j]="@";
               }
            }
         }
      }
   }
}

