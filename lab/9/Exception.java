import java.util.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;


public class Exception extends Frame implements ActionListener {

    int[] arr = new int[100];
    Random random;

    TextField t1;
    TextField t2;

    Label l1;
    Label l2;

    Button b1;

    Exception(){
        setTitle("Exception handling");
        setSize(200,200);
        setVisible(true);

        setLayout(new GridLayout(3,2));

        random = new Random();
        addElement();


        t1 = new TextField();
        t2 = new TextField();

        l1 = new Label("Index");
        l2 = new Label("Element");

        b1 = new Button("Click");

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(b1);


        b1.addActionListener(this);

    }

    private void addElement(){
        
        for(int i =0;i<100;i++){
            arr[i] = (int)(random.nextInt(100));
        }
    }

    public void actionPerformed(ActionEvent e){
        try {
            int a = Integer.parseInt(t1.getText());

            int b = arr[a];

            t2.setText(Integer.toString(b));

        } 
        catch(ArrayIndexOutOfBoundsException ex) {
            t2.setText(ex.toString());
        }
    }
    


    public static void main(String[] args) {
        Exception e = new Exception();

        e.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    
}
