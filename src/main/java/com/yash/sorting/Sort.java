package com.yash.sorting;

public interface Sort {

    enum SortingDirection {
        ASCENDING,
        DESCENDING
    }

    void sort(int[] inputArr, SelectionSort.SortingDirection sortingDirection);
}
