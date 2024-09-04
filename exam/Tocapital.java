import java.awt.*;
import java.awt.event.*;


public class Tocapital extends Frame implements ActionListener {

    TextField tf1 = new TextField(10);
    TextField tf2 = new TextField(10);
    
    Tocapital(){
        setTitle("To Capital");
        setSize(300,300);
        setVisible(true);


        setLayout(null);

        add(tf1);
        add(tf2);

        tf1.setBounds(100,100,100,30);
        tf2.setBounds(100,150,100,30);

        tf2.setEditable(false);

        tf1.addActionListener(this);

    }


    public void actionPerformed(ActionEvent e){
        String s = tf1.getText();

        char[] charArray = s.toCharArray();
        int i = 0;
        while(i < charArray.length){
        
            if(charArray[i] >= 'a' && charArray[i] <= 'z'){
                charArray[i] -= 32;
            }
        
            i++;
        }
        String result = new String(charArray);
        tf2.setText(result);

    }

    public static void main(String[] args) {
        Tocapital t = new Tocapital();

        t.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
