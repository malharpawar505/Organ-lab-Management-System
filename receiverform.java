//RECEIVER FORM
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class receiverform extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	String d1="",d2="",d3="",d4="",d5="",d6="",d7="",d9="";
	JComboBox c1,c2,c3,c4,c5,c6,c7;
	JRadioButton r1,r2,r3;
	JButton b1,b2,b4;
	ButtonGroup b3;
	Connection c=null;
	Font f;
	
	String a[]={"A+","B+","AB+","O+","A-","B-","AB-","O-"};			//C1 BLOODGROUP
	String a2[]={"PUNE","MUMBAI","AURANGABAD","NAGPUR","JAIPUR","UDAIPUR","KOTA","SURAT","AHMEDABAD","RAJKOT","DWARKA","KOCHI","KANNUR","KOLLAM","MUNNAR"};		//CITY
	String a1[]={"MAHARASHTRA","RAJASTHAN","GUJARAT","KERALA"};		//STATE
	String a4[]={"KIDNEY","HEART","PANCREAS","EYES","LIVER","PLASMA","BONE-MARROW"};	//ORGAN TO RECEIVE
	
	int rn;

	/*public static void main(String [] args)
	{
		receiverform org1= new receiverform();
	}*/
	public receiverform()
	{
		String cs,uid,pwd;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			cs="jdbc:mysql://localhost:3306/organlabmanagement";
			uid="root";
			pwd="root";
			c=DriverManager.getConnection(cs,uid,pwd);		//CONNETION SUCCESSFULLY

			//Quary for count rid
			String q="select count(*) as rid from receiver";
			Statement st=c.createStatement();
			ResultSet r=st.executeQuery(q);
			r.next();
			rn=r.getInt("rid");
			System.out.println(rn);
			
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			
		}
		
		f=new Font("Arial",Font.BOLD,15);
		l16=new JLabel(new ImageIcon("dobag.jpg"));
	
		l1=new JLabel("Receiver ID	:    ");
		l1.setFont(f);

		l2=new JLabel("Enter Receiver Name	:");
		l2.setFont(f);

		l3=new JLabel("Enter Receiver Age	:");
		l3.setFont(f);

		l4=new JLabel("Blood Group			:");
		l4.setFont(f);

		l5=new JLabel("Any  Diesease		:");
		l5.setFont(f);

		l6=new JLabel("Address              :");
		l6.setFont(f);

		l8=new JLabel("City					:");
		l8.setFont(f);

		l7=new JLabel("State				:");
		l7.setFont(f);

		l10=new JLabel("Request Date		:");
		l10.setFont(f);

		l11=new JLabel("Gender				:");
		l11.setFont(f);

		l12=new JLabel("Phone NO			:");
		l12.setFont(f);

		l13=new JLabel("Request Organ		:");
		l13.setFont(f);

		l14=new JLabel("Enter Donar Id		:");
		l14.setFont(f);

		l15=new JLabel("Donar Name			:");
		l15.setFont(f);

		
		
		t1=new JTextField(""+(rn+1));		//counted rid
		t1.setEnabled(false);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		t6=new JTextField(20);
		t7=new JTextField(20);
		
		
		c1=new JComboBox(a);
		c1.setFont(f);
		c1.setForeground(Color.black);

		c2=new JComboBox(a1);
		c2.setFont(f);
		c2.setForeground(Color.black);

		c3=new JComboBox(a2);
		c3.setFont(f);
		c3.setForeground(Color.black);

		c5=new JComboBox(a4);
		c5.setFont(f);
		c5.setForeground(Color.black);

		c6=new JComboBox();
		c6.setFont(f);
		c6.setForeground(Color.black);

		c7=new JComboBox();
		c7.setFont(f);
		c7.setForeground(Color.black);

		r1=new JRadioButton("Male");
		r1.setFont(f);
		r1.setForeground(Color.black);

		r2=new JRadioButton("Female");
		r2.setFont(f);
		r2.setForeground(Color.black);

		r3=new JRadioButton("Other");
		r3.setFont(f);
		r3.setForeground(Color.black);
		
		b1=new JButton("Submit");
		b1.setFont(f);
		b1.setForeground(Color.black);

		b2=new JButton("Clear");
		b2.setFont(f);
		b2.setForeground(Color.black);

		b4=new JButton("Back");
		b4.setFont(f);
		b4.setForeground(Color.black);
		
		b3= new ButtonGroup();			//Buttongroup for radio button

		setTitle("RECEIVER FORM");
		
		setLayout(null);
		
	

		l13.setBounds(30,30,130,25);		//Request Organ
		l14.setBounds(30,70,130,25);		//Donar ID
		l1.setBounds(30,110,130,25);		//Receiver ID
		l2.setBounds(30,150,200,25);		//Receiver Name
		l3.setBounds(30,190,200,25);		//Receiver Age
		l11.setBounds(30,230,130,25);		//Gender
		l4.setBounds(30,270,200,25);		//Blood Group 
		l5.setBounds(30,310,130,25);		//Diesease
		l6.setBounds(30,350,130,25);		//Address
		l7.setBounds(30,390,130,25);		//State
		l8.setBounds(30,430,130,25);		//City 
		l10.setBounds(30,470,200,25);		//Request Date
		l12.setBounds(30,510,130,25);		//Phone NO  
		l15.setBounds(30,550,200,25);		//Donar Name
		l16.setBounds(0,0,500,800);			//Image

	

		t1.setBounds(200,110,130,25);		//Receiver ID
		t2.setBounds(200,150,130,25);		//Receiver Name
		t3.setBounds(200,190,130,25);		//Receiver Age
		t4.setBounds(200,310,130,25);		//Diesease
		t5.setBounds(200,350,130,25);		//Address
		t6.setBounds(200,470,130,25);		//Request Date
		t7.setBounds(200,510,130,25);		//Phone NO 
		

		c1.setBounds(200,270,130,25);		//Bloodgroup
		c2.setBounds(200,390,130,25);		//state
		c3.setBounds(200,430,130,25);		//City
		c5.setBounds(200,30,130,25);		//organ received 
		c6.setBounds(200,70,130,25);		//Donar ID
		c7.setBounds(200,550,130,25);      //Donarname
		
		

		r1.setBounds(195,230,70,25);		//Male
		r2.setBounds(290,230,70,25);		//Female
		r3.setBounds(400,230,70,25);		//Other

		b1.setBounds(200,600,100,50);		//Submit
		b2.setBounds(320,600,100,50);		//Clear
		b4.setBounds(80,600,100,50);		//Back
		
		add(l1);		//Receiver ID
		add(t1);

		add(l2);		//Receiver Name
		add(t2);

		add(l3);		//Receiver Age
		add(t3);

		add(l11);		//Gender
		b3.add(r1);
		b3.add(r2);
		b3.add(r3);
		
		add(r1);
		add(r2);
		add(r3);
		
		add(l4);		//Blood Group 
		add(c1);

		add(l5);		//Diesease
		add(t4);

		add(l6);		//Address
		add(t5);
		
		add(l7);		//State
		add(c2);
		
		add(l8);		//City
		add(c3);

		add(l10);		//Request Date
		add(t6);

		add(l12);		//Phone No
		add(t7);
		
		add(l13);		//Organ received
		add(c5);

		add(l14);		//Donar ID
		add(c6);

		add(l15);			//Donar name
		add(c7);
		
		add(b1);		//Submit
		add(b2);		//Clear
		add(b4);		//Back
		b1.setEnabled(false);

		add(l16);

		setSize(500,800);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		

		b1.addActionListener(this);
		b2.addActionListener(this);
		b4.addActionListener(this);
		c5.addActionListener(this);
		c6.addActionListener(this);
	}

	String bg="",dn;	//bg=pblood variable & dn=pname

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==c5)			//Organ Receiver ComboBox
		{
			c6.removeAllItems();	//To clear all ID 
			try
			{
				
				int k,v=0;		//k for rid and v for organ available
				String o=(c5.getItemAt(c5.getSelectedIndex())).toString();		//To convert combobox in string 

				//Quary to compare rid and bloodgroup
				String q="select rid ,pblood from registration where porgan='"+o+"' and status='n'";
				Statement st=c.createStatement();
				ResultSet r=st.executeQuery(q);		//to get rid and bloodgroup from registration
				while(r.next())
				{
					v=1;
					k=r.getInt("rid");
					bg=r.getString("pblood");
					System.out.println(k);
					c6.addItem(""+k);
				}
				if(v==0)
				{
					JOptionPane.showMessageDialog(this,"Organ is not available");
						b1.setEnabled(false);
				}
				else
						b1.setEnabled(true);

			}
			catch (Exception ex)
			{
				System.out.println(ex);
			}
			finally
			{
			
			}
			
		}
		
		if(e.getSource()==c6)			//ID Receiver ComboBox
		{
			c7.removeAllItems();  //To clear all names 
			try
			{
				
				String o=(c6.getItemAt(c6.getSelectedIndex())).toString();		//To convert combobox in string 

				//Quary to get name
				String q="select pname from registration where rid='"+o+"' and status='n'";
				Statement st=c.createStatement();
				ResultSet r=st.executeQuery(q);		
				while(r.next())
				{
					dn=r.getString("pname");
					System.out.println(dn);
					c7.addItem(""+dn);
				}
				
			}
			catch (Exception ex)
			{
				System.out.println(ex);
			}
			finally
			{
			
			}
			
		}

		if(e.getSource()==b1)		//Submit Button
		{
			//Message for null textbox

			if(t2.getText().equals(""))
				JOptionPane.showMessageDialog(this,"Please Enter Your Name: ");
			else if(t3.getText().equals(""))
				JOptionPane.showMessageDialog(this,"Please Enter age: ");
			else if(r1.isSelected()==false &&r2.isSelected()==false&&r3.isSelected()==false)
				JOptionPane.showMessageDialog(this,"Please Select Gender: "); 
			else if(t4.getText().equals(""))
				JOptionPane.showMessageDialog(this,"Please Enter Disease: ");
			else if(t5.getText().equals(""))
				JOptionPane.showMessageDialog(this,"Please Enter Address: ");			
			else if(t6.getText().equals(""))
				JOptionPane.showMessageDialog(this,"Please Enter Request Date: ");
			else if(t7.getText().equals(""))
				JOptionPane.showMessageDialog(this,"Please Enter  Phone Number: ");
			else
			{


				d7=t7.getText();		//ph no varification
				System.out.println("Ph no="+d7);
				if(d7.length()<10 ||d7.length()>10)
					JOptionPane.showMessageDialog(this,"Please Enter valid Phone Number: ");
				else
				{	
					
					//Donar name
					d9=(c7.getItemAt(c7.getSelectedIndex())).toString();
					System.out.println(" donar name"+d9);

					String m7=""; //Donar id	
					m7=(c6.getItemAt(c6.getSelectedIndex())).toString();
					System.out.println(" donar id"+m7);
					

					rn=Integer.parseInt(t1.getText());		//rid
					System.out.println("rid"+rn);

					d2=t2.getText();						//name
					System.out.println("rname="+d2);

					d3=t3.getText();						//age
					System.out.println("rage="+d3);

					String m1="";							//gender
					if(r1.isSelected())
							m1="Male";
					else if(r2.isSelected())
							m1="FeMale";
					else if(r3.isSelected())
							m1="Other";
					
					String m2="",m3="",m4="",m5="";				//bloodgroup
					m2=(c1.getItemAt(c1.getSelectedIndex())).toString();
					System.out.println(" "+m2);

					d4=t4.getText();						//disease
					System.out.println("disease="+d4);

					d5=t5.getText();						//address
					System.out.println("Address="+d5);

					m3=(c2.getItemAt(c2.getSelectedIndex())).toString();	//state
					System.out.println(" Your state is:"+m3);

					m4=(c3.getItemAt(c3.getSelectedIndex())).toString();	//city
					System.out.println(" Your City is:"+m4);

					m5=(c5.getItemAt(c5.getSelectedIndex())).toString();	//organ
					System.out.println(" Organ you Want:"+m5);

					d6=t6.getText();						//date
					System.out.println("rdate="+d6);
					try
					{
						
								//compare for the blood group
						if(m2.compareTo(bg)==0)
						{
							//Quary for insert data
							String p="insert into receiver values("+t1.getText()+",'"+d2+"',"+d3+",'"+m1+"','"+m2+"','"+d4+"','"+d5+"','"+m3+"','"+m4+"','"+m5+"',STR_TO_DATE('"+d6+"','%d/%m/%Y')"+",'"+d7+"','y',"+m7+",'"+d9+"')";
							Statement st=c.createStatement();
							st.executeUpdate(p);
							System.out.println("Record saved succesfully");

							//Quary for update status
							p="update registration set status ='Y' where rid="+(c6.getItemAt(c6.getSelectedIndex())).toString()+""; 
							st=c.createStatement();
							st.executeUpdate(p);
							System.out.println("updated succesfully");	
							JOptionPane.showMessageDialog(this,"Appointment Confirmed");
							st.close();
							c.close();
						}
					    
						else
							JOptionPane.showMessageDialog(this,"Blood Group Does't Match");
					}
					catch(Exception ex)
					{
						System.out.println(ex);
					}
					finally
					{
					}
			
				}	
			}		
			
		}
		else if(e.getSource()==b2)		//Clear Button
		{
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
		}
		else if(e.getSource()==b4)		//Back Button
		{
			selectionform or1=new selectionform();//selectionform
			this.hide();
		}
		
	}
}