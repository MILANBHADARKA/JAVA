
import java.awt.*;

public class Move extends Frame implements Runnable {

    int x = 0;
    int y = 200;
    boolean left = false;
    boolean right = true;

    Move() {
        setSize(500, 500);
        setTitle("Hello");
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public void paint(Graphics g) {
        if (right) {
            x += 50;
        } else if (left) {
            x -= 50;
        }

        if (x == 500) {
            left = true;
            right = false;
        } else if (x == 0) {
            left = false;
            right = true;
        }

        g.drawString("Milan", x, y);
    }

    public void run() {
        try {
            while (true) {
                repaint();

                Thread.sleep(50);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Move one = new Move();

        Thread t = new Thread(one);
        t.start();
    }
}
