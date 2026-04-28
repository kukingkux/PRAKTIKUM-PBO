package MODUL67.Abstract;

import java.util.ArrayList;
import java.util.List;

public abstract class MetodePembayaran implements Pembayaran {
    private String namaMetode;
    private double saldo;
    private List<String> riwayat;

    public MetodePembayaran(String namaMetode, double saldoAwal) {
        this.namaMetode = namaMetode;
        this.saldo = saldoAwal;
        this.riwayat = new ArrayList<>();
    }

    public abstract boolean validasiPembayaran(double jumlah);

    public String getNamaMetode() {
        return namaMetode;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tambahRiwayat(String catatan) {
        riwayat.add(catatan);
    }

    @Override
    public void cekSaldo() {
        System.out.println(namaMetode + " -> Rp " + (long) saldo);
    }

    @Override
    public List<String> getRiwayat() {
        return riwayat;
    }
}
