import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class JdbcApp extends Frame implements ActionListener 
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
Button b1,b2,b3,b4;
Connection con=null;
JdbcApp()
{
	l1=new Label("empno");
	l2=new Label("name");
	l3=new Label("address");
	t1=new TextField(20);
	t2=new TextField(20);
	t3=new TextField(20);
	b1=new Button("INSERT");
	b2=new Button("UPDATE");
	b3=new Button("DELETE");
	b4=new Button("SELECT");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	setLayout(new FlowLayout());
	add(l1);add(t1);
	add(l2);add(t2);
	add(l3);add(t3);
	add(b1);add(b2);add(b3);add(b4);
}
public static void main(String[] args)
{
	JdbcApp ob=new JdbcApp();
	ob.setVisible(true);
	ob.setSize(400,400);
	
}
public void actionPerformed(ActionEvent ae) 
{
	   try
	   {
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	      con=DriverManager.getConnection
	    		  ("jdbc:oracle:thin:@localhost:1521:xe", "system", "1234");
	   }
	   catch(Exception ab)
	   {
	        ab.printStackTrace();
	   }
	        
	        if(ae.getSource()==(b1))
	        {
	        try
	        {
	    
	     PreparedStatement st=con.prepareStatement("insert into mphasisstudent values(?,?,?)");
	     String x=t1.getText();
	     String y=t2.getText();
	     String z=t3.getText();
	     int p=Integer.parseInt(x);
	     st.setInt(1,p);
	     st.setString(2,y);
	     st.setString(3,z);
	     st.execute();
	     System.out.println("one row inserted");
	   }

	        catch(Exception ab)
	        {
	             System.out.println(ab);
	        }
	        }
	        if(ae.getSource()==(b2))
	        {
	             try
	             {
	   PreparedStatement st=con.prepareStatement("update mphasisstudent set name=?,address=? where empno=?");
	     String x=t1.getText();
	     String y=t2.getText();
	     String z=t3.getText();
	     int p=Integer.parseInt(x);
	    st.setString(1,y);
	     st.setString(2,z);
	     st.setInt(3,p);
	     st.execute();
	     System.out.println("one row updated");
	             }
	             catch(Exception rt)
	             {
	                  rt.printStackTrace();
	             }          
	             
	        }

	
}

}
