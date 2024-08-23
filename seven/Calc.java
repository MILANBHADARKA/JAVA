import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener {

    Button b1 = new Button("Sum");
    Button b2 = new Button("Sub");
    Button b3 = new Button("Mul");
    Button b4 = new Button("Div");

    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);

    Label l = new Label("Result");

    public Calc() {
        setTitle("Calculator");
        setSize(300, 300);
        setVisible(true);

        setLayout(new GridLayout(5,2));

        Label l1 = new Label("Enter first number");
        Label l2 = new Label("Enter second number");

        // set size of labels
        l1.setSize(100, 10);
        l2.setSize(100, 10);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        add(l);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });

    }

    //Action listner

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = 0;

        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        } else if (e.getSource() == b3) {
            c = a * b;
        } else if (e.getSource() == b4) {
            c = a / b;
        }

        l.setText("Result: " + c);
    }


    public static void main(String[] args) {
        Calc t = new Calc();
    }
}
