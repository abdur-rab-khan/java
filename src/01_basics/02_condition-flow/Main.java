import java.util.ArrayList;

class IfElse {

    // 🟡 Every Programming languages have similar if-else statements. There is nothing special in Java.
    // 🟡 In Java there is no truthy or falsy value like in JavaScript, so every condition must be boolean value (true or false).
    void ifElse() {
        System.out.println("<===============> If Else <===============>");
        int age = 20;
        if (age >= 18) {
            System.out.println("User is a adult");
        } else if (age >= 15) {
            System.out.println("User is a teen");
        } else {
            System.out.println("User is a kid");
        }

        String name = "Java";
        // if(name) {} ❌ Wrong condition must be either "true" or "false"
        if (name != null && !name.isEmpty()) {
            System.out.println("Name is there and the value is: " + name);
        }

        // 🔷 One important distinction with `==` is that with a non-primitive value it checks the object's reference. If both are pointing to the same memory location, it simply returns `true`.
        // 🔷 But to check the content we have to use the `.equals()` method. It will check the content of it. If the content is the same then it will return `true`.
        String name1 = new String("Java");
        String name2 = new String("Java");

        // ❌ False
        System.out.println("Is name1 and name2 is equal: " + (name1 == name2));

        // 👉 True
        System.out.println(
            "Is name1 and name2 has same content: " + name1.equals(name2)
        );

        String str1 = "Java";
        String str2 = "Java";

        // ✔ True, because If we create a string literal in Java, it goes into a pool. If a string is created with the same content, it just points to the existing address of the pool instead of creating a new memory allocation.
        // 🟡 But string created using "new String("str")" always create new object
        System.out.println("str1 == str2: " + (str1 == str2));
    }

    // 🟡 Switch case in Java is similar to other programming languages. There is nothing special here.
    void switchCase(int day) {
        System.out.println("<===============> Switch Case <===============>");
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Other");
        }
    }

    // 🟡 Switch case here, By using an arrow behaves differently. Here we don't need break and it returns a value from it.
    String newSwitchCase(int day) {
        System.out.println(
            "<===============> Modern Switch Case <===============>"
        );
        String result = switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> "Invalid";
        };
        return result;
    }

    // 🟡 It checks the instance of an object, as well as creates a variable with the same object type.
    void instanceOfMethod(Object day) {
        System.out.println(
            "<===============> Instance Of Method <===============>"
        );
        if (day instanceof String s) {
            System.out.println("String length is: " + s.length());
        } else if (day instanceof ArrayList arr) {
            System.out.println("Array value is: " + arr);
        }
    }
}

class LoopingInJava {

    void classic() {
        System.out.println("<===============> Classic Loop <===============>");
    }

    void forEach() {
        System.out.println("<===============> ForEach Loop <===============>");
    }

    void loopOnMap() {
        System.out.println("<===============> Loop on Map <===============>");
    }
}

public class Main {

    public static void main(String[] args) {
        IfElse i = new IfElse();
        i.ifElse();
        i.switchCase(1);
        System.out.println("Day is: " + i.newSwitchCase(1));

        LoopingInJava l = new LoopingInJava();
        l.classic();
        l.forEach();
        l.loopOnMap();
    }
}
