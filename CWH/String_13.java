
import java.util.Scanner;


public class String_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // String name = "MIlan";
        String name = new String("Milan");
        System.out.println(name);

        name = "Hello";
        System.out.println(name);

        //String is immutable in java
        //in string we cannot change one character of string like name[0] = "B"; it will give error 
        //we can change the whole string like name = "Bilan";
    
        //input string from user
        System.out.println("Enter your name: ");
        String name2 = sc.next();
        System.out.println("Your name is: " + name2);
        sc.nextLine(); //to clear the buffer //if we don't use this line then the next input will be skipped because of the buffer left by the previous input 

        //input string with spaces
        System.out.println("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("Your full name is: " + fullName);

        //String concatenation
        String str1 = "Milan";
        String str2 = "Kumar";

        String str3 = str1 + str2;
        System.out.println(str3);

        //String formatting
        float f1 = 5.6f;
        int a = 8;

        String str4 = String.format("The value of a is %d and value of f1 is %f", a, f1);
        System.out.println(str4);

        //String methods
        String str5 = "Milan Kumar";
        System.out.println(str5.length());
        System.out.println(str5.toLowerCase());
        System.out.println(str5.toUpperCase());
        System.out.println(str5.substring(5));
        System.out.println(str5.substring(5, 10));
        System.out.println(str5.replace('M', 'B'));
        System.out.println(str5.startsWith("Mil"));
        System.out.println(str5.endsWith("mar"));
        System.out.println(str5.charAt(4));
        System.out.println(str5.indexOf("Kumar"));
        System.out.println(str5.indexOf("Kumar", 7));     //search Kumar from index 7  
        System.out.println(str5.lastIndexOf("Kumar"));       //search Kumar from last
        System.out.println(str5.lastIndexOf("Kumar", 7));     //search Kumar from index 7 from last
        System.out.println(str5.equals("Milan Kumar"));       //compare the content of the string
        //trim() method is used to remove the leading and trailing spaces
        String str8 = "    Milan Kumar    ";
        System.out.println(str8.trim());


        //String comparison
        String str6 = "Milan";
        String str7 = "Milan";

        System.out.println(str6 == str7); //it will compare the reference of the string
        System.out.println(str6.equals(str7)); //it will compare the content of the string
         

    }
}
