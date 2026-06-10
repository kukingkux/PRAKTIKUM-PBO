<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session == null || session.getAttribute("username") == null) {
        response.sendRedirect("form_login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Daftar Barang - Inventory System</title>
</head>
<body>

    <div style="float: right; margin-bottom: 20px;">
        Selamat Datang, <b><%= session.getAttribute("username") %></b> | 
        <a href="LoginServlet?logout=true" style="color: red;">Logout</a>
    </div>

    <h2>Data Inventory</h2>
    <p><a href="BarangServlet?menu=add">💾 Tambah Barang Baru</a></p>
    
    <table border="1" cellpadding="6" cellspacing="0" style="width: 100%; max-width: 600px; border-collapse: collapse;">
        <tr style="background-color: #f2f2f2; text-align: left;">
            <th>ID</th>
            <th>Nama Barang</th>
            <th>Aksi</th>
        </tr>
        <%
            ResultSet rs = (ResultSet) request.getAttribute("list");
            if (rs != null) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nama = rs.getString("nama");
        %>
        <tr>
            <td><%= id %></td>
            <td><%= nama %></td>
            <td>
                <a href="BarangServlet?menu=edit&id=<%= id %>">Edit</a> | 
                <a href="BarangServlet?menu=del&id=<%= id %>" 
                   onclick="return confirm('Apakah Anda yakin ingin menghapus barang ini?');" 
                   style="color: red;">Hapus</a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="3" style="text-align: center; color: gray; padding: 15px;">
                Tidak ada data tersedia. Pastikan Anda mengakses halaman ini melalui <a href="BarangServlet">BarangServlet</a>.
            </td>
        </tr>
        <%
            }
        %>
    </table>

</body>
</html>