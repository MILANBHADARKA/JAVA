public class Precedence_9 {
    public static void main(String[] args) {
        //precedence and associativity

        int a = 6 * 5 - 34 / 2;
        int b  = 60 / 5 - 34 * 2;
        System.out.println(a);
        System.out.println(b);

        int c = 6 * 5 / 34 - 2;
        int d = 6 * 5 / 34 - 4;

        System.out.println(c);
        System.out.println(d);

        //left to right
        int e = (6 * ((5 / 2) + 2));
        
        System.out.println(e);

        //precedence and associativity
        // 1. ()   
        // 2. * /      //left to right
        // 3. + -       //left to right

        //other
        // 4. = assignment operator
        // 5. == equals to
        // 6. && logical and
        // 7. || logical or

    }
}
