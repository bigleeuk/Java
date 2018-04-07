public class Time2 
{
   private int hour;
   private int minute;
   
   public Time2() 
   {
      hour = 0;
      minute = 0;
   }
   
   public static boolean isValid(int hour, int minute)
   {
      if((hour>=0 && hour<=23) && (minute>=0 && minute<=59))
         return true;
      else
         return false;
   }
   
   public Time2(int newhour, int newminute)
   {
      if(isValid(newhour,newminute) == true)
      {
         this.hour = newhour;
         this.minute = newminute;
      }
      else
      {
         System.out.println("Invalid value !!");
         System.exit(0);
      }      
   }
   
   public Time2(int newhour, int newminute, boolean isPM)
   {
      if(isPM == true)
      {
         if(newhour>12){
            this.hour = newhour;
            this.minute = newminute;
         }
         else{
            newhour = newhour + 12;
            this.hour = newhour;
            this.minute = newminute;
         }
      }
      else{
         if(newhour<=12){
            this.hour = newhour;
            this.minute= newminute;
         }
         else{
            System.out.println("AM hour is not bigger than 12...");
            System.exit(0);
         }
      }
   }
   public String getTime24()
   {
      String temp;
      temp = String.format("%d%d",this.hour,this.minute);
      return temp;
   }
   public String getTime12()
   {
      String temp;
      if(this.hour>12){
         temp = String.format("%d : %d PM",this.hour-12,this.minute);
         return temp;
      }
      else{
         temp = String.format("%d : %d AM",this.hour,this.minute);
         return temp;
      }
         
   }   
}