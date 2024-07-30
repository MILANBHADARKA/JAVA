class Parent {
    public void show(){
        System.out.println("Parent");
    }
}

public class Child extends Parent {
    public void show(){
        super.show();
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
