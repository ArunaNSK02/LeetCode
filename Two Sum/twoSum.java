import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
//First Attempt (Time: O(n^2) Space: o(1))
    // public int[] twoSum(int[] numArray, int targetVal) {
    //     if(numArray.length > 0) {
    //         int firstNumber;
    //         int secondNumber;
    //         int[] result = new int[2];

    //         for(int firstIndex = 0; firstIndex < (numArray.length) - 1; firstIndex++) {
    //             firstNumber = numArray[firstIndex];
    //             for(int secondIndex = firstIndex + 1; secondIndex < (numArray.length); secondIndex++) {
    //                 secondNumber = numArray[secondIndex];
    //                 if(firstNumber + secondNumber == targetVal) {

    //                     result[0] = firstIndex;
    //                     result[1] = secondIndex;

    //                     return  result;
    //                 }
    //             }
    //         }
    //     }
    //     return null;
    // }


    //Second Attempt (Upgraded) (Time: O(n) Space: O(n))
    public int[] twoSum(int[] numArray, int targetVal) {
        int currentVal;
        int restVal;
        int[] result = new int[2];
        HashMap<Integer, Integer> MemoryMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < numArray.length; i++) {
            currentVal = numArray[i];
            restVal = targetVal - currentVal;
            if (MemoryMap.size() != 0) {
                if (MemoryMap.containsKey(restVal)) {
                    result[0] = i;
                    result[1] = MemoryMap.get(restVal);
                    return result;
                } else {
                    MemoryMap.put(currentVal, i);
                }
            } else {
                MemoryMap.put(currentVal, i);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] numArray = {2,7,11,15};
        int targetVal = 9;

        int[] result = new twoSum().twoSum(numArray, targetVal);

        if (result == null) {
            System.out.println("Null");
        } else {
            System.out.println(Arrays.toString(result));
        }
    }
    
}