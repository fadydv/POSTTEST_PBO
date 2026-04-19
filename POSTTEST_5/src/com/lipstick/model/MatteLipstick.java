package com.lipstick.model;

public class MatteLipstick extends Lipstick {
    private int ketahananJam;

    public MatteLipstick(int id, String namaProduk, String brand, String warna, String undertone, int harga, int ketahananJam) {
        super(id, namaProduk, brand, warna, undertone, harga);
        this.ketahananJam = ketahananJam;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID Produk    : " + id);
        System.out.println("Nama Produk  : " + namaProduk);
        System.out.println("Brand        : " + brand);
        System.out.println("Warna        : " + warna);
        System.out.println("Undertone    : " + undertone);
        System.out.println("Harga        : Rp" + harga);
        System.out.println("Jenis        : Matte Lipstick");
        System.out.println("Ketahanan    : " + ketahananJam + " Jam");
    }

    public int getKetahananJam() { return ketahananJam; }
    public void setKetahananJam(int ketahananJam) { this.ketahananJam = ketahananJam; }
}