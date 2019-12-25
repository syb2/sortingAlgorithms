package com.yash.sorting;

import java.util.Arrays;

public class SelectionSort implements Sort {

    public void sort(int[] inputArr, SortingDirection sortingDirection){

        int inputArrLength =  inputArr.length;

        sortingDirection = (sortingDirection != null) ? sortingDirection : SortingDirection.ASCENDING;

        for(int i=0;i<inputArrLength;i++){
            int min_index = i;
            for(int j=i+1;j<inputArrLength;j++){

                if(sortingDirection==SortingDirection.ASCENDING){
                    if(inputArr[min_index]>inputArr[j]){
                        min_index=j;
                    }
                }else if(sortingDirection==SortingDirection.DESCENDING){
                    if(inputArr[min_index]<inputArr[j]){
                        min_index=j;
                    }
                }

            }
            if(i!=min_index){
                int temp = inputArr[i];
                inputArr[i] = inputArr[min_index];
                inputArr[min_index] = temp;
            }
        }
    }
}

