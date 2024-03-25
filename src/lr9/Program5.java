
package lr9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Program5 {
    public static void main(String[] args) {
        Random random = new Random();

        HashMap<Integer, String> map = new HashMap<>();
        while (map.size() != 10) {
            map.put(random.nextInt(0, 10), Integer.toString(random.nextInt(0, 999999)));
        }

        System.out.println("Map: " + map);

        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<String> vals = new ArrayList<>();
        map.forEach((key, value) -> {
            if (key > 5) vals.add(value);
            if (value.length() > 5) keys.add(key);
        });

        System.out.println("Values: " + vals);
        System.out.println("Mul: " + keys.stream().reduce(1, (a, b) -> a*b));
    }
}
