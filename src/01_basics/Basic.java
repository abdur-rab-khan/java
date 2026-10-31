/*
🟡 Java is a programming language, where we write a program once and run anywhere on any operating system or any CPU architecture with the help of "JVM".
🟡 JVM (Java Virtual Machine) It's a program that helps to run a Java program on any operating system so it behaves as a middle layer between a Java program and an operating system.

🔸 How a Java program works:
    1. """javac Main.java""" compiles the code into bytecode (Main.class).
    2. """java Main""" starts the JVM.
    3. The class loader loads the .class file into memory.
    4. The JVM runs the bytecode line by line (interpreter).
    5. The JIT compiler finds hot methods (used many times) and converts them to machine code, so the program becomes faster.
*/

class Basic {

    public static void main(String[] args) {
        System.out.println("Hello Java! I'm from JavaScript 😉");
    }
}
