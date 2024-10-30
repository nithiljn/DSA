package DoublyLinkedList;

import java.lang.*;
import java.util.*;

import LinkedListseries.DoublyLinkedList;

public class DoublyLinkedLis {
	ListNode head;
	ListNode tail;
	int length;
	public class ListNode{
		int data;
		ListNode next;
		ListNode prev;
		ListNode(int data){
			this.data=data;
		}
		
	}
	DoublyLinkedLis(){
		this.head=null;
		this.tail=null;
		int length=0;
	}
	public boolean isempty() {
		return length==0;
	}
	public int length() {
		return length;
	}
	void add(int val) {
		ListNode node=new ListNode(val);
		if(isempty()) {
			tail=node;
		}else {
			head.prev=node;
		}
		node.next=head;
		head=node;
		length++;
	}
	void displayF() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+" -> <- ");
			current=current.next;
		}
		System.out.println("null");
	}
	void displayR() {
		ListNode current = tail;
		while(current!=null) {
			System.out.print(current.data+" -> <- ");
			current=current.prev;
		}
		System.out.println("null");
	}
	void addatend(int val) {
		ListNode node = new ListNode(val);
		if(isempty()) {
			head=node;
		}else {
			tail.next=node;
			node.prev=tail;
		}
		tail=node;
		length++;
	}
	public ListNode remove() {
	    ListNode current=head;
	    if(head==tail) {
	    	tail=null;
	    }
	    else {
	    	head.next.prev=null;
	    }
	    head=head.next;
	    current.next=null;
	    return current;
	}
	public ListNode removeE() {
	    ListNode current=tail;
	    if(head==tail) {
	    	head=null;
	    }
	    else {
	    	tail.prev.next=null;
	    }
	    tail=tail.prev;
	    current.prev=null;
	    return current;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DoublyLinkedLis obj =new DoublyLinkedLis();
      System.out.println("The Doubly Linked List are");
      obj.add(0);
      obj.add(2);
      obj.add(7);
      obj.add(3);
      obj.displayF();
      System.out.println("\n"+"Add the val at the end of List");
      
      obj.addatend(31);
      obj.displayF();
      System.out.println("\n"+"Remove the elemnt from the begin of the list");
      System.out.println("The elemnt has removed from lsit is : "+obj.remove().data);
      obj.displayF();
      System.out.println();
      System.out.println("The Elemnt removed from the list from last is :");
      System.out.println("The element is removed from list is : "+obj.removeE().data);
      obj.displayF();
      
      System.out.println("\n"+"The reverse of the List is");
      obj.displayR();
	}

}
