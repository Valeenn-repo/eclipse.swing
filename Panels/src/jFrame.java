import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;

public class jFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel contentPanel1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    jFrame frame = new jFrame();
                    frame.setVisible(true);
                    frame.setSize(672, 500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public jFrame() {
        initComponents();
        
        Page1 p1 = new Page1();
        showJpanel(p1);
        Page2 p2 = new Page2();

        JButton btn1 = new JButton("Page 1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showJpanel(p1);
            }
        });
        btn1.setBounds(117, 25, 120, 30);
        contentPane.add(btn1);

        JButton btn2 = new JButton("Page 2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showJpanel(p2);
            }
        });
        btn2.setBounds(441, 25, 120, 30);
        contentPane.add(btn2);
        
       
    }

    public void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 688, 443);
        contentPane = new JPanel();
        contentPane.setBounds(new Rectangle(0, 0, 672, 600));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        contentPanel1 = new JPanel();
        contentPanel1.setSize(672, 338);
        contentPanel1.setLocation(0, 66);
        contentPane.add(contentPanel1, BorderLayout.CENTER);
        contentPanel1.setLayout(new BorderLayout(0, 0));
    }

    private void showJpanel(JPanel p) {
    	//p.setLocation(672, 330);
    	
        contentPanel1.removeAll();
        contentPanel1.add(p, BorderLayout.CENTER);
        contentPanel1.repaint();
        contentPanel1.revalidate();
    }
}
