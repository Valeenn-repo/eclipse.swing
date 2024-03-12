package prueba_Swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Dialogo_Prueba extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	public swing_Builder window = new swing_Builder();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dialogo_Prueba dialog = new Dialogo_Prueba();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dialogo_Prueba() {
		setBounds(100, 100, 602, 368);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panelNorth = new JPanel();
			contentPanel.add(panelNorth, BorderLayout.NORTH);
			panelNorth.setLayout(new BorderLayout(0, 0));
			{
				JPanel panelNorthCenter = new JPanel();
				panelNorth.add(panelNorthCenter, BorderLayout.CENTER);
				panelNorthCenter.setLayout(new BorderLayout(0, 0));
				{
					textField = new JTextField();
					panelNorthCenter.add(textField, BorderLayout.WEST);
					textField.setColumns(10);
				}
				{
					JPanel panel = new JPanel();
					panelNorthCenter.add(panel, BorderLayout.SOUTH);
					panel.setLayout(new BorderLayout(0, 0));
					{
						JLabel lblNewLabel_6 = new JLabel(" ");
						panel.add(lblNewLabel_6);
					}
					{
						JComboBox comboBox = new JComboBox();
						comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hola", "Adios"}));
						panel.add(comboBox, BorderLayout.WEST);
					}
					{
						JLabel lblNewLabel_10 = new JLabel(" ");
						panel.add(lblNewLabel_10, BorderLayout.NORTH);
					}
				}
			}
			{
				JPanel panel = new JPanel();
				panelNorth.add(panel, BorderLayout.WEST);
				panel.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNewLabel_5 = new JLabel("Prueba:      ");
					panel.add(lblNewLabel_5, BorderLayout.NORTH);
				}
				{
					JPanel panel_1 = new JPanel();
					panel.add(panel_1, BorderLayout.WEST);
					panel_1.setLayout(new BorderLayout(0, 0));
					{
						JLabel lblNewLabel_1 = new JLabel("Prueba:");
						lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
						lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEFT);
						panel_1.add(lblNewLabel_1, BorderLayout.WEST);
					}
					{
						JLabel lblNewLabel_11 = new JLabel(" ");
						panel_1.add(lblNewLabel_11, BorderLayout.NORTH);
					}
				}
			}
			{
				JPanel panel = new JPanel();
				panelNorth.add(panel, BorderLayout.NORTH);
				panel.setLayout(new BorderLayout(0, 0));
				{
					JLabel lblNewLabel_3 = new JLabel("Prueba:    ");
					panel.add(lblNewLabel_3, BorderLayout.WEST);
				}
				{
					JCheckBox chckbxNewCheckBox = new JCheckBox("check box");
					panel.add(chckbxNewCheckBox, BorderLayout.CENTER);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("  ");
					panel.add(lblNewLabel_4, BorderLayout.NORTH);
				}
				{
					JLabel lblNewLabel_2 = new JLabel(" ");
					panel.add(lblNewLabel_2, BorderLayout.SOUTH);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JTextArea textArea = new JTextArea();
				panel.add(textArea);
			}
			{
				JLabel lblNewLabel = new JLabel(" ");
				panel.add(lblNewLabel, BorderLayout.NORTH);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("   ");
				panel.add(lblNewLabel_7, BorderLayout.WEST);
			}
			{
				JLabel lblNewLabel_8 = new JLabel("   ");
				panel.add(lblNewLabel_8, BorderLayout.EAST);
			}
			{
				JLabel lblNewLabel_9 = new JLabel(" ");
				panel.add(lblNewLabel_9, BorderLayout.SOUTH);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showInternalMessageDialog(null,"confirmado",
								"información", JOptionPane.INFORMATION_MESSAGE);
						swing_Builder window = new swing_Builder();
						window.frmSwing.setVisible(true);
						dispose();
					}
					
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
