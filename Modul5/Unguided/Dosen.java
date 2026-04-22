package Modul5.Unguided;

public class Dosen {
    private String nip;
    private String nama;

    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar.");
    }

    public void mengajar(Prodi prodi) {
        prodi.tambahDosen(this);
        System.out.println(nama + " ditambahkan ke Prodi " + prodi.getNamaProdi());
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return nip + " - " + nama;
    }
}
