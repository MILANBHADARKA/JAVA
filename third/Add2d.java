
import java.util.Scanner;



public class Add2d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        System.out.println("Enter the elements of 2D array a and b: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }


        System.out.println("Sum of a and b:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "    ");
            }
            System.out.println();
        }





            
    }
}
