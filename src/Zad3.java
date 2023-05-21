import javax.swing.*;
import java.awt.*;

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

        add(submitButton);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}