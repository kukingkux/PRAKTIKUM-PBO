package Modul9.VariableCasting;

class A {}
class B extends A {}

public class DownCast {
    public static void main(String[] args) {
        DownCast t = new DownCast();
        t.lAkukanSesuatu();
    }
    void lAkukanSesuatu() {
        A a = new A();
        /*Statement di bawah dapat dicompile, akan tetapi
        *saat dijalankan akan melemparkan exception
        *ClassCastException !!!!
        */
        B b = (B) a;
    }
}

/*
Saat dicompile berhasil !!! (dengan javac)
Saat dijalankan (dengan java) akan menghasilkan :
java.lang.NoClassDefFoundError: inheritance/VarRefCast03
Exception in thread "main"
Java Result: 1
*/