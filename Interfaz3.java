import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Interfaz3 extends JFrame {

    private Map<String, String> usuarios = new HashMap<>();

    public Interfaz3() {
        usuarios.put("candidato@jobconnect.com", "password123");
        usuarios.put("empresa@tech.com", "empresa456");

        setTitle("JobConnect - Plataforma de Empleo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setResizable(false);

        // Panel principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // Header
        JLabel headerLabel = new JLabel("💼 JobConnect", JLabel.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setForeground(Color.BLUE);
        headerLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        // Panel de pestañas
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Login", createLoginPanel());
        tabbedPane.addTab("Registro", createRegisterPanel());

        mainPanel.add(headerLabel, BorderLayout.NORTH);
        mainPanel.add(tabbedPane, BorderLayout.CENTER);

        add(mainPanel);
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel(new GridLayout(8, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setBackground(Color.WHITE);

        // Título
        JLabel titleLabel = new JLabel("Iniciar Sesión", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel);

        // Email
        panel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        panel.add(emailField);

        // Contraseña
        panel.add(new JLabel("Contraseña:"));
        JPasswordField passField = new JPasswordField();
        panel.add(passField);

        // Checkbox
        JCheckBox rememberCheck = new JCheckBox("Recordar usuario");
        panel.add(rememberCheck);

        // BOTÓN AZUL OSCURO - BIEN VISIBLE
        JButton loginButton = new JButton("ACCEDER");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        panel.add(loginButton);

        // Acción
        loginButton.addActionListener(e -> {
            String email = emailField.getText();
            String password = new String(passField.getPassword());

            if (email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Completa todos los campos");
                return;
            }

            if (usuarios.containsKey(email) && usuarios.get(email).equals(password)) {
                JOptionPane.showMessageDialog(this, "Login exitoso");
            } else {
                JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
            }
        });

        return panel;
    }

    private JPanel createRegisterPanel() {
        JPanel panel = new JPanel(new GridLayout(10, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("Crear Cuenta", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(titleLabel);

        // Campos
        panel.add(new JLabel("Tipo de cuenta:"));
        String[] tipos = {"Candidato", "Empresa"};
        JComboBox<String> tipoCombo = new JComboBox<>(tipos);
        panel.add(tipoCombo);

        panel.add(new JLabel("Nombre completo:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Email:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Contraseña:"));
        panel.add(new JPasswordField());

        // Checkbox
        JCheckBox termsCheck = new JCheckBox("Acepto términos y condiciones");
        panel.add(termsCheck);

        // BOTÓN VERDE OSCURO - BIEN VISIBLE
        JButton registerButton = new JButton("REGISTRARSE");
        registerButton.setFont(new Font("Arial", Font.BOLD, 14));
        registerButton.setBackground(new Color(0, 100, 0));
        registerButton.setForeground(Color.WHITE);
        registerButton.setFocusPainted(false);
        panel.add(registerButton);

        registerButton.addActionListener(e -> {
            if (!termsCheck.isSelected()) {
                JOptionPane.showMessageDialog(this, "Acepta los términos");
                return;
            }
            JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente");
        });

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Interfaz3().setVisible(true);
        });
    }
}