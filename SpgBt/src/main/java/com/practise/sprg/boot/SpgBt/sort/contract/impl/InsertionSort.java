package com.practise.sprg.boot.SpgBt.sort.contract.impl;

import org.springframework.stereotype.Component;

import com.practise.sprg.boot.SpgBt.sort.contract.ArraySortAlgorithm;

@Component("InsertionSort")
public class InsertionSort implements ArraySortAlgorithm {

	@Override
	public int[] sort(int[] intArray) {
		for(int firstUnsorted=1;firstUnsorted<intArray.length;firstUnsorted++) {
			int i;
			int newElement=intArray[firstUnsorted];
			for(i=firstUnsorted;i>0 && intArray[i-1]>newElement;i--) {
				intArray[i] = intArray[i-1];
			}
			intArray[i] = newElement;
		}
		return intArray;
	}

	@Override
	public int[] reverseSort(int[] intArray) {
		for(int firstUnsorted=1;firstUnsorted<intArray.length;firstUnsorted++) {
			int i;
			int newElement=intArray[firstUnsorted];
			for(i=firstUnsorted;i>0 && intArray[i-1]<newElement;i--) {
				intArray[i] = intArray[i-1];
			}
			intArray[i] = newElement;
		}
		return intArray;
	}

}
