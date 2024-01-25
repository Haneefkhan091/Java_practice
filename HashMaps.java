import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // Creating a HashMap with key-value pairs
        Map<String, Integer> ages = new HashMap<>();

        // Adding key-value pairs
        ages.put("Haneef Khan", 25);
        ages.put("Daniyal khan", 22);
        ages.put("Ahsan khan", 22);

        // Accessing values using keys
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
