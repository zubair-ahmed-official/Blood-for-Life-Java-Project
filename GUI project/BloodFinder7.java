import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BloodFinder7 extends JFrame implements ActionListener
{
		JButton l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23;
		JTextField t1,t2;
		JLabel l0;
		JPanel p1,p2;
		
	public BloodFinder7()
	{
		super(" BLOOD FOR LIFE ");
		this.setSize(1920,1080);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1920,1080));
		p1.setBackground(Color.red);
		p1.setBackground(Color.red);
		p1.setLayout(null);
		
		
		l0 = new JLabel("People with O+ Blood group");
		l0.setFont(new Font("Serif",Font.BOLD,55));
		l0.setForeground(Color.white);
		l0.setBounds(85,100,850,80);
		p1.add(l0);
		
		
		p2 = new JPanel();
		p2.setSize(new Dimension(450,280));
		p2.setBackground(Color.black);
		p1.setLayout(null);
		
		l1 = new JButton("Name: ");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(35,200,150,60);
		p1.add(l1);
		
		l2 = new JButton("Zubair");
		l2.setFont(new Font("Serif",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBackground(Color.yellow);
		l2.setBounds(185,200,220,60);
		p1.add(l2);
		
		l3 = new JButton("Blood Group: ");
		l3.setFont(new Font("Serif",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(405,200,210,60);
		p1.add(l3);
		
		l5 = new JButton("O+");
		l5.setFont(new Font("Serif",Font.PLAIN,30));
		l5.setForeground(Color.black);
		l5.setBackground(Color.yellow);
		l5.setBounds(615,200,80,60);
		p1.add(l5);
		
		l6 = new JButton("Age:");
		l6.setFont(new Font("Serif",Font.BOLD,30));
		l6.setForeground(Color.black);
		l6.setBounds(695,200,120,60);
		p1.add(l6);
		
		l7 = new JButton("23");
		l7.setFont(new Font("Serif",Font.PLAIN,30));
		l7.setForeground(Color.black);
		l7.setBackground(Color.yellow);
		l7.setBounds(800,200,80,60);
		p1.add(l7);
		
		l8 = new JButton("Weight:");
		l8.setFont(new Font("Serif",Font.BOLD,30));
		l8.setForeground(Color.black);
		l8.setBounds(880,200,150,60);
		p1.add(l8);
		
		l9 = new JButton("65");
		l9.setFont(new Font("Serif",Font.PLAIN,30));
		l9.setForeground(Color.black);
		l9.setBackground(Color.yellow);
		l9.setBounds(1030,200,80,60);
		p1.add(l9);
		
		l10 = new JButton("Location:");
		l10.setFont(new Font("Serif",Font.BOLD,30));
		l10.setForeground(Color.black);
		l10.setBounds(1100,200,160,60);
		p1.add(l10);
		
		l11 = new JButton("Dhaka");
		l11.setFont(new Font("Serif",Font.PLAIN,30));
		l11.setBackground(Color.yellow);
		l11.setForeground(Color.black);
		l11.setBounds(1250,200,140,60);
		p1.add(l11);
		
		l12 = new JButton("Phone No.:");
		l12.setFont(new Font("Serif",Font.BOLD,30));
		l12.setForeground(Color.black);
		l12.setBounds(1390,200,180,60);
		p1.add(l12); 
		
		l13 = new JButton("018695479963");
		l13.setFont(new Font("Serif",Font.PLAIN,30));
		l13.setBackground(Color.yellow);
		l13.setForeground(Color.black);
		l13.setBounds(1570,200,250,60);
		p1.add(l13);
		
		l1 = new JButton("Name: ");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(35,260,150,60);
		p1.add(l1);
		
		l2 = new JButton("Saif");
		l2.setFont(new Font("Serif",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBackground(Color.yellow);
		l2.setBounds(185,260,220,60);
		p1.add(l2);
		
		l3 = new JButton("Blood Group: ");
		l3.setFont(new Font("Serif",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(405,260,210,60);
		p1.add(l3);
		
		l5 = new JButton("O+");
		l5.setFont(new Font("Serif",Font.PLAIN,30));
		l5.setForeground(Color.black);
		l5.setBackground(Color.yellow);
		l5.setBounds(615,260,80,60);
		p1.add(l5);
		
		l6 = new JButton("Age:");
		l6.setFont(new Font("Serif",Font.BOLD,30));
		l6.setForeground(Color.black);
		l6.setBounds(695,260,120,60);
		p1.add(l6);
		
		l7 = new JButton("28");
		l7.setFont(new Font("Serif",Font.PLAIN,30));
		l7.setForeground(Color.black);
		l7.setBackground(Color.yellow);
		l7.setBounds(800,260,80,60);
		p1.add(l7);
		
		l8 = new JButton("Weight:");
		l8.setFont(new Font("Serif",Font.BOLD,30));
		l8.setForeground(Color.black);
		l8.setBounds(880,260,150,60);
		p1.add(l8);
		
		l9 = new JButton("60");
		l9.setFont(new Font("Serif",Font.PLAIN,30));
		l9.setForeground(Color.black);
		l9.setBackground(Color.yellow);
		l9.setBounds(1030,260,80,60);
		p1.add(l9);
		
		l10 = new JButton("Location:");
		l10.setFont(new Font("Serif",Font.BOLD,30));
		l10.setForeground(Color.black);
		l10.setBounds(1100,260,160,60);
		p1.add(l10);
		
		l11 = new JButton("Dhaka");
		l11.setFont(new Font("Serif",Font.PLAIN,30));
		l11.setBackground(Color.yellow);
		l11.setForeground(Color.black);
		l11.setBounds(1250,260,140,60);
		p1.add(l11);
		
		l12 = new JButton("Phone No.:");
		l12.setFont(new Font("Serif",Font.BOLD,30));
		l12.setForeground(Color.black);
		l12.setBounds(1390,260,180,60);
		p1.add(l12); 
		
		l13 = new JButton("01646203463");
		l13.setFont(new Font("Serif",Font.PLAIN,30));
		l13.setBackground(Color.yellow);
		l13.setForeground(Color.black);
		l13.setBounds(1570,260,250,60);
		p1.add(l13);
		
		l1 = new JButton("Name: ");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(35,320,150,60);
		p1.add(l1);
		
		l2 = new JButton("Nafiz");
		l2.setFont(new Font("Serif",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBackground(Color.yellow);
		l2.setBounds(185,320,220,60);
		p1.add(l2);
		
		l3 = new JButton("Blood Group: ");
		l3.setFont(new Font("Serif",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(405,320,210,60);
		p1.add(l3);
		
		l5 = new JButton("O+");
		l5.setFont(new Font("Serif",Font.PLAIN,30));
		l5.setForeground(Color.black);
		l5.setBackground(Color.yellow);
		l5.setBounds(615,320,80,60);
		p1.add(l5);
		
		l6 = new JButton("Age:");
		l6.setFont(new Font("Serif",Font.BOLD,30));
		l6.setForeground(Color.black);
		l6.setBounds(695,320,120,60);
		p1.add(l6);
		
		l7 = new JButton("35");
		l7.setFont(new Font("Serif",Font.PLAIN,30));
		l7.setForeground(Color.black);
		l7.setBackground(Color.yellow);
		l7.setBounds(800,320,80,60);
		p1.add(l7);
		
		l8 = new JButton("Weight:");
		l8.setFont(new Font("Serif",Font.BOLD,30));
		l8.setForeground(Color.black);
		l8.setBounds(880,320,150,60);
		p1.add(l8);
		
		l9 = new JButton("59");
		l9.setFont(new Font("Serif",Font.PLAIN,30));
		l9.setForeground(Color.black);
		l9.setBackground(Color.yellow);
		l9.setBounds(1030,320,80,60);
		p1.add(l9);
		
		l10 = new JButton("Location:");
		l10.setFont(new Font("Serif",Font.BOLD,30));
		l10.setForeground(Color.black);
		l10.setBounds(1100,320,160,60);
		p1.add(l10);
		
		l11 = new JButton("Dhaka");
		l11.setFont(new Font("Serif",Font.PLAIN,30));
		l11.setBackground(Color.yellow);
		l11.setForeground(Color.black);
		l11.setBounds(1250,320,140,60);
		p1.add(l11);
		
		l12 = new JButton("Phone No.:");
		l12.setFont(new Font("Serif",Font.BOLD,30));
		l12.setForeground(Color.black);
		l12.setBounds(1390,320,180,60);
		p1.add(l12); 
		
		l13 = new JButton("016461596333");
		l13.setFont(new Font("Serif",Font.PLAIN,30));
		l13.setBackground(Color.yellow);
		l13.setForeground(Color.black);
		l13.setBounds(1570,320,250,60);
		p1.add(l13);
		
		l1 = new JButton("Name: ");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(35,380,150,60);
		p1.add(l1);
		
		l2 = new JButton("Shanto");
		l2.setFont(new Font("Serif",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBackground(Color.yellow);
		l2.setBounds(185,380,220,60);
		p1.add(l2);
		
		l3 = new JButton("Blood Group: ");
		l3.setFont(new Font("Serif",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(405,380,210,60);
		p1.add(l3);
		
		l5 = new JButton("O+");
		l5.setFont(new Font("Serif",Font.PLAIN,30));
		l5.setForeground(Color.black);
		l5.setBackground(Color.yellow);
		l5.setBounds(615,380,80,60);
		p1.add(l5);
		
		l6 = new JButton("Age:");
		l6.setFont(new Font("Serif",Font.BOLD,30));
		l6.setForeground(Color.black);
		l6.setBounds(695,380,120,60);
		p1.add(l6);
		
		l7 = new JButton("36");
		l7.setFont(new Font("Serif",Font.PLAIN,30));
		l7.setForeground(Color.black);
		l7.setBackground(Color.yellow);
		l7.setBounds(800,380,80,60);
		p1.add(l7);
		
		l8 = new JButton("Weight:");
		l8.setFont(new Font("Serif",Font.BOLD,30));
		l8.setForeground(Color.black);
		l8.setBounds(880,380,150,60);
		p1.add(l8);
		
		l9 = new JButton("75");
		l9.setFont(new Font("Serif",Font.PLAIN,30));
		l9.setForeground(Color.black);
		l9.setBackground(Color.yellow);
		l9.setBounds(1030,380,80,60);
		p1.add(l9);
		
		l10 = new JButton("Location:");
		l10.setFont(new Font("Serif",Font.BOLD,30));
		l10.setForeground(Color.black);
		l10.setBounds(1100,380,160,60);
		p1.add(l10);
		
		l11 = new JButton("Sylhet");
		l11.setFont(new Font("Serif",Font.PLAIN,30));
		l11.setBackground(Color.yellow);
		l11.setForeground(Color.black);
		l11.setBounds(1250,380,140,60);
		p1.add(l11);
		
		l12 = new JButton("Phone No.:");
		l12.setFont(new Font("Serif",Font.BOLD,30));
		l12.setForeground(Color.black);
		l12.setBounds(1390,380,180,60);
		p1.add(l12); 
		
		l13 = new JButton("018679523198");
		l13.setFont(new Font("Serif",Font.PLAIN,30));
		l13.setBackground(Color.yellow);
		l13.setForeground(Color.black);
		l13.setBounds(1570,380,250,60);
		p1.add(l13);
		
		l1 = new JButton("Name: ");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.black);
		l1.setBounds(35,440,150,60);
		p1.add(l1);
		
		l2 = new JButton("Rahat");
		l2.setFont(new Font("Serif",Font.PLAIN,30));
		l2.setForeground(Color.black);
		l2.setBackground(Color.yellow);
		l2.setBounds(185,440,220,60);
		p1.add(l2);
		
		l3 = new JButton("Blood Group: ");
		l3.setFont(new Font("Serif",Font.PLAIN,30));
		l3.setForeground(Color.black);
		l3.setBounds(405,440,210,60);
		p1.add(l3);
		
		l5 = new JButton("O+");
		l5.setFont(new Font("Serif",Font.PLAIN,30));
		l5.setForeground(Color.black);
		l5.setBackground(Color.yellow);
		l5.setBounds(615,440,80,60);
		p1.add(l5);
		
		l6 = new JButton("Age:");
		l6.setFont(new Font("Serif",Font.BOLD,30));
		l6.setForeground(Color.black);
		l6.setBounds(695,440,120,60);
		p1.add(l6);
		
		l7 = new JButton("32");
		l7.setFont(new Font("Serif",Font.PLAIN,30));
		l7.setForeground(Color.black);
		l7.setBackground(Color.yellow);
		l7.setBounds(800,440,80,60);
		p1.add(l7);
		
		l8 = new JButton("Weight:");
		l8.setFont(new Font("Serif",Font.BOLD,30));
		l8.setForeground(Color.black);
		l8.setBounds(880,440,150,60);
		p1.add(l8);
		
		l9 = new JButton("76");
		l9.setFont(new Font("Serif",Font.PLAIN,30));
		l9.setForeground(Color.black);
		l9.setBackground(Color.yellow);
		l9.setBounds(1030,440,80,60);
		p1.add(l9);
		
		l10 = new JButton("Location:");
		l10.setFont(new Font("Serif",Font.BOLD,30));
		l10.setForeground(Color.black);
		l10.setBounds(1100,440,160,60);
		p1.add(l10);
		
		l11 = new JButton("Dhaka");
		l11.setFont(new Font("Serif",Font.PLAIN,30));
		l11.setBackground(Color.yellow);
		l11.setForeground(Color.black);
		l11.setBounds(1250,440,140,60);
		p1.add(l11);
		
		l12 = new JButton("Phone No.:");
		l12.setFont(new Font("Serif",Font.BOLD,30));
		l12.setForeground(Color.black);
		l12.setBounds(1390,440,180,60);
		p1.add(l12); 
		
		l13 = new JButton("0186785698");
		l13.setFont(new Font("Serif",Font.PLAIN,30));
		l13.setBackground(Color.yellow);
		l13.setForeground(Color.black);
		l13.setBounds(1570,440,250,60);
		p1.add(l13);
		
        this.add(p1);		
        //this.add(p2);
		l23 = new JButton("Back");
		l23.setFont(new Font("Comic Sans MS",Font.BOLD,35));
		l23.setForeground(Color.white);
		l23.setBackground(Color.blue);
		l23.setBounds(1580,800,250,60);
		l23.addActionListener(this);
		p1.add(l23);
	}

	 public void actionPerformed(ActionEvent ae)
		{
		    if(ae.getSource()==l23)
			{
				BloodFind13 bf = new BloodFind13();
				this.setVisible(false);
				bf.setVisible(true);
			}
		}
}














