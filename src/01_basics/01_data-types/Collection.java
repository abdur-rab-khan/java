import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
}

class SetInJava {
    // 🟡 Set in Java includes HashSet, LinkedHashSet, TreeSet and all have common interface Set
}

class QueueInJava {
    // 🟡 Queue in Java includes ArrayDeque, PriorityQueue and all have common interface Queue
}

class StackInJava {
    // 🟡 Stack operations in modern Java are handled by ArrayDeque and LinkedList
    // and both share the common interface Deque (or you can use the legacy Stack class)
}

public class Collection {

    public static void main(String[] args) {
        ListInJava list = new ListInJava();
        MapInJava map = new MapInJava();
        SetInJava set = new SetInJava();
        QueueInJava queue = new QueueInJava();

        list.arrayList();
        list.linkedList();
    }
}
