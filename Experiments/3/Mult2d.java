
import java.util.Scanner;


public class Mult2d {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the how many elements of 2D array a and b: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];

        int c[][] = new int[m][n];

        System.out.println("Enter the elements of 2D array a and b: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplication of a and b:");

        //multiplication of a and b
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + "    ");
            }
            System.out.println();
        }



    }
}
