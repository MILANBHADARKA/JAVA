import java.awt.*;
import java.awt.event.*;

public class MovingCircle extends Frame implements Runnable {


    int circle1x = 100;
    int circle1y = 30;

    int circle2x = 200;
    int circle2y = 30;

    int circle3x = 10;
    int circle3y = 340;

    int circle4x = 230;
    int circle4y = 344;


    int circle1vx = 5;
    int circle1vy = 5;

    int circle2vx = -4;
    int circle2vy = 4;

    int circle3vx = 3;
    int circle3vy = -3;

    int circle4vx = -6;
    int circle4vy = -6;
    

    MovingCircle(){
        setSize(700, 400);
        setVisible(true);
        setLayout(new FlowLayout());
    }


    public void updateCircles() {

        circle1x += circle1vx;
        circle1y += circle1vy;

        circle2x += circle2vx;
        circle2y += circle2vy;

        circle3x += circle3vx;
        circle3y += circle3vy;

        circle4x += circle4vx;
        circle4y += circle4vy;


        // Circle 1
        if (circle1x <= 0 || circle1x >= 650) {
            circle1vx *= -1;
        }
        if (circle1y <= 0 || circle1y >= 350) {
            circle1vy *= -1;
        }

        // Circle 2
        if (circle2x <= 0 || circle2x >= 650) {
            circle2vx *= -1;
        }
        if (circle2y <= 0 || circle2y >= 350) {
            circle2vy *= -1;
        }

        // Circle 3
        if (circle3x <= 0 || circle3x >= 650) {
            circle3vx *= -1;
        }
        if (circle3y <= 0 || circle3y >= 350) {
            circle3vy *= -1;
        }

        // Circle 4
        if (circle4x <= 0 || circle4x >= 650) {
            circle4vx *= -1;
        }
        if (circle4y <= 0 || circle4y >= 350) {
            circle4vy *= -1;
        }
    }

    public void paint(Graphics g){
        g.setColor(Color.pink);


        g.fillOval(circle1x, circle1y, 50, 50);
        g.fillOval(circle2x, circle2y, 50, 50);
        g.fillOval(circle3x, circle3y, 50, 50);
        g.fillOval(circle4x, circle4y, 50, 50);
    }

    @Override
    public void run() {
        while(true){
            updateCircles(); 
            repaint(); 
            try{
                Thread.sleep(25);
            }catch(Exception e){}
        }
    }

    public static void main(String[] args) {
        MovingCircle t = new MovingCircle();

        Thread y = new Thread(t);
        y.start();

        t.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
