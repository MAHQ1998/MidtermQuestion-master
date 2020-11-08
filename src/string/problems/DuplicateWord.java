package string.problems;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        int count = 0;
        double sum = 0;
        double average = 0;

        String[] duplicateData = st.split(" ");

        HashMap<String, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < duplicateData.length; i++) {
            Integer previousCount = occurrences.get(duplicateData[i]);
            if (previousCount == null) {
                previousCount = 0;
            }

            occurrences.put(duplicateData[i], previousCount + 1);
        }

        System.out.println(occurrences);

        System.out.println(occurrences.get("Java"));


        Scanner scanner = new Scanner(st);

        while (scanner.hasNext()) {

            String userInput = scanner.next();

            double charNum = userInput.length();
            sum = charNum + sum;
            count++;

            if (count > 0) {
                average = sum / count;
            }
        }
        System.out.println("Average word length = " + average);

    }

}
