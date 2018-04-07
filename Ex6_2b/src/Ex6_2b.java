public class Ex6_2b {

   public static void main(String[] args) 
   {
      Time2 time1 = new Time2(13,50,true);
      Time2 time2 = new Time2(2,47);
      System.out.println(time1.getTime12());
      System.out.println(time1.getTime24());
      System.out.println(time2.getTime12());
      System.out.println(time2.getTime24());
   }
}