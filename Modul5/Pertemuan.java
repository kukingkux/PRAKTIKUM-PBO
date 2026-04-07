package Modul5;

class Manusia {
    private String nama;
    private int umur;

    public Manusia(){}

    public Manusia(String nama) {
        this.nama = nama;
    }

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void setNama (String a) {
        nama = a;
    }
    public String getNama() {
        return nama;
    }
    public void setUmur(int a) {
        umur = a;
    }
    public int getUmur() {
        return umur;
    }

    
}

public class Pertemuan {
    public static void main(String[] args) {
        Manusia mhs = new Manusia();
        mhs.setNama("Keishin");
        System.out.println(mhs.getNama());

        Manusia mhs1 = new Manusia("Bahsuyl");
        // mhs1.setNama("Bahslis");
        System.out.println(mhs1.getNama());
        
    }
}


