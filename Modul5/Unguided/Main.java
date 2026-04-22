package Modul5.Unguided;

public class Main {
    public static void main(String[] args) {
        Fakultas fakultasInformatika = new Fakultas("FIF01", "Fakultas teknikInformatika");

        Prodi teknikInformatika = new Prodi("IF01", "Teknik Informatika");
        Prodi rpl = new Prodi("RPL01", "Rekayasa Perangkat Lunak");

        fakultasInformatika.tambahProdi(teknikInformatika);
        fakultasInformatika.tambahProdi(rpl);

        teknikInformatika.tampilkanDosen();
        rpl.tampilkanDosen();

        Dosen dosen1 = new Dosen("D001", "Sombrenion");
        Dosen dosen2 = new Dosen("D002", "Companion");
        Dosen dosen3 = new Dosen("D003", "Sonion");

        dosen1.mengajar(teknikInformatika);
        dosen2.mengajar(teknikInformatika);
        dosen3.mengajar(rpl);

        Dosen dosenBebas = new Dosen("D004", "Joc");
        dosenBebas.mengajar();

        System.out.println();
        fakultasInformatika.tampilkanProdi();
        System.out.println();
        teknikInformatika.tampilkanDosen();
        System.out.println();
        rpl.tampilkanDosen();
    }
}
