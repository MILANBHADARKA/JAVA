import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class GridBagLayoutDemo extends Frame
{
  GridBagLayoutDemo()
  {
   super("GridBagLayout Demo");
   setSize(1000,1000);
   setVisible(true);
   GridBagLayout grid = new GridBagLayout();  
   GridBagConstraints gbc = new GridBagConstraints();  
   setLayout(grid);
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Button("Button One"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new Button("Button two"), gbc);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.ipady = 20; //Specifies the internal padding: how much to add to the size of the component
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new Button("Button Three"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new Button("Button Four"), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    gbc.gridwidth = 2;  
    this.add(new Button("Button Five"), gbc);  

  }

  public static void main(String args[])
   {
     GridBagLayoutDemo f = new GridBagLayoutDemo();

     f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
        System.exit(0);
      }
     });
   }
}
