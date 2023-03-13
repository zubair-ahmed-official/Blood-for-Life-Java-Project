import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BloodLogin8 extends JFrame implements ActionListener
{
		JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField t1,t2,t3,t4,t5,t6,t7;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		
	public BloodLogin8()
	{
		super(" BLOOD FOR LIFE ");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.red);
		p1.setBackground(Color.red);
		p1.setLayout(null);
		
		
		l1 = new JLabel("USER NAME : ");
		l1.setFont(new Font("Arial Black",Font.BOLD,40));
		l1.setForeground(Color.black);
		l1.setBounds(485,350,650,60);
		p1.add(l1);
		
		l2 = new JLabel("PASSWORD : ");
		l2.setFont(new Font("Arial Black",Font.BOLD,40));
		l2.setForeground(Color.black);
		l2.setBounds(500,450,650,60);
		p1.add(l2);
		
		t1 = new JTextField();
		t1.setFont(new Font("Calibri Light",Font.BOLD,40));
		t1.setBounds(850,350,450,60);
		p1.add(t1);

		t2 = new JTextField();
		t2.setFont(new Font("Calibri Light",Font.BOLD,40));
		t2.setBounds(850,450,450,60);
		p1.add(t2); 
		
		
		b2 = new JButton("Login");
		b2.setFont(new Font("Arial Black",Font.BOLD,35));
		b2.setForeground(Color.black);
		b2.setBackground(Color.yellow);
		b2.setBounds(1380,600,250,60);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b3.setForeground(Color.white);
		b3.setBackground(Color.blue);
		b3.setBounds(1580,800,250,60);
		b3.addActionListener(this);
		p1.add(b3);
		
		
        this.add(p1);		
        //this.add(p2);
	}


		 public void actionPerformed(ActionEvent ae)
		{
		    if(ae.getSource()==b3)
			{
				Blood7 f5 = new Blood7();
				this.setVisible(false);
				f5.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Blood18 f20 = new Blood18();
				this.setVisible(false);
				f20.setVisible(true);
			}
			//System.exit(0);
		} 
		/* public static void main(String [] args)
	{
		BloodLogin f1 = new BloodLogin();
		f1.show();
		//f1.setVisible(true);
	}  */


}

