public class IncrementDecrement_10 {
    public static void main(String[] args) {
        //increment and decrement operators

        int i = 56;
        int j = 67;

        System.out.println(i++); // first print then increment
        System.out.println(i);   // increment after print

        System.out.println(++j); // increment first then print
        System.out.println(j);   // increment after print

        int a = 5;
        int b = 7; 

        int c = a++; // first assign then increment
        int d = b--; // first assign then decrement

        System.out.println(c);
        System.out.println(d);

        System.out.println(a);
        System.out.println(b);


        // 1. ++i or i++  // pre increment and post increment
        // 2. --i or i--  // pre decrement and post decrement


        int num = 6;
        int num2 = 6;

        int res = num++ + num++ + num++;
        System.out.println(res);

        int res2 = ++num2 + ++num2 + ++num2;
        System.out.println(res2);


    }
}
