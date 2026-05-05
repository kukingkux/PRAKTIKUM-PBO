![](_page_0_Picture_0.jpeg)

# **LAPORAN PRAKTIKUM**

### ▪ **Identitas Praktikum**

Nama MK : Praktikum Pemrograman Berorientasi Objek

Kode MK : CAK2KAB4

Bobot SKS : 3 SKS

Tempat : L-MM, Gedung IOT, lantai 3

Hari, tanggal : Selasa, 21 April 2026

Jam : 09:30-12:30 WIB

Topik praktikum : Modul-6

### ▪ **Identitas Mahasiswa**

Nama lengkap : Keishin Naufa Alfaridzhi

NIM : 103112400061

Program Studi : S-1 Teknik Informatika

### ▪ **Algoritma & Penjelasan**

Program ini merupakan implementasi dari konsep **Inheritance** dalam Pemrograman Berorientasi Objek, yang menggambarkan hierarki karyawan di suatu perusahaan. Terdapat tiga class utama yaitu *Karyawan*, *KaryawanKontrak*, dan *KaryawanTetap*, serta satu class *Main* sebagai titik eksekusi program. Class *KaryawanKontrak* dan *KaryawanTetap* merupakan subclass (child class) yang mewarisi atribut dan method dari superclass *Karyawan*, kemudian masing-masing meng-override method **hitungGaji()** dan **tampilInfo()** sesuai kebutuhan spesifik tiap jenis karyawan.

# ▪ **Kode Program & Penjelasan**

**(Karyawan.java)**

```
package MODUL67.Inheritance;
public class Karyawan {
    private String nama;
    private String nip;
    private int gajiPokok;
    public Karyawan(String nama, String nip, int gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    public String getNama() {
        return nama;
```

```
public String getNip() {
        return nip;
    public int getGajiPokok() {
        return gajiPokok;
    public void setNama(String nama) {
        this.nama = nama;
    public void setNip(String nip) {
        this.nip = nip;
    public int hitungGaji() {
        return gajiPokok;
    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + hitungGaji());
        System.out.println();
}
```

### **Penjelasan:**

Class Karyawan merupakan superclass (parent class) yang menjadi fondasi dari seluruh hierarki karyawan dalam program ini. Untuk penjelasan rinci terkait class ini adalah sebagai berikut:

#### **1. Atribut**

Terdapat tiga atribut yaitu nama dan nip bertipe String, serta gajiPokok bertipe int. Ketiganya bersifat private sehingga hanya dapat diakses dari dalam class itu sendiri dan tidak bisa diakses langsung oleh subclass.

#### **2. Constructor**

Menerima tiga parameter nama, nip, dan gajiPokok, kemudian masing-masing ditetapkan ke atribut class menggunakan keyword this.

# **3. Getter getNama(), getNip(), dan getGajiPokok()**

Mengembalikan nilai atribut nama, nip, dan gajiPokok yang bersifat private agar dapat diakses dari luar class maupun oleh subclass.

# **4. Setter setNama() dan setNip()**

Memungkinkan pengubahan nilai atribut nama dan nip dari luar class menggunakan keyword this untuk membedakan antara parameter dan atribut class.

### **5. Method hitungGaji()**

Mengembalikan nilai gajiPokok secara langsung. Method ini akan di-override oleh subclass untuk menyesuaikan perhitungan gaji dengan komponen tambahan masing-masing jenis karyawan.

### **6. Method tampilInfo()**

Mencetak informasi karyawan ke konsol meliputi nama, NIP, dan gaji pokok dengan memanggil method hitungGaji(). Method ini juga akan di-override oleh subclass.

### **(KaryawanKontrak.java)**

```
package MODUL67.Inheritance;
public class KaryawanKontrak extends Karyawan {
    private int durasiKontrak;
    private int bonusPerBulan;
    public KaryawanKontrak(String nama, String nip, int gajiPokok, int durasiKontrak,
int bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    @Override
    public int hitungGaji() {
        return super.hitungGaji() + bonusPerBulan;
    @Override
    public void tampilInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNip());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Durasi Kontrak: " + durasiKontrak + " bulan");
        System.out.println("Bonus per Bulan: " + bonusPerBulan);
        System.out.println("Gaji: " + hitungGaji());
        System.out.println();
```

#### **Penjelasan:**

Class KaryawanKontrak merupakan subclass yang mewarisi class Karyawan menggunakan keyword extends. Class ini merepresentasikan karyawan berstatus kontrak yang memiliki durasi kerja dan bonus bulanan. Untuk penjelasan rinci terkait class ini adalah sebagai berikut:

#### **1. Atribut**

Terdapat dua atribut tambahan bertipe int yaitu durasiKontrak untuk menyimpan lama kontrak dalam satuan bulan, dan bonusPerBulan untuk menyimpan jumlah bonus yang diterima setiap bulan. Keduanya bersifat private.

#### **2. Constructor**

Menerima lima parameter: nama, nip, gajiPokok (diteruskan ke superclass melalui pemanggilan super()), serta durasiKontrak dan bonusPerBulan yang diinisialisasi ke atribut milik class ini sendiri menggunakan keyword this.

### **3. Override hitungGaji()**

Meng-override method hitungGaji() dari superclass. Nilai yang dikembalikan adalah hasil pemanggilan super.hitungGaji() (yaitu gajiPokok) ditambah dengan bonusPerBulan, sehingga total gaji karyawan kontrak memperhitungkan bonus bulanannya.

### **4. Override tampilInfo()**

Meng-override method tampilInfo() dari superclass untuk mencetak informasi yang lebih lengkap, meliputi nama, NIP, gaji pokok, durasi kontrak, bonus per bulan, dan total gaji. Karena atribut nama, nip, dan gajiPokok bersifat private di superclass, maka diakses melalui getter getNama(), getNip(), dan getGaji-Pokok().

# **(KaryawanTetap.java)**

```
package MODUL67.Inheritance;
public class KaryawanTetap extends Karyawan{
    private int tunjangan;
    public KaryawanTetap(String nama, String nip, int gajiPokok, int tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    @Override
    public int hitungGaji() {
        return super.hitungGaji() + tunjangan;
    @Override
    public void tampilInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNip());
        System.out.println("Gaji Pokok: " + getGajiPokok() );
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Gaji: " + hitungGaji());
        System.out.println();
```

#### **Penjelasan:**

Class KaryawanTetap merupakan subclass yang mewarisi class Karyawan menggunakan keyword extends. Class ini merepresentasikan karyawan berstatus tetap yang mendapatkan tunjangan tambahan di luar gaji pokok. Strukturnya serupa dengan KaryawanKontrak, namun komponen tambahan gajinya berupa tunjangan, bukan bonus per bulan. Untuk penjelasan rinci terkait class ini adalah sebagai berikut:

### **1. Atribut**

Terdapat satu atribut tambahan yaitu tunjangan bertipe int untuk menyimpan nilai tunjangan yang diterima karyawan tetap. Atribut ini bersifat private.

### **2. Constructor**

Menerima empat parameter: nama, nip, gajiPokok (diteruskan ke superclass melalui super()), dan tunjangan yang diinisialisasi ke atribut class menggunakan keyword this.

### **3. Override hitungGaji()**

Meng-override method hitungGaji() dari superclass. Nilai yang dikembalikan adalah hasil pemanggilan super.hitungGaji() ditambah dengan tunjangan, sehingga total gaji karyawan tetap sudah mencakup tunjangan.

## **4. Override tampilInfo()**

Meng-override method tampilInfo() dari superclass untuk mencetak informasi lengkap karyawan tetap, meliputi nama, NIP, gaji pokok, tunjangan, dan total gaji. Sama seperti pada KaryawanKontrak, akses ke atribut superclass dilakukan melalui method getter yang tersedia.

### **(Main.java)**

```
package MODUL67.Inheritance;
public class Main {
    public static void main(String[] args) {
        KaryawanTetap kingNatsir = new KaryawanTetap("King Natsir", "10340001", 3500000,
600000);
        KaryawanKontrak masRusdi = new KaryawanKontrak("Mas Rusdi", "10440001", 3000000,
12, 500000);
        kingNatsir.tampilInfo();
        masRusdi.tampilInfo();
```

### **Penjelasan:**

Class Main merupakan titik eksekusi utama program. Untuk penjelasan rinci terkait class ini adalah sebagai berikut:

### **1. Instansiasi KaryawanTetap**

Dibuat objek kingNatsir bertipe KaryawanTetap dengan nama "King Natsir", NIP "10340001", gaji pokok 3.500.000, dan tunjangan 600.000. Dengan demikian, total gaji yang akan dihitung adalah 4.100.000.

#### **2. Instansiasi KaryawanKontrak**

Dibuat objek masRusdi bertipe KaryawanKontrak dengan nama "Mas Rusdi", NIP "10440001", gaji pokok 3.000.000, durasi kontrak 12 bulan, dan bonus per bulan 500.000. Total gaji yang dihitung adalah 3.500.000.

#### **3. Pemanggilan tampilInfo()**

Method tampilInfo() dipanggil pada kedua objek. Karena masing-masing subclass telah meng-override method ini, maka yang dieksekusi adalah versi milik subclass masing-masing (bukan versi superclass), sesuai dengan prinsip polymorphism dalam OOP.

#### Hasil Running Program

Nama: King Natsir

NIP: 10340001

Gaji Pokok: 3500000

Tunjangan: 600000

Gaji: 4100000

Nama: Mas Rusdi

NIP: 10440001

Gaji Pokok: 3000000

Durasi Kontrak: 12 bulan

Bonus per Bulan: 500000

Gaji: 3500000

Link Program Praktikum (Github)

kukingkux/PRAKTIKUM-PBO