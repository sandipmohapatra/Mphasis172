import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class register extends HttpServlet
 {
PreparedStatement st=null;
Connection con=null;
public void init()
{
System.out.println("init");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1234");

}
catch(Exception ae)
{}
}

    public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
       
	String a=req.getParameter("t1");
	String b=req.getParameter("t2");
	String c=req.getParameter("t3");
	String d=req.getParameter("t4");
	String e=req.getParameter("t5");
	String f=req.getParameter("t6");
	 String g=req.getParameter("t7");
	String h=req.getParameter("t8");
 try 
{

st=con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?)");
	st.setString(1,a);
	st.setString(2,b);
	st.setString(3,c);
	st.setString(4,d);
	st.setString(5,e);
	st.setString(6,f);
	st.setString(7,g);
	st.setString(8,h);

	st.execute();
}
catch(Exception at)
{}
             res.sendRedirect("login.html");
	
            out.println("</body>");
            out.println("</html>");
              } 

 
}