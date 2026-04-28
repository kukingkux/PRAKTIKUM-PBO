package MODUL67.Inheritance;

public class Karyawan {
    private String nama;
    private String nip;
    private int gajiPokok;

    public Karyawan(String nama, String nip, int gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public int hitungGaji() {
        return gajiPokok;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + hitungGaji());
        System.out.println();
    }
}
