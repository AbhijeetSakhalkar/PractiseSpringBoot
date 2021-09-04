package com.practise.sprg.boot.SpgBt.sort.contract.impl;

import org.springframework.stereotype.Component;

import com.practise.sprg.boot.SpgBt.sort.contract.ArraySortAlgorithm;

@Component("SelectionSort")
public class SelectionSort implements ArraySortAlgorithm {

	@Override
	public int[] sort(int[] intArray) {
		for(int lastIndex=intArray.length-1;lastIndex>0;lastIndex--) { // Index which should have largest element
			int largestIndex = 0;
			for(int i=0;i<=lastIndex;i++) {
				if(intArray[i]>intArray[largestIndex]) {
					largestIndex=i; // select the index of biggest element in the left remaining porting of array
				}
			}
			swap(intArray, lastIndex, largestIndex); // swap the biggest element at the right
		}
		return intArray;
	}

	@Override
	public int[] reverseSort(int[] intArray) {
		
		for(int lastIndex = intArray.length-1 ; lastIndex>0 ; lastIndex--) {
			int smallestIndex=0;
			for(int i=0;i<=lastIndex;i++) {
				if(intArray[i]<intArray[smallestIndex]) {
					smallestIndex=i;
				}
			}
			swap(intArray,lastIndex, smallestIndex);
		}
		return intArray;
	}

	private void swap(int [] intArray, int i, int j) {
		if(intArray[i]==intArray[j])
			return;

		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
	
}
