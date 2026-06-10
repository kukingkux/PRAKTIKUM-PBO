### Langkah Pengerjaan Praktikum

#### Preparation

1. XAMPP
   Digunakan untuk membuat web server dan database server. Web server menggunakan Apache, sedangkan database server menggunakan MySQL. XAMPP juga menyediakan phpMyAdmin untuk memudahkan pengelolaan database.
2. Pembuatan Database dan Tabel pada MySQL (phpmyadmin)
   Pengelolaan database dilakukan melalui phpMyAdmin pada address `http://localhost/phpmyadmin/`. Pada praktikum ini digunakan username `root` dengan password kosong. Kita akan membuat database dengan nama `praktikum` dan tabel `barang` dengan struktur sebagai berikut:

- id (INT(5), PRIMARY KEY, AUTO_INCREMENT)
- nama (VARCHAR(20))

3. Pembuatan Project Web APP dengan VSCode
   Membuat project web app menggunakan Visual Studio Code (VSCode) dengan ekstensi Java Extension Pack. Pastikan untuk mengatur JDK yang sesuai dan menambahkan library JDBC untuk MySQL. Step pembuatan project java:

- Buka VSCode, pilih `File > New Folder` untuk membuat folder project baru, misalnya `Praktikum`.
- Buka folder tersebut di VSCode.
- Gunakan shortcut `Ctrl + Shift + P`, ketik `Java: Create Java Project`, dan pilih `No Build Tools`.
- Beri nama project, misalnya `guided`.

4. Konfigurasi Library dan Server

- Konfigurasi Maven: Project praktikum kali ini akan menggunakan Maven untuk manajemen dependensi. Pastikan untuk menambahkan dependency JDBC MySQL di file `pom.xml`, `mysql-connector-java` dengan versi 8.0.33.
- Konfigurasi Server: Pastikan Apache Tomcat sudah terinstal dan dikonfigurasi dengan benar di VSCode. Kita akan explode project Tomcat untuk menjalankan aplikasi web dengan cara copy folder project ke dalam folder `webapps` di directory instalasi Tomcat.

#### Modul 12 - JSP

5. Pengenalan JSP
   JSP adalah teknologi Java yang digunakan untuk membuat halaman web dinamis. JSP memungkinkan kita untuk menyisipkan kode Java langsung ke dalam halaman HTML, sehingga memudahkan dalam pembuatan aplikasi web yang interaktif.
6. Java Web Server
   a. Instalasi Tomcat Server
   Sebelum membuat program web java, langkah pertama adalah instalasi Tomcat terlebih dahulu. Install dari official website Tomcat, lalu konfigurasi di VSCode. Di sini menggunakan extension "Community Server Connector" untuk memudahkan pengelolaan server.
   b. Memulai membuat java web sederhana
   Pembuatan file JSP pertama dengan nama `index.jsp` pada direktori `src/main/webapp/`.
   c. Compile dan menjalankan java web
   Untuk meng-compile dan menjalankan aplikasi web, pastikan Tomcat sudah berjalan. Kemudian akses aplikasi melalui browser dengan alamat `http://localhost:8080/guided/index.jsp`.

#### Modul 13 - Java Servlet & JDBC Part 1

1. Java Servlet
   Java Web Server memiliki Servlet engine untuk memproses konten secara dinamis. Servlet bertindak sebagai controller dalam aplikasi.
   Membuat Servlet dengan nama `PrakServlet` pada folder `src/main/java/servlets`. Servlet ini akan menangani request dan response dari client. Kita juga perlu membuat form pada `index.jsp` untuk mengirim data ke `PrakServlet` dan menampilkan return dari `PrakServlet`.
2. Memulai JDBC
   JDBC digunakan untuk menghubungkan aplikasi Java dengan database MySQL agar programmer dapat mengeksekusi perintah SQL statement.
   a. Koneksi web app dengan JDBC
   Implementasi
3. Fetching Data
4. Insert Data

#### Modul 14 - Java Servlet & JDBC Part 2

1. Update Data
2. Delete Data
