package com.sharma.dataStructure.Other_Files;

public class NodeImplSingleList {
	Node head;

	private void addLast(int value) {
		Node new_data = new Node(value);

		if (head == null) {
			head = new_data;
			return;
		}
		new_data.next = null;

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = new_data;

	}

	private void display() {
		Node tdata = head;
		while (tdata.next != null) {
			System.out.print(tdata.data + "->");
			tdata = tdata.next;
		}
		System.out.println(tdata.data);
	}

	private void addlocation(int position, int data) {
		Node tdata = head;
		Node new_data = new Node(data);
		int inserPosition = 0;
		while (tdata.next != null) {
			if (inserPosition == position) {
				Node pre = tdata;
				Node n = tdata.next;
				new_data.next = null;
				pre.next = new_data;
				new_data.next = n;
				return;
			}
			tdata = tdata.next;
			inserPosition++;
		}
	}

	private void insertMiddle(int data) {
		int count = count();
		addlocation(count / 2, data);
	}

	private void deleteFirst() {
		Node pre = head;
		head = pre.next;
		pre.next = null;
	}

	private void deleteLast() {
		if ((head == null) || (head.next == null))
			return;

		Node pre = head;
		while (pre.next.next != null) {
			pre = pre.next;
		}
		pre.next = null;
	}

	private int count() {
		if (head == null)
			return 0;

		Node pre = head;
		int count = 1;
		while (pre.next != null) {
			pre = pre.next;
			count++;
		}
		return count;
	}

	private void deleteAtPosition(int position) {
		if ((position == 0) || (head == null) || (head.next == null))
			return;
		Node tdata = head;
		int deletePosition = 0;
		Node curr = null;
		while (tdata != null) {
			if (position == deletePosition) {
				Node pre = curr;
				Node n = tdata.next;
				pre.next = n;
				tdata.next = null;
				return;
			}
			curr = tdata;
			tdata = tdata.next;
			deletePosition++;
		}

	}

	private void addFirst(int value) {
		Node new_data = new Node(value);
		new_data.next = head;
		head = new_data;
	}

	private void swipe2Data() {
		Node curr = head;
		while (curr != null && curr.next != null) {
			int k = curr.data;
			curr.data = curr.next.data;
			curr.next.data = k;
			curr = curr.next.next;
		}
	}

	private void moveLastToFirst() {
		Node tdata = head;
		Node pre = null;
		while (tdata.next != null) {
			pre = tdata;
			tdata = tdata.next;
		}
		pre.next = null;
		tdata.next = head;
		head = tdata;
	}

	public static void main(String[] args) {
		NodeImplSingleList l = new NodeImplSingleList();
		l.addLast(12);
		l.addLast(121);
		l.addLast(122);
		l.addFirst(1);
		l.addLast(124);
		l.addLast(12112);
		l.addLast(11221);
		l.addLast(1242);
		l.addLast(12564);
		l.addlocation(2, 45);
		l.display();
		l.deleteFirst();
		l.display();
		l.deleteLast();
		l.display();
		l.deleteAtPosition(2);
		l.display();
		System.out.println(l.count());

		l.insertMiddle(6);
		l.display();
		System.out.println(l.count());

		// l.swipe2Data();
		l.moveLastToFirst();
		l.display();

	}

}
