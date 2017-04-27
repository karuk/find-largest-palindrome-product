/**
 * Problem : A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */
package checkPalindrome;

/**
 * Class used to find largest palindrome made from the product of two 3-digit numbers.
 * @author Karuna Gujar
 *
 */
public final class CheckPalindrome {

    /* Declaration of loop constraints */
    private static final int UPPERBOUND = 999;
    private static final int LOWERBOUND = 100;

    /**
     * Method to find largest palindrome made from the product of two 3-digit numbers.
     * @return	int	Largest palindrome product
     */
    public static int findLargestPalindromeProduct(){
        int previousPalindromeNumber = 0;

        for (int i = UPPERBOUND; i >= LOWERBOUND; i--) {

	    	/* Go to next index i if previous calculated palindrome is larger than first product for current value of i */
            if (previousPalindromeNumber >= i * UPPERBOUND) {
                break;
            }
            for (int j = UPPERBOUND; j >= i; j--) {                                // Loop j till j>=i to avoid calculation overhead in "i*j = j*i" situations
                int productOfTwoNumbers = i * j;
                if (previousPalindromeNumber < productOfTwoNumbers && isPalindrome(productOfTwoNumbers) ) {
                    previousPalindromeNumber = productOfTwoNumbers;
                    break;
                }
            }
        }
        return previousPalindromeNumber;
    }

    /**
     * Method to find if the input number is a palindrome.
     * @param numberToCheck Input number to check for palindrome
     * @return boolean Returns if numberToCheck is palindrome or not
     */
    public static boolean isPalindrome (int numberToCheck){
        int originalNumber = numberToCheck;
        int reversedNumber = 0;
        while (numberToCheck > 0)
        {
            int modResult = numberToCheck % 10;
            reversedNumber = reversedNumber * 10 + modResult;
            numberToCheck = numberToCheck / 10;
        }
        return (originalNumber == reversedNumber);
    }
}
