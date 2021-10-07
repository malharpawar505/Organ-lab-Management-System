//SELECTION FORM 
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class selectionform extends JFrame implements ActionListener  
{
	JButton b1,b2,b3;
	JLabel l1,l2;
	Connection c;
	JTextArea a1;
	Font f,f1;

	/*public static void main(String[] args) 
	{

		selectionform o2=new selectionform();

	}	*/	
	public selectionform()
	{
		f=new Font("Elephant",Font.PLAIN,14);
		f1=new Font("Arial",Font.BOLD,12);
		l2=new JLabel(new ImageIcon("secbag.jpg"));

		l1=new JLabel("SELECT THE FUNCTION YOU PERFORM");
		l1.setFont(f);

		b1=new JButton("Donar Registration Form");
		b1.setFont(f1);
		b1.setForeground(Color.black);

		b2=new JButton("Receiver Form");
		b2.setFont(f1);
		b2.setForeground(Color.black);

		b3=new JButton("Log Out");			
		b3.setFont(f1);
		b3.setForeground(Color.black);
		
		setLayout(null);
		setTitle("SELECTION FORM");
		
		
		l1.setBounds(20,50,400,25);		//FUNCTION YOU PERFORM
		l2.setBounds(0,0,400,400);		//Background Image
		b1.setBounds(30,100,300,30);	//Registration Form
		b2.setBounds(100,150,150,30);	//Receiver Form
		b3.setBounds(100,200,150,30);	//Log Out
	
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(l2);

		setSize(400,400);
		setVisible(true);
		setResizable(false);		//To Set Size Fix
		setLocationRelativeTo(null);	//center to screen


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)		//REGISTRATION FORM
		{
			registrationform s= new registrationform();//next form registration
			this.hide();
		}
		else if(e.getSource()==b2)		//RECEIVER FORM
		{
			receiverform aa1= new receiverform();//next form receiver request
			this.hide();
		}
		else if(e.getSource()==b3)		//logout
		{
			login k1=new login();
				this.hide();
		}
	}
}