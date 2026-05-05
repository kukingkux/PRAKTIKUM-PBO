package Modul9.VariableCasting;

class A {}
class B extends A {}

public class UpCast {
    public static void main(String[] args) {
    B b = new B();
    //implisit upcasting
    //dari variabel reference ke variabel reference lainnya
    A ab1 = b; 
    //implisit upcasting
    //dari suatu Object ke variabel reference
    A ab2 = new B();
    //explisit upcasting
    //dari variabel reference ke variabel reference lainnya
    A ab3 = (A) b; 
    //explisit upcasting
    //dari Object kel variabel reference
    A ab4 = (A) new B();
    }
}

