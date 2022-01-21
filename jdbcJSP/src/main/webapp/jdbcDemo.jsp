<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%	
	String url = "jdbc:mysql://localhost:3306/demo";
	String name= "root";
	String pass= "08121999";
	String query = "SELECT * FROM users WHERE id = 2";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,name,pass);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	rs.next();
%>

Name: <%= rs.getString(2) %><br>
mail id: <%= rs.getString(3) %><br>
country: <%= rs.getString(4) %>




</body>
</html>