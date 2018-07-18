package com.cam.algorithm.linearsearch;

public class LinearSearch {
	
	static int search(int[] arr, int length, int item) {
		for(int i = 0; i<length; i++) {
			if(arr[i]==item) {
				System.out.println("Index:" + i);
				continue;
				
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] intArr = {1,2,3,5,7,3,1,5,7,3,1,4,5,7,3,1};
		LinearSearch.search(intArr, intArr.length, 3);
		
	}
}
