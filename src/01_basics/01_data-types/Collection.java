import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class ListInJava {

    // 🟡 List in Java includes ArrayList and LinkedList and both have same interface List

    void arrayList() {
        System.out.println("<===============> Array List <===============>");

        // 🟡 """ArrayList""" only take initial capacity or initial value as an argument, but we can fill using it:
        List<Integer> numList = new ArrayList<>(10);
        List<String> strList = new ArrayList<>(Collections.nCopies(10, "Java"));

        // 🟡 """Fixed""" array similar to raw array in java, methods like "add", "remove" isn't not allowed here.
        List<String> names = List.of("Java", "Python", "JavaScript", "C++");

        System.out.println(numList);
        System.out.println(strList);

        // 🟡 Important methods in """ArrayList""" in Java:
        List<Integer> fromNumList = new ArrayList<>(numList);

        fromNumList.add(11);
        fromNumList.add(22);
        fromNumList.add(33);
        System.out.println("Value of fromNumList is: " + fromNumList);

        fromNumList.remove(0); // 👉 Remove by index and return the removed element
        fromNumList.remove(fromNumList.indexOf(22)); // 👉 Remove by value and return the removed element
        System.out.println("Now Value of fromNumList is: " + fromNumList);

        fromNumList.set(0, 11); // 👉 Replace the value using there index
        boolean isFromNumListEmpty = fromNumList.isEmpty(); // 👉 Tell whether list is empty or not
        boolean isFromNumListContainsEleven = fromNumList.contains(11);
        fromNumList.addAll(Collections.nCopies(2, 7)); // 👉 Adds the list of values into the array list

        System.out.println("Now value of fromNumList is: " + fromNumList);
        System.out.println("Is fromNumList is empty: " + isFromNumListEmpty);
        System.out.println(
            "Is fromNumList contains 11: " + isFromNumListContainsEleven
        );

        fromNumList.remove(fromNumList.indexOf(7));
        System.out.println("Now value of fromNumList is: " + fromNumList);
    }

    void linkedList() {
        System.out.println("<===============> Linked List <===============>");
    }
}

class MapInJava {

    // 🟡 Map in Java includes HashMap, LinkedHashMap, TreeMap and all have common interface Map
    void hashMapInJava() {
        Map<String, List<String>> vegFruits = new HashMap<>();

        // 🟡 Unlike "C++" and "Python (defaultdict)" the value mapped to key is null by default
        // 🟡 Here first we create string a """ArrayList""" then adding value into them
        vegFruits.put("vegetables", new ArrayList<>());
        vegFruits
            .get("vegetables")
            .addAll(List.of("Carrot", "Potato", "Tomato"));

        // 🟡 If the value is null then first it run the given """lambda""" function then and the we add the fruit
        vegFruits
            .computeIfAbsent("fruits", k -> new ArrayList<>())
            .add("Mango");
        vegFruits
            .computeIfAbsent("fruits", k -> new ArrayList<>())
            .add("Apple");
        vegFruits
            .computeIfAbsent("fruits", k -> new ArrayList<>())
            .add("Banana");

        // 🟡 If value isn't there than the "Empty Array" will be returned
        System.out.println(
            "The value of veg is: " +
                vegFruits.getOrDefault("veg", new ArrayList<>())
        );
        System.out.println("Available fruits are: " + vegFruits.get("fruits"));
        System.out.println(
            "Is vegetables are there in hashmap" +
                vegFruits.containsKey("vegetables")
        );
        System.out.println(
            "Is apple is there within in this hashmap: " +
                vegFruits.containsValue(new ArrayList<>())
        );
        vegFruits.remove("fruits");

        // 🟡 Looping methods:
        //      1. "keySet()": Returns all the keys as a set
        //      2. "values()": Returns all the values
        //      3. "entrySet()": Gives key and value together
        System.out.print("Keys are: ");
        vegFruits.keySet().forEach(k -> {
            System.out.print(k + ", ");
        });
        System.out.println("");

        System.out.print("Values are: ");
        vegFruits.values().forEach(v -> {
            System.out.print(v + ", ");
        });
        System.out.println("");

        System.out.print("Key value together are: ");
        vegFruits.forEach((v, k) -> {
            System.out.print(v + " --> " + k);
        });
        System.out.println("");
    }
}

class SetInJava {

    // 🟡 Set in Java includes HashSet, LinkedHashSet, TreeSet and all have common interface Set
    void hashSetInJava() {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.addAll(List.of("Mango", "Banana", "Orange"));
        System.out.println("Set right now is: " + set);

        set.remove("Mango");
        System.out.println("Set right now is: " + set);
    }
}

class QueueInJava {
    // 🟡 Queue in Java includes ArrayDeque, PriorityQueue and all have common interface Queue
}

class StackInJava {
    // 🟡 Stack operations in modern Java are handled by ArrayDeque and LinkedList
    // and both share the common interface Deque (or you can use the legacy Stack class)
}

class StreamAPI {

    void arrayStreamAPI() {
        System.out.println(
            "<===============> Array Stream API <===============>"
        );
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // 🟡 Let's use important stream methods for "ArrayList"
        //  🔸 Let's only sum the even numbers:
        int sumOfEvenNums = list
            .stream()
            .filter(v -> v % 2 == 0)
            .mapToInt(v -> v) // 🔸 Converts `Stream<Integer>` to simple int
            .sum();
        System.out.println("Sum of even numbers are: " + sumOfEvenNums);
    }

    void practiceStreamAPI() {
        List<String> names = new ArrayList<>(
            List.of("John", "Charlie", "John", "Abraham", "Mumbai", "New York")
        );

        List<String> namesStartChars = names
            .stream()
            .distinct() // 👉 It removes the duplicate john from the list
            .filter(n -> !(n.equals("Mumbai") || n.equals("New York")))
            .map(n -> n.substring(0, 3))
            .map(String::toUpperCase)
            .toList();
        System.out.println("Names with start chars are: " + namesStartChars);
    }

    // 🟡 Level 1: Arrays and Lists
    void level1() {
        List<Integer> listNums = new ArrayList<>(
            List.of(1, 2, 3, 4, 1, 5, 6, 7, 5, 2, 8, 9)
        );
        List<String> listNames = new ArrayList<>(
            List.of("John", "Charlie", "Abrahm", "Bob", "Pop")
        );
        List<String> words = new ArrayList<>(
            List.of(
                "",
                "Hello Python",
                "Hello JavaScript",
                "Hello C++",
                "Hello Go",
                "Hello Rust",
                ""
            )
        );

        // 1. Sum of all even numbers
        int sumOfEvenNums = listNums
            .stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(n -> n) // 👉 It simply converts """Stream<Integer>""" to """IntStream"""
            .sum();

        // 2. Remove duplicates and sort increasing order
        List<Integer> removeDuplicates = listNums
            .stream()
            .distinct()
            .sorted((a, b) -> Integer.compare(b, a))
            .toList();

        // 3. Word that have more than 3 chars
        List<String> moreThanThreeChars = listNames
            .stream()
            .filter(n -> n.length() > 3)
            .map(String::toUpperCase)
            .toList();

        // 4. Grab longest word from the words
        String longestWord = words
            .stream()
            .max(Comparator.comparingInt(String::length))
            .orElse("");

        System.out.println("Sum of all even numbers are: " + sumOfEvenNums);
        System.out.println("Remove duplicates and sort: " + removeDuplicates);
        System.out.println(
            "Words more than three characters: " + moreThanThreeChars
        );
        System.out.println("Longest word from the list: " + longestWord);
    }

    void level2() {
        String word = "My Favorite programming language is C++";

        // 1. Count vowel from the word
        int vowelCount = (int) word
            .toLowerCase()
            .chars()
            .filter(v -> "aeiou".indexOf(v) != -1)
            .count();

        // 2. Reverse each word in the sentence but keep the order same
        String reverseWord = Arrays.stream(word.split(" "))
            .map(v -> new StringBuilder(v).reverse().toString())
            .collect(Collectors.joining(" "));

        //
    }
}

public class Collection {

    public static void main(String[] args) {
        ListInJava list = new ListInJava();
        MapInJava map = new MapInJava();
        SetInJava set = new SetInJava();
        QueueInJava queue = new QueueInJava();
        StreamAPI streamApi = new StreamAPI();

        list.arrayList();
        list.linkedList();
        map.hashMapInJava();
        streamApi.arrayStreamAPI();
        streamApi.practiceStreamAPI();
        streamApi.level1();
    }
}
