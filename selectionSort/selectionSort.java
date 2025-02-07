package LeetCode.JavaDSA.selectionSort;

import java.util.Arrays;

public class selectionSort {
    public int[] arraySelectionSort(int[] arr){
        int lowestNumber,tempVal;
        for(int startIndex = 0; startIndex < arr.length; startIndex++){
            lowestNumber = startIndex;
            for(int index = startIndex; index < arr.length; index++){
                if (arr[lowestNumber] > arr[index]) {
                    lowestNumber = index;
                }
            }
            tempVal = arr[startIndex];
            arr[startIndex] = arr[lowestNumber];
            arr[lowestNumber] = tempVal;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 12, 9, 11, 3};
        System.out.println(Arrays.toString(new selectionSort().arraySelectionSort(arr)));
    }
}
