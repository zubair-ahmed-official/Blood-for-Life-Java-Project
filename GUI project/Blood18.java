import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Blood18 extends JFrame implements ActionListener 
{
	
		JButton l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,b2;
		JTextField t1,t2;
		//JLabel ;
		JPanel p1,p2;
		
	public Blood18()
	{
		super(" BLOOD FOR LIFE ");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.red);
		p1.setBackground(Color.red);
		p1.setLayout(null);
		
		l0 = new JButton("PROFILE");
		l0.setFont(new Font("Arial Black",Font.BOLD,50));
		l0.setForeground(Color.black);
		l0.addActionListener(this);
		l0.setBounds(750,100,550,100);
		p1.add(l0);
		
		l1 = new JButton("FIND BLOOD");
		l1.setFont(new Font("Arial Black",Font.BOLD,50));
		l1.setForeground(Color.black);
		l1.addActionListener(this);
		l1.setBounds(1320,100,550,100);
		p1.add(l1);
		
		l3 = new JButton("LOG OUT");
		l3.setFont(new Font("Arial Black",Font.BOLD,35));
		l3.setForeground(Color.black);
		l3.addActionListener(this);
		l3.setBounds(1520,580,350,80);
		p1.add(l3);
		
		/* l2 = new JButton("BACK");
		l2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		l2.setBackground(Color.blue);
		l2.setForeground(Color.white);
		l2.addActionListener(this);
		l2.setBounds(1520,780,350,80);
		p1.add(l2); */
		
		b2 = new JButton("EXIT");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b2.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setBounds(1520,900,350,50);
		b2.addActionListener(this);
		p1.add(b2);	
		
        this.add(p1);		
        //this.add(p2);
	}
	/* public static void main(String [] args)
	{
		Blood26 f1 = new Blood26();
		f1.show();
		//f1.setVisible(true);
	} 
 */
		 public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==l1)
			{
				BloodFind13 bf = new BloodFind13();
				this.setVisible(false);
				bf.setVisible(true);
			}
			else  if(ae.getSource()==l0)
			{
				Blood215 f215 = new Blood215();
				this.setVisible(false);
				f215.setVisible(true);
			}
			/* else if(ae.getSource()==l2)
			{
				Blood45 f1 = new Blood45();
				this.setVisible(false);
				f1.setVisible(true);
			} */
			else if(ae.getSource()==l3)
			{
				Blood7 f1 = new Blood7();
				this.setVisible(false);
				f1.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				System.exit(0);
			}
		} 
}
