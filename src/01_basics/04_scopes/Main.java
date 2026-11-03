/*
 * 🟡 Scope in Java is similar to other programming languages like Python and JavaScript with few difference.
 *      1. Local (Block) Scope:
 *                             🔸 Variable define inside "{}" lives only inside that block, `if`, `for`, `try`
 *                             🔸 In Java there is no default value for a variable, unlike JavaScript, where
 *                                we have `undefined`. If you try to create a variable without defining it
 *                                and if you try to access it, it will throw a compiler error.
 *                             🔸 Java does not allow shadow variables (same name) like between
 *                                ""outer local (block)"" and ""inner local (block)"".
 *
 *      2. Method Parameter Scope:
 *                             🔸 A parameter passed inside a method is only accessible within the function.
 *                             🔸 In Java if you pass a primitive value, it just copies. If you pass an
 *                                object, it will copy the reference but if you try to change something inside
 *                                the object, it will reflect.
 *
 *      3. Instance Variable Scope:
 *                             🔸 A variable declared inside the class is only accessible within a class and
 *                                it will be removed after the object is garbage collected.
 *                             🔸 But a variable created inside a class gets a default value like 0, null, false.
 *
 *      4. Static Variable Scope:
 *                             🔸 A static variable belongs to a class not an object instance, every variable
 *                                created as static can be accessed throughout the instance with the same data
 *                                across all instances.
 *
 *      5. Lambda and Capture Variables:
 *                             🔸 A lambda can access an outside variable but it is only for reading purposes.
 *                                If we try to update it, it will throw a compiler error.
 *                             🔸 When Lambda is created it copies the outside variable, so java needs a variable
 *                                that never change anywhere.
 *                             🔸 The rule for Lambda is that the variable accessed inside the lambda must not
 *                                not change.
 */

class ScopeInJava {

    // 👉 Both a, b have default value as 0
    int a;
    int b;

    // ❌ Default value in constructor parameter is not possible in java
    // ScopeInJava(int a = 0, int b = 0) {
    //     this.a = a;
    //     this.b = b;
    // }

    ScopeInJava(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public ScopeInJava() {
        this(0, 0);
    }

    public void scope() {
        System.out.println("<===============> Scope in Java <===============>");

        // int count = 0;
        // for (int i = 0; i < 8; ++i) {
        // int count = i; ❌ Not Possible
        // }

        int count = 0;
        for (int i = 0; i < 8; ++i) {
            count += i;
        }
        System.out.println("Total count is: " + count);
    }
}

public class Main {

    public static void main(String[] args) {
        ScopeInJava scope = new ScopeInJava();
        scope.scope();
    }
}
