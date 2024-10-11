package arrays;

import java.util.*;

public class SingklyLinkedList {
	private L1 head;

	private static class L1 {
		int data;
		L1 next;

		L1(int data) {
			this.data = data;
			this.next = null;
		}
	 

	}
	void display() {
	    while(head!=null) {
	    	System.out.print(head.data+" -> ");
	    	head =head.next;
	    }
	    System.out.print("null");
	    
	}
	public static void main(String... dgfv) {
		SingklyLinkedList obj = new SingklyLinkedList();
		obj.head= new L1(10);
		L1 f1= new L1(12);
		L1 f2= new L1(14);
		L1 f3= new L1(16);
		L1 f4= new L1(18);
		obj.head.next=f1;
		f1.next=f2;
		f2.next=f3;
		f3.next=f4;
		obj.display();
	}
	
}
