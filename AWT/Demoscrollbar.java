import javax.swing.*;

public class Demoscrollbar extends JFrame {

    Demoscrollbar() {
        setTitle("Scrollbar Example");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create JScrollBar
        JScrollBar benefitsScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 1, 0, 5);
        benefitsScrollbar.setBounds(50, 100, 199, 20);

        // Set unit increment to 1
        benefitsScrollbar.setUnitIncrement(1);

        add(benefitsScrollbar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Demoscrollbar();
    }
}
