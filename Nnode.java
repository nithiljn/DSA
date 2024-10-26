package LinkedList;

public class Nnode {
	private linked head;

	private static class linked {
		int data;
		linked next;

		linked(int data) {
			this.data = data;
			this.next = null;

		}
	}

	void display() {
		linked current = head;
		while (current != null) {
			System.out.print(current.data + " - >");
			current = current.next;
		}
		System.out.println("null");
	}

	void addbegin(int values) {
		linked node = new linked(values);
		node.next = head;
		head = node;
	}

	void addatend(int values) {

		linked node = new linked(values);
		linked current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = node;

	}

	public linked rev(linked head) {
		linked current = head;
		linked prev = null;
		linked node = null;
		while (current != null) {
			node = current.next;
			current.next = prev;
			prev = current;
			current = node;

		}
		return prev;
	}

	public linked half(linked head) {
		int count = 0;
		linked current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		int sum = count / 2;

		current = head;
		linked prev = null;
		linked node = null;
		for (int i = 0; i < sum; i++) {
			node = current.next;
			current.next = prev;
			prev = current;
			current = node;

		}

		linked pointing = prev;

		while (pointing.next != null) {
			pointing = pointing.next;
		}
		pointing.next = current;
		return prev;

	}

	public linked middelNode() {
		linked m1 = head;
		linked m2 = head;
		while (m1 != null && m2.next != null) {
			m1 = m1.next;
			m2 = m2.next.next;
		}
		return m1;
	}

	public int countAll() {
		linked current = head;
		int count = 0;
		while (current != null) {
			count += current.data;
			current = current.next;
		}
		return count;
	}

	public int maxnode() {
		linked current = head;
		int max = 0;
		while (current != null) {
			if (current.data > max) {
				max = current.data;
			}
			current = current.next;
		}
		return max;
	}

	public int minnode() {
		linked current = head;

		int min = current.data;
		while (current != null) {
			if (current.data < min) {
				min = current.data;

			}
			current = current.next;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nnode obj = new Nnode();
		System.out.println("The Linked List are  : ");
		obj.addbegin(5);
		obj.addatend(8);
		obj.addatend(2);
		obj.addatend(11);
		obj.addatend(4);
		obj.addatend(9);
		obj.addatend(6);

		obj.display();
		System.out.println();
		System.out.println("Reverse the Linked List  :");
		obj.head = obj.rev(obj.head);
		obj.display();

		System.out.println();
		System.out.println("Reverse the Half of the linked list  :");
		obj.head = obj.half(obj.head);
		obj.display();
		System.out.println();
		System.out.println("The Middle node is : ");
		System.out.println(obj.middelNode().data + "\n");
		System.out.println("The additional count of all number is :");
		System.out.println(obj.countAll() + "\n");
		System.out.println("The Maximum number in linked node is :");
		System.out.println(obj.maxnode() + "\n");
		System.out.println("The Minimum number in this node is :");
		System.out.println(obj.minnode());

	}

}
