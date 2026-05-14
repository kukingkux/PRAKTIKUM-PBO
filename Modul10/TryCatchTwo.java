package Modul10;

public class TryCatchTwo {
    public static void main(String[] args){ 
        try { 
            int x= args.length; 
            int y = 100/x;
            int[] arr={10,11};
            y = arr[x];
            System.out.println("Tidak terjadi eksepsi"); 
        } catch(ArithmeticException e) { 
            System.out.println("Terjadi eksepsi karena pembagian dengan nol"); 
        } catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Setelah blok try catch");
        } 
    }
}
