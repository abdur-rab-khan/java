import java.util.HashMap;

class Calculator {

    public void main() {
        System.out.println(
            String.format(
                "The calculation of %s + %s is: %s",
                20,
                20,
                calculation(20, 20)
            )
        );
    }

    public int calculation(int a, int b) {
        return a + b;
    }
}

class Main {

    public static void main() {
        Calculator cal = new Calculator();
        cal.main();

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("hello", 200);

        System.out.println(hashMap);

        System.out.println("Hello world");
    }
}
