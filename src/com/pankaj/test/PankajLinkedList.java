package com.pankaj.test;

public class PankajLinkedList {

	public static void main(String[] args) {
//		Node node = new Node(10);
//		Node node2 = new Node(12);
//		Node node3 = new Node(13);
//		node.next = node2;
//		node2.next = node3;
//		node3.next = null;
//		// traverse(node);
//		Node node4 = new Node(14);
//		Node newhead = addnewnode(node, node4);
//		traverse(newhead);
//		System.out.println("-------");		
//		newhead = deletenode(newhead, new Node(13));
//		traverse(newhead);
		
//		newhead = reverse(newhead);
//		System.out.println("-------");
//		traverse(newhead);
		
		Node node = new Node("A");
		Node node2 = new Node("B");
		Node node3 = new Node("B");
		Node node4 = new Node("A");

		node.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		//palimdrome(node);
	}

//	private static void palimdrome(Node head) {
//		Node prevHead = null;
//		Node temp = null;
//		Node onePointerNode = head;
//		Node onePointerNode2 = head;
//		Node twoPointerNode = head;
//		boolean palimdromNumber = true;
//		
//		while(twoPointerNode.next != null && twoPointerNode.next.next != null) {
//			temp = onePointerNode.next;
//			(onePointerNode.clone()).next =prevHead ;
//			prevHead = prevHead2;
//			onePointerNode = temp;
//			
//			onePointerNode2 = onePointerNode2.next;
//			twoPointerNode = twoPointerNode.next.next;
//		}
//		if(twoPointerNode.next != null && twoPointerNode.next.next == null) {
//			onePointerNode2 = onePointerNode2.next;
//		}
//		while(prevHead2 != null && onePointerNode2 != null) {
//			if(onePointerNode2.data != onePointerNode.data) {
//				palimdromNumber = false;
//				break;
//			}
//		}
//		if(palimdromNumber) {
//			System.out.println("LinkedList is palimdrom");
//		}else {
//			System.out.println("LinkedList is palimdrom");
//		}
//	}

	private static Node reverseRecu(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseRecu(head.next);
		Node headNext = head.next;
		headNext.next = head;
		head.next =null;
		return newHead;
		
	}

	private static Node reverse(Node head) {
		Node prevHead = null;
		Node temp = null;
		while (head != null) {
			temp = head.next;
			head.next = prevHead;
			prevHead = head;
			head = temp;
		}
		return prevHead;
	}

	private static Node deletenode(Node newhead, Node node) {
		Node curr = newhead;
		Node prev = newhead;
		while (curr != null) {
			if (curr.equals(node)) {
				if (curr.equals(prev)) {
					newhead = curr.next;
				} else {
					prev.next = curr.next;
				}
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		return newhead;
	}

//	private static Node addnewnode(Node head, Node node) {
//		Node curr = head;
//		Node prev = head;
//		while (curr != null) {
//			if (curr.data > node.data) {
//				if (curr.equals(prev)) {
//					node.next = head;
//					head = node;
//				} else {
//					prev.next = node;
//					node.next = curr;
//				}
//				break;
//			} else {
//				if (curr.next == null) {
//					curr.next = node;
//					break;
//				}
//			}
//			prev = curr;
//			curr = curr.next;
//		}
//		return head;
//	}

	static void traverse(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}

	}

}

class Node {
	String data;
	Node next;
	
	Node() {
	}
	
	Node(String data) {
		this.data = data;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + data;
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (data != other.data)
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
