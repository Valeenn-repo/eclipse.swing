import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Page2 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Page2() {
		setLayout(null);
		
		JLabel lblPgina = new JLabel("Página 2");
		lblPgina.setHorizontalTextPosition(SwingConstants.LEADING);
		lblPgina.setHorizontalAlignment(SwingConstants.CENTER);
		lblPgina.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPgina.setBounds(244, 140, 175, 31);
		add(lblPgina);

	}

}
