package com.yash.sorting;

public class InsertionSort implements Sort {
    public void sort(int[] inputArr, SortingDirection sortingDirection) {
        int arrLength = inputArr.length;

        for(int i=0;i<arrLength;i++){
            int insertionIndex =0;
            boolean doSwap= false;
            for(int j=i-1;j>=0;j--){
                if(sortingDirection==SortingDirection.DESCENDING && inputArr[i]>inputArr[j]){
                    insertionIndex = j;
                    doSwap = true;
                }else{
                    if(inputArr[i]<inputArr[j]){
                        insertionIndex = j;
                        doSwap = true;
                    }
                }
            }
            if(doSwap){
                int valueToBeInserted = inputArr[i];
                for(int j=i-1;j>=insertionIndex;j--){
                    //swapping by moving elements forward
                    inputArr[j+1] = inputArr[j];
                }
                inputArr[insertionIndex] = valueToBeInserted;
            }
        }
    }
}
