package Modul10;

public class TryCatchOne {
    public static void main(String[] args) { 
        try { 
            int[] arr = new int[1]; 
            System.out.println(arr[1]); 
            System.out.println("Baris ini tidak akan pernah dieksekusi..."); 
        } catch(ArithmeticException e) { 
            System.out.println("Terjadi eksepsi karena indeks di luar kapasitas array"); 
        }

        System.out.println("Sesudah blok try catch"); 
    } 
}
