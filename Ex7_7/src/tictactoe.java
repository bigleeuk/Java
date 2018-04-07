import java.util.Scanner;
public class tictactoe {

   public static void xturn(String arr[][]){
      Scanner keyboard=new Scanner(System.in);
      int row,col;
      System.out.println("where you want x? row col");
      row=keyboard.nextInt();
      col=keyboard.nextInt();
      if(row>2){
         System.out.println("wrong try again");
         row=keyboard.nextInt();
      }
      if(col>2){
         System.out.println("wrong try again");
         col=keyboard.nextInt();
      }
      if(arr[row][col] != "@"){
    	  System.out.println(" already exist , try again");
    	  row=keyboard.nextInt();
          col=keyboard.nextInt();
      }
      arr[row][col]="x";
      if(arr[row][col]=="x"||arr[row][col]=="o")
      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
         }
         System.out.println("");
      }
   }
   public static void oturn(String arr[][]){
      Scanner keyboard=new Scanner(System.in);
      int row,col;
      System.out.println("where you want o? row col");
      row=keyboard.nextInt();
      col=keyboard.nextInt();
      if(row>2){
         System.out.println("wrong try again");
         row=keyboard.nextInt();
      }
      if(col>2){
         System.out.println("wrong try again");
         col=keyboard.nextInt();
      }
      if(arr[row][col] != "@"){
    	  System.out.println(" already exist , try again");
    	  row=keyboard.nextInt();
          col=keyboard.nextInt();
      }
      arr[row][col]="o";
      for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
         }
         System.out.println("");
      }
   }
   public static boolean xwin(String arr[][]){
      int i,j=0,count=0,result=0;
      for(i=0;i<3;i++){
         for(j=0;j<3;j++){
            if(arr[i][j]=="x")
               count++;
            else
               count=0;
         }
         if(count==3)
            result++;
      }
      for(j=0;j<3;j++){
         for(i=0;i<3;i++){
            if(arr[i][j]=="x")
               count++;
            else
               count=0;
         }
         if(count==3)
            result++;
      }
      if(arr[0][0]=="x"&&arr[1][1]=="x"&&arr[2][2]=="x")
         result++;
      if(arr[0][2]=="x"&&arr[1][1]=="x"&&arr[2][0]=="x")
         result++;
      if(result>0)
         return true;
      else
         return false;
   }
   public static boolean owin(String arr[][]){
      int i,j=0,count=0,result=0;
      for(i=0;i<3;i++){
         for(j=0;j<3;j++){
            if(arr[i][j]=="o")
               count++;
            else
               count=0;
         }
         if(count==3)
            result++;
      }
      for(j=0;j<3;j++){
         for(i=0;i<3;i++){
            if(arr[i][j]=="o")
               count++;
            else
               count=0;
         }
         if(count==3)
            result++;
      }
      if(arr[0][0]=="o"&&arr[1][1]=="o"&&arr[2][2]=="o")
         result++;
      if(arr[0][2]=="o"&&arr[1][1]=="o"&&arr[2][0]=="o")
         result++;
      if(result>0)
         return true;
      else
         return false;
   }
}