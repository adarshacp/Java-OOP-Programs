class A {
    void callme() {
        System.out.println("Inside class A");
    }
}

class B extends A {
    @Override
    void callme() {
        System.out.println("Inside class B");
    }
}

class C extends A {
    @Override
    void callme() {
        System.out.println("Inside class C");
    }
}

class Dispatch {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        A r;   // Reference of type A

        r = a;
        r.callme();   // Calls A's method

        r = b;
        r.callme();   // Calls B's method

        r = c;
        r.callme();   // Calls C's method
    }
}
