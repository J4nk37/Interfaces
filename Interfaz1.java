import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz1 extends JFrame {

    public Interfaz1() {
        // Configuración básica de la ventana
        setTitle("Acceso a Wallet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 550);
        setLocationRelativeTo(null);
        setResizable(false);

        // Panel principal con fondo degradado azul
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(0, 0, new Color(230, 240, 255), 0, getHeight(), new Color(200, 220, 250));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(new BorderLayout(10, 25));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));

        // Logo mejorado
        JLabel logoLabel = new JLabel("🔒 Crypto-Take 🔒", JLabel.CENTER);
        logoLabel.setFont(new Font("Montserrat", Font.BOLD, 26));
        logoLabel.setForeground(new Color(0, 82, 165));
        logoLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));

        // Panel de formulario con bordes redondeados visuales
        JPanel formPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.WHITE);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
                g2d.setColor(new Color(180, 200, 230));
                g2d.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
            }
        };
        formPanel.setLayout(new GridLayout(0, 1, 12, 18));
        formPanel.setOpaque(false);
        formPanel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        formPanel.setPreferredSize(new Dimension(300, 350));

        // Campos de texto con mejor diseño
        JLabel userLabel = new JLabel("USUARIO:");
        userLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        userLabel.setForeground(new Color(60, 80, 120));

        JTextField userField = new JTextField() {
            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(new Color(150, 180, 220));
                g2d.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 10, 10);
            }
        };
        userField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        userField.setOpaque(false);
        userField.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        userField.setBackground(new Color(248, 250, 255));

        JLabel passLabel = new JLabel("CONTRASEÑA:");
        passLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
        passLabel.setForeground(new Color(60, 80, 120));

        JPasswordField passField = new JPasswordField() {
            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(new Color(150, 180, 220));
                g2d.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 10, 10);
            }
        };
        passField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        passField.setOpaque(false);
        passField.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        passField.setBackground(new Color(248, 250, 255));

        // Checkbox mejorado
        JCheckBox termsCheck = new JCheckBox("Mantener sesion iniciada en segundo plano");
        termsCheck.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        termsCheck.setOpaque(false);
        termsCheck.setForeground(new Color(80, 100, 140));
        termsCheck.setBorder(BorderFactory.createEmptyBorder(5, 0, 15, 0));

        // Botón MEJORADO - Ahora sí se ve bien
        JButton loginButton = new JButton("ACCEDER A LA WALLET") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                if (getModel().isPressed()) {
                    // Efecto al presionar
                    GradientPaint gradient = new GradientPaint(0, 0, new Color(0, 105, 200), 0, getHeight(), new Color(0, 75, 160));
                    g2d.setPaint(gradient);
                } else {
                    // Estado normal
                    GradientPaint gradient = new GradientPaint(0, 0, new Color(0, 120, 220), 0, getHeight(), new Color(0, 90, 180));
                    g2d.setPaint(gradient);
                }

                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);

                super.paintComponent(g);
            }

            @Override
            protected void paintBorder(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(new Color(0, 60, 140));
                g2d.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
            }
        };
        loginButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        loginButton.setForeground(Color.WHITE);
        loginButton.setContentAreaFilled(false);
        loginButton.setBorderPainted(false);
        loginButton.setFocusPainted(false);
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.setPreferredSize(new Dimension(0, 50));

        // Enlace de registro


        // Agregar componentes al formulario
        formPanel.add(userLabel);
        formPanel.add(userField);
        formPanel.add(passLabel);
        formPanel.add(passField);
        formPanel.add(termsCheck);
        formPanel.add(loginButton);

        // Agregar componentes al panel principal
        mainPanel.add(logoLabel, BorderLayout.NORTH);
        mainPanel.add(formPanel, BorderLayout.CENTER);

        add(mainPanel);

        // Acción del botón
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!termsCheck.isSelected()) {
                    JOptionPane.showMessageDialog(Interfaz1.this,
                            "Debe aceptar los términos y condiciones para continuar",
                            "Advertencia de Seguridad", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(Interfaz1.this,
                        "✅ Acceso concedido\nBienvenido al sistema",
                        "Autenticación Exitosa", JOptionPane.INFORMATION_MESSAGE);
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
                new Interfaz1().setVisible(true);
            }
        });
    }
}