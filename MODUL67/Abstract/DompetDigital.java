package MODUL67.Abstract;

public class DompetDigital extends MetodePembayaran {
    public DompetDigital(double saldoAwal) {
        super("Dompet Digital", saldoAwal);
    }

    @Override
    public boolean validasiPembayaran(double jumlah) {
        return getSaldo() >= jumlah;
    }

    @Override
    public void bayar(double jumlah) {
        if (jumlah <= 0) {
            tambahRiwayat("[GAGAL] " + getNamaMetode() + " - jumlah tidak valid: Rp " + (long) jumlah);
            return;
        }

        if (validasiPembayaran(jumlah)) {
            setSaldo(getSaldo() - jumlah);
            tambahRiwayat("[BERHASIL] " + getNamaMetode() + " bayar Rp " + (long) jumlah
                    + " | sisa saldo: Rp " + (long) getSaldo());
        } else {
            tambahRiwayat("[GAGAL] " + getNamaMetode() + " bayar Rp " + (long) jumlah
                    + " | saldo saat ini: Rp " + (long) getSaldo());
        }
    }
}
