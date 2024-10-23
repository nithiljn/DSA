package LinkedList;

class ListNode {
	private List head;

	private static class List {
		int data;
		List next;

		List(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void display() {
		List current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}

	public List rev(List head) {
		List current = head;
		List prev = null;
		List node = null;
		while (current != null) {
			node = current.next;
			current.next = prev;
			prev = current;
			current = node;

		}
		return prev;

	}

	public static void main(String[] dvd) {
		ListNode obj = new ListNode();
		obj.head = new List(1);
		List first = new List(2);
		List second = new List(3);
		List third = new List(4);
		List four = new List(5);

		obj.head.next = first;
		first.next = second;
		second.next = third;
		third.next = four;
		obj.display();
		obj.head = obj.rev(obj.head);
		obj.display();
	}

}