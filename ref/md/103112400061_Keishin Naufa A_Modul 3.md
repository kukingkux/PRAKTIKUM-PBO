![](_page_0_Picture_0.jpeg)

# **LAPORAN PRAKTIKUM**

#### ▪ **Identitas Praktikum**

Nama MK : Praktikum Pemrograman Berorientasi Objek

Kode MK : CAK2KAB4

Bobot SKS : 3 SKS

Tempat : L-MM, Gedung IOT, lantai 3

Hari, tanggal : Selasa, 31 Maret 2025

Jam : 09:30-12:30 WIB

Topik praktikum : Modul-3

# ▪ **Identitas Mahasiswa**

Nama lengkap : Keishin Naufa Alfaridzhi

NIM : 103112400061 Program Studi : S-1 Informatika

### ▪ **Algoritma & Penjelasan**

Program ini mensimulasikan sistem vending machine menggunakan prinsip Pemrograman Berorientasi Objek (PBO), di mana logika mesin dan eksekusi utama dipisah ke dalam dua file.

- 1. **Inisialisasi**: Program dimulai dengan membuat objek vending machine dan menetapkan data awal seperti kode mesin, jumlah stok (teh, kopi, susu), dan harga masing-masing minuman.
- 2. **Input Saldo Awal**: User diminta untuk memasukkan jumlah uang (saldo) sebelum masuk ke menu pemilihan.
- 3. **Proses Pemilihan (Looping)**: Program akan terus menampilkan menu menggunakan perulangan selama user tidak membatalkan transaksi (menginput "x").
- 4. **Validasi Transaksi**: Setiap kali user memilih minuman, algoritma mengecek tiga kondisi utama:
  - Apakah uang/saldo user mencukupi harga minuman?
  - Apakah stok minuman yang dipilih tersedia (lebih dari 0)?
  - Apakah user memilih untuk membatalkan transaksi ("x")?
- 5. **Eksekusi & Update Data**: Jika lolos validasi, program akan mengurangi stok minuman, menambah total penjualan mesin, mengurangi saldo user sebesar harga minuman, dan menampilkan kembalian.
- 6. **Terminasi**: Program berhenti apabila user membatalkan transaksi ("x") atau terjadi kegagalan validasi (uang kurang/stok habis). Saldo akhir kemudian dikembalikan.

# ▪ **Kode Program & Penjelasan (VendingMachine.java)**

```
▪ package Modul3.Unguided.VendingMachine;
▪
▪ public class VendingMachine {
▪ private String kodeMesin, pilihan;
▪ private int teh, kopi, susu;
▪ private double hargaTeh, hargaKopi, hargaSusu, saldoMasuk, totalPenjualan;
▪
▪ public VendingMachine(String kodeMesin) {}
▪ public VendingMachine(String kodeMesin, int teh, int kopi, int susu) {
▪ this.kodeMesin = kodeMesin;
▪ this.teh = teh;
▪ this.kopi = kopi;
▪ this.susu = susu;
▪ }
▪ public VendingMachine(
▪ String kodeMesin,
▪ int teh,
▪ int kopi,
▪ int susu,
▪ double hargaTeh,
▪ double hargaKopi,
▪ double hargaSusu
▪ ) {
▪ this.kodeMesin = kodeMesin;
▪ this.teh = teh;
▪ this.kopi = kopi;
▪ this.susu = susu;
▪ this.hargaTeh = hargaTeh;
▪ this.hargaKopi = hargaKopi;
▪ this.hargaSusu = hargaSusu;
▪ }
▪
▪ public double getHarga(String jenis) {
▪ if (jenis.equalsIgnoreCase("teh")) return hargaTeh;
▪ if (jenis.equalsIgnoreCase("kopi")) return hargaKopi;
▪ if (jenis.equalsIgnoreCase("susu")) return hargaSusu;
▪ return 0;
▪ }
▪
▪ public double masukkanUang(double jumlah) {
▪ this.saldoMasuk = jumlah;
▪ return this.saldoMasuk;
▪ }
▪
▪ public void pilihMinuman(String jenis) {
▪ pilihan = jenis.toLowerCase();
▪ }
▪
▪ public Boolean batalkanTransaksi() {
▪
```

```
▪ if (saldoMasuk < getHarga(this.pilihan)) {
▪ System.out.println("Uang tidak cukup.");
▪ System.out.println("Transaksi dibatalkan.");
▪ return true;
▪ }
▪
▪ if (
▪ (this.pilihan.equals("teh") && teh <= 0) ||
▪ (this.pilihan.equals("kopi") && kopi <= 0) ||
▪ (this.pilihan.equals("susu") && susu <= 0)
▪ ) {
▪ System.err.println("Stok " + this.pilihan + " kosong.");
▪ System.out.println("Transaksi dibatalkan.");
▪ System.out.println("Mengembalikan uang...");
▪ System.out.println();
▪ return true;
▪ }
▪
▪ if (pilihan.equals("x")) {
▪ System.out.println("Transaksi dibatalkan.");
▪ System.out.println("Mengembalikan uang...");
▪ return true;
▪ }
▪ return false;
▪ }
▪
▪ public void tampilkanStatus(){
▪ System.out.println("=== Status Vending Machine | Kode " + this.kodeMesin);
▪ System.out.println("Stok Teh: " + teh + "| Rp" + hargaTeh +"/pcs");
▪ System.out.println("Stok Kopi: " + kopi + "| Rp" + hargaKopi +"/pcs");
▪ System.out.println("Stok Susu: " + susu + "| Rp" + hargaSusu +"/pcs");
▪ System.out.println("Total Penjualan: " + totalPenjualan);
▪ }
▪
▪ public double tampilkanStatusPembelian() {
▪ if (this.pilihan.equals("teh")) {
▪ totalPenjualan += hargaTeh;
▪ teh--;
▪ } else if (this.pilihan.equals("kopi")) {
▪ totalPenjualan += hargaKopi;
▪ kopi--;
▪ } else if (this.pilihan.equals("susu")) {
▪ totalPenjualan += hargaSusu;
▪ susu--;
▪ }
▪ System.out.println("=== Status Pembelian | " + kodeMesin + " ===");
▪ System.out.println("Minuman yang diambil: " + pilihan);
▪ System.out.println("Jumlah yang dibayarkan: " + saldoMasuk);
▪ System.out.println("Kembali: " + (saldoMasuk-getHarga(this.pilihan)));
▪ System.out.println("Terima Kasih Sudah Berbelanja :D");
▪ return (saldoMasuk-getHarga(this.pilihan));
▪ }
▪
▪ }
▪
```

### **Penjelasan:**

**Class VendingMachine** merupakan class utama yang mengenkapsulasi semua fungsi dan data yang berkaitan dengan operasional vending machine. Class ini memiliki beberapa atribut private yang menyimpan informasi penting seperti kode mesin, jumlah stok minuman (teh, kopi, susu), harga masing-masing minuman, saldo masuk, dan total penjualan. Terdapat tiga constructor yang memberikan fleksibilitas dalam pembuatan objek vending machine dengan parameter yang berbeda. Method-method dalam class ini meliputi getter untuk harga minuman, method untuk menerima uang, memilih minuman, membatalkan transaksi, menampilkan status mesin, dan menampilkan status pembelian. Konsep enkapsulasi diterapkan dengan menjadikan atribut sebagai private sehingga hanya bisa diakses melalui method public yang tersedia.

Constructor pertama **VendingMachine(String kodeMesin)** merupakan constructor default yang dapat digunakan untuk membuat objek tanpa parameter awal. Constructor kedua **VendingMachine(String kodeMesin, int teh, int kopi, int susu)** digunakan untuk membuat objek dengan menyertakan informasi kode mesin dan jumlah stok minuman. Constructor ketiga **VendingMachine(String kodeMesin, int teh, int kopi, int susu, double hargaTeh, double hargaKopi, double hargaSusu)** merupakan constructor lengkap yang menyertakan semua parameter termasuk harga masing-masing minuman.

Method **getHarga(String jenis)** berfungsi untuk mengembalikan harga minuman berdasarkan jenis yang diminta. Menggunakan **equalsIgnoreCase()** untuk membandingkan string agar tidak case-sensitive. Method **masukkanUang(double jumlah)** digunakan untuk menerima input saldo dari pengguna dan menyimpannya dalam atribut saldoMasuk.

Method **pilihMinuman(String jenis)** menyimpan pilihan minuman yang dipilih oleh pengguna dan mengkonversi input menjadi lowercase untuk konsistensi. Method **batalkanTransaksi()** merupakan method yang kompleks dan bertanggung jawab untuk memvalidasi berbagai kondisi yang dapat menyebabkan transaksi dibatalkan, seperti saldo tidak mencukupi, stok habis, atau pengguna membatalkan secara manual. Method ini mengembalikan nilai Boolean true jika transaksi dibatalkan dan false jika transaksi dapat dilanjutkan.

Method **tampilkanStatus()** digunakan untuk menampilkan informasi terkini tentang vending machine seperti kode mesin, stok minuman beserta harganya, dan total penjualan. Method **tampilkanStatusPembelian()** mengelola proses akhir transaksi dengan mengurangi stok minuman, menambah total penjualan, dan menampilkan struk pembelian kepada pengguna.

# **(Main.java)**

```
package Modul3.Unguided.VendingMachine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        VendingMachine wallahiVM = new VendingMachine(
            "w411h1",
            5,
            7,
            10000,
            18000,
            12000);
        Scanner reader = new Scanner(System.in);
        System.out.println("Selamat Datang! | wallahiVM");
        System.out.print("Masukkan Uang: ");
        double saldo = reader.nextDouble();
        String inputMenu = "";
        while (!inputMenu.equals("x")) {
            wallahiVM.masukkanUang(saldo);
            System.out.println();
            inputMenu = "";
            System.out.println("Saldo saat ini: " + saldo);
            System.out.println("Minuman: ");
            System.out.println("1. Teh | Rp" + wallahiVM.getHarga("teh")+"/pcs");
            System.out.println("2. Kopi | Rp" + wallahiVM.getHarga("kopi")+"/pcs");
            System.out.println("3. Susu | Rp" + wallahiVM.getHarga("susu")+"/pcs");
            System.out.println("4. Status Mesin");
            System.out.println("Batalkan Transaksi (x)");
            System.out.print("Pilih Minuman (ketik jenis [cth: 'teh']): ");
            inputMenu = reader.next().toLowerCase();
            if (inputMenu.equals("4")) {
                wallahiVM.tampilkanStatus();
                continue;
            wallahiVM.pilihMinuman(inputMenu);
            System.out.println();
            if (wallahiVM.batalkanTransaksi()) {
                System.out.println("Saldo yang dikembalikan: " + saldo);
                break;
```

```
if (
          inputMenu.equals("teh") ||
          inputMenu.equals("kopi") ||
          inputMenu.equals("susu")
          wallahiVM.tampilkanStatusPembelian();
          saldo -= wallahiVM.getHarga(inputMenu);
      } else {
          System.out.println("Input Invalid.");
 System.out.println();
 wallahiVM.tampilkanStatus();
 reader.close();
```

#### **Penjelasan:**

Class Main merupakan titik masuk program yang mengatur interaksi antara pengguna dan sistem vending machine. Di dalam method **main()**, pertama dibuat objek VendingMachine dengan nama **wallahiVM** yang diinisialisasi dengan parameter kode mesin "w411h1", stok teh 5, kopi 7, susu 9, serta harga masing-masing minuman. Selanjutnya dibuat objek Scanner reader untuk menerima input dari pengguna melalui keyboard.

Program menggunakan perulangan while yang akan terus berjalan sampai pengguna memasukkan input "x" untuk membatalkan transaksi. Dalam perulangan, program pertama meminta pengguna untuk memasukkan uang, kemudian menampilkan menu interaktif yang berisi daftar minuman beserta harganya, opsi untuk melihat status mesin, dan opsi untuk membatalkan transaksi.

Fitur program memungkinkan pengguna untuk memilih minuman dengan mengetik nama minuman (teh, kopi, susu), melihat status mesin dengan memilih opsi 4, atau membatalkan transaksi dengan mengetik "x". Setelah pemilihan, program memanggil method **batalkanTransaksi()** untuk memverifikasi apakah transaksi dapat dilanjutkan. Jika transaksi dibatalkan (saldo tidak cukup, stok habis, atau dibatalkan manual), program akan mengembalikan uang dan keluar dari perulangan. Jika transaksi berhasil, program akan memanggil method **tampilkanStatusPembelian()** untuk menyelesaikan transaksi dan mengurangi saldo pengguna sesuai harga minuman yang dipilih. Perulangan akan terus berlanjut sampai pengguna memilih untuk membatalkan transaksi atau program selesai dijalankan.

### ▪ **Hasil Running Program**

```
Gambar 2 Masukkan Uang dan Pilih Minuman
```

**Gambar 3 Kasus Jika Stok Habis Gambar 4 Batalkan Transaksi**

**Gambar 1 Kasus Jika Uang Tidak Cukup**

#### ▪ **Link Program Praktikum (Github)**

[kukingkux/PRAKTIKUM-PBO](https://github.com/kukingkux/PRAKTIKUM-PBO)