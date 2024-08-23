import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import pack.B;


public class JLabel_Two {
    public static void main(String[] args) {
        //JLabel = a GUI display area for a string of text, an image, or both
        
        JFrame frame = new JFrame();    //creates a frame
        JLabel label = new JLabel();    //creates a label
        label.setText("Hello this is Milan");   //sets text of label

        frame.setTitle("JFrame title goes here"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setSize(420,420);  
        frame.setVisible(true);   
        frame.add(label);   //adds label to frame

        ImageIcon image = new ImageIcon("image1.jpg");  //create an ImageIcon
        image = new ImageIcon(image.getImage().getScaledInstance(300, 300, java.awt.Image.SCALE_SMOOTH));  //resize image
        label.setIcon(image);   //adds icon to label

        label.setHorizontalTextPosition(JLabel.CENTER);   //set text LEFT, CENTER, RIGHT of image icon 
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(new Color(0x00FF00));   //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));   //set font of text
        label.setIconTextGap(-25);  //set gap of text to image
        label.setBackground(Color.black);   //set background color
        label.setOpaque(true);   //display background color

        Border border = BorderFactory.createLineBorder(Color.red, 3);   //create border


    }
}
