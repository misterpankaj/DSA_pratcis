package com.pankaj.test;

import java.util.Arrays;
import java.util.List;

public class FindOccurance {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int findCount(final List<Integer> A, int B) {

		int length = A.size();

		if (A.get(length / 2) > B)
			findCount(A.subList(0, length / 2), B);
		else if (A.get(length / 2) > B)
			findCount(A.subList(length / 2, length), B);

		if (A.get(length / 2) == B) {
			System.out.println(A.get(length / 2));
		}
		return 2;
	}
	
	public static void main(String[] args) {
		FindOccurance findOccurance = new FindOccurance();
		List<Integer> list = Arrays.asList(5, 7, 7, 8, 8, 10);
		findOccurance.findCount(list, 7);
	}
}