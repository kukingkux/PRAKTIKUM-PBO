package Modul3;

class Contoh {
    private String pencipta;

    public void setter(String pencipta) {
        this.pencipta = pencipta;
    }

    public String getter() {
        return this.pencipta;
    }
}

public class Lagu {
    public static void main(String[] args) {
        Contoh heavenKnows = new Contoh();
        heavenKnows.setter("54 Ultra");
        System.out.println(heavenKnows.getter());
    }
}
