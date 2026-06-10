<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String id = request.getParameter("id");
    String nama = "";
    ResultSet rs = (ResultSet) request.getAttribute("list");
    
    if (rs != null && rs.next()) {
        nama = rs.getString("nama");
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Barang</title>
</head>
<body>
    <h2>Form Perubahan Barang</h2>
    <form method="post" action="BarangServlet?menu=update&id=<%= id %>">
        Nama Barang: <input type="text" name="nama" value="<%= nama %>" /><br/><br/>
        <input type="submit" value="Simpan Perubahan" />
    </form>
</body>
</html>