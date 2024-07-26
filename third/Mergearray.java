
import java.util.*;


public class Mergearray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        int b[] = new int[6];
        int c[] = new int[11];

        System.out.println("Enter element of first array");
        for(int i=0; i<5; i++){
            a[i]= sc.nextInt();
        }

        System.out.println("Enter element of second array");
        for(int i=0; i<6; i++){
            b[i]= sc.nextInt();
        }

        for(int i=0; i<11; i++){
            if(i<5){
                c[i] = a[i];
            }
            else{
                c[i] = b[i-5];
            }
        }

        // for(int i = 0; i< 11-1; i++){
        //     for(int j = 0; j< 11-i-1; j++){
        //         if(c[j]>c[j+1]){
        //             int temp;
        //             temp = c[j];
        //             c[j] = c[j+1];
        //             c[j+1] = temp;
        //         }
        //     }
        // }

        Arrays.sort(c);

        for(int i=0; i<11; i++){
            System.out.println(c[i]);
        }

    }
}