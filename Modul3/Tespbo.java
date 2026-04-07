package Modul3;

class Mahasiswa {
    String nama;
    String nim;

    void HaiMahasiswa() {
        System.out.println("Halo " + nama + " Dengan NIM " + nim);
    }
}

public class Tespbo {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Mamyor Temdy";
        mhs1.nim = "1031126767";
        mhs1.HaiMahasiswa();
    }
}
