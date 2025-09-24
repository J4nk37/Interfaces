import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz2 extends JFrame {

    public Interfaz2() {
        setTitle("Banco Global - Acceso Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 580);
        setLocationRelativeTo(null);
        setResizable(false);

        // Panel principal con fondo azul claro profesional
        JPanel mainPanel = new JPanel(new BorderLayout(15, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 35, 30, 35));
        mainPanel.setBackground(new Color(235, 242, 250));

        // Header profesional
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setOpaque(false);

        JLabel logoLabel = new JLabel("🏦 BANCO GLOBAL", JLabel.CENTER);
        logoLabel.setFont(new Font("Segoe UI", Font.BOLD, 26));
        logoLabel.setForeground(new Color(0, 80, 160));
        logoLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

        JLabel subtitleLabel = new JLabel("Acceso seguro para clientes", JLabel.CENTER);
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        subtitleLabel.setForeground(new Color(100, 120, 150));

        headerPanel.add(logoLabel, BorderLayout.NORTH);
        headerPanel.add(subtitleLabel, BorderLayout.SOUTH);

        // Panel del formulario con sombra sutil
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 220, 235), 1),
                BorderFactory.createEmptyBorder(30, 30, 30, 30)
        ));

        // ComboBox mejorado
        JLabel typeLabel = new JLabel("Tipo de cuenta:");
        typeLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        typeLabel.setForeground(new Color(60, 80, 120));
        typeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        String[] accounts = {"Cuenta Personal", "Cuenta Empresarial", "Cuenta Premium"};
        JComboBox<String> accountCombo = new JComboBox<>(accounts);
        accountCombo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        accountCombo.setBackground(Color.WHITE);
        accountCombo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 195, 215)),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        accountCombo.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Campos de texto
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        userLabel.setForeground(new Color(60, 80, 120));
        userLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextField userField = new JTextField();
        userField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        userField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 195, 215)),
                BorderFactory.createEmptyBorder(10, 12, 10, 12)
        ));
        userField.setMaximumSize(new Dimension(300, 35));
        userField.setAlignmentX(Component.LEFT_ALIGNMENT);

        JLabel passLabel = new JLabel("Contraseña:");
        passLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        passLabel.setForeground(new Color(60, 80, 120));
        passLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPasswordField passField = new JPasswordField();
        passField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        passField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 195, 215)),
                BorderFactory.createEmptyBorder(10, 12, 10, 12)
        ));
        passField.setMaximumSize(new Dimension(300, 35));
        passField.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Opciones
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
        optionsPanel.setOpaque(false);
        optionsPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JRadioButton rememberRadio = new JRadioButton("Recordar usuario en este equipo");
        rememberRadio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        rememberRadio.setOpaque(false);
        rememberRadio.setSelected(true);

        JCheckBox termsCheck = new JCheckBox("Acepto los términos y condiciones bancarios");
        termsCheck.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        termsCheck.setOpaque(false);

        optionsPanel.add(rememberRadio);
        optionsPanel.add(Box.createVerticalStrut(5));
        optionsPanel.add(termsCheck);

        // BOTÓN QUE SÍ SE VE - Azul oscuro contrastado
        JButton loginButton = new JButton("ACCEDER A LA CUENTA");
        loginButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
        loginButton.setBackground(new Color(0, 100, 200)); // Azul oscuro visible
        loginButton.setForeground(Color.WHITE); // Texto blanco de alto contraste
        loginButton.setBorder(BorderFactory.createEmptyBorder(12, 25, 12, 25));
        loginButton.setFocusPainted(false);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginButton.setMaximumSize(new Dimension(300, 45));

        // Agregar componentes con espaciado
        formPanel.add(typeLabel);
        formPanel.add(Box.createVerticalStrut(8));
        formPanel.add(accountCombo);
        formPanel.add(Box.createVerticalStrut(20));
        formPanel.add(userLabel);
        formPanel.add(Box.createVerticalStrut(8));
        formPanel.add(userField);
        formPanel.add(Box.createVerticalStrut(20));
        formPanel.add(passLabel);
        formPanel.add(Box.createVerticalStrut(8));
        formPanel.add(passField);
        formPanel.add(Box.createVerticalStrut(20));
        formPanel.add(optionsPanel);
        formPanel.add(Box.createVerticalStrut(25));
        formPanel.add(loginButton);

        // Footer
        JLabel footerLabel = new JLabel("¿Necesita ayuda? Contacte con su gestor personal", JLabel.CENTER);
        footerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        footerLabel.setForeground(new Color(120, 140, 170));

        // Ensamblar
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(footerLabel, BorderLayout.SOUTH);

        add(mainPanel);

        // Acción
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!termsCheck.isSelected()) {
                    JOptionPane.showMessageDialog(Interfaz2.this,
                            "Debe aceptar los términos y condiciones para continuar",
                            "Advertencia", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                JOptionPane.showMessageDialog(Interfaz2.this,
                        "Acceso concedido correctamente",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz2().setVisible(true);
            }
        });
    }
}