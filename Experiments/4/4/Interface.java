import java.util.*;

interface Push{
    void push(int x);
}
interface POP{
    void pop();
}
interface TOP{
    void top();
}

class Stack implements Push, POP, TOP{
    int top = -1;
    int[] stack = new int[100];
    public void push(int x){
        if(top == 99){
            System.out.println("Stack Overflow");
        }
        else{
            stack[++top] = x;
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
        }
        else{
            top--;
        }
    }
    public void top(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(stack[top]);
        }
    }
}

public class Interface{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        s.top();
        s.pop();

        s.top();
        s.pop();

        s.top();
        s.pop();
        
        s.top();
    }
}