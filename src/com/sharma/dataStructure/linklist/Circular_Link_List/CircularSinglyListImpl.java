package com.sharma.dataStructure.linklist.Circular_Link_List;

public class CircularSinglyListImpl {
	private CLNode head;
	private CLNode tail;
	private int size;

	private boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	private void addNodeAtStart(int value) {
		CLNode new_data = new CLNode(value);

		if (isEmpty()) {
			head = new_data;
			tail = new_data;
			new_data.next = head;
		} else {
			CLNode temp = head;
			new_data.next = temp;
			head = new_data;
			tail.next = head;
		}
		size++;
	}

	private void addNodeAtEnd(int value) {
		if (isEmpty()) {
			addNodeAtStart(value);
			return;
		}
		CLNode new_data = new CLNode(value);

		tail.next = new_data;
		tail = new_data;
		tail.next = head;
		size++;
	}

	private void insertNode(int position, int value) {
		CLNode new_data = new CLNode(value);

		if (position == 0) {
			addNodeAtStart(value);
		} else if (position > size) {
			addNodeAtEnd(value);
		} else {
			CLNode temp = head;
			int index = 1;

			while (index != position) {
				temp = temp.next;
				index++;
			}
			new_data.next = temp.next;
			temp.next = new_data;

		}

		size++;
	}

	private void deleteFirst() {
		if (isEmpty()) {
			System.out.println("List  is Empty");
		}

		CLNode temp = head;
		head = temp.next;
		tail.next = temp.next;
		size--;
	}

	private void deleteLast() {
		if (isEmpty()) {
			System.out.println("List  is Empty");
		}
		CLNode pre = null;
		CLNode temp = head;
		while (temp.next != head) {
			pre = temp;
			temp = temp.next;
		}

		pre.next = head;
		tail = pre;
		size--;

	}

	private void deleteAt(int position) {
		if (isEmpty()) {
			System.out.println("List  is Empty");
		} else if (position == 1)
			deleteFirst();
		else if (position >= size)
			deleteLast();
		else {
			CLNode pre = null;
			CLNode temp = head;
			int index = 1;
			while (temp.next != head) {
				if (index == position) {
					CLNode p = pre;
					CLNode n = temp.next;
					p.next = n;
					return;
				}
				pre = temp;
				temp = temp.next;
				index++;
			}
		}
		size--;
	}

	private void elementAt(int position) {
		if (isEmpty())
			System.out.println("Empty List");
		else if (position > size)
			System.out.println("invalid position, max avail element size =" + size);
		CLNode tdata = head;
		int index = 1;
		while (tdata.next != head) {

			if (position == index) {
				System.out.println(tdata.data);
				return;
			}

			tdata = tdata.next;
			index++;
		}

		if (position == size - 1) {
			System.out.println(tdata.data);
			return;
		}

	}

	private void display() {
		if (isEmpty())
			return;
		CLNode tdata = head;

		while (tdata.next != head) {
			System.out.print(tdata.data + " -> ");
			tdata = tdata.next;
		}
		System.out.print(tdata.data + "\n\n");

		/*
		 * for (int i = 0; i < size; i++) { System.out.print(tdata.data); if (i
		 * != size - 1) { System.out.print(" -> "); } tdata = tdata.next; }
		 */

	}

	public static void main(String[] args) {
		CircularSinglyListImpl csl = new CircularSinglyListImpl();
		csl.addNodeAtStart(12);
		csl.addNodeAtStart(112);
		csl.addNodeAtEnd(212);
		csl.addNodeAtEnd(412);
		csl.insertNode(2, 56);
		csl.display();
		System.out.println("Inserting Elements : End");
		csl.deleteFirst();
		csl.display();
		csl.deleteLast();
		csl.display();
		csl.deleteAt(2);
		csl.display();
		System.out.println("Delete Elements : End");
		csl.elementAt(2);
		csl.deleteLast();
		csl.display();
		csl.elementAt(1);

	}

}
