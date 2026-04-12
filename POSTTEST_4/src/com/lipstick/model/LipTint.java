package com.lipstick.model;

public class LipTint extends Lipstick {
    private String bahanDasar;

    public LipTint(int id, String namaProduk, String brand, String warna, String undertone, int harga, String bahanDasar) {
        super(id, namaProduk, brand, warna, undertone, harga);
        this.bahanDasar = bahanDasar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis        : Lip Tint");
        System.out.println("Bahan Dasar  : " + bahanDasar);
    }

    public String getBahanDasar() { return bahanDasar; }
    public void setBahanDasar(String bahanDasar) { this.bahanDasar = bahanDasar; }
}