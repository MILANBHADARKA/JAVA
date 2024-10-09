import java.util.*;

abstract class shape{
    //origin
    int x;
    int y;

    abstract void Display();
    abstract void Area();
}

class Circle extends shape{
    int radius;

    Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    void Display(){
        System.out.println("Circle is displayed");
    }

    void Area(){
        System.out.println("Area of Circle is: " + 3.14 * radius * radius);
    }
}

class Rectangle extends shape{
    int hight;
    int width;

    Rectangle(int x, int y, int hight, int width){
        this.x = x;
        this.y = y;
        this.hight = hight;
        this.width = width;
    }

    void Display(){
        System.out.println("Rectangle is displayed");
    }

    void Area(){
        System.out.println("Area of Rectangle is: " + hight * width);
    }
}

public class Abstract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of Circle: ");
        int radius = sc.nextInt();

        System.out.println("Enter the hight of Rectangle: ");
        int hight = sc.nextInt();
        System.out.println("Enter the width of Rectangle: ");
        int width = sc.nextInt();

        Circle c = new Circle(0, 0, radius);
        c.Display();
        c.Area();

        Rectangle r = new Rectangle(0, 0, hight, width);
        r.Display();
        r.Area();
    }
}
