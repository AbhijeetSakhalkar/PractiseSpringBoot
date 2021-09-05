package com.practise.sprg.boot.SpgBt.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practise.sprg.boot.SpgBt.sort.contract.ArraySortAlgorithm;


@RestController
public class SortController {

	@Autowired
	@Qualifier("BubbleSort")
	private ArraySortAlgorithm bubbleSort;
	
	@Autowired
	@Qualifier("SelectionSort")
	private ArraySortAlgorithm selectionSort;
	
	@Autowired
	@Qualifier("InsertionSort")
	private ArraySortAlgorithm insertionSort;
	
	@RequestMapping(method = RequestMethod.GET, value = "/helloWorld")
	public void helloWorldMethod() {
		System.out.println("Hello world program");
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/bubbleSort")
	public void bubbleSort() {
		int [] array = getArrayOfSize(10);
		printLine();
		System.out.println("Bubble Sort : Ascending");
		bubbleSort.sort(array);
		Arrays.stream(array).forEach(p -> System.out.println(p));
		printLine();
		System.out.println("Bubble Sort : Descending");
		bubbleSort.reverseSort(array);
		Arrays.stream(array).forEach(p -> System.out.println(p));
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/selectionSort")
	public void selectionSort() {
		int [] array = getArrayOfSize(10);
		printLine();
		System.out.println("Selection Sort : Ascending");
		selectionSort.sort(array);
		Arrays.stream(array).forEach(p -> System.out.println(p));
		printLine();
		System.out.println("Selection Sort : Descending");
		selectionSort.reverseSort(array);
		Arrays.stream(array).forEach(p -> System.out.println(p));
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/insertionSort")
	public void insertionSort() {
		int [] array = getArrayOfSize(12);
		printLine();
		System.out.println("Insertion Sort : Ascending");
		insertionSort.sort(array);
		Arrays.stream(array).forEach(p -> System.out.println(p));
		printLine();
		System.out.println("Insertion Sort : Descending");
		insertionSort.reverseSort(array);
		Arrays.stream(array).forEach(p -> System.out.println(p));
	}

	private void printLine() {
		System.out.println("----------------------------------");
	}
	
	private int [] getArrayOfSize(int size) {
		List<Integer> integerList = new ArrayList<Integer>();
		for(int i=0;i<size;i++) {
			integerList.add(i+1);
		}
		Collections.shuffle(integerList);
		printLine();
		System.out.println("Unsorted array : ");
		int [] array = new int [integerList.size()];
		for(int i=0;i<integerList.size();i++) {
			array [i] = integerList.get(i); 
			System.out.println(array[i]);
		}
		return array;
	}
	
	
	
}
