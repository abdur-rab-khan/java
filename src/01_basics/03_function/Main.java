import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

record Result(int sum, int count) {}

class FunctionInJava {

    // 🟡 Similar to functions in """Python""", """JavaScript""", and """C++""". There are a few differences you can see below:
    //      1. Java always sends a copy. For primitives it copies the value. For objects it copies the reference.
    //      2. To return multiple values like with a tuple in Python you can use a record object and it's
    //         immutable.
    int add(int a, int b) {
        System.out.println(
            "<===============> Function in Java <===============>"
        );
        return a + b;
    }

    Result calculate(int[] nums) {
        System.out.println(
            "<===============> Return multiple values <===============>"
        );
        int sum = Arrays.stream(nums).sum();
        return new Result(sum, nums.length);
    }

    void lambdaFunction() {
        // 🟡 A lambda is an object that implements a functional interface, like `Function<Integer, Integer>`.
        // 🟡 Unlike JavaScript with a lambda function, closure is not possible, mean that you outer value will be just READONLY.
        // 🟡 Every function in Java can be overridden but using the `final` keyword you can stop it.

        System.out.println(
            "<===============> Lambda Function <===============>"
        );
        Function<Integer, Integer> sq = p -> p * p;
        BiFunction<Integer, Integer, Integer> sum = (p, q) -> p + q;

        System.out.println("Sq of 2 * 2 is: " + sq.apply(2));
        System.out.println("Sum of 4 + 6 is: " + sum.apply(4, 6));
    }
}

public class Main {

    public static void main(String[] args) {
        FunctionInJava fn = new FunctionInJava();
        System.out.println("Sum of 10 + 10 is: " + fn.add(10, 10));
        int[] list = { 1, 2, 3, 4, 5 };
        Result res = fn.calculate(list);
        System.out.println(res);
        fn.lambdaFunction();
    }
}
