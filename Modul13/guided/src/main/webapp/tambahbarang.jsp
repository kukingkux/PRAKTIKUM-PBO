<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Tambah Barang</title>
  </head>
  <body>
    <h2>Form Penambahan Barang</h2>
    <form method="post" action="BarangServlet?menu=insert">
      Nama Barang: <input type="text" name="nama" /><br /><br />
      <input type="submit" value="Tambah" />
    </form>
  </body>
</html>
