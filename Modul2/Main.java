package Modul2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int temp = 0, total = 0, max = 0, min = 0, odd = 0, even = 0;
        double rerata;

        System.out.print("Masukkan jumlah deret: ");
        int input = reader.nextInt();
        System.out.println();
        reader.close();
        
        if (input <= 0) {
            System.out.println("Input tidak valid. Jumlah harus lebih dari 0.");
        } else {
            System.out.println("Deret Fibonacci:");
            for (int i = 0; i < input; i++) {
                System.out.print(a);
                System.out.print(" ");
                total += a;
                if (min > a) {
                    min = a;
                }
                if (max < a) {
                    max = a;
                }
                if (a % 2 != 0) {
                    odd += 1;
                } else {
                    even += 1;
                }
                temp = a + b;
                a = b;
                b = temp;

            }
            rerata = (double) total / input;
            System.out.println("\n\nTotal\t\t: " + total);
            System.out.println("Rata-rata\t: " + rerata);
            System.out.println("Nilai terbesar\t: " + max);
            System.out.println("Nilai terkecil\t: " + min);
            System.out.println("Jumlah genap\t: " + even);
            System.out.println("Jumlah ganjil\t: " + odd);
        }
    }
}