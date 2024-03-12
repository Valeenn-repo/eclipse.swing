package dialog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;


public class Dialog_Components extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Dialog_Components dialog = new Dialog_Components();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Dialog_Components() {
		setBounds(100, 100, 618, 453);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JLabel jlabel1_ = new JLabel();
			contentPanel.add(jlabel1_, BorderLayout.NORTH);
			jlabel1_.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		}
		{
			JLabel jlabel2_ = new JLabel();
			contentPanel.add(jlabel2_, BorderLayout.WEST);
		}
		{
			JLabel jlabel3 = new JLabel();
			contentPanel.add(jlabel3, BorderLayout.SOUTH);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 1, 0, 0));
			{
				JPanel panel = new JPanel();
				FlowLayout flowLayout = (FlowLayout) panel.getLayout();
				flowLayout.setAlignment(FlowLayout.RIGHT);
				buttonPane.add(panel);
				{
					JButton okButton = new JButton("OK");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "Datos recogidos", "", JOptionPane.WARNING_MESSAGE);
						}
						
					});
					okButton.setActionCommand("OK");
					panel.add(okButton);
				}
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
						}
					});
					cancelButton.setActionCommand("Cancel");
					panel.add(cancelButton);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JLabel lblNewLabel = new JLabel("  ");
				panel.add(lblNewLabel, BorderLayout.NORTH);
			}
			{
				JLabel lblNewLabel_1 = new JLabel(" ");
				panel.add(lblNewLabel_1, BorderLayout.SOUTH);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("  ");
				panel.add(lblNewLabel_2, BorderLayout.WEST);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("  ");
				panel.add(lblNewLabel_3, BorderLayout.EAST);
			}
			{
				JTextArea textArea = new JTextArea();
				panel.add(textArea, BorderLayout.CENTER);
			}
		}
		

	}

}