import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;

public class register_panel extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	private JLabel nameLabel;
	private JTextField nameField;
	
    private JLabel emailLabel; 
    private JTextField emailField;

    private JLabel passwordLabel;
    private JPasswordField passwordField;

    private JLabel confirmLabel;
    private JPasswordField confirmField;

  private JButton registerButton;
  private JLabel lblNewLabel;
  private JLabel lblNewLabel_1;
  private JLabel lblNewLabel_2;
	public register_panel() {
		setBackground(SystemColor.inactiveCaptionBorder);
		GridLayout gridLayout = new GridLayout(0,2);
		gridLayout.setVgap(20);
		setLayout(gridLayout);

	    // Name
	    nameLabel = new JLabel("Nombre:");
	    nameLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
	    nameField = new JTextField(20);
	    add(nameLabel);
	    add(nameField);

	    // Email
	    emailLabel = new JLabel("Email:");
	    emailLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
	    emailField = new JTextField(20); 
	    add(emailLabel);
	    add(emailField);

	    // Password
	    passwordLabel = new JLabel("Contraseña:");
	    passwordLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
	    passwordField = new JPasswordField(20);
	    add(passwordLabel); 
	    add(passwordField);

	    // Confirm password
	    confirmLabel = new JLabel("Confirmar Contraseña:");
	    confirmLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 13));
	    confirmField = new JPasswordField(20);
	    add(confirmLabel);
	    add(confirmField);

	    // Register button
	    registerButton = new JButton("Registrarte");
	    registerButton.addActionListener(new RegisterListener());
	    
	    lblNewLabel_1 = new JLabel(" ");
	    add(lblNewLabel_1);
	    
	    lblNewLabel = new JLabel("  ");
	    add(lblNewLabel);
	    
	    lblNewLabel_2 = new JLabel(" ");
	    add(lblNewLabel_2);
	    add(registerButton);


	}
	private class RegisterListener implements ActionListener {

	    @SuppressWarnings("deprecation")
		@Override
	    public void actionPerformed(ActionEvent e) {
	    	if(nameField.getText().isEmpty() ||  emailField.getText().isEmpty()||  passwordField.getText().isEmpty()||  confirmField.getText().isEmpty()) {
	    		JOptionPane.showMessageDialog(null, "Introduzca todos los campos.", "", JOptionPane.WARNING_MESSAGE);
	    	}else if(!(passwordField.getText().equals(confirmField.getText()))) {
    			JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "", JOptionPane.WARNING_MESSAGE);
	    	}else {
	    	int result = JOptionPane.showConfirmDialog(
	    			null,
	    			"Registro correcto. ¿Confirmar?",
	    			"",
	    			JOptionPane.YES_NO_OPTION
			);

			if(result == JOptionPane.YES_OPTION) {
			  // continue
			}
	    }

	  }

	}
	
}
