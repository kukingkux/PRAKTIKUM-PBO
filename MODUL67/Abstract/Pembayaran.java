package MODUL67.Abstract;

import java.util.List;

public interface Pembayaran {
    void bayar(double jumlah);
    void cekSaldo();
    List<String> getRiwayat();
}
