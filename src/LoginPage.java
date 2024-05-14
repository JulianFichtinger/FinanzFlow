import javax.swing.*;
import java.awt.*;

public class LoginPage {
    private JFrame loginFrame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPage() {
        loginFrame = new JFrame();
        loginFrame.setTitle("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(400, 200);
        loginFrame.setLocationRelativeTo(null); // Zentriert das Fenster auf dem Bildschirm

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10)); // 3 Reihen, 2 Spalten, Abstand zwischen den Komponenten

        JLabel usernameLabel = new JLabel("Benutzername:");
        JLabel passwordLabel = new JLabel("Passwort:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        loginButton.addActionListener(e -> login());

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Leerer Platzhalter
        panel.add(loginButton);

        loginFrame.add(panel);
        loginFrame.setVisible(true);
    }

    private void login() {
        // Hier kannst du deine Login-Logik einfügen
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        // Dummy-Überprüfung, hier muss deine eigentliche Logik stehen
        if (username.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(loginFrame, "Login erfolgreich!");
            // Hier könntest du den Übergang zur Hauptanwendung oder einer anderen Seite steuern
        } else {
            JOptionPane.showMessageDialog(loginFrame, "Login fehlgeschlagen. Bitte überprüfen Sie Ihre Anmeldeinformationen.");
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
