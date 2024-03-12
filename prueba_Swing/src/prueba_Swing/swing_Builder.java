package prueba_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class swing_Builder {

	protected JFrame frmSwing;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing_Builder window = new swing_Builder();
					window.frmSwing.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public swing_Builder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSwing = new JFrame();
		frmSwing.setTitle("Swing");
		frmSwing.setBounds(100, 100, 771, 437);
		frmSwing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSwing.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmSwing.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		frmSwing.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("boton1");
		panel.add(btnNewButton);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		JLabel lblNewLabel = new JLabel("No se ha presionado nada");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_2.setForeground(new Color(128, 0, 255));
		panel_2.setBackground(new Color(128, 128, 192));
		panel_1.add(panel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(0, 255, 255));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button1");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(128, 255, 255));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(10);
		slider.setValueIsAdjusting(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		
		JButton btnNewButton_4 = new JButton("volver");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showInternalConfirmDialog(null, "confirmado", "información", JOptionPane.OK_CANCEL_OPTION);
				if (choice == JOptionPane.OK_OPTION) {
				    Dialogo_Prueba window = new Dialogo_Prueba();
				    window.setLocationRelativeTo(null);
				    window.setVisible(true);
				    frmSwing.dispose();
				}

			}
		});
		
		JButton btnNewButton_5 = new JButton("nueva pagina");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				        int choice = JOptionPane.showInternalConfirmDialog(null, "confirmado", "información", JOptionPane.OK_CANCEL_OPTION);
				        if (choice == JOptionPane.OK_OPTION) {
				            swing_Builder window = new swing_Builder();
				            window.frmSwing.setLocationRelativeTo(null);
				            window.frmSwing.setVisible(true);
				            frmSwing.dispose();
				        }
				   

			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(162, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(rdbtnNewRadioButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(rdbtnNewRadioButton_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(112))
				.addComponent(separator, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(81, Short.MAX_VALUE)
					.addComponent(slider, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(148, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(98))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(170, Short.MAX_VALUE)
					.addComponent(btnNewButton_4)
					.addGap(18)
					.addComponent(btnNewButton_5)
					.addGap(41))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(22)
					.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_5)
						.addComponent(btnNewButton_4))
					.addGap(23))
		);
		panel_2.setLayout(gl_panel_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Se ha presionado el botón 1");
			}
		});
		
		JButton btnNewButton_1 = new JButton("boton2");
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Se ha presionado el botón 2");
			}
		});
		
		
		JButton btnNewButton_2 = new JButton("boton3");
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Se ha presionado el botón 3");
			}
		});
		
		
		JButton btnNewButton_3 = new JButton("boton4");
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Se ha presionado el botón 4");
			}
		});
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_1.setText("Ha seleccionado " + slider.getValue());
			}
		});	
	}
}
