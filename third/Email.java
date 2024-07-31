import java.util.Scanner;


public class Email {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // System.err.println("Enter Email");

        // String email = sc.nextLine();

        // System.out.println("Email: " + email); 

        // if (email.contains("@") && email.contains(".")) {
        //     System.out.println("Email is valid");
        // } else {
        //     System.out.println("Email is invalid");
        // }



        //using regex

        // System.err.println("Enter Email");

        // String email = sc.nextLine();

        // System.out.println("Email: " + email);

        // String[] emailParts = email.split("@");

        // if(email.matches(email)) {   //
        //     System.out.println("Email is valid");
        // } else {
        //     System.out.println("Email is invalid");
        // }

        // if (emailParts.length == 2) {
        //     String[] domainParts = emailParts[1].split("\\.");       

        //     if (domainParts.length == 2) {
        //         System.out.println("Email is valid");
        //         System.out.println("Email id: " + emailParts[0]);
        //         System.out.println("Email server address: " + domainParts[0] + "." + domainParts[1]);
        //     } else {
        //         System.out.println("Email is invalid");
        //     }
        // } else {
        //     System.out.println("Email is invalid");
        // }










        //using regex validation pattern


        System.err.println("Enter Email");

        String email = sc.nextLine();

        System.out.println("Email: " + email);

        String emailPattern = "[A-Za-z0-9\\._%+\\-]+@[A-Za-z0-9\\.\\-]+\\.[A-Za-z]{2,}";

        if (email.matches(emailPattern)) {
            System.out.println("Email is valid");
            System.out.println("username: " + email.split("@")[0]);
            System.out.println("domain: " + email.split("@")[1]);
        } else {
            System.out.println("Email is invalid");
        }





    }
}
