package OOPS;

public class Constructor {

    // Non-parameterized constructor
    public Constructor() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    public Constructor(int a, int b) {
        System.out.println("Parameterized Constructor: " + a + " " + b);
    }

    // Copy constructor
    public Constructor(Constructor c2) {
        System.out.println("Copy Constructor");
    }

    public static void main(String[] args) {

        Constructor c = new Constructor();

        Constructor c1 = new Constructor();

        Constructor c2 = new Constructor(10, 20);

        Constructor c3 = new Constructor(c2);
    }
}