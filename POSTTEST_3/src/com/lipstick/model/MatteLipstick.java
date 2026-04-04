package com.lipstick.model;

public class MatteLipstick extends Lipstick {
    private int ketahananJam;

    public MatteLipstick(int id, String namaProduk, String brand, String warna, String undertone, int harga, int ketahananJam) {
        super(id, namaProduk, brand, warna, undertone, harga);
        this.ketahananJam = ketahananJam;
    }

    public int getKetahananJam() { return ketahananJam; }
    public void setKetahananJam(int ketahananJam) { this.ketahananJam = ketahananJam; }
}