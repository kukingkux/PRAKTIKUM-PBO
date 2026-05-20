# LAPORAN PRAKTIKUM

```
▪ Identitas Praktikum
Nama MK : Praktikum Pemrograman Berorientasi Objek
Kode MK : CAK2KAB
Bobot SKS : 3 SKS
Tempat : L-MM, Gedung IOT, lantai 3
Hari, tanggal : Selasa, 5 Mei 2026
Jam : 09 :30- 12 :30 WIB
Topik praktikum : Modul- 10
▪ Identitas Mahasiswa
Nama lengkap : Keishin Naufa Alfaridzhi
NIM : 103112400061
Program Studi : S- 1 Teknik Informatika
▪ Kode Program & Penjelasan
Unchecked Exception
(UncheckedException.java)
```

package _Modul10_ ;

_public class_ UncheckedException {
_public static void_ main( _String_ [] _args_ ) {
_int_ [] arr = new _int_ [ 1 ];
System.out.println(arr[ 1 ]);
}
}
**Penjelasan:
UncheckedException.java** mendemonstrasikan perilaku _unchecked excep-
tion_. Yaitu exception yang tidak diperiksa pada saat kompilasi dan hanya akan muncul
saat program dieksekusi. Untuk penjelasan terkait file ini adalah sebagai berikut.
Program mendeklarasikan array bertipe **int** dengan kapasitas satu elemen (in-
deks 0). Kemudian program mencoba mengakses elemen pada indeks 1 yang berada
di luar batas kapasitas array tersebut. Statement ini dapat dikompilasi tanpa error,
namun saat dijalankan akan menghasilkan **ArrayIndexOutOfBoundsException** ka-
rena indeks yang diakses melebihi ukuran array yang dialokasikan. Karena exception
ini tidak ditangani dengan blok **try-catch** , program langsung berhenti secara tidak
normal dan menampilkan pesan error dari JVM.

```
Checked Exceptions
```

## Try-Catch

```
(TryCatchOne.java)
```

package _Modul10_ ;

_public class_ TryCatchOne {
_public static void_ main( _String_ [] _args_ ) {
try {
_int_ [] arr = new _int_ [ 1 ];
System.out.println(arr[ 1 ]);
System.out.println("Baris ini tidak akan pernah dieksekusi...");
} catch( _ArithmeticException e_ ) {
System.out.println("Terjadi eksepsi karena indeks di luar kapasitas array");
}

System.out.println("Sesudah blok try catch");
}
}

**Penjelasan:
TryCatchOne.java** mendemonstrasikan penggunaan blok **try-catch** untuk
menangani _checked exception_ , namun dengan kondisi di mana tipe exception yang
ditangkap tidak sesuai dengan exception yang sebenarnya terjadi. Untuk penjelasan
terkait file ini adalah sebagai berikut.
Di dalam blok **try** , program mendeklarasikan array bertipe **int** dengan kapasitas
satu elemen lalu mencoba mengakses indeks 1 yang berada di luar batas sehingga
memicu **ArrayIndexOutOfBoundsException**. Karena exception terjadi, baris yang
mencetak "Baris ini tidak akan pernah dieksekusi..." tidak pernah dijalankan. Blok
**catch** yang tersedia hanya menangkap **ArithmeticException** , sedangkan exception
yang dilempar bertipe **ArrayIndexOutOfBoundsException**. Karena tipe exception
tidak cocok, blok **catch** tidak berhasil menangkap exception tersebut, sehingga pro-
gram tetap berhenti secara tidak normal dan baris "Sesudah blok try catch" pun tidak
sempat dicetak.
**(TryCatchTwo.java)**
package _Modul10_ ;

_public class_ TryCatchTwo {
_public static void_ main( _String_ [] _args_ ){
try {
_int_ x= args.length;
_int_ y = 100 /x;
_int_ [] arr={ 10 , 11 };
y = arr[x];
System.out.println("Tidak terjadi eksepsi");
} catch( _ArithmeticException e_ ) {
System.out.println("Terjadi eksepsi karena pembagian dengan nol");

} catch( _ArrayIndexOutOfBoundsException e_ ) {
System.out.println("Setelah blok try catch");
}
}
}
**Penjelasan:
TryCatchTwo.java** mendemonstrasikan penggunaan beberapa blok **catch**
sekaligus untuk menangani lebih dari satu jenis exception yang mungkin terjadi dalam
satu blok **try**. Untuk penjelasan terkait file ini adalah sebagai berikut.
Di dalam blok **try** , program mengambil panjang argumen command-line se-
bagai nilai **x**. Apabila program dijalankan tanpa argumen, nilai **x** adalah nol, sehingga
operasi **100/x** memicu **ArithmeticException** dan blok **catch** pertama yang me-
nangani **ArithmeticException** akan dieksekusi, mencetak "Terjadi eksepsi karena
pembagian dengan nol". Apabila program dijalankan dengan satu atau lebih argumen
sehingga **x** tidak nol, operasi pembagian berhasil, namun akses ke **arr[x]** berpotensi
memicu **ArrayIndexOutOfBoundsException** jika nilai **x** melebihi indeks valid array
dan blok **catch** kedua yang menangani **ArrayIndexOutOfBoundsException** akan
dieksekusi, mencetak "Setelah blok try catch". Dengan pendekatan ini, setiap jenis
exception ditangani secara terpisah sesuai penyebabnya.
**_Throws_**
**(Throws.java)**

package _Modul10_ ;

_class_ Coba {

_public void_ tampil() _throws Exception_ {
_int_ x= 0 ;
if (x< 5 )
throw new Exception("Lebih kecil 5");
}
}

_public class_ Throws {
_public static void_ main ( _String args_ []) {
_Coba_ c = new Coba();
try {
c.tampil();
} catch ( _Exception e_ ) {
System.out.println(e.getMessage());
}
System.out.println("Program Selesai");
}
}

```
Penjelasan:
Throws.java mendemonstrasikan penggunaan keyword throws untuk
mendeklarasikan bahwa suatu method dapat melempar exception, serta penggunaan
keyword throw untuk melempar exception secara eksplisit berdasarkan kondisi
tertentu. Untuk penjelasan terkait file ini adalah sebagai berikut:
```

**1. Method tampil() pada class Coba**
Method ini dideklarasikan dengan **throws Exception** , yang berarti
method mengumumkan kepada pemanggilnya bahwa eksekusi method ini
berpotensi menghasilkan exception bertipe **Exception**. Di dalam method,
apabila nilai **x** kurang dari 5, program secara eksplisit melempar objek
**Exception** baru dengan pesan "Lebih kecil 5" menggunakan keyword **throw**.
Karena nilai **x** diinisialisasi sebagai nol, kondisi ini selalu terpenuhi sehingga
exception selalu dilempar setiap kali method dipanggil.
**2. Static method main() pada class Throws**
Program membuat objek dari class **Coba** , lalu memanggil method
**tampil()** di dalam blok **try**. Karena **tampil()** selalu melempar exception, blok
**catch** yang menangkap **Exception** langsung dieksekusi dan mencetak pesan
exception yang diterima melalui **e.getMessage()** , yaitu "Lebih kecil 5". Setelah
blok **try-catch** selesai, program mencetak "Program Selesai" sebagai tanda
bahwa eksekusi berlanjut secara normal setelah exception berhasil ditangani.
**_Finally_**
**(Finally.java)**
package _Modul10_ ;

_public class_ Finally {
_public static void_ main( _String_ [] _args_ ){
_int_ x = 3 ;
_int_ [] arr = { 10 , 11 , 12 };
try {
System.out.println(arr[x]);
System.out.println("Tidak Terjadi Eksepsi");
} catch ( _ArrayIndexOutOfBoundsException e_ ) {
System.out.println("Terjadi Eksepsi");
System.out.println(arr[x- 4 ]);
} finally {
System.out.println("Program Selesai");
}
}
}
**Penjelasan:
Finally.java** mendemonstrasikan penggunaan blok **finally** yang selalu
dieksekusi setelah blok **try-catch** selesai, terlepas dari apakah exception terjadi atau

```
tidak. Termasuk dalam kondisi di mana blok catch sendiri memicu exception baru.
Untuk penjelasan terkait file ini adalah sebagai berikut:
Program mendeklarasikan variabel x bernilai 3 dan array arr berisi tiga elemen
(indeks 0–2). Di dalam blok try , program mencoba mengakses arr[3] yang berada
di luar batas array, sehingga memicu ArrayIndexOutOfBoundsException dan baris
"Tidak Terjadi Eksepsi" tidak dieksekusi. Blok catch menangkap exception tersebut
dan mencetak "Terjadi Eksepsi", namun kemudian mencoba mengakses arr[x-4]
yang berarti arr[-1] merupakan indeks negatif yang juga tidak valid sehingga memicu
ArrayIndexOutOfBoundsException baru di dalam blok catch itu sendiri. Meski
demikian, blok finally tetap dieksekusi dan mencetak "Program Selesai" sebelum pro-
gram akhirnya berhenti secara tidak normal akibat exception yang tidak tertangani
dari dalam blok catch.
```

▪ **Hasil Running Program**

## Gambar 1. UncheckedException.java

## Gambar 2. TryCatchOne.java

## Gambar 3. TryCatchTwo.java

## Gambar 4. Throws.java

## Gambar 5. Finally.java

```
▪ Link Program Praktikum (Github)
kukingkux/PRAKTIKUM-PBO
```
