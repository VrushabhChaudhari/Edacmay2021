package Challenge;

class List {
	Node3 head;

	static class Node3 {
		int data;
		Node3 next;

		public Node3(int data) {
			this.data = data;
			next = null;
		}
	}
	void AddAtFirst(int data) {
		Node3 node = new Node3(data); // new node created
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	void swap() {
		if (head == null)
			return;
		if (head.next == null)
			return;
		Node3 current = head;
		Node3 prev = null;
		Node3 third = null;
		if (current == head) {
			prev = current;
			current = current.next;
			prev.next = current.next;
			current.next = prev;
			head = current;
			third = head.next;
			current = current.next.next;

		}
		while (current != null && current.next != null) {

			prev = current;
			current = current.next;
			prev.next = current.next;
			current.next = prev;
			third.next = current;
			third = current;
			current = current.next.next;
			third = third.next;

		}

	}

	public void show() {
		if (head == null)
			return;
		Node3 n1 = head; // to traverse
		while (n1.next != null) {
			System.out.print(n1.data + " ");
			n1 = n1.next;
		}
		System.out.print(n1.data);
	}
}

public class SwapTwoAdjacentLL {

	public static void main(String[] args) {
		List l1 = new List();
		l1.AddAtFirst(100);
		l1.AddAtFirst(90);
		l1.AddAtFirst(80);
		l1.AddAtFirst(70);
		l1.AddAtFirst(60);
		l1.AddAtFirst(50);
		l1.AddAtFirst(40);
		l1.AddAtFirst(30);
		l1.AddAtFirst(20);
		l1.AddAtFirst(10);

		System.out.println("Before Swap");
		l1.show();
		l1.swap();
		System.out.println();
		System.out.println("After Swap");
		l1.show();
	}
}
