
import java.util.Scanner;


public class Fibonaccii {
    
    static int hrl(int n){
        if(n==1 || n==2) return 1;
        return (hrl(n-1) + hrl(n-2));
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");

        int n = sc.nextInt();

        int a = hrl(n);

        System.out.println(a);

    }

}
