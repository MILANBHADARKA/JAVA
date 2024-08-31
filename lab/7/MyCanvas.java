import java.awt.*;
import java.awt.event.*;

public class MyCanvas extends Frame implements ItemListener {

    CheckboxGroup cbg = new CheckboxGroup();

    Checkbox c1;
    Checkbox c2;
    Checkbox c3;
    Canvas canvas;

    MyCanvas() {
        setTitle("Canvas");
        setSize(500, 500);
        setVisible(true);

        setLayout(new FlowLayout());

        c1 = new Checkbox("Rectangle", cbg, false);
        c2 = new Checkbox("Circle", cbg, false);
        c3 = new Checkbox("Line", cbg, false);

        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        canvas = new Canvas() {
            public void paint(Graphics g) {
                if (c1.getState()) {
                    g.drawRect(100, 100, 200, 200);
                } else if (c2.getState()) {
                    g.drawOval(100, 100, 200, 200);
                } else if (c3.getState()) {
                    g.drawLine(100, 100, 200, 200);
                }
            }
        };
        canvas.setSize(400, 400);
        add(canvas);
    }

    public void itemStateChanged(ItemEvent e) {
        canvas.repaint();
    }

    public static void main(String[] args) {
        MyCanvas c = new MyCanvas();

        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}