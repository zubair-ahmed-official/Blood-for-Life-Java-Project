import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Blood49 extends JFrame implements ActionListener
{
		JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField t1,t2,t3,t4,t5,t6,t7;
		JButton b1,b2,b3; 
		JPanel p1,p2;
		
	public Blood49()
	{
		super(" BLOOD FOR LIFE ");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.red);
		p1.setBackground(Color.red);
		p1.setLayout(null);
		
		l0 = new JLabel("CREATE A NEW ACCOUNT ");
		l0.setFont(new Font("Arial Black",Font.BOLD,70));
		l0.setForeground(Color.green);
		l0.setBounds(180,100,1150,70);
		p1.add(l0);
		
		l1 = new JLabel("NAME : ");
		l1.setFont(new Font("Arial Black",Font.BOLD,50));
		l1.setForeground(Color.black);
		l1.setBounds(180,250,650,60);
		p1.add(l1);
		
		l2 = new JLabel("PASSWORD : ");
		l2.setFont(new Font("Arial Black",Font.BOLD,50));
		l2.setForeground(Color.black);
		l2.setBounds(180,350,650,60);
		p1.add(l2);
		
		l3 = new JLabel("BLOOD GROUP : ");
		l3.setFont(new Font("Arial Black",Font.BOLD,50));
		l3.setForeground(Color.black);
		l3.setBounds(180,450,650,60);
		p1.add(l3); 
		
		l4 = new JLabel("AGE : ");
		l4.setFont(new Font("Arial Black",Font.BOLD,50));
		l4.setForeground(Color.black);
		l4.setBounds(180,550,650,60);
		p1.add(l4);
		
		l5 = new JLabel("WEIGHT : ");
		l5.setFont(new Font("Arial Black",Font.BOLD,50));
		l5.setForeground(Color.black);
		l5.setBounds(180,650,650,60);
		p1.add(l5);
		
		l6 = new JLabel("PHONE NUMBER : ");
		l6.setFont(new Font("Arial Black",Font.BOLD,50));
		l6.setForeground(Color.black);
		l6.setBounds(180,750,650,60);
		p1.add(l6);
		 
		l7 = new JLabel("ADDRESS : ");
		l7.setFont(new Font("Arial Black",Font.BOLD,50));
		l7.setForeground(Color.black);
		l7.setBounds(180,850,650,60);
		p1.add(l7);
		
		t1 = new JTextField();
		t1.setFont(new Font("Calibri Light",Font.BOLD,50));
		t1.setBounds(820,250,650,60);
		p1.add(t1);

		t2 = new JTextField();
		t2.setFont(new Font("Calibri Light",Font.BOLD,50));
		t2.setBounds(820,350,650,60);
		p1.add(t2); 
		
		t3 = new JTextField();
		t3.setFont(new Font("Calibri Light",Font.BOLD,50));
		t3.setBounds(820,450,650,60);
		p1.add(t3);

		t4 = new JTextField();
		t4.setFont(new Font("Calibri Light",Font.BOLD,50));
		t4.setBounds(820,550,650,60);
		p1.add(t4); 
		
		t5 = new JTextField();
		t5.setFont(new Font("Calibri Light",Font.BOLD,50));
		t5.setBounds(820,650,650,60);
		p1.add(t5);

		t6 = new JTextField();
		t6.setFont(new Font("Calibri Light",Font.BOLD,50));
		t6.setBounds(820,750,650,60);
		p1.add(t6); 
		
		t7 = new JTextField();
		t7.setFont(new Font("Calibri Light",Font.BOLD,50));
		t7.setBounds(820,850,650,60);
		p1.add(t7); 
		
		b2 = new JButton("Save");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		b2.setForeground(Color.black);
		b2.setBackground(Color.green);
		b2.setBounds(1580,900,250,60);
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
				Blood7 f = new Blood7();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Blood18 f1 = new Blood18();
				this.setVisible(false);
				f1.setVisible(true);
			}
			//System.exit(0);
		} 
		 /* public static void main(String [] args)
	{
		Blood24 f1 = new Blood24();
		f1.show();
		//f1.setVisible(true);
	} 
 */

}














