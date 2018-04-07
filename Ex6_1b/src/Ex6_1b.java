
public class Ex6_1b {

	public static void main(String[] args) 
	   {
	      RoomOccupancy room1 = new RoomOccupancy(78,5);
	      RoomOccupancy room2 = new RoomOccupancy(89,7);
	      System.out.println(room1.getNumber() + ", " + room2.getNumber() 
	      + " have "+ RoomOccupancy.getTotal() + " people");   
	   }

}
