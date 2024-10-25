import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int ans;

        int n;
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            ans = a+b;

            System.out.println(ans + " ");

            b=a;
            a=ans;
        }

    }
}
