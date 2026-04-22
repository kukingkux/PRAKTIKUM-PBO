package Modul5.Unguided;

import java.util.ArrayList;

public class Fakultas {
    private String kodeFakultas;
    private String namaFakultas;
    private ArrayList<Prodi> listProdi;

    public Fakultas(String kodeFakultas, String namaFakultas) {
        this.kodeFakultas = kodeFakultas;
        this.namaFakultas = namaFakultas;
        this.listProdi = new ArrayList<>();
    }

    public void tambahProdi(Prodi prodi) {
        if (!listProdi.contains(prodi)) {
            listProdi.add(prodi);
        }
    }

    public void tampilkanProdi() {
        System.out.println("Fakultas : " + namaFakultas + " (" + kodeFakultas + ")");
        if (listProdi.isEmpty()) {
            System.out.println("Belum ada prodi.");
            return;
        }
        for (Prodi prodi : listProdi) {
            System.out.println(" - " + prodi.getKodeProdi() + " " + prodi.getNamaProdi());
        }
    }

    public String getKodeFakultas() {
        return kodeFakultas;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }
}
