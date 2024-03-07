import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JSeparator;

public class registro {

	private JFrame frmSmarthouse;
	private JLabel labelCombo;
	private JLabel labelNombre;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro window = new registro();
					window.frmSmarthouse.setVisible(true);
					window.frmSmarthouse.setSize(1400, 825);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSmarthouse = new JFrame();
		frmSmarthouse.setTitle("SmartHouse");
		frmSmarthouse.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Descargas\\irradiacion-de-alimentos (1).png"));
		frmSmarthouse.setBounds(100, 100, 1052, 863);
		frmSmarthouse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		frmSmarthouse.getContentPane().add(panelPrincipal, BorderLayout.NORTH);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(Color.WHITE);
		panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Descargas\\2b072e99a37a44609089640290e314db.png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.menu);
		panelSuperior.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setOpaque(false);
		panelSuperior.add(panelLogin, BorderLayout.SOUTH);
		panelLogin.setLayout(new BorderLayout(50, 5));
		
		JLabel lblNewLabel_1 = new JLabel("  ");
		panelLogin.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		panelLogin.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("      ");
		panelLogin.add(lblNewLabel_3, BorderLayout.WEST);
		
		JPanel panelGridLogin = new JPanel();
		panelGridLogin.setOpaque(false);
		panelLogin.add(panelGridLogin, BorderLayout.CENTER);
		panelGridLogin.setLayout(new GridLayout(0, 3, 150, 10));
		
		JLabel lblNewLabel_4 = new JLabel("Tipo:");
		panelGridLogin.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre:");
		panelGridLogin.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("  ");
		panelGridLogin.add(lblNewLabel_7);
		
		labelCombo = new JLabel("");
		labelCombo.setFont(new Font("Verdana", Font.ITALIC, 20));
		panelGridLogin.add(labelCombo);
		
		labelNombre = new JLabel(" ");
		labelNombre.setFont(new Font("Verdana", Font.ITALIC, 20));
		panelGridLogin.add(labelNombre);
		
		JPanel panelSesion = new JPanel();
		panelSesion.setOpaque(false);
		panelGridLogin.add(panelSesion);
		panelSesion.setLayout(new BorderLayout(100, 0));
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesión");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSmarthouse.dispose();
				ventanaPrin prin = new ventanaPrin();
				prin.setVisible(true);
				prin.setSize(1400, 800);
				
			}
			
			
		});
		panelSesion.add(btnCerrarSesin, BorderLayout.CENTER);
		
		JLabel lblNewLabel_11 = new JLabel("");
		panelSesion.add(lblNewLabel_11, BorderLayout.EAST);
		
		JPanel panelWest = new JPanel();
		frmSmarthouse.getContentPane().add(panelWest, BorderLayout.CENTER);
		panelWest.setLayout(new GridLayout(1, 0, 30, 90));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon("D:\\Descargas\\icon-3317467_1280.png"));
		panelWest.add(lblNewLabel_6);
		
		JPanel panelEast = new JPanel();
		frmSmarthouse.getContentPane().add(panelEast, BorderLayout.SOUTH);
		panelEast.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panelEast.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new GridLayout(0, 5, 20, 0));
		
		JLabel label = new JLabel("");
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		panel_1.add(label_1);
		
		JButton btnNewButton = new JButton("Administrar Vivienda");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        JOptionPane.showMessageDialog(null, "Orden realizada", "", JOptionPane.WARNING_MESSAGE);
		        
			}
		});
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_10 = new JLabel("");
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		panel_1.add(lblNewLabel_8);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(64, 0, 64));
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(64, 0, 64));
		panel_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(64, 0, 64));
		panel_1.add(separator_2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(64, 0, 64));
		panel_1.add(separator_4);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(64, 0, 64));
		panel_1.add(separator_3);
		
		JLabel label_2 = new JLabel("");
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		panel_1.add(label_3);
		
		JLabel lblNewLabel_9 = new JLabel("     Desarrollado por: Valentín Sánchez");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.ITALIC, 12));
		panel_1.add(lblNewLabel_9);
	}

	public void setVisible(boolean b) {
		frmSmarthouse.setVisible(true);
		frmSmarthouse.setSize(1400, 825);
		frmSmarthouse.setLocationRelativeTo(null);
		
	}
	
    // Otros atributos y métodos

    public void setCampos(String tipoUsuario, String nombre) {
    	labelCombo.setText(tipoUsuario);
        labelNombre.setText(nombre);
    }

}
