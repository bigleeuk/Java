public class Ex6_2a {

   public static void main(String[] args) 
   {
      Suit cardSuit = Suit.SPADES   ;
      System.out.println(cardSuit.ordinal());
      System.out.println(cardSuit.equals(Suit.CLUBS));
      System.out.println(cardSuit.equals(Suit.SPADES));
      System.out.println(cardSuit.compareTo(Suit.HEARTS));
      System.out.println(cardSuit.compareTo(Suit.DIAMONDS));
      System.out.println(Suit.valueOf("CLUBS"));
      System.out.println(Suit.valueOf(cardSuit.toString()));
      System.out.println(cardSuit.getColor());
      System.out.println(cardSuit.toString());  
      System.out.println(cardSuit.toString());
   }
}