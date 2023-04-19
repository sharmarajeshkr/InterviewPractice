package com.sharma.dataStructure.Other_Files;

public class DoubleLinkListImpl {

	DLNode head;

	private void display(String direction) {
		if (direction.trim().equalsIgnoreCase("f")) {
			displayForword();
			return;
		}
		displayBackword();
	}

	// Traversal in forward direction
	private void displayForword() {
		DLNode tdata = head;
		while (tdata.next != null) {
			System.out.print(tdata.data + "->");
			tdata = tdata.next;
		}
		System.out.print(tdata.data);
		System.out.println("\n");
	}

	// Traversal in backword direction
	private void displayBackword() {
		DLNode tdata = head;
		DLNode last = null;
		while (tdata != null) {
			last = tdata;
			tdata = tdata.next;
		}

		while (last.prev != null) {
			System.out.print(last.data + "->");
			last = last.prev;
		}
		System.out.print(last.data);
		System.out.println("\n");
	}

	private void addFirst(int value) {
		DLNode curr = head;
		DLNode new_data = new DLNode(value);
		if (isEmpty()) {
			new_data.next = head;
			head = new_data;
			return;
		}

		new_data.next = curr;
		curr.prev = new_data;
		new_data.prev = null;

		head = new_data;
	}

	private void addLast(int value) {
		DLNode new_data = new DLNode(value);
		if (isEmpty()) {
			new_data.next = head;
			head = new_data;
			return;
		}

		DLNode curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = new_data;
		new_data.prev = curr;
		new_data.next = null;
	}

	private void addAtPosition(int position, int value) {
		DLNode new_data = new DLNode(value);
		if (isEmpty()) {
			new_data.next = head;
			head = new_data;
			return;
		}

		if (countItems() <= position) {
			addLast(value);
			return;
		}

		DLNode curr = head;
		int i = 1;
		while (curr.next != null) {

			if (i == position) {
				DLNode n = curr.next;

				curr.next = new_data;
				new_data.prev = curr;

				new_data.next = n;
				n.prev = new_data;
				return;
			}

			curr = curr.next;
			i++;
		}
	}

	private int countItems() {
		DLNode curr = head;
		int i = 1;
		if (isEmpty()) {
			return 0;
		}

		while (curr.next != null) {
			curr = curr.next;
			i++;
		}
		return i;
	}

	private boolean isEmpty() {
		DLNode curr = head;
		if (curr == null)
			return true;
		return false;
	}

	private void deleteFirst() {
		DLNode curr = head;
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		head = curr.next;
		head.prev = null;
	}

	private void deleteLast() {
		DLNode curr = head;
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;
	}

	private void deleteAtPosition(int position) {

		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		if (countItems() <= position) {
			deleteLast();
			return;
		}

		if (position == 1) {
			deleteFirst();
			return;
		}

		DLNode curr = head;
		DLNode pre = null;
		int i = 1;
		while (curr.next != null) {
			if (i == position) {
				DLNode n = curr.next;

				pre.next = n;
				n.prev = pre;
				return;
			}
			pre = curr;
			curr = curr.next;
			i++;
		}

	}

	public static void main(String[] args) {
		DoubleLinkListImpl dl = new DoubleLinkListImpl();
		dl.addFirst(23);
		dl.addFirst(134);
		dl.addFirst(3);
		dl.addFirst(334);
		dl.addFirst(53);
		dl.addFirst(634);

		dl.addLast(99);

		dl.addAtPosition(5, 789);
		dl.display("f");
		System.out.println("Addintion End \n");
		System.out.println("Delete first \n");
		dl.deleteFirst();
		dl.display("f");
		System.out.println("Delete Last \n");
		dl.deleteLast();
		dl.display("f");

		System.out.println("Delete From position \n");
		dl.deleteAtPosition(2);
		dl.display("f");

		System.out.println("Total Element count");
		System.out.println("\n" + dl.countItems());
		dl.display("b");
	}

}
