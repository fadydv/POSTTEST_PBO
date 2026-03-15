package com.lipstick.service;

import com.lipstick.model.Lipstick;
import com.lipstick.model.Undertone;
import java.util.ArrayList;
import java.util.Scanner;

public class LipstickManager {
    private ArrayList<Lipstick> daftarLipstick = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private ArrayList<Undertone> undertones = Undertone.defaultUndertones();

    public void tambahLipstick() {
        System.out.println("\n--- Tambah Data ---");
        System.out.print("ID Produk: ");
        int id = input.nextInt(); input.nextLine();
        System.out.print("Nama Produk: ");
        String nama = input.nextLine();
        System.out.print("Brand: ");
        String brand = input.nextLine();
        System.out.print("Warna: ");
        String warna = input.nextLine();

        System.out.println("Pilih Undertone:");
        for (Undertone u : undertones) {
            System.out.println(u.getId() + ". " + u.getNamaUndertone());
        }
        System.out.print("Pilihan: ");
        int pil = input.nextInt();
        String ut = (pil == 1) ? "Cool" : (pil == 2) ? "Warm" : "Neutral";

        System.out.print("Harga: ");
        int harga = input.nextInt();

        Lipstick lipstickBaru = new Lipstick(id, nama, brand, warna, ut, 0);
        lipstickBaru.setHarga(harga); // Validasi setter

        daftarLipstick.add(lipstickBaru);
        System.out.println("Data Berhasil Ditambahkan!");
    }

    public void tampilkanLipstick() {
        System.out.println("\n===== DATA LENGKAP LIPSTICK =====");
        if (daftarLipstick.isEmpty()) {
            System.out.println("Data masih kosong!");
            return;
        }
        for (Lipstick l : daftarLipstick) {
            System.out.println("ID       : " + l.getId());
            System.out.println("Produk   : " + l.getNamaProduk());
            System.out.println("Brand    : " + l.getBrand());
            System.out.println("Warna    : " + l.getWarna());
            System.out.println("Undertone: " + l.getUndertone());
            System.out.println("Harga    : Rp" + l.getHarga());
            System.out.println("---------------------------------");
        }
    }

    public void updateLipstick() {
        System.out.print("\nMasukkan ID untuk Update: ");
        int idCari = input.nextInt();
        input.nextLine();

        for (Lipstick l : daftarLipstick) {
            if (l.getId() == idCari) {
                System.out.println("--- Masukkan Data Baru ---");

                System.out.print("Nama Baru: ");
                l.setNamaProduk(input.nextLine());

                System.out.print("Brand Baru: ");
                l.setBrand(input.nextLine());

                System.out.print("Warna Baru: ");
                l.setWarna(input.nextLine());

                System.out.println("Pilih Undertone Baru:");
                for (Undertone u : undertones) {
                    System.out.println(u.getId() + ". " + u.getNamaUndertone());
                }
                System.out.print("Pilihan: ");
                int pil = input.nextInt();
                input.nextLine();

                String utBaru = "Neutral";
                for (Undertone u : undertones) {
                    if (u.getId() == pil) {
                        utBaru = u.getNamaUndertone();
                        break;
                    }
                }
                l.setUndertone(utBaru);

                System.out.print("Harga Baru: ");
                l.setHarga(input.nextInt());
                input.nextLine();

                System.out.println("Data ID " + idCari + " Berhasil Diperbarui!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }

    public void hapusLipstick() {
        System.out.print("\nID yang dihapus: ");
        int idCari = input.nextInt();
        boolean removed = daftarLipstick.removeIf(l -> l.getId() == idCari);
        if (removed) {
            System.out.println("Data Berhasil Dihapus.");
        } else {
            System.out.println("ID tidak ditemukan.");
        }
    }
}