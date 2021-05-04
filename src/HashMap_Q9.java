//9. Create a HashMap object called people that will store String keys and Integer values
// : And use for each loop to iterate the value from Map.

import java.util.HashMap;
import java.util.Map;

public class HashMap_Q9 {
    public static void main(String[] args) {
        Map<String , Integer> people = new HashMap<>();
        people.put("Summer", 1);
        people.put("Winter", 2);
        people.put("Autumn", 3);
        people.put("Spring", 4);

        for (Integer i : people.values()) {
            System.out.println(i);


        }

    }
}

