import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Pattern extends Frame {

    Pattern(){
        setTitle("Pattern");
        setSize(500,500);
        setVisible(true);


    }

    public void paint(Graphics g){
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
        g.drawLine(250,100,250,400);
        g.drawLine(100,250,400,250);
    }
    
    public static void main(String[] args) {
        Pattern p = new Pattern();

        p.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
}
