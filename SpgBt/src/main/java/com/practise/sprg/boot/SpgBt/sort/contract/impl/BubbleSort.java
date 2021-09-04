package com.practise.sprg.boot.SpgBt.sort.contract.impl;

import org.springframework.stereotype.Component;

import com.practise.sprg.boot.SpgBt.sort.contract.ArraySortAlgorithm;

@Component("BubbleSort")
public class BubbleSort implements ArraySortAlgorithm {

	/**
	 * 
	 * Bubble up the largest element
	 * 
	 */
	@Override
	public int[] sort(int[] intArray) {
		int last = intArray.length;
		for(int j = last-1; j>0;j--) {
			for(int i=0;i<j;i++) {
				if(intArray[i]>intArray[i+1]) {
					int tmp = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = tmp;
				}
			}
		}
		return intArray;
	}

	@Override
	public int[] reverseSort(int[] intArray) {
		int last = intArray.length;
		for(int j = last-1; j>0;j--) {
			for(int i=0;i<j;i++) {
				if(intArray[i]<intArray[i+1]) {
					int tmp = intArray[i];
					intArray[i] = intArray[i+1];
					intArray[i+1] = tmp;
				}
			}
		}
		return intArray;
	}

}
