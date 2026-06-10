<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Sistem Login Inventory</title>
  </head>
  <body>
    <h2>Silahkan Login</h2>
    <form method="post" action="LoginServlet">
      Username: <input type="text" name="user" /><br /><br />
      Password: <input type="password" name="pass" /><br /><br />
      <input type="submit" value="Login" />
    </form>
  </body>
</html>
