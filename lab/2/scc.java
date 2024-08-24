import java.util.*;

class Calculator{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();

        if(c.equals("+")){
            System.out.println(a + b);
        }
        else if(c.equals("-")){
            System.out.println(a - b);
        }
        else if(c.equals("/")){
            System.out.println(a / b);
        }
        else if(c.equals("*")){
            System.out.println(a * b);
        }
        else{
            System.out.println("Enter valid operation");
        }

    }
}
