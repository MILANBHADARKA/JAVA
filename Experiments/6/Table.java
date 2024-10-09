import java.awt.*;
import java.awt.event.*;

public class Table extends Frame {

    public Table() {
        setTitle("Multiplication Table");
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        //multiplication table 1 to 10

        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table of "+i);
            for (int j = 1; j <= 10; j++) {
                g.drawString(i + " * " + j + " = " + i * j,50,100*i+j*10);
            }
            g.drawString("----------------",50,100*i+103);
        }

    }

    public static void main(String[] args) {
        Table t = new Table();

        t.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
