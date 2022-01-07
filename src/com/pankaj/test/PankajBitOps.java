package com.pankaj.test;

import java.util.List;
import java.util.Stack;

public class PankajBitOps {
	public static void main(String[] args) {
		//int a = 7, b=8;
		//System.out.println(a & b);
		//System.out.println(a | b);
		//System.out.println(a ^ b);
		//System.out.println(~ b);
		
		//System.out.println(a >> 2);
		//System.out.println(a << 2);
		

//		a =8;
//		int c = a & 1;
//		if (c == 1) {
//			System.out.println("Odd number");
//		} else {
//			System.out.println("Even number");
//		}

		
//		a = a ^ b;
//		System.out.println(a);
//		b = a ^ b ;
//		System.out.println(b);
//		a = a ^ b;
//		System.out.println(a);
		
//		int a = 8; // a = 1 0 0 0
//		int b = a >> 2;
//		int c = b & 1;
//		if (c ==0) {
//			System.out.println("number is 0");
//		}else {
//			System.out.println("number is 1");
//		}
		
//		int a = 0; // a = 0 0 0 0
//		int b = 1 << 3;
//		System.out.println(b);
//		int c = a & b;
//		System.out.println(c);
//		if (c > 0) {
//			System.out.println("number is 1");
//		}else {
//			System.out.println("number is 0");
//		}
		
		
		//double value = Math.log(8); 
		//System.out.println(value);
		
//		int a =13; // 1101
//		System.out.println("Value "+(a & (a-1)));
//		System.out.println();
//		while ((a & (a-1)) != 0) {
//			System.out.println("a value "+a);
//			System.out.println("a-1 value "+(a-1));
//			System.out.println("(a & (a-1)) "+(a & (a-1)));
//			System.out.println();
//			a = a & (a-1);
//		}
		
		
//		int a[]=  {5,4,1,5,4};
//		int res = 5 ^4^1^5^4;
//		System.out.println(res);
		
		
//		int a[]=  {5,4,1,4,3,5,1,2};
//		int res = 5^4^1^4^3^5^1^2;  
//		System.out.println(res);
		
//		int i = 45354, j = 45354;
//		int reverse =0;
//		while(j != 0) {
//			reverse = reverse*10 + (j % 10);
//			j= j/10;   					
//		}
//		
//		if(i == reverse) {
//			System.out.println("same");
//		}
		
		int org_temp = 12344321;
		int length = String.valueOf("12344321").length();
		Stack<Integer> stack = new Stack<Integer>();
		
		int round = 0;
		boolean isOdd = false;
		if(length %2 ==0) {
			round = length/2;
		}
		else { 
			round = (length/2) + 1;
			isOdd = true;
		}
		
		int i =0;
		while(i != round) {
			int number = org_temp %10;
			org_temp = org_temp/10;
			stack.push(number);	
			i++;
		}
		if(isOdd) {
			stack.pop();
		}
		while(i != length) {
			i++;
			int number = org_temp %10;
			org_temp = org_temp/10;
			int pop_number = stack.pop();
			if(number == pop_number) {
				System.out.println("number matched");
			}
			else {
				System.out.println("number not palindrome");
				System.exit(-1);
			}
		}
		
	}
}
