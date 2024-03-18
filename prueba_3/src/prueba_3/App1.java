package prueba_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App1 extends JFrame implements ActionListener {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, registerButton;
    private JPanel contentPanel;
    private JPanel panel_1;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JPanel panel_2;
    private JTextField textField;
    private JPanel panel_3; 
    private JPanel panel_4;
    private JLabel lblNewLabel_3;
    private JTextField textField_1;
    private JPanel panel_5;
    private JLabel lblNewLabel_4;
    private JTextField textField_2;

    public App1() {
        setTitle("Client Application");
        getContentPane().setLayout(new BorderLayout());

        // Create the menu panel
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(new Color(51, 153, 255));
        menuPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        loginButton = new JButton("Login");
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(51, 102, 153));
        loginButton.addActionListener(this);
        menuPanel.add(loginButton);

        registerButton = new JButton("Register");
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(51, 102, 153));
        registerButton.addActionListener(this);
        menuPanel.add(registerButton);

        // Create the header panel
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(51, 153, 255));
        JLabel headerLabel = new JLabel("¡BIEVENIDO DE NUEVO!");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);

        // Create the content panel
        contentPanel = new JPanel();
        contentPanel.setForeground(Color.WHITE);
        contentPanel.setBackground(UIManager.getColor("activeCaption"));

        // Add the menu, header, and content panels to the frame
        getContentPane().add(menuPanel, BorderLayout.NORTH);
        getContentPane().add(headerPanel, BorderLayout.SOUTH);
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(new BorderLayout(0, 0));
        
        panel_1 = new JPanel();
        panel_1.setOpaque(false);
        contentPanel.add(panel_1, BorderLayout.NORTH);
        panel_1.setLayout(new BorderLayout(0, 0));
        
        lblNewLabel = new JLabel("   Direccion:  ");
        panel_1.add(lblNewLabel, BorderLayout.WEST);
        
        lblNewLabel_1 = new JLabel(" ");
        panel_1.add(lblNewLabel_1, BorderLayout.NORTH);
        
        lblNewLabel_2 = new JLabel(" ");
        panel_1.add(lblNewLabel_2, BorderLayout.SOUTH);
        
        panel_2 = new JPanel();
        panel_2.setOpaque(false);
        panel_1.add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new BorderLayout(0, 0));
        
        textField = new JTextField();
        panel_2.add(textField, BorderLayout.WEST);
        textField.setColumns(10);
        
        panel_3 = new JPanel();
        panel_3.setOpaque(false);
        contentPanel.add(panel_3, BorderLayout.WEST);
        panel_3.setLayout(new BorderLayout(0, 0));
        
        panel_4 = new JPanel();
        panel_4.setOpaque(false);
        panel_3.add(panel_4, BorderLayout.NORTH);
        panel_4.setLayout(new BorderLayout(0, 15));
        
        lblNewLabel_3 = new JLabel("   Nombre vía:  ");
        panel_4.add(lblNewLabel_3, BorderLayout.WEST);
        
        textField_1 = new JTextField();
        textField_1.setColumns(9);
        panel_4.add(textField_1, BorderLayout.CENTER);
        
        panel_5 = new JPanel();
        panel_5.setOpaque(false);
        panel_4.add(panel_5, BorderLayout.SOUTH);
        panel_5.setLayout(new BorderLayout(0, 0));
        
        lblNewLabel_4 = new JLabel("   Localidad:  ");
        panel_5.add(lblNewLabel_4, BorderLayout.WEST);
        
        textField_2 = new JTextField();
        panel_5.add(textField_2, BorderLayout.CENTER);
        textField_2.setColumns(10);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            showLoginDialog();
        } else if (e.getSource() == registerButton) {
            showRegistrationDialog();
        }
    }

    private void showLoginDialog() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel usernameLabel = new JLabel("Username: ");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(usernameLabel, constraints);

        usernameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(usernameField, constraints);

        JLabel passwordLabel = new JLabel("Password: ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel, constraints);

        passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passwordField, constraints);

        JButton loginButton = new JButton("Login");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(loginButton, constraints);

        JOptionPane.showMessageDialog(this, panel, "Login", JOptionPane.PLAIN_MESSAGE);
    }

    private void showRegistrationDialog() {
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        JLabel usernameLabel = new JLabel("Username: ");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(usernameLabel, constraints);

        JTextField usernameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(usernameField, constraints);

        JLabel passwordLabel = new JLabel("Password: ");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel, constraints);

        JPasswordField passwordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passwordField, constraints);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password: ");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(confirmPasswordLabel, constraints);

        JPasswordField confirmPasswordField = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(confirmPasswordField, constraints);

        JLabel fullNameLabel = new JLabel("Full Name: ");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(fullNameLabel, constraints);

        JTextField fullNameField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(fullNameField, constraints);

        JLabel emailLabel = new JLabel("Email: ");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(emailLabel, constraints);

        JTextField emailField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(emailField, constraints);

        JLabel phoneLabel = new JLabel("Phone: ");
        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(phoneLabel, constraints);

        JTextField phoneField = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 5;
        panel.add(phoneField, constraints);

        JButton registerButton = new JButton("Register");
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(10, 10, 10, 10);
        panel.add(registerButton, constraints);

        JOptionPane.showMessageDialog(this, panel, "Register", JOptionPane.PLAIN_MESSAGE);
    }


    public static void main(String[] args) {
        new App1();
    }
}
