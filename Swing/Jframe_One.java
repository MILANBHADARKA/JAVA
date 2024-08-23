import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Jframe_One{
    public static void main(String[] args) {
        //JFrame = a GUI window to add components to

        JFrame frame = new JFrame();    //creates a frame

        frame.setTitle("JFrame title goes here");   //sets title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //by default when you click "X" button on the frame that is HIDE_ON_CLOSE so exit out of application and terminate the program we use EXIT_ON_CLOSE    
        frame.setResizable(false);  //prevent frame from being resized 
        frame.setSize(420,420);    //sets the size of the frame (width, height) in pixels 
        frame.setVisible(true);   //makes frame visible

        ImageIcon image = new ImageIcon("image1.jpg");  //create an ImageIcon
        frame.setIconImage(image.getImage());   //change icon of the frame

        frame.getContentPane().setBackground(Color.green);  //change color of background
        //from getContentPane() we can get the content pane of the frame and then we can do anything with it like changing the background color of the frame & we can add components to the frame like buttons, textfields, etc.
        // frame.getContentPane().setBackground(new Color(255,0,0));  //change color of background
        // frame.getContentPane().setBackground(new Color(0x123456));  //change color of background

    }
}