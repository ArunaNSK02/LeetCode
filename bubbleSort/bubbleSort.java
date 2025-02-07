package LeetCode.JavaDSA.bubbleSort;

import java.util.Arrays;

public class bubbleSort {
    public int outer;

    public int[] bubbleSortMethod(int[] arr){
        int lastIndex = arr.length - 1;
        int tempVal;
        boolean isSwapped;

        for (int outerRound = 0; outerRound < arr.length; outerRound++) {
            isSwapped = false;
            for (int index = 0; index < lastIndex; index++) {
                if (arr[index] > arr[index+1]) {
                    tempVal = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = tempVal;
                    isSwapped = true;
                }
            }
            lastIndex--;

            if (!isSwapped) {
                return arr;
            }

            outer++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,12,9,11,3};
        bubbleSort newObj = new bubbleSort();
        System.out.println(Arrays.toString(newObj.bubbleSortMethod(arr)));
        System.out.println(newObj.outer);
    }
}
