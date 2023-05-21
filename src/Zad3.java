import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad3 extends JFrame {
    private JTextField nicknameField;
    private JPasswordField passwordField;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField emailField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;

    public Zad3() {
        // Ustawianie właściwości okna
        setTitle("Formularz rejestracyjny");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        JLabel nicknameLabel = new JLabel("Nick:");
        nicknameField = new JTextField();
        add(nicknameLabel);
        add(nicknameField);

        JLabel passwordLabel = new JLabel("Hasło:");
        passwordField = new JPasswordField();
        add(passwordLabel);
        add(passwordField);

        JLabel firstNameLabel = new JLabel("Imię:");
        firstNameField = new JTextField();
        add(firstNameLabel);
        add(firstNameField);

        JLabel lastNameLabel = new JLabel("Nazwisko:");
        lastNameField = new JTextField();
        add(lastNameLabel);
        add(lastNameField);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        add(emailLabel);
        add(emailField);

        JLabel genderLabel = new JLabel("Płeć:");
        maleRadioButton = new JRadioButton("Mężczyzna");
        femaleRadioButton = new JRadioButton("Kobieta");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel(new FlowLayout());
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        add(genderLabel);
        add(genderPanel);

        JButton submitButton = new JButton("Zarejestruj");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    validateForm();
                    JOptionPane.showMessageDialog(Zad3.this, "Formularz rejestracyjny został zatwierdzony.");
                    clearForm();
                } catch (InvalidInputException ex) {
                    JOptionPane.showMessageDialog(Zad3.this, "Błąd: " + ex.getMessage(), "Błąd rejestracji", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(submitButton);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void validateForm() throws InvalidInputException {
        // Pobieranie wartości z pól tekstowych, pól hasła i wyboru płci
        String nickname = nicknameField.getText();
        String password = new String(passwordField.getPassword());
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String gender = maleRadioButton.isSelected() ? "mężczyzna" : "kobieta";

        // Walidacja danych formularza
        if (nickname.length() < 6 || !nickname.matches(".*\\d.*")) {
            throw new InvalidInputException("Nick powinien składać się z co najmniej 6 znaków i zawierać przynajmniej jedną cyfrę.");
        }

        if (!email.endsWith("@gra.pl")) {
            throw new InvalidInputException("Email musi kończyć się @gra.pl.");
        }
    }
}