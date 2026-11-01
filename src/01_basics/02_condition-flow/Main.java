class IfElse {

    // 🟡 Every Programming languages have similar if-else statements. There is nothing special in Java.
    // 🟡 In Java there is no truthy or falsy value like in JavaScript, so every condition must be boolean value (true or false).
    void main() {
        int age = 20;
        if (age > 18) {
            System.out.println("User is a adult");
        } else if (age > 15) {
            System.out.println("User is a teen");
        } else {
            System.out.println("User is a kid");
        }

        String name = "Java";
        // if(name) {} ❌ Wrong condition must be either "true" or "false"
        if (name != null && !name.isEmpty()) {
            System.out.println("Name is there and the value is: " + name);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        IfElse i = new IfElse();
        i.main();
    }
}
