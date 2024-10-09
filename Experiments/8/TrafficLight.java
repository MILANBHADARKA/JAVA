import java.awt.*;
import java.awt.event.*;


public class TrafficLight extends Frame implements ItemListener {

    Color Redcolor = Color.WHITE;
    Color Yellowcolor = Color.WHITE;
    Color Greencolor = Color.WHITE;

    CheckboxGroup cbg = new CheckboxGroup();


    TrafficLight(){
        setTitle("Traffic Light");
        setSize(300, 300);
        setVisible(true);

        setLayout(new FlowLayout());

        Checkbox r = new Checkbox("Red", cbg, false);
        Checkbox y = new Checkbox("Yellow", cbg, false);
        Checkbox g = new Checkbox("Green", cbg, false);

        add(r);
        add(y);
        add(g);

        r.addItemListener(this);
        y.addItemListener(this);
        g.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e){

        String s = (String) e.getItem();

        if(s.equals("Red")){
            Redcolor = Color.RED;
            Yellowcolor = Color.WHITE;
            Greencolor = Color.WHITE;
        }

        else if(s.equals("Yellow")){
            Redcolor = Color.WHITE;
            Yellowcolor = Color.YELLOW;
            Greencolor = Color.WHITE;
        }

        else if(s.equals("Green")){
            Redcolor = Color.WHITE;
            Yellowcolor = Color.WHITE;
            Greencolor = Color.GREEN;
        }

        repaint();
    }





    public void paint(Graphics g){

        g.drawRect(120,75,60,165);

        g.setColor(Color.black);
        if(Redcolor == Color.RED){
            g.setColor(Redcolor);
            g.fillOval(130, 85, 40, 40);
        }
        else if(Redcolor == Color.WHITE){
            g.drawOval(130,85,40,40);
        }

        g.setColor(Color.black);
        if(Yellowcolor == Color.YELLOW){
            g.setColor(Yellowcolor);
            g.fillOval(130, 135, 40, 40);
        }
        else if(Yellowcolor == Color.WHITE){
            g.drawOval(130,135,40,40);
        }

        g.setColor(Color.black);
        if(Greencolor == Color.GREEN){
            g.setColor(Greencolor);
            g.fillOval(130, 185, 40, 40);
        }
        else if(Greencolor == Color.WHITE){
            g.drawOval(130,185,40,40);
        }

    }


    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();

        t.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
