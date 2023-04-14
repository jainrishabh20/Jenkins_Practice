package com.jain.test;

public class Java_DSA {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int k=8;
		
		System.out.println(search(a, k));
	}
	public static String search(int[] a, int k) {
		int start=0;
		int end=a.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if (a[mid]==k) 
				return "Present";
			else if (a[mid]>k)
				end=mid-1;
			else 
				start=mid+1;
			
		}
		return "Not present";
	}

}
