package princi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import components.Jlabel1_;
import components.Jlabel2_;
import components.Jlabel3;

public class ventana {

	private JFrame frmPrueba;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frmPrueba.setSize(400, 300);
					window.frmPrueba.setLocationRelativeTo(null);
					window.frmPrueba.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrueba = new JFrame();
		
		Jlabel1_ jlabel1_ = new Jlabel1_();
		frmPrueba.getContentPane().add(jlabel1_, BorderLayout.NORTH);
		
		Jlabel2_ jlabel2_ = new Jlabel2_();
		frmPrueba.getContentPane().add(jlabel2_, BorderLayout.WEST);
		
		Jlabel3 jlabel3 = new Jlabel3();
		frmPrueba.getContentPane().add(jlabel3, BorderLayout.SOUTH);
	}

}
