package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String x = "MELON";
        String y = "LEMON";

        boolean anangram = checkIfStringAreAnangram(x, y);

        if (anangram) {
            System.out.println("Yes it is Anangram");
        } else {
            System.out.println("No it is not Anangram");
        }
    }

    public static boolean checkIfStringAreAnangram(String x, String y) {

        char[] firstArray = x.toCharArray();
        char[] secondArray = y.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
    }
}

