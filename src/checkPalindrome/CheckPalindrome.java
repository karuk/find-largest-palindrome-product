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
