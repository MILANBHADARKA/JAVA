import javax.swing.*;

public class App{
    public static void main(String[] args) throws Exception {

        int boardwidth = 600;
        int boardheight = boardwidth;


        JFrame frame = new JFrame("Snack");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setVisible(true);

        SnackGame snackgame = new SnackGame(boardwidth, boardheight);
        frame.add(snackgame);
        frame.pack();     //pack() is use for resize the frame to fit the preferred size and layouts of its subcomponents. it's like box-sizing: border-box in css
    }
}