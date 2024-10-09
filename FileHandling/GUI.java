
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

public class GUI extends Frame implements ActionListener {

    TextField tf;
    TextArea ta;

    Button b1;

    GUI() {
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());

        tf = new TextField();
        ta = new TextArea();

        b1 = new Button("Submit");

        add(tf);
        add(ta);
        add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String name = tf.getText();
        String content = ta.getText();

        try {

            File f = new File("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\" + name+".txt");

            if (f.createNewFile()) {
                FileWriter writer = new FileWriter("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\" + name+".txt");

                try {
                    writer.write(content);
                }
                catch (Exception err) {
                    System.out.println("An error occurred.");
                    err.printStackTrace();
                }
                finally{
                    writer.close();
                }  
            } 
            else {
                System.out.println("Problem");
            }
        } 
        catch (Exception er) {
            System.out.println(er);
        }

        tf.setText("");
        ta.setText("");
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}
