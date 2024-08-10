import java.awt.*;
import java.awt.event.*;


public class Mouse extends Frame implements MouseListener {
    Label l = new Label("Click here");
    public Mouse() {
        setTitle("Pattern");
        setSize(1000, 1000);
        setVisible(true);
        addMouseListener(this);

        //create label
        setLayout(new FlowLayout());
        add(l);
    }

    public void mouseClicked(MouseEvent e) {
        int a = e.getX();
        int b = e.getY();

        l.setText( "X: " + a + " Y: " + b );
    }
    public void mousePressed(MouseEvent e) {

    }
    public void mouseReleased(MouseEvent e) {

    }
    public void mouseEntered(MouseEvent e) {

    }
    public void mouseExited(MouseEvent e) {
        
    }

    public static void main(String[] args) {
        Mouse t = new Mouse();
    }
}

