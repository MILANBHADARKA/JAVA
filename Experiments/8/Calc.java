
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener {

    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button four = new Button("4");
    Button five = new Button("5");
    Button six = new Button("6");
    Button seven = new Button("7");
    Button eight = new Button("8");
    Button nine = new Button("9");
    Button zero = new Button("0");

    Button add = new Button("+");
    Button sub = new Button("-");
    Button mul = new Button("*");
    Button div = new Button("/");
    Button eq = new Button("=");
    Button clr = new Button("C");

    Label l = new Label("0");
    TextField tf = new TextField();

    double firstOperand = 0;
    String operator = "";
    boolean operatorPressed = false;

    Calc() {
        setTitle("Calculator");
        setSize(500, 500);
        setVisible(true);

        setLayout(null);
        
        tf.setBounds(50, 50, 200, 50);
        tf.setEditable(false);

        one.setBounds(50, 100, 50, 50);
        two.setBounds(100, 100, 50, 50);
        three.setBounds(150, 100, 50, 50);
        four.setBounds(50, 150, 50, 50);
        five.setBounds(100, 150, 50, 50);
        six.setBounds(150, 150, 50, 50);
        seven.setBounds(50, 200, 50, 50);
        eight.setBounds(100, 200, 50, 50);
        nine.setBounds(150, 200, 50, 50);
        zero.setBounds(100, 250, 50, 50);

        add.setBounds(200, 100, 50, 50);
        sub.setBounds(200, 150, 50, 50);
        mul.setBounds(200, 200, 50, 50);
        div.setBounds(200, 250, 50, 50);
        eq.setBounds(250, 100, 50, 50);
        clr.setBounds(250, 150, 50, 50);


        add(tf);

        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(zero);

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(eq);
        add(clr);


        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eq.addActionListener(this);
        clr.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") ||
            s.equals("6") || s.equals("7") || s.equals("8") || s.equals("9") || s.equals("0")) {

            if (operatorPressed) {
                tf.setText("");
                operatorPressed = false;
            }

            tf.setText(tf.getText() + s);
        } 
        else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            firstOperand = Integer.parseInt(tf.getText());
            operator = s;
            operatorPressed = true;
        } 
        else if (s.equals("=")) {
            int secondOperand = Integer.parseInt(tf.getText());
            double result = 0;
            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    result = firstOperand / secondOperand;
                    break;
            }

            tf.setText(String.valueOf(result));
            operator = "";
        } 
        else if (s.equals("C")) {
            tf.setText("");
            firstOperand = 0;
            operator = "";
            operatorPressed = false;
        }
    }

    public static void main(String[] args) {
        Frame f = new Calc();

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}