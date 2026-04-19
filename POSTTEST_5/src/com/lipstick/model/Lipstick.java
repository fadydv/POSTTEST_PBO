package com.lipstick.model;

public abstract class Lipstick extends Item {
    protected String namaProduk;
    protected String brand;
    protected int harga;
    protected String warna;
    protected String undertone;

    public Lipstick(int id, String namaProduk, String brand, String warna, String undertone, int harga) {
        super(id);
        this.namaProduk = namaProduk;
        this.brand = brand;
        this.warna = warna;
        this.undertone = undertone;
        this.harga = harga;
    }

    public abstract void tampilkanInfo();

    public void updateData(String namaBaru) {
        this.namaProduk = namaBaru;
    }

    public void updateData(String namaBaru, int hargaBaru) {
        this.namaProduk = namaBaru;
        this.harga = hargaBaru;
    }

    public String getNamaProduk() { return namaProduk; }
    public String getBrand() { return brand; }
    public String getWarna() { return warna; }
    public String getUndertone() { return undertone; }
    public int getHarga() { return harga; }

    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setWarna(String warna) { this.warna = warna; }
    public void setUndertone(String undertone) { this.undertone = undertone; }
    public void setHarga(int harga) { this.harga = harga; }
}