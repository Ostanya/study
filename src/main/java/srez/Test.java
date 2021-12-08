package srez;

public class Test {
    public class A {
    }

    public static class B {
    }

    public void useclasses() {
        new Test().new A();
        new Test.B();
        new Test.A();
        new A();
    }
}
