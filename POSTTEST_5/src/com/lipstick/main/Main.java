package com.lipstick.main;

import com.lipstick.service.LipstickManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LipstickManager manager = new LipstickManager();
        int pilihan;

        do {
            System.out.println("\n===== SISTEM MANAJEMEN LIPSTICK =====");
            System.out.println("1. Tambah Data Lipstick");
            System.out.println("2. Lihat Data Lipstick");
            System.out.println("3. Update Data Lipstick");
            System.out.println("4. Hapus Data Lipstick");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: manager.tambahLipstick(); break;
                case 2: manager.tampilkanLipstick(); break;
                case 3: manager.updateLipstick(); break;
                case 4: manager.hapusLipstick(); break;
                case 5: System.out.println("Selesai. Terima kasih!"); break;
                default: System.out.println("Menu tidak tersedia."); break;
            }
        } while (pilihan != 5);
    }
}