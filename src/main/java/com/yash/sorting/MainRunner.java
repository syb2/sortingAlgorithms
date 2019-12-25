package com.yash.sorting;

import java.util.Arrays;

public class MainRunner {

    public static void main(String[] args){
        int[] intArr = new int[] {34,67,11,59,60,32};

        System.out.println("Selection Sort");
        Sort sorting = new SelectionSort();
        sorting.sort(intArr, Sort.SortingDirection.ASCENDING);
        System.out.println(Arrays.toString(intArr));
        sorting.sort(intArr, Sort.SortingDirection.DESCENDING);
        System.out.println(Arrays.toString(intArr));

        intArr = new int[] {34,67,11,59,60,32};
        System.out.println("Now Bubble Sort");
        sorting = new BubbleSort();
        sorting.sort(intArr, Sort.SortingDirection.ASCENDING);
        System.out.println(Arrays.toString(intArr));
        sorting.sort(intArr, Sort.SortingDirection.DESCENDING);
        System.out.println(Arrays.toString(intArr));
    }
}
