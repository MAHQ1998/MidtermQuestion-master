package datastructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Queue<Integer> queue = new LinkedList<>();

        for (int i : numbers) {
            queue.add(i);
        }


        System.out.println(queue);

        Iterator iterator = Arrays.stream(numbers).iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

}




