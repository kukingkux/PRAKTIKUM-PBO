package Modul3.Unguided.VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachine wallahiVM = new VendingMachine(
            "w411h1",
            5,
            7,
            9,
            10000,
            18000,
            12000);

        Scanner reader = new Scanner(System.in);
        
        System.out.println("Selamat Datang! | wallahiVM");
        System.out.print("Masukkan Uang: ");
        double saldo = reader.nextDouble();
        
        String inputMenu = "";
        while (!inputMenu.equals("x")) {
            wallahiVM.masukkanUang(saldo);
            System.out.println();
            inputMenu = "";
            
            System.out.println("Saldo saat ini: " + saldo);
            System.out.println("Minuman: ");
            System.out.println("1. Teh | Rp" + wallahiVM.getHarga("teh")+"/pcs");
            System.out.println("2. Kopi | Rp" + wallahiVM.getHarga("kopi")+"/pcs");
            System.out.println("3. Susu | Rp" + wallahiVM.getHarga("susu")+"/pcs");
            System.out.println("4. Status Mesin");
            System.out.println("Batalkan Transaksi (x)");
            System.out.print("Pilih Minuman (ketik jenis [cth: 'teh']): ");
            inputMenu = reader.next().toLowerCase();

            if (inputMenu.equals("4")) {
                wallahiVM.tampilkanStatus();
                continue;
            }

            wallahiVM.pilihMinuman(inputMenu);
            System.out.println();
            
            if (wallahiVM.batalkanTransaksi()) {
                System.out.println("Saldo yang dikembalikan: " + saldo);
                break;
            }

            if (
                inputMenu.equals("teh") ||
                inputMenu.equals("kopi") ||
                inputMenu.equals("susu")
            ) {
                wallahiVM.tampilkanStatusPembelian();
                saldo -= wallahiVM.getHarga(inputMenu);
            } else {
                System.out.println("Input Invalid.");
            }
        }

        System.out.println();
        wallahiVM.tampilkanStatus();

        reader.close();
    }
}
