package com.lipstick.service;

import com.lipstick.model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LipstickManager {
    private ArrayList<Lipstick> daftarLipstick = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private ArrayList<Undertone> undertones = Undertone.defaultUndertones();

    public Lipstick cari(int id) {
        for (Lipstick l : daftarLipstick) {
            if (l.getId() == id) return l;
        }
        return null;
    }

    public Lipstick cari(String nama) {
        for (Lipstick l : daftarLipstick) {
            if (l.getNamaProduk().equalsIgnoreCase(nama)) return l;
        }
        return null;
    }

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
        int pilUt = input.nextInt();
        String ut = (pilUt == 1) ? "Cool" : (pilUt == 2) ? "Warm" : "Neutral";

        System.out.print("Harga: ");
        int harga = input.nextInt();

        System.out.println("Pilih Jenis Lipstick:");
        System.out.println("1. Matte Lipstick");
        System.out.println("2. Lip Tint");
        System.out.print("Pilihan: ");
        int jenis = input.nextInt(); input.nextLine();

        if (jenis == 1) {
            System.out.print("Ketahanan (Jam): ");
            int tahan = input.nextInt(); input.nextLine();
            daftarLipstick.add(new MatteLipstick(id, nama, brand, warna, ut, harga, tahan));
        } else {
            System.out.print("Bahan Dasar: ");
            String base = input.nextLine();
            daftarLipstick.add(new LipTint(id, nama, brand, warna, ut, harga, base));
        }
        System.out.println("\nData Berhasil Ditambahkan!");
    }

    public void tampilkanLipstick() {
        if (daftarLipstick.isEmpty()) {
            System.out.println("\nKatalog masih kosong.");
            return;
        }
        System.out.println("\n===== DATA LENGKAP LIPSTICK =====");
        for (Lipstick l : daftarLipstick) {
            l.tampilkanInfo();
            System.out.println("---------------------------------");
        }
    }

    public void updateLipstick() {
        System.out.print("\nMasukkan ID yang ingin diupdate: ");
        int idCari = input.nextInt(); input.nextLine();

        Lipstick l = cari(idCari);

        if (l != null) {
            System.out.println("\n--- Masukkan Data Baru ---");
            System.out.print("Nama Baru: ");
            String namaBaru = input.nextLine();
            System.out.print("Brand Baru: ");
            l.setBrand(input.nextLine());
            System.out.print("Warna Baru: ");
            l.setWarna(input.nextLine());

            System.out.println("Pilih Undertone Baru:");
            for (Undertone u : undertones) {
                System.out.println(u.getId() + ". " + u.getNamaUndertone());
            }
            System.out.print("Pilihan: ");
            int pilUt = input.nextInt();
            l.setUndertone((pilUt == 1) ? "Cool" : (pilUt == 2) ? "Warm" : "Neutral");

            System.out.print("Harga Baru: ");
            int hargaBaru = input.nextInt(); input.nextLine();

            l.updateData(namaBaru, hargaBaru);

            if (l instanceof MatteLipstick) {
                System.out.print("Ketahanan Baru (Jam): ");
                ((MatteLipstick) l).setKetahananJam(input.nextInt()); input.nextLine();
            } else if (l instanceof LipTint) {
                System.out.print("Bahan Dasar Baru: ");
                ((LipTint) l).setBahanDasar(input.nextLine());
            }
            System.out.println("\nData Berhasil Diperbarui!");
        } else {
            System.out.println("ID tidak ditemukan.");
        }
    }

    public void hapusLipstick() {
        System.out.print("\nMasukkan ID yang ingin dihapus: ");
        int idCari = input.nextInt();
        if (daftarLipstick.removeIf(l -> l.getId() == idCari)) {
            System.out.println("Data Berhasil Dihapus!");
        } else {
            System.out.println("ID tidak ditemukan.");
        }
    }
}