package MODUL67.Inheritance;

public class KaryawanKontrak extends Karyawan {
    private int durasiKontrak;
    private int bonusPerBulan;

    public KaryawanKontrak(String nama, String nip, int gajiPokok, int durasiKontrak, int bonusPerBulan) {
        super(nama, nip, gajiPokok);
        this.durasiKontrak = durasiKontrak;
        this.bonusPerBulan = bonusPerBulan;
    }

    @Override
    public int hitungGaji() {
        return super.hitungGaji() +  bonusPerBulan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNip());
        System.out.println("Gaji Pokok: " + getGajiPokok());
        System.out.println("Durasi Kontrak: " + durasiKontrak + " bulan");
        System.out.println("Bonus per Bulan: " + bonusPerBulan);
        System.out.println("Gaji: " + hitungGaji());
        System.out.println();
    }
}
