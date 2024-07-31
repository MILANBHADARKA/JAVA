package pack;
import pack.A;

public class B extends A {
    public void display() {
        // Accessing protected and public variables directly
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);

        // Accessing private variable through a public getter method
        System.out.println("Private Variable: " + getPrivateVar());
    }
}