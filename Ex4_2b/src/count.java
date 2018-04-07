import java.util.Scanner;
public class count {
   int up,down,reset,now;
   private int count=0;
   
   public int up(){
	   count=count+1;
      System.out.println("up!");
      return count;
   }
   public int down(){
      if(count>0){
    	  count=count-1;
      System.out.println("down!");
      }
      else
         System.out.println("current is 0");
      return count;
   }
   public int reset(){
	   count=0;
      System.out.println("current 0!");
      return count;
   }
   public int now(){
      System.out.println("current value:"+count);
     return count;
   }
}