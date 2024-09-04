import java.awt.*;
import java.awt.event.*;


public class Guicalculator extends Frame  {

    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b0 = new Button("0");
    Button b11 = new Button("*");
    Button b12 = new Button("#");

    TextField tf = new TextField(2);

    Guicalculator(){
        setTitle("Guicalculator");
        setSize(400,400);
        setVisible(true);

        setLayout(null);

        tf.setBounds(0,0,400,80);
        add(tf);

        b1.setBounds(0,80,133,80);
        add(b1);
        b2.setBounds(133,80,133,80);
        add(b2);
        b3.setBounds(266,80,133,80);
        add(b3);
        b4.setBounds(0,160,133,80);
        add(b4);
        b5.setBounds(133,160,133,80);
        add(b5);
        b6.setBounds(266,160,133,80);
        add(b6);
        b7.setBounds(0,240,133,80);
        add(b7);
        b8.setBounds(133,240,133,80);
        add(b8);
        b9.setBounds(266,240,133,80);
        add(b9);
        b0.setBounds(0,320,133,80);
        add(b0);
        b11.setBounds(133,320,133,80);
        add(b11);
        b12.setBounds(266,320,133,80);
        add(b12);

    }
    public static void main(String[] args) {
        Guicalculator g = new Guicalculator();

        g.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
