class Parent {
    protected String name = "Protected Name";

    protected void display() {
        System.out.println("This is a protected method.");
    }
}

class Child extends Parent {
    public void accessParent() {
        System.out.println("Accessing protected name: " + name);
        display();
    }
}

public class Q4 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.accessParent();
    }
}