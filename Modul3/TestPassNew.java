package Modul3;
import Modul5.Teljom;

class yanto {
    int i, j;

    public yanto(int a, int b) {
        i = a;
        j = b;
        System.out.println("Objeg telah dibuat..");
    }

    void h(yanto e) {
        e.i = 10 * e.i;
        e.j = 100 * e.j;
        System.out.println(e.j + " " + e.i);
    }

    void display() {
        System.out.println();
    }
}

public class TestPassNew {
    public static void main(String[] args) {
        yanto b = new yanto(6, 7);
        b.h(b);

        Teljom tel = new Teljom();
        tel.setTeljom("Teljom Uni Puertorico");
        tel.getTeljom();
    }
}