package Modul3.Unguided.VendingMachine;

public class VendingMachine {
    private String kodeMesin, pilihan;
    private int teh, kopi, susu;
    private double hargaTeh, hargaKopi, hargaSusu, saldoMasuk, totalPenjualan;

    public VendingMachine(String kodeMesin) {}
    public VendingMachine(String kodeMesin, int teh, int kopi, int susu) {
        this.kodeMesin = kodeMesin;
        this.teh = teh;
        this.kopi = kopi;
        this.susu = susu;
    }
    public VendingMachine(
        String kodeMesin,
        int teh,
        int kopi,
        int susu,
        double hargaTeh,
        double hargaKopi,
        double hargaSusu
    ) {
        this.kodeMesin = kodeMesin;
        this.teh = teh;
        this.kopi = kopi;
        this.susu = susu;
        this.hargaTeh = hargaTeh;
        this.hargaKopi = hargaKopi;
        this.hargaSusu = hargaSusu;
    }

    public double getHarga(String jenis) {
        if (jenis.equalsIgnoreCase("teh")) return hargaTeh;
        if (jenis.equalsIgnoreCase("kopi")) return hargaKopi;
        if (jenis.equalsIgnoreCase("susu")) return hargaSusu;
        return 0;
    }

    public double masukkanUang(double jumlah) {
        this.saldoMasuk = jumlah;
        return this.saldoMasuk;
    }
    
    public void pilihMinuman(String jenis) {
        pilihan = jenis.toLowerCase();
    }

    public Boolean batalkanTransaksi() {


        if (saldoMasuk < getHarga(this.pilihan)) {
            System.out.println("Uang tidak cukup.");
            System.out.println("Transaksi dibatalkan.");
            return true;
        }

        if (
            (this.pilihan.equals("teh") && teh <= 0) ||
            (this.pilihan.equals("kopi") && kopi <= 0) ||
            (this.pilihan.equals("susu") && susu <= 0)
        ) {
            System.err.println("Stok " + this.pilihan + " kosong.");
            System.out.println("Transaksi dibatalkan.");
            System.out.println("Mengembalikan uang...");
            System.out.println();
            return true;
        }

        if (pilihan.equals("x")) {
            System.out.println("Transaksi dibatalkan.");
            System.out.println("Mengembalikan uang...");
            return true;
        }
        return false;
    }

    public void tampilkanStatus(){
        System.out.println("=== Status Vending Machine | Kode " + this.kodeMesin);
        System.out.println("Stok Teh: " + teh + "| Rp" + hargaTeh +"/pcs");
        System.out.println("Stok Kopi: " + kopi + "| Rp" + hargaKopi +"/pcs");
        System.out.println("Stok Susu: " + susu + "| Rp" + hargaSusu +"/pcs");
        System.out.println("Total Penjualan: " + totalPenjualan);
    }

    public double tampilkanStatusPembelian() {
        if (this.pilihan.equals("teh")) {
            totalPenjualan += hargaTeh;
            teh--;
        } else if (this.pilihan.equals("kopi")) {
            totalPenjualan += hargaKopi;
            kopi--;
        } else if (this.pilihan.equals("susu")) {
            totalPenjualan += hargaSusu;
            susu--;
        }
        System.out.println("=== Status Pembelian | " + kodeMesin + " ===");
        System.out.println("Minuman yang diambil: " + pilihan);
        System.out.println("Jumlah yang dibayarkan: " + saldoMasuk);
        System.out.println("Kembali: " + (saldoMasuk-getHarga(this.pilihan)));
        System.out.println("Terima Kasih Sudah Berbelanja :D");
        return (saldoMasuk-getHarga(this.pilihan));
    }

}
