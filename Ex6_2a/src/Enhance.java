enum Suit
{
	 CLUBSa("DFEI"),CLUBS("black"), DIAMONDS("red"), SPADES("black"), HEARTS("red"),LOL("white");
   
   private final String color;
   
   private Suit(String suitColor)
   {
      color = suitColor;
   }
   public String getColor()
   {
      return color;
   }
}