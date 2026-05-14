package Modul10;

public class Finally {
    public static void main(String[] args){ 
        int x = 3; 
        int[] arr = {10,11,12}; 
        try { 
            System.out.println(arr[x]); 
            System.out.println("Tidak Terjadi Eksepsi"); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Terjadi Eksepsi"); 
            System.out.println(arr[x-4]); 
        } finally { 
            System.out.println("Program Selesai"); 
        } 
    }
}
