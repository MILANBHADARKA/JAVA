
import java.util.Scanner;

public class ForEach_27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Printing the elements of the array using forEach loop: ");
        for (int element : arr) {
            System.out.println(element);
        }


        // String[] str = new String[5];
        String[] str = {"Milan", "Kumar", "Bilan", "Bimal", "Bhola"};

        System.out.println("Printing the elements of the string array using forEach loop: ");
        for (String element : str) {
            System.out.println(element);
        }




    }
}
