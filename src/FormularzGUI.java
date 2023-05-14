import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FormularzGUI extends JFrame implements ActionListener {
    private JTextField imieField, nazwiskoField, peselField;
    private JButton submitButton;

    public FormularzGUI() {
        setTitle("Formularz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2,10,10));

        JLabel imieLabel = new JLabel("Imię:");
        imieField = new JTextField();
        addPlaceholder(imieField, "Imię");

        JLabel nazwiskoLabel = new JLabel("Nazwisko:");
        nazwiskoField = new JTextField();
        addPlaceholder(nazwiskoField, "Nazwisko");

        JLabel peselLabel = new JLabel("PESEL:");
        peselField = new JTextField();
        addPlaceholder(peselField, "PESEL");
        peselField.setToolTipText("Wprowadź 11-cyfrowy numer PESEL");

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

            boolean isValid = validatePesel(pesel);

            // Wyświetlanie wyników w oknie dialogowym
            String message;
            if (isValid) {
                message = "Imię: " + imie + "\nNazwisko: " + nazwisko + "\nPESEL: " + pesel + "\n\nPESEL jest prawidłowy.";
            } else {
                message = "Imię: " + imie + "\nNazwisko: " + nazwisko + "\nPESEL: " + pesel + "\n\nPESEL jest nieprawidłowy.";
            }
            JOptionPane.showMessageDialog(this, message, "Dane formularza", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void addPlaceholder(JTextField textField, String placeholder) {
        textField.setForeground(Color.GRAY);
        textField.setText(placeholder);

        textField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setForeground(Color.GRAY);
                    textField.setText(placeholder);
                }
            }
        });

        add(textField);
    }

    private static boolean validatePesel(String pesel) {
        if (pesel.length() != 11) {
            return false; // PESEL musi mieć dokładnie 11 cyfr
        }

        int[] factors = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3}; // Czynniki do obliczenia sumy kontrolnej

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int digit = Character.getNumericValue(pesel.charAt(i));
            sum += digit * factors[i];
        }

        int checksum = 10 - (sum % 10);
        if (checksum == 10) {
            checksum = 0;
        }

        int lastDigit = Character.getNumericValue(pesel.charAt(10));

        return checksum == lastDigit;
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormularzGUI());
    }
}