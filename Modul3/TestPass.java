package Modul3;

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

public class TestPass {
    public static void main(String[] args) {
        yanto b = new yanto(6, 7);
        b.h(b);
    }
}