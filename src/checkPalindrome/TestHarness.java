package checkPalindrome;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit tests for methods involved in finding largest palindrome made from the product of two 3-digit numbers.
 * @author Karuna Gujar
 *
 */
public class TestHarness {
	
	@Test
	public void testForIsPalindrome(){
		assertEquals(true, CheckPalindrome.isPalindrome(9009));
	}

	@Test
	public void testForLargestPalindromeNumber(){
		assertEquals(906609, CheckPalindrome.findLargestPalindromeProduct());
	}
}
