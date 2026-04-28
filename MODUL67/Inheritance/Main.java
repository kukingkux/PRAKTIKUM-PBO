package MODUL67.Inheritance;

public class Main {
    public static void main(String[] args) {
        KaryawanTetap kingNatsir = new KaryawanTetap("King Natsir", "10340001", 3500000, 600000);
        KaryawanKontrak masRusdi = new KaryawanKontrak("Mas Rusdi", "10440001", 3000000, 12, 500000);

        kingNatsir.tampilInfo();
        masRusdi.tampilInfo();
    }
}
