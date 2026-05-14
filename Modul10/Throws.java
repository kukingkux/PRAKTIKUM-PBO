package Modul10;

class Coba { 
 
    public void tampil() throws Exception { 
        int x=0; 
        if (x<5) 
        throw new Exception("Lebih kecil 5");
    }
}

public class Throws {
    public static void main (String args[]) { 
        Coba c = new Coba(); 
        try { 
            c.tampil(); 
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        } 
            System.out.println("Program Selesai"); 
    }
}
