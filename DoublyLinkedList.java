package LinkedListseries;

public class DoublyLinkedList {
	private ListNode head;

	private static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;

		}
	}

	void display() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public ListNode addAt(int values) {
		ListNode node = new ListNode(values);
		if (head == null) {
			node.next = head;
			head = node;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		return node;
	}

	public static ListNode merge(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;
		while (a != null && b != null) {
			if (a.data <= b.data) {
				temp.next = a;
				a = a.next;
			} else {
				temp.next = b;
				b = b.next;
			}
			temp = temp.next;
		}
		if (a == null) {
			temp.next = b;
		} else {
			temp.next = a;
		}
		return dummy.next;
	}

	public ListNode addition(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(-1);
		ListNode temp = dummy;
		int carry = 0;
		while (a != null || b != null) {
			int x = (a != null) ? a.data : 0;
			int y = (b != null) ? b.data : 0;
			int sum = x + y + carry;
			carry = sum / 10;
			temp.next = new ListNode(sum % 10);
			temp = temp.next;
			if (a != null)
				a = a.next;
			if (b != null)
				b = b.next;
		}
		if (carry > 0) {
			temp.next = new ListNode(carry);
		}
		return dummy.next;
	}

	void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList obj = new DoublyLinkedList();
		obj.addAt(7);
		obj.addAt(4);
		obj.addAt(9);
		System.out.println("the first linked list :");
		obj.display();
		DoublyLinkedList obj1 = new DoublyLinkedList();
		obj1.addAt(5);
		obj1.addAt(6);
		System.out.println("\n" + "the second linked list :");
		obj1.display();
         System.out.println("\n"+"Addion of the two linked list is :");
		ListNode addition = obj.addition(obj.head, obj1.head);
		obj.display(addition);
		
		System.out.println("\n"+"the sorded of linkedlist is :");
		ListNode me = obj.merge(obj.head, obj1.head);
		obj.display(me); // this methode is if the Linked list is in sorted order
	}

}
