public class RoomOccupancy 
{
   private int roomNumber;
   private int peopleInRoom;
   private static int totalNumber;
   
   public RoomOccupancy(int num,int num2)
   {
      this.roomNumber = num;
      this.peopleInRoom = num2;
      totalNumber = totalNumber + num2;
   }
   
   public void addOneToRoom()
   {
      this.peopleInRoom++;
      totalNumber++;
   }
   
   public void removeOneFromRoom(int denum)
   {
      if(this.peopleInRoom > 0 && totalNumber > 0)
      {
         peopleInRoom--;
         totalNumber--;
      }
      else
         System.out.println("There is no people in the room");         
   }
   
   public int getNumber()
   {
      return this.roomNumber;
   }
      
   public static int getTotal()
   {
      return totalNumber;
   }

}
//public class RoomOccupancy {
//	private int roomNumber;
//	private int peopleInRoom;
//	private static int totalNumber;
//	
//	RoomOccupancy(int roomnumber,int peopleinroom){
//		roomNumber=roomnumber;peopleInRoom=peopleinroom;
//	}
//	
//	public void addOneToRoom(int roomn,int peopler){
//		peopleInRoom++;
//		totalNumber++;
//	}
//	public void removeOneFromRoom(int peopleR,int totalNumber){
//		if(peopleR>0)
//			if(totalNumber>0)
//			{
//				peopleInRoom--;
//				totalNumber--;
//			}
//	}
//	public int getNumber(){
//		return roomNumber;
//	}
//	public static int getTotal(int roomN,int peopleR){
//		totalNumber=roomN*peopleR;
//		return totalNumber;
//	}
//	
//}
