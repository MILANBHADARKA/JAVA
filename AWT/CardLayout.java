import java.awt.*;
import java.awt.CardLayout;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{

    CardLayout c1 = new CardLayout();

    Panel p1 = new Panel();
    Panel p2 = new Panel();

    Button b1 = new Button("Next");
    Button b2 = new Button("Previous");

  MyFrame()
  {
    super("CardLayout Demo");
    setSize(600,400);
    setVisible(true);
	setLayout(c1);

    p1.add(b1);
    p2.add(b2);

    p1.add(new Label("This is Card 1"));
    p2.add(new Label("This is Card 2"));

    b1.addActionListener(this);
    b2.addActionListener(this);

	add(p1,"Card1");
	add(p2,"Card2");
	 
	c1.show(this,"Card1");

  }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            c1.show(this,"Card2");
        }
        else
        {
            c1.show(this,"Card1");
        }
    }

  public static void main(String args[])
  {
    MyFrame f = new MyFrame();
  }
}
