package com.lipstick.model;

import java.util.ArrayList;

public class Undertone {
    private int id;
    private String namaUndertone;

    public Undertone(int id, String namaUndertone) {
        this.id = id;
        this.namaUndertone = namaUndertone;
    }

    public int getId() {
        return id;
    }

    public String getNamaUndertone() {
        return namaUndertone;
    }

    public static ArrayList<Undertone> defaultUndertones() {
        ArrayList<Undertone> daftar = new ArrayList<>();
        daftar.add(new Undertone(1, "Cool"));
        daftar.add(new Undertone(2, "Warm"));
        daftar.add(new Undertone(3, "Neutral"));
        return daftar;
    }
}