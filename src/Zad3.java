import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad3 extends JFrame {

    private JButton noThreadButton;
    private JButton withThreadButton;
    private JLabel statusLabel;

    public Zad3() {
        setTitle("Porównanie wersji");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new FlowLayout());

        noThreadButton = new JButton("Bez wątków");
        withThreadButton = new JButton("Z wątkami");
        statusLabel = new JLabel("Status");

        add(noThreadButton);
        add(withThreadButton);
        add(statusLabel);

    }
}

