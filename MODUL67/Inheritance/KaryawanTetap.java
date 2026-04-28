package MODUL67.Inheritance;

public class KaryawanTetap extends Karyawan{
    private int tunjangan;

    public KaryawanTetap(String nama, String nip, int gajiPokok, int tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public int hitungGaji() {
        return super.hitungGaji() + tunjangan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIP: " + getNip());
        System.out.println("Gaji Pokok: " + getGajiPokok() );
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Gaji: " + hitungGaji());
        System.out.println();
    }
}
