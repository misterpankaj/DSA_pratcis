package com.pankaj.test;

public class MyStack{
	
	public static void main(String[] args) throws Exception {
		MyStack2 myStack2 = new MyStack2(5);
		System.out.println(myStack2.push(1));
		System.out.println(myStack2.push(2));
		System.out.println(myStack2.push(2));
		System.out.println(myStack2.push(2));
		System.out.println(myStack2.push(2));
		
		//System.out.println(myStack2.peek());
		System.out.println(myStack2.size());
		
		System.out.println("----------------");
		System.out.println(myStack2.pop());
		System.out.println(myStack2.pop());
		System.out.println(myStack2.pop());
		System.out.println(myStack2.pop());
		System.out.println(myStack2.isEmpty());
		System.out.println(myStack2.pop());
		
		System.out.println(myStack2.isEmpty());
	}
	
	
}

class MyStack2 {

	int a[];
	int size = -1;
	int capacity;
	
	public MyStack2(int capacity) {
	  this.capacity = capacity;
	  this.a = new int[capacity];
	}
	
	int push(int data) throws Exception {
		if (size+1 == capacity) {
			throw new Exception();
		}
		size++;
		a[size] = data;
		return data;
	}
	
	int pop() throws Exception {
		if(size == -1) {
			throw new Exception();
		}
		int data = a[size];
		size --;
		return data;
	}
	
	int peek() throws Exception {
		if(size == -1) {
			throw new Exception();
		}
		int data = a[size];
		return data;
	}
	
	int size() {
		return size+1;
	}
	
	boolean isEmpty() {
		return size == -1;
	}
}
