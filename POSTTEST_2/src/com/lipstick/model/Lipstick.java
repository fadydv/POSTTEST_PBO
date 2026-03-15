package com.lipstick.model;

public class Lipstick extends Item {

    private String namaProduk;
    private String brand;
    private int harga;

    String warna;
    String undertone;

    public Lipstick(int id, String namaProduk, String brand, String warna, String undertone, int harga) {
        super(id);
        this.namaProduk = namaProduk;
        this.brand = brand;
        this.warna = warna;
        this.undertone = undertone;
        this.harga = harga;
    }

    public int getId() { return id; }
    public String getNamaProduk() { return namaProduk; }
    public String getBrand() { return brand; }
    public String getWarna() { return warna; }
    public String getUndertone() { return undertone; }
    public int getHarga() { return harga; }

    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setWarna(String warna) { this.warna = warna; }
    public void setUndertone(String undertone) { this.undertone = undertone; }

    public void setHarga(int harga) {
        if (harga < 0) {
            System.out.println("Peringatan: Harga tidak boleh negatif! Otomatis diset ke 0.");
            this.harga = 0;
        } else {
            this.harga = harga;
        }
    }
}