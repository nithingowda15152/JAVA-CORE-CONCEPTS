//Example for Compile time polymorphism
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));      // Calls int version
        System.out.println(c.add(5.5, 10.5));  // Calls double version
    }
}
