package home_nov_sixty_question;

class Node {
	int value;
	Node next;

	public Node(int value) {
		super();
		this.value = value;
		this.next = null;
	}
}

public class LinkedList {
	Node head;

	// Adding the Node ...
	public void add(int data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = new Node(data);
		}
	}

	// Deleting the Node ...
	public void delete(int key) {
		if (head == null) {
			System.out.println("Empty String.");
			return;
		}

		// If we've to delete head ... means head matches the key ...
		if (head.value == key) {
			head = head.next;
			return;
		}

		// Traversing the list to finding the match key ...
		Node previous = null;
		Node current = head;

		while (current != null && current.value != key) {
			previous = current;
			current = current.next;
		}

		// if the current is moved out of the list ...
		if (current == null) {
			System.out.println("The list is not having the key:  " + key);
			return;
		}

		// If key is there remove the key form list ...
		previous.next = current.next;

	}

	// Displaying the Node ...
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Adding the nodes {20, 40, 40, 10, 90, 60, 30} ...
		list.add(20);
		list.add(40);
		list.add(10);
		list.add(40);
		list.add(90);
		list.add(60);
		list.add(30);

		// Displaying the Nodes ...
		System.out.print("List after adding the data : ");
		list.display();

		// Deleting the Nodes ...
		int deleteData = 60;
		System.out.println("Delete " + deleteData + " form the list.");
		list.delete(deleteData);

		// Displaying the Node ...
		System.out.print("List after the deleting " + deleteData + " : ");
		list.display();
	}
}
