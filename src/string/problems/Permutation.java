package string.problems;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String pStr = "ABC";
        int n = pStr.length();


        permuteLetters(pStr, 0, n - 1);
    }

    private static void permuteLetters(String str, int l, int r) {
        ArrayList<String> list = new ArrayList<String>();
        if (l == r)
            //System.out.println(str);
            list.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permuteLetters(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}










