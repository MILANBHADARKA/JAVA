import java.awt.*;
import java.awt.event.*;

public class MovingCircle2 extends Frame implements ItemListener, Runnable{

    Choice c;
    boolean isHorizontal = false;
    boolean isVertical = false;

    int x = 50;
    int y = 70;

    MovingCircle2(){
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        c = new Choice();

        c.add("Horizontal");
        c.add("Vertical");

        c.addItemListener(this);

        add(c);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, 50, 50);

        if(isHorizontal){
            x += 10;
            if(x > 450){
                x = 50;
            }
        }
        if(isVertical){
            y += 10;
            if(y > 450){
                y = 50;
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c.getSelectedItem().equals("Horizontal")){
            isHorizontal = true;
            isVertical = false;
            y = 50;
        }
        if(c.getSelectedItem().equals("Vertical")){
            isVertical = true;
            isHorizontal = false;
            x = 50;
        }
    }

    @Override
    public void run() {
        while(true){
            repaint();
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }



    public static void main(String[] args) {
        MovingCircle2 t = new MovingCircle2();

        Thread y = new Thread(t);
        y.start();

        t.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
