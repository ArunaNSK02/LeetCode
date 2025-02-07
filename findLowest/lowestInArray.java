package LeetCode.JavaDSA.findLowest;

public class lowestInArray {
    public int findLowest(int[] arr){
        int lowestNumber = arr[0];
        for (int number : arr) {
            if (number < lowestNumber) {
                lowestNumber = number;
            }
        }
        return lowestNumber;
    }

    public static void main(String[] args) {
        int[] arr = {7,12,9,11,3};
        System.out.println(new lowestInArray().findLowest(arr));
    }
}
