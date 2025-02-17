class A {
    A() {
        System.out.println("Constructor of A is called.");
    }
}
class B extends A {
    B() {
        super();
        System.out.println("Constructor of B is called.");
    }
}
class C extends B {
    C() {
        super(); 
        System.out.println("Constructor of C is called.");
    }
    public static void main(String[] args) {
        C obj = new C();
    }
}