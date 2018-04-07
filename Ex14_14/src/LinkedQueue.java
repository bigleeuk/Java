import java.util.Scanner;
import java.util.LinkedList;
public class LinkedQueue {
	private ListNode head;
	private ListNode front;
	private int count;
	public LinkedQueue(){
		head = null;
	}
	public void showList(){
		ListNode position = head;
		while(position != null){
			System.out.println(position.getData());
			position = position.getLink();
		}
	}
	public int length(){
		count = 0;
		ListNode position = head;
		while(position != null){
			count ++;
			position = position.getLink();
		}
		return count;
	}
	public void addToQueue(String data){
		if(head == null){
			head = new ListNode(data,head);
		}
		else{
			ListNode position = head;
			while(position != null){
				position = position.getLink();
			}
			position = new ListNode(data,position.getLink());
		}
	}
	public String removeFromQueue(){
		ListNode temp = head;
		if(isEmpty())
			return null;
		else if(!isEmpty()){
			
			temp.setData(head.getData());
		}
		head = head.getLink();
		return temp.getData();
	}
	public boolean isEmpty(){
		return head == null;
	}

}