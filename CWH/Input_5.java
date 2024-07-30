import java.util.Scanner;

public class Input_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number: ");
        // int x = sc.nextInt();
        
        // System.out.println("Enter a byte number: ");
        // byte e = sc.nextByte();

        // System.out.println("Enter a float number: ");
        // float y = sc.nextFloat();

        // System.out.println("Enter a double number: ");
        // double z = sc.nextDouble();

        // System.out.println("Enter a character: ");
        // char a = sc.next().charAt(0);

        // System.out.println("Enter a boolean: ");
        // boolean b = sc.nextBoolean();

        // System.out.println("Enter a long number: ");
        // long c = sc.nextLong();

        // System.out.println("Enter a short number: ");
        // short d = sc.nextShort();

        // System.out.println("Enter a string: ");
        // String str = sc.next();      // it will only take the first word of the string

        // System.out.println("Enter a string: ");
        // String str1 = sc.nextLine();      // it will take the whole string

        // System.out.println("int: " + x);
        // System.out.println("byte: " + e);
        // System.out.println("float: " + y);
        // System.out.println("double: " + z);
        // System.out.println("char: " + a);
        // System.out.println("boolean: " + b);
        // System.out.println("long: " + c);
        // System.out.println("short: " + d);
        // System.out.println("string: " + str);
        // System.out.println("string: " + str1);


        //hasNextInt() method
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("The number entered by user is: " + num);
            sc.nextLine(); // Consume the newline character
        } else {
            System.out.println("The input is not an Integer");
            sc.nextLine(); // Consume the invalid input
        }

        //hasNextFloat() method
        //hasNextDouble() method
        //hasNextBoolean() method
        //hasNextByte() method
        //hasNextLong() method
        //hasNextShort() method
        //hasNext() method
        //hasNextLine() method

        System.err.println("Enter a string: ");
        if(sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println("The string entered by user is: " + str);
        }else{
            System.out.println("The input is not a String");
        }


        sc.close();      // closing the scanner object to avoid memory leak 
    }
}
