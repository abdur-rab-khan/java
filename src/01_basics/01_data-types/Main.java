/*
🟡 In Java there are four kind of variables:
    1. Instance Variable (Non-Static Fields): Variables which are unique to each instance
    2. Class Variable (Static Fields): Variables which are the same across instances using the same class
    3. Local Variables: Variables which are created inside the function.
    4. Parameters: Variables which are passed into a function might be passed by reference or by a copy of it.

 🟡 Types of Variable in Java:
     1. Primitive Types: Java has 8 primitive types, primitive types are raw values like (int, byte, etc) they aren't an object:
         +-----------------------------------------------------------------------------------------------+
         |   1. byte      |  8 bits    |  -128 to 127                                                    |
         |   2. short     |  16 bits   |  -32,768 to 32,767                                              |
         |   3. int       |  32 bits   |  -2,147,483,648 to 2,147,483,647                                |
         |   4. long      |  64 bits   |  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807        |
         |   5. float     |  32 bits   |  about ±3.4 × 10^38 (about 7 digits correct)                    |
         |   6. double    |  64 bits   |  about ±1.8 × 10^308 (about 15 digits correct)                  |
         |   7. char      |  16 bits   |  0 to 65,535 (unsigned)                                         |
         |   8. boolean   |  not fixed |  true or false                                                  |
         +-----------------------------------------------------------------------------------------------+
 */

import java.util.ArrayList;

class PrimitiveTypes {

    void integerType() {
        System.out.println("<===============> Integer Type <===============>");
        // 🟡 These integer values are signed, but they can be negative there is not specific types of unsigned integer.
        byte byte1 = 30;
        byte byte2 = 40;
        // byte byte1PlusByte2 = byte1 + byte2; // ❌ Because it returns integer values, so need to convert into byte
        byte byte1PlusByte2 = (byte) (byte1 + byte2);
        // byte byte2 = 128; ❌ Wrong overflow
        System.out.println("Byte value: " + String.valueOf(byte1));

        short short1 = 32000;
        System.out.println("Short value: " + String.valueOf(short1));

        int max = Integer.MAX_VALUE;
        int maxPlusOne = max + 1; // ❌ Java won't through any overflow error, it just wrap around negative numbers
        System.out.println("Max value: " + String.valueOf(max));
        System.out.println("Max value + 1: " + String.valueOf(maxPlusOne));

        float float1 = 20.888f; // 🟡 Explicit define it's a float value
        float float2 = 20.801f;
        double float1PlusFloat2 = float1 + float2;

        // var is for """local variable""" and the compiler will find it's types
        var count = 10;
        var name = "Java";

        var users = new ArrayList<String>();
        users.add("Hello");
        users.add("Java");

        System.out.println("Value of count is: " + String.valueOf(count));
        System.out.println("Value of name is: " + String.valueOf(name));
        System.out.println("Value of users is: " + String.valueOf(users));
        System.out.print("\n\n");
    }

    void wrapBoxing() {
        System.out.println(
            "<===============> Wrapper Boxing <===============>"
        );
        /*
        🟡 Each primitive type in Java has matching object in "java.lang", that's called wrapper because it wraps on primitive types into an object
        🟡 Wrapper objects are immutable, once """Integer""" is created it's values never change, like String
        🟡 Wrapper object cache and points to the same memory location if value is smaller like with:
            1. [Byte, Short, Integer, Long (cache from -128 to 127)]
            2. [Characters (cache from 0 to 127)]
            3. [Boolean: (cache true and false)]
            4. [Float/Double: (No Cache at all)]
        🔸 Value with same value range above shown, directly points to same location

        🔵 Most common reason why we use Wrapper/Boxing:
            1. Generic and Collections:
                🔸 Generic in Java only works with objects, we can't write like this List<int> or Map<String, int>
                🔸 We must have to write like this List<Integer> or Map<String, Int>
            2. The value can be missing:
                🔸 Primitive always have a value, but when needed null """Wrapper""" is a good choice
                🔸 Mostly popularly use in DTO's, example Integer age = null;
            3. Frameworks needs it:
                🔸 Database (JPA): A column that allows """null""" maps to a wrapper
                🔸 REST Requests: """@RequestParam Integer page""" can be missing and framework gives null
                🔸 JSON DTO's: A fields that is missing in JSON says null
            4. Useful methods:
                🔸 Primitive have no methods, Wrapper have methods and static methods:
                    1. Integer.parseIn("42");
                    2. Integer.compare(a, b);
                    3. Integer.MAX_VALUE;
                    4. Characters.isDigit(c)

        🔷 Note: Boxing: Primitive to wrapper, Unboxing: Wrapper to primitive
        */
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");

        PrimitiveTypes pt = new PrimitiveTypes();
        pt.integerType();
        pt.wrapBoxing();
    }
}
