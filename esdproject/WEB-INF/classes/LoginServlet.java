import java.sql.*;
import java.util.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet
{
Connection con;
PreparedStatement pstmt;
ResultSet rs;
public void service(HttpServletRequest req,HttpServletResponse res)
throws IOException{
PrintWriter out=res.getWriter();
res.setContentType("text/html");
System.out.println("Inside service...");
String email=req.getParameter("email");
String psw=req.getParameter("psw");
System.out.println(email+"  "+psw);
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");
//String vsql="select * from userdetails where uname=? and pwd=?";
String sql="insert into userdetails values(?,?)";
pstmt=con.prepareStatement(sql);
//set the uname and pwd values
pstmt.setString(1,email);
pstmt.setString(2,psw);
rs=pstmt.executeQuery();
out.println("<html><body bgcolor=green>");
out.println("<h2 align=center");
if(rs.next()){
out.println("Login success");
}
else{
out.println("Invalid credentials");
}
}
catch(Exception e){ System.out.println(e);
}
}
}

