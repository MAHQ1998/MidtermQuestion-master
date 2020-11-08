package datastructure;

import javax.naming.NoInitialContextException;
import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> cityOfFrance = new ArrayList<>();
        cityOfFrance.add("Paris");
        cityOfFrance.add("Lyon");
        cityOfFrance.add("Toulouse");
        cityOfFrance.add("Marseille");


        //to add
        cityOfFrance.add("Nice");

        //to remove
        cityOfFrance.remove("Nice");

        //to Retrieve
        System.out.println(cityOfFrance);

        //to peek
        System.out.println(cityOfFrance.size());
        //For each Loop
        for (int i = 0; i > 4; i++) {
            System.out.println(cityOfFrance.get(i));

        }
        //Iterator

        for (Iterator<String> i = cityOfFrance.iterator(); i.hasNext(); ) {
            String cities = i.next();
            System.out.println(cities);
        }


    }

}


