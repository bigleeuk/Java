import java.util.Scanner;
public class Ex4_2b {

   public static void main(String[] args) {
      count choice =new count();
      Scanner keyboard=new Scanner(System.in);
      System.out.println("1:up 2:down 3:reset 4:current 5:exit");
      int select;
      while(true){
    	  select =keyboard.nextInt();
         switch(select){
         case 1:
            choice.up();
            break;
         case 2:
            choice.down();
            break;
         case 3:
            choice.reset();
            break;
         case 4:
            choice.now();
            break;
         }
      }
   }
}