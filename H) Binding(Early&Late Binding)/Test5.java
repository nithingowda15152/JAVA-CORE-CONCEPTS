class A {
    private void msg() {
        System.out.println("Private method of A");
    }

    public void callMsg() {
        msg(); // Calls A’s private method
    }
}

class Test5 extends A {
    private void msg() {
        System.out.println("Private method of Test5");
    }

    public static void main(String[] args) {
        Test5 T=new Test5();
        T.callMsg();

        A a = new Test5();
        a.callMsg(); // Private method of A → early binding
    }
}
//Private methods are not inherited, so no overriding → early binding.