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
