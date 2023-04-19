package com.sharma.dataStructure.Stack_Implementation.Link_List_Implementation;


public class StackImpl {
	Node head;
	int size;

	public StackImpl() {
		size = -1;
	}

	private boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	private void push(int value) {
		Node new_data = new Node(value);

		if (isEmpty()) {
			head = new_data;
			return;
		}
		new_data.next = head;
		head = new_data;
		++size;
	}
	
	private void pop(){
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		Node tdata = head;
		
	}
	

	private void display() {
		if (isEmpty()) {
			System.out.println("List is empty");
		}
		Node tdata = head;
		while (tdata.next != null) {
			System.out.print(tdata.data + "->");
			tdata = tdata.next;

		}
		System.out.print(tdata.data + "\n");

	}

	public static void main(String[] args) {
		StackImpl sl = new StackImpl();
		sl.push(12);
		sl.push(112);
		sl.push(212);
		sl.push(412);
		sl.push(512);

		sl.display();
	}

}
