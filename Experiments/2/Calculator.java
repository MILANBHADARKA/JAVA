public class Calculator{
    
    public static void main(String[] args){
        String s1 = args[0];
        String s2 = args[1];
        String s3 = args[2];

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);

        if(s3.equals("+")){
            System.out.println(a + b);
        }
        else if(s3.equals("-")){
            System.out.println(a - b);
        }
        else if(s3.equals("/")){
            System.out.println(a / b);
        }
        else if(s3.equals("*")){
            System.out.println(a * b);
        }
        else{
            System.out.println("Enter valid operation");
        }

    }
}
