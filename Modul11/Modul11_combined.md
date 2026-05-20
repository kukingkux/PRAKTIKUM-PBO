### 1.1.1.html
<nama_tag> letakkan konten di sini . </nama_tag>

### 1.1.2.html
<!doctype html>
<html>
  <head>
    <!-- Contoh elemen berisi tag lain -->
    <title>Page Title</title>
  </head>
  asdff

  <body>
    <h1>My First Heading</h1>
    <!-- Contoh Elemen berisi Teks -->
    <p>My first paragraph.</p>
  </body>
</html>

### 1.1.3.html
<a href="www.google.co.id"> Google.co.id </a>
<input type="button" id="btnSubmit" class="btnSubmit1" value="Kirim" />

### 1.2.html
<!doctype html>
<html>
  <head>
    <title>Page Title</title>
  </head>

  <body>
    <h1>My First Heading</h1>
    <p>My first paragraph.</p>
  </body>
</html>

### 1.3.html
<h1>Heading 1</h1>
<h2>Heading 2</h2>
<h3>Heading 3</h3>
<h4>Heading 4</h4>
<h5>Heading 5</h5>
<h6>Heading 6</h6>

### 1.4.html
<a href="www.google.co.id"> Visit Google </a>

### 1.5.html
<table width="80%" height="50%" border="1">
  <tr>
    <th>Nama Lengkap</th>
    <th>Kota Kelahiran</th>
    <th>Age</th>
  </tr>
  <tr>
    <td>Budi</td>
    <td>Jakarta</td>
    <td>35</td>
  </tr>
  <tr>
    <td>Andi</td>
    <td>Semarang</td>
    <td>52</td>
  </tr>
  <tr>
    <td>Rasyid</td>
    <td>Surabaya</td>
    <td>22</td>
  </tr>
</table>
<table width="80%" height="50%" border="1">
  <tr>
    <th rowspan="2">Nama Lengkap</th>
    <th colspan="2">Gelar Pendidikan</th>
    <th rowspan="2">Age</th>
  </tr>
  <tr>
    <th>Sarjana</th>
    <th>Magister</th>
  </tr>
  <tr>
    <td>Budi</td>
    <td>S.Kom</td>
    <td>M.Sc</td>
    <td>35</td>
  </tr>
  <tr>
    <td>Andi</td>
    <td>S.SiKom</td>
    <td>M.T</td>
    <td>52</td>
  </tr>
</table>

### 1.6.html
<img src="wp (35).jpg" width="50%" height="50%" />
<p>Ini Gambar Kincir Angin</p>

### 1.7.html
<audio controls>
  <source src="horse.ogg" type="audio/ogg" />
  <source src="horse.mp3" type="audio/mpeg" />
  Your browser does not support the audio element.
</audio>

<video width="400" controls>
  <source src="mov_bbb.mp4" type="video/mp4" />
  <source src="mov_bbb.ogg" type="video/ogg" />
  Your browser does not support HTML5 video.
</video>

<p>
  Video courtesy of
  <a href="https://www.bigbuckbunny.org/" target="_blank">Big Buck Bunny</a>.
</p>

### 1.8.1.html
<input /> type = ''text" Menampilkan elemen untuk input data teks type =
''password" Menampilkan elemen untuk input data password type = ''email"
Menampilkan elemen untuk input data email type = ''radio" Menampilkan elemen
untuk pemilihan data berbentuk radio type = ''checkbox" Menampilkan elemen untuk
pemilihan data berbentu checkbox type = ''submit" Menampilkan elemen tombol
untuk pengolahan data form

<select>
  -

  <option>.</option>
  Menampilkan elemen untuk pemilihan data berbentuk dropdown
</select>
list

<textarea> . </textarea> - Menampilkan elemen untuk input data dalam bentuk
paragraf panjang.

<button>.</button> type = ''button"

### 1.8.2.html
<!doctype html>
<html lang="id">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Formulir Pendaftaran Praktikan</title>
    <link rel="stylesheet" href="styles.css" />
  </head>
  <body>
    <h1>Formulir Pendaftaran Praktikan</h1>
    <form action="#" method="POST">
      <div class="form-group">
        <label for="nama_id">Nama:</label>
        <input
          type="text"
          name="nama_input"
          id="nama_id"
          placeholder="Input Nama"
          value="Praktikan"
          readonly
        />
      </div>
      <div class="form-group">
        <label for="uname_id">Username:</label>
        <input
          type="text"
          name="uname_input"
          id="uname_id"
          placeholder="Input
Username"
          value="Praktikum"
          disabled
        />
      </div>
      <div class="form-group">
        <label for="password_id">Password:</label>
        <input
          type="password"
          name="password_input"
          id="password_id"
          placeholder="Input Password"
        />
      </div>
      <div class="form-group">
        <label for="email_id">Email:</label>
        <input
          type="email"
          name="email_input"
          id="email_id"
          placeholder="Input
Email"
        />
      </div>
      <fieldset>
        <legend>Jenis Kelamin</legend>
        <div>
          <input type="radio" name="jk_input" id="pria" value="Pria" />
          <label for="pria">Pria</label>
        </div>
        <div>
          <input type="radio" name="jk_input" id="wanita" value="Wanita" />
          <label for="wanita">Wanita</label>
        </div>
      </fieldset>
      <fieldset>
        <legend>Hobi</legend>
        <div>
          <input type="checkbox" name="hobi_input" id="renang" value="Renang" />
          <label for="renang">Renang</label>
        </div>
        <div>
          <input
            type="checkbox"
            name="hobi_input"
            id="bersepeda"
            value="Bersepeda"
          />
          <label for="bersepeda">Bersepeda</label>
        </div>
        <div>
          <input
            type="checkbox"
            name="hobi_input"
            id="memancing"
            value="Memancing"
          />
          <label for="memancing">Memancing</label>
        </div>
      </fieldset>
      <div class="form-group">
        <label for="jp_id">Jenjang Pendidikan:</label>
        <select name="jp_input" id="jp_id">
          <option value="" selected>------Pilih------</option>
          <option value="D3">Tamat D3</option>
          <option value="S1">Tamat S1</option>
          <option value="S2">Tamat S2</option>
          <option value="S3">Tamat S3</option>
        </select>
      </div>
      <div class="form-group">
        <label for="kritik_saran">Kritik & Saran:</label>
        <textarea id="kritik_saran" name="kritik_saran" rows="5"></textarea>
      </div>
      <div class="form-actions">
        <button type="button" class="btn-cancel">Cancel</button>
        <button type="submit" class="btn-submit">Submit</button>
      </div>
    </form>
  </body>
</html>

### 2.1.1.html
<head>
  <link rel="stylesheet" type="text/css" href="myStyleSheet.css" />
</head>
<head>
  <style>
    body {
      background-color: blue;
    }

    h1 {
      color: maroon;
      margin-left: 40px;
    }
  </style>
</head>
<h1 style="color: lightblue; font-size: 30px">Praktikum Web Programming</h1>

### 2.1.2.css
p {
  text-align: center;
  color: red;
}

/*Selector dengan Id Elemen
HTML*/
#para1 {
  text-align: center;
  color: red;
}

/*Selector dengan Class Elemen
HTML*/
p.center {
  text-align: center;
  color: red;
}

### 2.3.html
<h3>List of Property</h3>
<ol type="1">
  <li>
    Indoor
    <ul type="circle">
      <li>Sofa</li>
    </ul>
    <ul type="disc">
      <li>Tanaman Hias</li>
    </ul>
    <ul type="square">
      <li>Lampu Baca</li>
    </ul>
    <ul type="none">
      <li>Rak Buku</li>
    </ul>
  </li>
  <li>
    Outdoor
    <ol type="A">
      <li>Payung Pantai</li>
    </ol>
    <ol type="a">
      <li>Ayunan</li>
    </ol>
    <ol type="I">
      <li>Kursi Taman</li>
    </ol>
    <ol type="i">
      <li>Lampu Taman</li>
    </ol>
  </li>
</ol>

### 2.4.css
h1 {
  text-align: center;
}
h2 {
  text-align: left;
}
h3 {
  text-align: right;
}

### 2.5.css
body {
  background-color: HSL(20%, 40%, 70%);
  color: orange;
}

#teks {
  color: #2f3cdf;
}
input.text-field {
  background-color: RGBA(32, 55, 122, 0.5);
}

### 2.6.html
<div class="section1">
<p> Content of <span class="mark"> Property </span> </p>
</div>

/*CSS Properties*/
.section1 {
background-color: lightgrey;
padding: 10px 5px 10px 5px;
}
.mark {
background-color: tomato;
font-style: italic;
font-weight: bold;
padding: 10px 10px 10px 10px;
}

### 3.3.html
<div class="row">
  <div class="col-*-#"></div>
  <div class="col-*-#"></div>
</div>
<div class="row">
  <div class="col-*-#"></div>
  <div class="col-*-#"></div>
  <div class="col-*-#"></div>
</div>

<div class="”container”">
  <div class="row">
    <div class="col-12 col-md-8">.col-12 .col-md-8</div>
    <div class="col-6 col-md-4">.col-6 .col-md-4</div>
  </div>
  <div class="row">
    <div class="col-6 col-md-4">.col-6 .col-md-4</div>
    <div class="col-6 col-md-4">.col-6 .col-md-4</div>
    <div class="col-6 col-md-4">.col-6 .col-md-4</div>
  </div>
  <div class="row">
    <div class="col-6">.col-6</div>
    <div class="col-6">.col-6</div>
  </div>
</div>

### 3.4.html

### 3.5.html
<!--Tabel Hover Style -->
<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nama Lengkap</th>
      <th scope="col">Asal Kota</th>
      <th scope="col">Umur</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Budi Rojadi</td>
      <td>Semarang</td>
      <td>35 th</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Yulia Santi</td>
      <td>Bekasi</td>
      <td>32</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Fahri Abdilah</td>
      <td>Medan</td>
      <td>38 th</td>
    </tr>
  </tbody>
</table>

<div class="container">
  <h2>Thumbnail & Fluid</h2>
  <img src="cinqueterre.jpg" class="img-thumbnail" alt="Cinque Terre" />
  <img src="cinqueterre.jpg" class="img-fluid" alt="Responsive image" />
</div>

<div class="container">
  <h4>Button Styles</h4>
  <button type="button" class="btn btn-secondary btn-md">Secondary</button>
  <button type="button" class="btn btn-primary btn-lg">Primary</button>
  <button type="button" class="btn btn-success btn-block">Success</button>
  <button type="button" class="btn btn-info btn-xs">Info</button>
  <button type="button" class="btn btn-warning">Warning</button>
  <button type="button" class="btn btn-danger">Danger</button>
  <button type="button" class="btn btn-link">Link</button>
</div>

### 3.6.html
<div class="container">
  <h3>Horizontal form</h3>
  <form class="form-horizontal" action="/action_page.php">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Username:</label>
      <div class="col-sm-10">
        <input
          type="text"
          class="form-control"
          id="uname"
          placeholder="Enter 
username"
          name="uname"
        />
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">
        <input
          type="password"
          class="form-control"
          id="pwd"
          placeholder="Enter 
password"
          name="pwd"
        />
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-success">Submit</button>
      </div>
    </div>
  </form>
</div>

### 4.2.2.js
var a;             // a berisi undefined
var nama = "Budi"; // nama berisi "Budi"

### 4.2.3.js
var data = ["satu", 2, true];
var arr2 = [["satu", "dua"], ["tiga", "empat"]];
var data = ["a", "b", "c"];
// data.length mengembalikan 3
data.push("d"); // mengembalikan 4 data menjadi ["a", "b", "c", "d"]
data.pop(); // mengembalikan "d", data menjadi ["a", "b", "c"]

### 4.2.4.js
var gelar;
var pendidikan = "S2";
if (pendidikan === "S1") {
  gelar = "Sarjana";
} else if (pendidikan === "S2") {
  gelar = "Master";
} else if (pendidikan === "S3") {
  gelar = "Doktor";
} else {
  gelar = "Tidak Diketahui";
}
gelar; // gelar berisi "Master"
while (true) {
  // tak pernah berhenti
}
var input;
do {
  input = get_input();
} while (inputIsNotValid(input));
for (var i = 0; i < 5; i++) {
  // berulang sebanyak 5 kali
}

### 4.3.1.js
var objek_kosong = {};
var mobil = {
  "warna-badan": "merah",
  "nomor-polisi": "BK1234AB",
};
var jadwal = {
  platform: 34,
  telah_berangkat: false,
  tujuan: "Medan",
  asal: "Jakarta",
};
var jadwal = {
  platform: 34,
  telah_berangkat: false,
  asal: { kode_kota: "MDN", nama_kota: "Medan", waktu: "2013-12-29 14:00" },
  tujuan: { kode_kota: "JKT", nama_kota: "Jakarta", waktu: "2013-12-29 17.30" },
};

### 4.3.2.js
mobil["warna-badan"]; // Hasil: "merah"
jadwal.platform; // Hasil: 34
jadwal.nomor_kursi["jumlah-roda"]; // Hasil: undefined mobil // Hasil: undefined
mobil["jumlah-roda"] = 4;
mobil.bahan_bakar = "Bensin";

### 4.3.3.js
var mobil = { nama: "Mobil", jumlahBan: 4 };
var truk = Object.create(mobil);
// truk.nama === "Mobil"
// truk.jumlahBan === 4

### 4.4.1.js
function tambah(a, b) {
  hasil = a + b;
  return hasil;
}
var tambah = function (a, b) {
  hasil = a + b;
  return hasil;
};

### 4.4.2.js
var tambah = function (a, b) {
  hasil = a + b;

  return hasil;
};
tambah(3, 5);
var simpan = tambah(3, 5); // simpan === 8
tambah(simpan, 2); // mengembalikan 10
tambah(tambah(3, 5), 2); // juga mengembalikan 10
tambah(tambah(2, 3), 4); // mengembalikan 9
var naikkan = function (n) {
  var hasil = n + 10;
  return;
  hasil;
  // kode di bawah tidak dijalankan lagi hasil
  hasil = hasil * 100;
};
naikkan(10); // mengembalikan
naikkan(25); // mengembalikan

var naikkan = function (n) {
  return n + 10;
};
var tambah = function (a, b) {
  return a + b;
};
tambah(4, 4); // mengembalikan 8
naikkan(10); // mengembalikan 20
tambah(naikkan(5), 7); // mengembalikan 22

