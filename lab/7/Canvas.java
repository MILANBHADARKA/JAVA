import java.awt.*;
import java.awt.event.*;


public class Canvas extends Frame implements ItemListener { 

    CheckboxGroup cbg;
    java.awt.Canvas c;
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;

    public Canvas() {
        setTitle("Canvas");
        setSize(500, 500);
        setVisible(true);

        cbg = new CheckboxGroup();
        c = new java.awt.Canvas();
        c1 = new Checkbox("Circle", cbg, false);
        c2 = new Checkbox("Ractangle", cbg, false);
        c3 = new Checkbox("Line", cbg, false);

        c.setSize(300, 300);
        add(c);

        setLayout(new FlowLayout());

        add(c1);
        add(c2);
        add(c3);
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        if (c1.getState()) {
            g.drawOval(100, 100, 100, 100);
        } else if (c2.getState()) {
            g.drawRect(100, 100, 100, 100);
        } else if (c3.getState()) {
            g.drawLine(100, 100, 200, 200);
        }

        repaint();
    }

    public void itemStateChanged(ItemEvent e) {

    }

    public static void main(String[] args) {
        Canvas t = new Canvas();
    }
}
