import java.util.Scanner;


public class ConvertTocapital {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the string: ");

        String str = sc.nextLine();

        System.out.println("String: " + str);

        // System.out.println("String in capital: " + str.toUpperCase());

        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if (ch >= 'a' && ch <= 'z') {
        //         ch = (char)(ch - 32);
        //     }
        //     System.out.print(ch);
        // }

        // do chagies in main string
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char)(ch[i] - 32);
            }
        }
        str = new String(ch);
        System.out.println("String in capital: " + str);

    }
}
