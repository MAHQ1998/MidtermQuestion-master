package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        //use Map that includes storing and retrieving elements.

        HashMap<String, Integer> cityOfJapan = new HashMap<>();

        cityOfJapan.put("Tokyo", 3435);
        cityOfJapan.put("Osaka", 9877);
        cityOfJapan.put("Kyoto", 5355);

        System.out.println(cityOfJapan);

        //Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
        ArrayList<HashMap<String, Integer>> asianCities = new ArrayList<>();
        asianCities.add(cityOfJapan);

        System.out.println(asianCities);

        //Use For Each loop and while loop with Iterator to retrieve data.

        for (int i = 0; i > 3; i++)
            System.out.println(i);

        Iterator iterator = asianCities.iterator();

        ArrayList<String> listOfCity = new ArrayList<>();

        while (iterator.hasNext()) {
            String city = iterator.next().toString();
            listOfCity.add(city);
        }

        System.out.println(listOfCity);


    }

}
