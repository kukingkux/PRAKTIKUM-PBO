package Modul5.Asosiasi;

public class Main {
        public static void main(String[] args) { 
        Mahasiswas m = new Mahasiswas(); 
         
        m.setNim("130118383"); 
        m.setNama("Budi"); 
         
        Dosens d = new Dosens(); 
        d.giveScore(m, 90);  
         
        System.out.println("Nim :"+m.getNim()); 
        System.out.println("Nama :"+m.getNama()); 
        System.out.println("Nilai :"+d.getScore(m)); 
    } 
}
