package jDialogComponents;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import components.Jlabel1_;
import java.awt.GridLayout;
import components.Jlabel2_;
import components.Jlabel3;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Prueba_Components extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Prueba_Components dialog = new Prueba_Components();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Prueba_Components() {
		setBounds(100, 100, 618, 453);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			Jlabel1_ jlabel1_ = new Jlabel1_();
			contentPanel.add(jlabel1_, BorderLayout.NORTH);
			jlabel1_.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		}
		{
			Jlabel2_ jlabel2_ = new Jlabel2_();
			contentPanel.add(jlabel2_, BorderLayout.WEST);
		}
		{
			Jlabel3 jlabel3 = new Jlabel3();
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
