package com.sharma.dataStructure.linklist.Singly_Link_List;

public class Node {
	public Node next;
	public int data;
	public Node left,right;
	
	Node(int data){
		this.data = data;
		left = right = null;
	}

}
