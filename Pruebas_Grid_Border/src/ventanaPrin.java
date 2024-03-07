import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaPrin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textField_1;
	protected JComboBox<?> comboBox = new JComboBox();
	register_panel panel = new register_panel();
	//registro reg = new registro();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrin frame = new ventanaPrin();
					frame.setVisible(true);
					frame.setSize(1150, 750);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaPrin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Descargas\\irradiacion-de-alimentos (1).png"));
		setTitle("SmartHouse");
		inicializarComps();
		
	}

	private void inicializarComps() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(new Color(255, 255, 255));
		panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.menu);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\Descargas\\2b072e99a37a44609089640290e314db.png"));
		panelSuperior.add(lblNewLabel);
		
		JPanel panelLogin = new JPanel();
		panelLogin.setOpaque(false);
		panelSuperior.add(panelLogin, BorderLayout.EAST);
		panelLogin.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("  ");
		panelLogin.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		panelLogin.add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("      ");
		panelLogin.add(lblNewLabel_3, BorderLayout.EAST);
		
		JPanel panelGridLogin = new JPanel();
		panelGridLogin.setOpaque(false);
		panelLogin.add(panelGridLogin, BorderLayout.CENTER);
		panelGridLogin.setLayout(new GridLayout(2, 4, 15, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Tipo:");
		panelGridLogin.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nombre:");
		panelGridLogin.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Contraseña:");
		panelGridLogin.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("  ");
		panelGridLogin.add(lblNewLabel_7);
		
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Admin", "Visitante"}));
		panelGridLogin.add(comboBox);
		
		textFieldNombre = new JTextField();
		panelGridLogin.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textField_1 = new JTextField();
		panelGridLogin.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipoSeleccionado = getComboBoxString();

		        if ("Seleccione".equals(tipoSeleccionado)) {
		            JOptionPane.showMessageDialog(null, "Seleccione un tipo de usuario.", "", JOptionPane.WARNING_MESSAGE);
		        }else if(textFieldNombre.getText().isEmpty()){
		        	JOptionPane.showMessageDialog(null, "Introduzca el nombre", "", JOptionPane.WARNING_MESSAGE);
		        }else if(textField_1.getText().isEmpty()){
		        	JOptionPane.showMessageDialog(null, "Introduzca la contraseña", "", JOptionPane.WARNING_MESSAGE);
		        }
		        else {
		            int result = JOptionPane.showConfirmDialog(
		                null,
		                "Inicio correcto. ¿Confirmar?",
		                "",
		                JOptionPane.YES_NO_OPTION
		            );

		            if (result == JOptionPane.YES_OPTION) {
		                registro reg = new registro();
		                reg.setCampos(tipoSeleccionado, getNombre());  // Pasar el valor seleccionado del JComboBox
		                reg.setVisible(true);
		                
		                dispose();
		            }
		        }
			}
		});
		panelGridLogin.add(btnNewButton);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(new Color(255, 255, 255));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_9 = new JLabel("Desarrollado por: Valentín Sánchez");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.ITALIC, 12));
		panelInferior.add(lblNewLabel_9);
		
		JPanel panelCentro = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelCentro.getLayout();
		flowLayout.setVgap(15);
		flowLayout.setHgap(10);
		panelCentro.setBackground(SystemColor.inactiveCaptionBorder);
		panelPrincipal.add(panelCentro, BorderLayout.CENTER);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setIcon(new ImageIcon("D:\\Descargas\\icon-3317467_1280.png"));
		panelCentro.add(lblNewLabel_8);
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setOpaque(false);
		panelFormulario.setPreferredSize(new Dimension(500, 400));
		panelCentro.add(panelFormulario);
		panelFormulario.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(SystemColor.inactiveCaptionBorder);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(null);
		scrollPane.setBounds(0, 90, 500, 300);
		panel = new register_panel();
		GridLayout gridLayout = (GridLayout) panel.getLayout();
		gridLayout.setVgap(25);
		scrollPane.setViewportView(panel);
		panelFormulario.add(scrollPane);
		
		JLabel lblNewLabel_10 = new JLabel("Registro \u2705");
		lblNewLabel_10.setFont(new Font("Arial Unicode MS", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_10.setBounds(201, 0, 172, 68);
		panelFormulario.add(lblNewLabel_10);
		
		
		
	}
	
	public String getComboBoxString() {
		return comboBox.getSelectedItem().toString();
	}
	public String getNombre() {
		return textFieldNombre.getText();
	}
	
}
