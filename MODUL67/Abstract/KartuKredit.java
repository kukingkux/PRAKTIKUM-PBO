package MODUL67.Abstract;

public class KartuKredit extends MetodePembayaran {
    private final double limitKredit;

    public KartuKredit(double limitKredit) {
        super("Kartu Kredit", 0);
        this.limitKredit = limitKredit;
    }

    @Override
    public boolean validasiPembayaran(double jumlah) {
        return (getSaldo() + jumlah) <= limitKredit;
    }

    @Override
    public void bayar(double jumlah) {
        if (jumlah <= 0) {
            tambahRiwayat("[GAGAL] " + getNamaMetode() + " - jumlah tidak valid: Rp " + (long) jumlah);
            return;
        }

        if (validasiPembayaran(jumlah)) {
            setSaldo(getSaldo() + jumlah);
            tambahRiwayat("[BERHASIL] " + getNamaMetode() + " transaksi Rp " + (long) jumlah
                    + " | total tagihan: Rp " + (long) getSaldo()
                    + " | limit: Rp " + (long) limitKredit);
        } else {
            tambahRiwayat("[GAGAL] " + getNamaMetode() + " transaksi Rp " + (long) jumlah
                    + " | tagihan saat ini: Rp " + (long) getSaldo()
                    + " | limit: Rp " + (long) limitKredit);
        }
    }

    @Override
    public void cekSaldo() {
        System.out.println(getNamaMetode() + " -> tagihan: Rp " + (long) getSaldo()
                + " / limit: Rp " + (long) limitKredit);
    }
}
