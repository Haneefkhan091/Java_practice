import java.util.HashMap;
import java.util.Hashtable;

public class HashTable {

    public static void hashset() {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Haneef", 25);
        hashMap.put("Ahsan", 30);
        hashMap.put("Saym", 22);

        // Accessing values
        int ageOfAlice = hashMap.get("Haneef");
        System.out.println("Age of Haneef: " + ageOfAlice);

        // Iterating through the HashMap
        for (String name : hashMap.keySet()) {
            System.out.println(name + ": " + hashMap.get(name));
        }
    }

    public static void main(String[] args) {
        // Creating a Hashtable

        hashset();
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put("Haneef", 25);
        hashtable.put("Ahsan", 30);
        hashtable.put("Saym", 22);

        // Accessing values
        int age = hashtable.get("Haneef");
        System.out.println("Age of Haneef: " + age);

        // Iterating through the Hashtable
        for (String name : hashtable.keySet()) {
            System.out.println(name + ": " + hashtable.get(name));
        }
    }
}
