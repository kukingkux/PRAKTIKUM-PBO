package MODUL67.Abstract;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DompetDigital dompet = new DompetDigital(150000);
        KartuKredit kartu = new KartuKredit(5000000);
        RekeningBank rekening = new RekeningBank(300000);

        dompet.bayar(50000);
        dompet.bayar(120000);

        kartu.bayar(2000000);
        kartu.bayar(3500000);

        rekening.bayar(100000);
        rekening.bayar(200000);

        System.out.println("Cek Saldo & Tagihan:");
        dompet.cekSaldo();
        kartu.cekSaldo();
        rekening.cekSaldo();

        tampilkanRiwayat("Dompet Digital", dompet.getRiwayat());
        tampilkanRiwayat("Kartu Kredit", kartu.getRiwayat());
        tampilkanRiwayat("Rekening Bank", rekening.getRiwayat());
    }

    private static void tampilkanRiwayat(String judul, List<String> riwayat) {
        System.out.println("\nRiwayat " + judul + ":");
        for (String item : riwayat) {
            System.out.println(item);
        }
    }
}
