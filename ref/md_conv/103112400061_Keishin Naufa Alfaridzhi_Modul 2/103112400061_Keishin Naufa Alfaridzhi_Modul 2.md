![](_page_0_Picture_0.jpeg)

# **LAPORAN PRAKTIKUM**

### ▪ **Identitas Praktikum**

Nama MK : Praktikum Pemrograman Berorientasi Objek

Kode MK : CAK2KAB4

Bobot SKS : 3 SKS

Tempat : L-MM, Gedung IOT, lantai 3

Hari, tanggal : Selasa, 10 Maret 2025

Jam : 09:30-12:30 WIB

Topik praktikum : Modul-2

## ▪ **Identitas Mahasiswa**

Nama lengkap : Keishin Naufa Alfaridzhi

NIM : 103112400061 Program Studi : S-1 Informatika

### ▪ **Algoritma & Penjelasan**

Algoritma Fibonacci yang digunakan pada program ini bekerja dengan cara menambahkan angka saat ini dengan angka sebelumnya dalam deret. Untuk mencapai ini, program menggunakan 3 variabel utama, **a** (current), **b** (next), **temp** (temporary untuk menampung **a+b**).

Setiap loop, untuk menghasilkan deret, program akan menghitung **a+b** kemudian disimpan dalam variabel **temp**. Kemudian geser satu langkah ke depan dengan:

- Mengubah value **a** menjadi **b**.
- Mengubah value **b** menjadi **temp**.

Program akan terus berulang hingga panjang deret yang diminta oleh user.

#### ▪ Flowchart

(Halaman selanjutnya)

![](_page_1_Figure_0.jpeg)

#### ▪ **Kode Program & Penjelasan**

```
1. package Modul2;
2. import java.util.Scanner;
3.
4. public class Main {
5. public static void main(String[] args) {
6. Scanner reader = new Scanner(System.in);
7. int a = 0;
8. int b = 1;
9. int temp = 0, total = 0, max = 0, min = 0, odd = 0, even = 0;
10. double rerata;
11.
12. System.out.print("Masukkan jumlah deret: ");
13. int input = reader.nextInt();
14. System.out.println();
15. reader.close();
16.
17. if (input <= 0) {
18. System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
19. } else {
20. System.out.println("Deret Fibonacci:");
21. for (int i = 0; i < input; i++) {
22. System.out.print(a);
23. System.out.print(" ");
24. total += a;
25. if (min > a) {
26. min = a;
27. }
28. if (max < a) {
29. max = a;
30. }
31. if (a % 2 != 0) {
32. odd += 1;
33. } else {
34. even += 1;
35. }
36. temp = a + b;
37. a = b;
38. b = temp;
39.
40. }
41. rerata = (double) total / input;
42. System.out.println("\n\nTotal\t\t: " + total);
43. System.out.println("Rata-rata\t: " + rerata);
44. System.out.println("Nilai terbesar\t: " + max);
45. System.out.println("Nilai terkecil\t: " + min);
46. System.out.println("Jumlah genap\t: " + even);
47. System.out.println("Jumlah ganjil\t: " + odd);
48. }
49. }
50.}
```

#### **Penjelasan:**

Program ini merupakan program untuk mencetak deret fibonacci sepanjang input yang diberikan oleh user. Selain mencetak fibonacci, program dapat menentukan: Ratarata, Nilai Tebesar (max), Nilai Terkecil (min), Jumlah Genap (even), Jumlah Ganjil (odd), dan total dari deret fibonacci yang telah dicetak. Kemudian terdapat ketentuan untuk input handling yang jika user input 0, maka cetak status invalid dan program berhenti. Untuk penjelasan rinci terkait program adalah sebagai berikut:

### 1. Inisialisasi Variabel dan Objek

Terdapat beberapa variabel yang akan digunakan, dengan variabel utama **a**, **b**, dan **temp** berupa *Integer*. Kemudian terdapat variabel **total**, **max**, **min**, **odd**, **even** berupa *integer* dan **rerata** berupa *double*. Membuat objek **reader** dari class Scanner yang berguna untuk membaca input dari user.

### 2. Menerima Input

Membuat variabel **input** berupa *integer* dengan value **reader.nextInt()** untuk scan input user.

### 3. Input Handling

Cek apakah input user sama dengan 0 atau tidak. Jika 0, maka print("Input tidak valid...") dan program berhenti. Selain 0, maka program berlanjut.

#### 4. Fibonacci

Pada bagian inilah merupakan logic dari deret fibonacci, seperti yang sudah dijelaskan pada poin *Algoritma & Penjelasan*. Terdapat pula logic untuk menentukan **total, max, min, odd, even, rerata**. Ini termasuk dalam perulangan yang sama dengan algoritma deret fibonacci kecuali untuk **rerata** yang dijalankan pada bagian luar perulangan.

- **total** : Menambahkan **a** ke dalam **total** setiap perulangan.

- **min** : Jika **min** > **a** maka ubah value **min** menjadi **a**.

- **max** : Jika **max** < **a** maka ubah value **max** menjadi **a**.

- **odd** & **even**: Jika **a** habis dibagi **2** tidak sama dengan 0, **odd+1**. Jika tidak, **even+1**

- **rerata** : Ubah **total** & **input** menjadi *double*. Bagi **total** dengan **input**.

▪ **Hasil Running Program**

-

▪ **Link Program Praktikum (Github)**

[kukingkux/PRAKTIKUM-PBO](https://github.com/kukingkux/PRAKTIKUM-PBO)