package Modul5.Agregasi;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("213000", "Fardi");
        Mahasiswa mhs1 = new Mahasiswa("213001", "Froid");
        Mahasiswa mhs2 = new Mahasiswa("213001", "Froid");
        Jurusan p = new Jurusan("6767", "Teknik Bahasa Indonesia");
        p.AddMahasiswa(mhs);
        p.AddMahasiswa(mhs1);
        p.AddMahasiswa(mhs2);
        p.DisplayMahasiswa();
    }
}
