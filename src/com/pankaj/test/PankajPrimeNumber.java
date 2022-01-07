package com.pankaj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class PankajPrimeNumber {

	public static void main(String[] args) {
//		boolean[] prime = isPrime(20);
//		for(int i =0 ;i<20;i++) {
//			System.out.println(i+"-"+prime[i]);	
//		}
//		System.out.println(gcd(24,60));
//		System.out.println(fastPower(3,5));
//		System.out.println(powerNumberRecursive(3,5));
//		System.out.println(matrixPaths(2,2));
//		String str = "abcde";
//		System.out.println(str.length());
//		System.out.println(str.substring(0, str.length()-1));
//		System.out.println(supersetstring(str));
//		System.out.println(supersetStringarray(str));
//		int[] intarray = { 5, 2, 7, 3, 6, 1, 2, 4 };
//		System.out.println(sumOfProfits(intarray));
//		int[] rainWaterProblem = { 3, 1, 2, 4, 0, 1, 3, 2 };
//		System.out.println(sumOfRainWater(rainWaterProblem));
//		int a[] = {5, -10, 15, 20, 25, 5};	
//		int[] b = subArrayGivenSum(a, 35);
//		for(int i=0; i<a.length; i++) {
//			System.out.println(b[i]);
//		}
//		int a[] = {1,2,2,1,3,1,1,3};
//		distinctInSubArray(a, 4);
		
		int a[] = {0, 50, 30, 40, 10, 5, 20, 30, 45};
		int[] maxHeapInsertion = maxHeapInsertion(a);
		for(int i =0; i<maxHeapInsertion.length; i++) {
			System.out.println(maxHeapInsertion[i]);
		}
	}
	
	static int[] maxHeapInsertion(int array[]) {
		int nodeIndex = array.length-1;
		while (nodeIndex >=1) {
			int parentNodeIndex = nodeIndex/2;
			if(array[parentNodeIndex] < array[nodeIndex]) {
				array = swap(array, parentNodeIndex, nodeIndex);
				if(parentNodeIndex == 1) {
					break;
				}
				nodeIndex = parentNodeIndex;
			}else {
				break;
			}
		}
		return array;
	}
	
	private static int[] swap(int[] a, int parentNodeIndex, int nodeIndex) {
		int temp = a[parentNodeIndex];
		a[parentNodeIndex] = a[nodeIndex];
		a[nodeIndex] = temp;
		return a;
	}

	static void distinctInSubArray(int a[], int size) {
		int bucketSize = 0;
		int j = 0;
		boolean bucketSizeMatched = false;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<a.length; i++) {
			
			hashMap.put(a[i], hashMap.getOrDefault(a[i], 0)+1);
			bucketSize++;
			if(bucketSize == size) {
				bucketSizeMatched = true;
			}
			if(bucketSizeMatched) {
				System.out.println("Distinct element "+hashMap.size());
				int k = hashMap.get(a[j]) == 1 ? hashMap.remove(a[j]) :hashMap.put(a[j], hashMap.get(a[j])-1);
			}
		}
	}
	
	static int[] subArrayGivenSum(int a[], int sum) {
		int currsum = 0;
		int start = 0;
		int end = 0;
		int b[] = new int[a.length];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			currsum = currsum + a[i];
			if(map.get(currsum - sum) != null) {
				start = map.get(currsum - sum) + 1;
				end = i;
				break;
			}
			map.put(currsum, i);
		}
		int i =0;
		for (int j = start ; j <=end ;j++) {
			b[i] = a[j];
			i++;
		}
		return b;
	}

	static int sumOfRainWater(int a[]) {
		int start = 0;
		int sumcalculateblock = 0;
		int summiddleblock = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] < a[start]) {
				summiddleblock = summiddleblock + a[i + 1];
			} else {
				start = i + 1;
			}
//			else {
//				if (a[i + 1] > a[start]) {
//					sumcalculateblock = sumcalculateblock + ((a[start] * (i - start)) - summiddleblock);
//				} else {
//					sumcalculateblock = sumcalculateblock + ((a[i + 1] * (i - start)) - summiddleblock);
//				}
//				start = i + 1;
//				summiddleblock = 0;
//			}
		}
		return sumcalculateblock;
	}

	static int sumOfProfits(int a[]) {
		int sumofprofit = 0;
		boolean buy = true;
		int buyvalue = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (buy) {
				if (a[i + 1] > a[i]) {
					buyvalue = a[i];
					buy = false;
				}
			} else {
				if (a[i + 1] < a[i]) {
					sumofprofit = sumofprofit + (a[i] - buyvalue);
					buy = true;
				}
				if (a[i + 1] > a[i] && i + 1 == a.length - 1) {
					sumofprofit = sumofprofit + (a[i + 1] - buyvalue);
				}
			}
		}
		return sumofprofit;
	}

	static List<String> supersetStringarray(String str) {
		List<String> list = new ArrayList<String>();
		if (str.length() == 1) {
			list.add("");
			list.add(str);
			return list;
		}
		List<String> supersetStringarray = supersetStringarray(str.substring(0, str.length() - 1));
		List<String> supersetStringarray2 = new ArrayList<String>();
		for (String string : supersetStringarray) {
			supersetStringarray2.add(string + str.substring(str.length() - 1));
		}
		supersetStringarray.addAll(supersetStringarray2);
		return supersetStringarray;

	}

	static int supersetstring(String str) {
		if (str.length() == 1) {
			return 2;
		}
		return (int) (supersetstring(str.substring(0, str.length() - 1)) + (Math.pow(2, str.length() - 1)));
	}

	static int matrixPaths(int n, int m) {
		if (n == 1 || m == 1)
			return 1;
		return matrixPaths(n - 1, m) + matrixPaths(n, m - 1);
	}

	public static int powerNumberRecursive(int a, int b) {
		if (b == 1) {
			return a;
		}
		return a * powerNumberRecursive(a, b - 1);
	}

	public static int fastPower(int a, int b) {
		int res = 1;
		while (b > 0) {
			if ((b & 1) != 0) {
				res = res * a;
			}
			a = (a * a);
			b = b >> 1;
		}
		return res;
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static boolean[] isPrime(int n) {
		boolean[] isPrime = new boolean[n];
		Arrays.fill(isPrime, true);
		for (int i = 2; i * i <= n; i++) {
			for (int j = 2 * i; j < n; j = j + i) {
				isPrime[j] = false;
			}
		}
		return isPrime;
	}
}
