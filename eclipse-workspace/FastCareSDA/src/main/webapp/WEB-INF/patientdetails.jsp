<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
 <div align="center">
  <h1>Patient Register Form</h1>
  <form action="<%= request.getContextPath() %>/PatientServlet" method="post">
   <table style="with: 80%">
    <tr>
     <td>ID</td>
     <td><input type="text" name="ID" /></td>
    </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="passcode" /></td>
    </tr>
    <tr>
     <td>Location</td>
     <td><input type="text" name="location" /></td>
    </tr>
    <tr>
     <td>Email Address</td>
     <td><input type="text" name="emailAddress" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>