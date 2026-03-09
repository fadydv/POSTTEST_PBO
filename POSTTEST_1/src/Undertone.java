import java.util.ArrayList;

class Undertone {
    int id;
    String namaUndertone;
    String deskripsi;

    Undertone(int id, String namaUndertone, String deskripsi) {
        this.id = id;
        this.namaUndertone = namaUndertone;
        this.deskripsi = deskripsi;
    }

    static ArrayList<Undertone> defaultUndertones() {
        ArrayList<Undertone> daftar = new ArrayList<>();
        daftar.add(new Undertone(1, "Cool", "Rona biru atau pink."));
        daftar.add(new Undertone(2, "Warm", "Rona kuning atau emas."));
        daftar.add(new Undertone(3, "Neutral", "Seimbang cool dan warm."));
        return daftar;
    }
}