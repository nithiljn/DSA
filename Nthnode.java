package LinkedListseries;

public class Nthnode {

	private Linked head;

	private static class Linked {
		int data;
		Linked next;

		Linked(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void add(int values) {
		Linked node = new Linked(values);
		if (head == null) {
			node.next = head;
			head = node;
		} else {
			Linked current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}

	void display() {
		Linked current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("Null");

	}

	public Linked middlenode() {
		Linked first = head;
		Linked second = head;
		while (second != null && second.next != null) {
			first = first.next;
			second = second.next.next;
		}
		return first;

	}

	public Linked endnode(int value) {
		Linked first = head;
		Linked second = head;
		int count = 0;
		while (count < value) {
			second = second.next;
			count++;
		}
		while (second != null) {
			first = first.next;
			second = second.next;
		}
		return first;
	}

	public void duplicte() {
		Linked current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

	}

	public Linked insert(int values) {
		Linked node = new Linked(values);
		Linked current = head;
		Linked temp = null;
		if (head == null || current.data > node.data) {
			node.next = head;
			head = node;
		}
		while (current != null && current.data < node.data) {
			temp = current;
			current = current.next;
		}
		node.next = current;
		temp.next = node;
		return node;

	}

	public  void remove(int n) {
		Linked current = head;
		Linked temp=null;
		while(current!=null ) {
			if(current.data==(n)){
				temp.next=current.next;
			}
			else {
				temp=current;
			}
			current=current.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nthnode obj = new Nthnode();

		obj.add(1);
		obj.add(3);
		obj.add(4);
		obj.add(4);
		obj.add(5);
		obj.add(5);
		obj.add(7);

		System.out.println("The Linked List are :");
		obj.display();
		System.out.println();
		System.out.println("The  nth  node from the end of LinkedList :");
		System.out.println(obj.endnode(2).data);
		obj.duplicte();
		System.out.println();
		System.out.println("The duplicate element are removed");
		obj.duplicte();
		obj.display();
		System.out.println("\n" + "The node added in sorted Linkedlist");
		System.out.println("The node is added is: " + obj.insert(6).data);
		obj.display();
		System.out.println("\n"+"The Node remove from Linked list is : 5 ");
		obj.remove(5);
		obj.display();

	}

}
