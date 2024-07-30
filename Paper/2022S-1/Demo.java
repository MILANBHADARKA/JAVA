public class Demo {
    public static void main(String[] args) {
        Demo obj = new Demo(15);
    }

    static int a = 10;
    static int n;
    int b = 5;
    final int c = 37;
    public Demo(int n){
        System.out.println(a + "," + b + "," + c + "," + n);
    }
    static{
        a=60;
    }
}
