import java.awt.*;
import java.awt.event.*;

class MouseEventExample extends Frame implements MouseListener
{   boolean c=false;
    MouseEventExample()
	{  setSize(600,500);
	   setVisible(true);
	   addMouseListener(this);
	    
	}
	public void mouseClicked(MouseEvent e)
	{
		repaint();
		setBackground(Color.RED);
		c=true;
        System.out.println("Mouse Clicked");
			   
	}public void mousePressed(MouseEvent e)
	{
		
	}public void mouseReleased(MouseEvent e)
	{
		
	}public void mouseEntered(MouseEvent e)
	{
		
	}public void mouseExited(MouseEvent e)
	{
		
	}
	public void paint(Graphics g)
	{
        System.out.println("Paint");
		if(c)
		{
            System.out.println("Paint if");
		    g.drawRect(50,50,100,100); 
		    c=false;
		}
	}
	   
	public static void main(String args[])
	{
		MouseEventExample d1 = new MouseEventExample();
	}


}