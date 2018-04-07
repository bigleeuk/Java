public class Time 
{
   private int hour;
   private int minute;
   
   public Time() 
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
   
   public void setTime(int newhour, int newminute)
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
   
   public void setTime2(int newhour, int newminute, boolean isPM)
   {
      if(isPM == true)
      {
         if(newhour>12)
            setTime(newhour,newminute);
         else{
            newhour = newhour + 12;
            setTime(newhour,newminute);
         }
      }
      else{
         if(newhour<=12)
            setTime(newhour,newminute);
         else{
            System.out.println("AM hour is not bigger than 12");
            System.exit(0);
         }
      }
   }
   
   public int getHour()
   {
      return this.hour;
   }
   
   public int getMinute()
   {
      return this.minute;
   }
}