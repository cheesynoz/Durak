import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.*;  
import java.awt.event.*;  

public class GUI implements ActionListener{

    private int count = 0;
    private JFrame frame = new JFrame();
    private JLabel label = new JLabel("Number of clicks: 00");
    private JPanel panel = new JPanel();
    
    public GUI(){

        JButton button = new JButton("Click here");
        button.addActionListener(this);

        this.panel.setBorder(BorderFactory.createEmptyBorder(400, 400, 400, 400));
        this.panel.setLayout(new GridLayout(0,2));
        this.panel.add(button);
        this.label.setOpaque(true);
        this.panel.setBackground(Color.GREEN.darker().darker());
        this.panel.add(this.label);

        this.frame.add(panel, BorderLayout.CENTER);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setTitle("DURAK");
        this.frame.pack();
        this.frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.count ++;
        this.label.setText("Number of clicks: " + this.count);
    }

}
