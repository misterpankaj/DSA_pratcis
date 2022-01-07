package com.pankaj.test;

public class TestStack{
	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		System.out.println(stack.push(1));
		System.out.println(stack.push(2));
		System.out.println(stack.push(3));
		System.out.println(stack.push(4));
		System.out.println(stack.push(5));
		
		System.out.println("-----------------");
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println("-----------------");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("-----------------");
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
	}
}

class Stack {
	
	StackNode head = null;
	int size =0;
	
	int push(int data) {
		StackNode stackNode = new StackNode(data);
		stackNode.next = head;
		head = stackNode;
		size++;
		return data;
	}
	
	int pop() throws Exception {
		if(size == 0) {
			throw new Exception("LinkedList don't have any value");
		}
		StackNode temp = head.next;
		head.next = null;
		int data = head.data;
		head = temp;
		size--;
		return data;
	}
	
	int peek() throws Exception {
		if(size == 0) {
			throw new Exception("LinkedList don't have any value");
		}
		int data = head.data;
		return data;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
}

class StackNode {
	int data;
	StackNode next;
	StackNode(int data){
		this.data = data;
	}
}
