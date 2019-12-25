package com.yash.sorting;

public class BubbleSort implements Sort{

    public void sort(int[] inputArr, SortingDirection sortingDirection) {
        int arrLength = inputArr.length;
        int count=arrLength;
        for(int j=0;j<arrLength-1;j++){

            for(int i=0;i<count-1;i++){
                if(sortingDirection==SortingDirection.DESCENDING) {
                    if (inputArr[i] < inputArr[i + 1])
                        swap(i,inputArr);
                }else{
                    if (inputArr[i] > inputArr[i + 1])
                        swap(i,inputArr);
                }
            }
            count--;
        }
    }

    private void swap(int i, int[] inputArr){
            int temp = inputArr[i];
            inputArr[i] = inputArr[i + 1];
            inputArr[i + 1] = temp;
    }
}
