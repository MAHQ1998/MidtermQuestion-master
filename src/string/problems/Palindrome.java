package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String pWord = "kayak";
        if (isPalindrome(pWord)) {
            System.out.println("yes the word is Palindrome");
        } else {
            System.out.println("No the word is Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String pWord) {
        // using char Array convert the string
        char[] charArray = pWord.toCharArray();
        for (int i = 0; i < pWord.length(); i++) {
            if (charArray[i] != charArray[(pWord.length() - 1) - i]) {
                return false;
            }
        }
        return true;
    }

}



