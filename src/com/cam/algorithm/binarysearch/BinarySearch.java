package com.cam.algorithm.binarysearch;

public class BinarySearch {
	// Definition: Search a SORTED array by repeatedly dividing the search interval
	// in half.
	// whole array, if less or greater than middle value, go to respective side of
	// array.
	// reducing time complexity from O(n) to O(long(n))

	// requirements: Compare x with the middle element
	// if x matches the middle element, we return the mid index
	// else if x is great then examine top half
	// else if x is less than, examine bottom half
	// recursive implementation

	static int binarySearch(int[] arr, int start, int end, int item) {
		if (end >= 1) {

			int mid = 1 + (end - 1) / 2;
			if (item == arr[mid]) {
				System.out.println("Found it at index location:" + mid);
				return mid;
			} else if (item > arr[mid]) {
				System.out.println("Item is in upper half");
				return BinarySearch.binarySearch(arr, mid + 1, end, item);
			} else {
				System.out.println("Item is in lower half");
				return BinarySearch.binarySearch(arr, 0, mid - 1, item);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] testArr = { 1, 2, 5, 6, 7, 8, 11, 12, 13, 14, 15 };
		int end = testArr.length;

		BinarySearch.binarySearch(testArr, 0, end-1, 6);

	}

}
