package MODUL67.Abstract;

public class RekeningBank extends MetodePembayaran {
    private static final double BIAYA_ADMIN = 2500;

    public RekeningBank(double saldoAwal) {
        super("Rekening Bank", saldoAwal);
    }

    @Override
    public boolean validasiPembayaran(double jumlah) {
        return getSaldo() >= (jumlah + BIAYA_ADMIN);
    }

    @Override
    public void bayar(double jumlah) {
        if (jumlah <= 0) {
            tambahRiwayat("[GAGAL] " + getNamaMetode() + " - jumlah tidak valid: Rp " + (long) jumlah);
            return;
        }

        double totalPotong = jumlah + BIAYA_ADMIN;

        if (validasiPembayaran(jumlah)) {
            setSaldo(getSaldo() - totalPotong);
            tambahRiwayat("[BERHASIL] " + getNamaMetode() + " bayar Rp " + (long) jumlah
                    + " | biaya admin: Rp " + (long) BIAYA_ADMIN
                    + " | sisa saldo: Rp " + (long) getSaldo());
        } else {
            tambahRiwayat("[GAGAL] " + getNamaMetode() + " bayar Rp " + (long) jumlah
                    + " | butuh: Rp " + (long) totalPotong
                    + " | saldo saat ini: Rp " + (long) getSaldo());
        }
    }
}
