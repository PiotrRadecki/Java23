import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularzGUI extends JFrame implements ActionListener {
    private JTextField imieField, nazwiskoField, peselField;
    private JButton submitButton;

    public FormularzGUI() {
        setTitle("Formularz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2,10,10));

        JLabel imieLabel = new JLabel("Imię:");
        imieField = new JTextField();

        JLabel nazwiskoLabel = new JLabel("Nazwisko:");
        nazwiskoField = new JTextField();

        JLabel peselLabel = new JLabel("PESEL:");
        peselField = new JTextField();

        submitButton = new JButton("Zatwierdź");
        submitButton.addActionListener(this);

        add(imieLabel);
        add(imieField);
        add(nazwiskoLabel);
        add(nazwiskoField);
        add(peselLabel);
        add(peselField);
        add(new JLabel()); // Pusta etykieta, aby wycentrować przycisk
        add(submitButton);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String imie = imieField.getText();
            String nazwisko = nazwiskoField.getText();
            String pesel = peselField.getText();

            // Przetwarzanie wprowadzonych danych
            // Tutaj możesz umieścić kod do obsługi danych wprowadzonych przez użytkownika

            System.out.println("Imię: " + imie);
            System.out.println("Nazwisko: " + nazwisko);
            System.out.println("PESEL: " + pesel);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormularzGUI());
    }
}
