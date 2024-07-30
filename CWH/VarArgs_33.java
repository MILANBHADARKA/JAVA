//variable arguments in java
//variable arguments are used when we don't know how many arguments we have to pass in the method
//this is done by using three dots(...) after the data type of the argument
//variable arguments should be the last argument in the method
//variable arguments can be used only once in a method
//variable arguments can be used with any data type
//this is also known as varargs and all data store in an array

public class VarArgs_33 {

    static void fun(int ...v) {
        System.out.println("Number of arguments: " + v.length);
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static void sum(int ...v) {
        int sum = 0;
        for (int i : v) {
            sum += i;
        }
        System.out.println("Sum of arguments: " + sum);
    }

    public static void main(String[] args) {
        
        fun(1, 2, 3, 4, 5);
        fun(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        sum(1, 2, 3, 4, 5);
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    }
}
