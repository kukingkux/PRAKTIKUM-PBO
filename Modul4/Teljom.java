package Modul5;

public class Teljom {
    private String instansi;
    private int tahun;

    public Teljom(){}

    public Teljom (int tahun) {
        this.tahun = tahun;
    }

    public Teljom (String instansi) {
        this.instansi = instansi;
    }

    public Teljom (String instansi, int tahun) {
        this.instansi = instansi;
        this.tahun = tahun;
    }

    public void setTeljom(String instansi) {
        this.instansi = instansi;
    }

    public void getTeljom() {
        System.out.println(instansi);
    }
}
