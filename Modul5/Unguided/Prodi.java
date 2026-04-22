package Modul5.Unguided;

import java.util.ArrayList;

public class Prodi {
    private String kodeProdi;
    private String namaProdi;
    private ArrayList<Dosen> daftarDosen;

    public Prodi(String kodeProdi, String namaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    public void tambahDosen(Dosen dosen) {
        if (!daftarDosen.contains(dosen)) {
            daftarDosen.add(dosen);
        }
    }

    public void tampilkanDosen() {
        System.out.println("Prodi : " + namaProdi + " (" + kodeProdi + ")");
        if (daftarDosen.isEmpty()) {
            System.out.println("Belum ada dosen.");
            System.out.println();
            return;
        }
        for (Dosen dosen : daftarDosen) {
            System.out.println(" - " + dosen);
        }
    }

    public String getKodeProdi() {
        return kodeProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }
}
