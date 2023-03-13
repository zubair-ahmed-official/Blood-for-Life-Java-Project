import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Blood7 extends JFrame implements ActionListener 
{
	
		JButton l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,b2;
		JTextField t1,t2;
		JLabel l0;
		JPanel p1,p2;
		
	public Blood7()
	{
		super(" BLOOD FOR LIFE ");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.red);
		p1.setBackground(Color.red);
		p1.setLayout(null);
		
		l0 = new JLabel(" BLOOD FOR LIFE ");
		l0.setFont(new Font("Serif",Font.BOLD,100));
		l0.setForeground(Color.green);
		l0.setBounds(550,100,950,160);
		p1.add(l0);
		
		l1 = new JButton("Create a new Account");
		l1.setFont(new Font("Serif",Font.PLAIN,35));
		l1.setForeground(Color.black);
		l1.addActionListener(this);
		l1.setBounds(720,400,550,50);
		p1.add(l1);
		
		l2 = new JButton("Login");
		l2.setFont(new Font("Serif",Font.PLAIN,35));
		l2.setForeground(Color.black);
		l2.addActionListener(this);
		l2.setBounds(720,480,550,50);
		p1.add(l2);
		
		b2 = new JButton("Exit");
		b2.setFont(new Font("Serif",Font.PLAIN,35));
		b2.setForeground(Color.black);
		//b2.setBackground(Color.green);
		b2.setBounds(720,560,550,50);
		b2.addActionListener(this);
		p1.add(b2);	
		
        this.add(p1);		
        //this.add(p2);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==l1)
			{
				Blood49 f = new Blood49();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==l2)
			{
				BloodLogin8 bl = new BloodLogin8();
				this.setVisible(false);
				bl.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				System.exit(0);
			}
		}
}
