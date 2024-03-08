package princi;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class dialog_prueba extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialog_prueba dialog = new dialog_prueba();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public dialog_prueba() {
		setBounds(100, 100, 830, 556);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		contentPanel.setLayout(new BorderLayout(0, 20));
		{
			JLabel lblNewLabel_1 = new JLabel("label2:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			contentPanel.add(lblNewLabel_1, BorderLayout.WEST);
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 20));
			{
				JLabel lblNewLabel_4 = new JLabel("                                                                        ");
				lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(lblNewLabel_4, BorderLayout.EAST);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("   ");
				panel.add(lblNewLabel_3, BorderLayout.WEST);
			}
			{
				JLabel lblNewLabel_2 = new JLabel(" ");
				panel.add(lblNewLabel_2, BorderLayout.SOUTH);
			}
			{
				JLabel lblNewLabel = new JLabel(" ");
				panel.add(lblNewLabel, BorderLayout.NORTH);
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"hola", "adios"}));
					panel_1.add(comboBox, BorderLayout.WEST);
				}
			}
		}
		{
			JPanel panelLabel1 = new JPanel();
			contentPanel.add(panelLabel1, BorderLayout.NORTH);
			panelLabel1.setLayout(new BorderLayout(10, 20));
			{
				JLabel lblNewLabel_5 = new JLabel("label1:");
				lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
				panelLabel1.add(lblNewLabel_5, BorderLayout.WEST);
			}
			{
				JLabel lblNewLabel_6 = new JLabel(" ");
				panelLabel1.add(lblNewLabel_6, BorderLayout.NORTH);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("                                                     ");
				panelLabel1.add(lblNewLabel_7, BorderLayout.EAST);
			}
			{
				JLabel lblNewLabel_8 = new JLabel(" ");
				panelLabel1.add(lblNewLabel_8, BorderLayout.SOUTH);
			}
			{
				JPanel panel_1 = new JPanel();
				panelLabel1.add(panel_1, BorderLayout.CENTER);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					textField = new JTextField();
					panel_1.add(textField, BorderLayout.WEST);
					textField.setColumns(15);
				}
			}
		}
		{
			JPanel panelLabel3 = new JPanel();
			contentPanel.add(panelLabel3, BorderLayout.SOUTH);
			panelLabel3.setLayout(new BorderLayout(10, 20));
			{
				JLabel lblNewLabel_9 = new JLabel(" ");
				panelLabel3.add(lblNewLabel_9, BorderLayout.NORTH);
			}
			{
				JLabel lblNewLabel_10 = new JLabel(" ");
				panelLabel3.add(lblNewLabel_10, BorderLayout.SOUTH);
			}
			{
				JLabel lblNewLabel_11 = new JLabel("label3:");
				lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
				panelLabel3.add(lblNewLabel_11, BorderLayout.WEST);
			}
			{
				JLabel lblNewLabel_12 = new JLabel(" ");
				panelLabel3.add(lblNewLabel_12, BorderLayout.EAST);
			}
			{
				JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
				panelLabel3.add(chckbxNewCheckBox, BorderLayout.CENTER);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{
			JPanel panelTextArea = new JPanel();
			getContentPane().add(panelTextArea, BorderLayout.CENTER);
			panelTextArea.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel_13 = new JLabel(" ");
				panelTextArea.add(lblNewLabel_13, BorderLayout.NORTH);
			}
			{
				JLabel lblNewLabel_14 = new JLabel(" ");
				panelTextArea.add(lblNewLabel_14, BorderLayout.SOUTH);
			}
			{
				JLabel lblNewLabel_15 = new JLabel("     ");
				panelTextArea.add(lblNewLabel_15, BorderLayout.WEST);
			}
			{
				JLabel lblNewLabel_16 = new JLabel("    ");
				panelTextArea.add(lblNewLabel_16, BorderLayout.EAST);
			}
			{
				JTextArea textArea = new JTextArea();
				panelTextArea.add(textArea, BorderLayout.CENTER);
			}
		}
	}

}
