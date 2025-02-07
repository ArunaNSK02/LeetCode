public class palindromeNumber {
    public boolean checkPalindrome(int number) {
        String strNumber = Integer.toString(number);
        char[] numberArray = strNumber.toCharArray();

        int indexOne = 0, indexTwo = 0;
        boolean isPalindrome = false;

        if (numberArray.length % 2 == 0 && numberArray.length >= 2) {
            indexTwo = numberArray.length / 2;
            indexOne = indexTwo - 1;
        } else if (numberArray.length % 2 != 0 && numberArray.length >= 2) {
            indexTwo = (numberArray.length / 2) + 1;
            indexOne = (numberArray.length / 2) - 1;
        } else {
            isPalindrome = true;
        }

        while (indexOne != -1 && indexTwo != numberArray.length) {
            if (numberArray[indexTwo] == numberArray[indexOne]) {
                isPalindrome = true;
                indexTwo++;
                indexOne--;
            } else {
                isPalindrome = false;
                return isPalindrome;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        int number = -121;
        System.out.println(new palindromeNumber().checkPalindrome(number));
    }
    
}