class A {
    final void display() {
        System.out.println("Final method of A");
    }
}

class Test4 extends A {
    public static void main(String[] args) {
        A a = new Test4();
        a.display(); // Final method of A
    }
}
//Final methods cannot be overridden, so they are bound at compile time.