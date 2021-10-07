//Show records
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class record extends JFrame// implements ActionListener
{
		JLabel l1,l3,l2;
		JTextArea a1;
		Connection c1;
		String cs,uid,pwd;
		String v,x;
		int u,w;
		
	public static void main(String[] args) 
	{

		record o1=new record();

	} 
	public record()
	{
		setLayout(null);
		l1=new JLabel("All Records");
		l2=new JLabel("Donar Record");
		l3=new JLabel("Receiver Record");
		a1=new JTextArea(1,18);

		l1.setBounds(100,50,200,25);	
		l2.setBounds(50,100,200,25);
		l3.setBounds(150,100,200,25);
		a1.setBounds(30,120,350,300);

		add(l1);
		add(l2);
		add(l3);
		add(a1);
		

		setVisible(true);
		setSize(400,400);
		setResizable(false);
		setLocationRelativeTo(null);


		try
		{
			Class.forName("com.mysql.jdbc.Driver");		//databaseconnection
			cs="jdbc:mysql://localhost:3306/organlabmanagement";
			uid="root";
			pwd="root";
			c1=DriverManager.getConnection(cs,uid,pwd);		//successfullyconnected
			
			String q="select rid,rname,did,dname from receiver";
			Statement st=c1.createStatement();
			ResultSet r=st.executeQuery(q);
			
			while(r.next())
			{
				u=r.getInt("rid");
				v=r.getString("rname");
				w=r.getInt("did");
				x=r.getString("dname");
				System.out.println(u+"\t"+v+"\t"+w+"\t"+x);
				a1.append(u+"\t"+v+"\t"+w+"\t"+x+"\n");
			}
			

		st.close();
		c1.close();
		
		
		}
		catch(Exception e)
		{
		}
		finally
		{
			
		}
	}
}