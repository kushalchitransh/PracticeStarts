/**
 * 
 */
package JavaPractice.practiceStarts;

/**
 * @author Kushal Shrivastava
 * {@ https://www.journaldev.com/807/java-string-substring}
 */
public class PalindromeUsingSubstring {

	/**
	 * @param args
	 * @Description Palindrome is a string or sequence of elements whose opposite is also the same
	 * a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or nurses run.
	 * like 12321,abcba
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(checkPalindrome("abbccccbba"));
		System.out.println(checkPalindrome("XYyx"));
		System.out.println(checkPalindrome("871232178"));
		System.out.println(checkPalindrome("CCCCC"));
	}

	private static boolean checkPalindrome(String str) {
		if (str == null)
			return false;
		if (str.length() <= 1) {
			return true;
		}
		String first = str.substring(0, 1);
		String last = str.substring(str.length() - 1);
		int a;
		if (!first.equals(last))
			return false;
		else{
		a = str.length();
		int b=str.length()-1;
		String s=str.substring(1, b);
			return checkPalindrome(str.substring(1, str.length() - 1));}
	}
}
