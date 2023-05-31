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
        noThreadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Symulacja długotrwałej operacji
                simulateLongOperation();
                statusLabel.setText("Zakończono (bez wątków)");
            }
        });
        withThreadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tworzenie wątku
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // Symulacja długotrwałej operacji
                        simulateLongOperation();
                        // Aktualizacja etykiety w wątku interfejsowym
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                statusLabel.setText("Zakończono (z wątkami)");
                            }
                        });
                    }
                });
                thread.start();
            }
        });
    }
    private void simulateLongOperation() {
        try {
            Thread.sleep(5000); // Symulacja długotrwałej operacji
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




