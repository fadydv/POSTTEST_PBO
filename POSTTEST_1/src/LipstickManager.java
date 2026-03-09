import java.util.ArrayList;
import java.util.Scanner;

class LipstickManager {
    ArrayList<Lipstick> daftarLipstick = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    ArrayList<Undertone> undertones = Undertone.defaultUndertones();

    void tambahLipstick() {
        System.out.println("\n--- Tambah Data ---");
        System.out.print("ID Produk: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Nama Produk: ");
        String nama = input.nextLine();

        System.out.print("Brand: ");
        String brand = input.nextLine();

        System.out.print("Warna: ");
        String warna = input.nextLine();

        System.out.println("Pilih Undertone:");
        for (Undertone u : undertones) {
            System.out.println(u.id + ". " + u.namaUndertone);
        }
        System.out.print("Pilihan: ");
        int pil = input.nextInt();

        String ut = "Neutral";
        for (Undertone u : undertones) {
            if (u.id == pil) {
                ut = u.namaUndertone;
            }
        }

        System.out.print("Harga: ");
        int harga = input.nextInt();

        daftarLipstick.add(new Lipstick(id, nama, brand, warna, ut, harga));
        System.out.println("Data Berhasil Ditambahkan!");
    }

    void tampilkanLipstick() {
        System.out.println("\n===== DATA LENGKAP LIPSTICK =====");
        if (daftarLipstick.isEmpty()) {
            System.out.println("Data masih kosong!");
            return;
        }
        for (Lipstick l : daftarLipstick) {
            System.out.println("ID       : " + l.id);
            System.out.println("Produk   : " + l.namaProduk);
            System.out.println("Brand    : " + l.brand);
            System.out.println("Warna    : " + l.warna);
            System.out.println("Undertone: " + l.undertone);
            System.out.println("Harga    : Rp" + l.harga);
            System.out.println("---------------------------------");
        }
    }

    void updateLipstick() {
        System.out.print("\nMasukkan ID untuk Update: ");
        int idCari = input.nextInt();
        input.nextLine();

        for (Lipstick l : daftarLipstick) {
            if (l.id == idCari) {
                System.out.println("--- Masukkan Data Baru ---");

                System.out.print("Nama Baru: ");
                l.namaProduk = input.nextLine();

                System.out.print("Brand Baru: ");
                l.brand = input.nextLine();

                System.out.print("Warna Baru: ");
                l.warna = input.nextLine();

                System.out.println("Pilih Undertone Baru:");
                for (Undertone u : undertones) {
                    System.out.println(u.id + ". " + u.namaUndertone);
                }
                System.out.print("Pilihan: ");
                int pil = input.nextInt();
                input.nextLine();

                for (Undertone u : undertones) {
                    if (u.id == pil) {
                        l.undertone = u.namaUndertone;
                        break;
                    }
                }

                System.out.print("Harga Baru: ");
                l.harga = input.nextInt();
                input.nextLine();

                System.out.println("Data ID " + idCari + " Berhasil Diperbarui!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }

    void hapusLipstick() {
        System.out.print("\nID yang dihapus: ");
        int idCari = input.nextInt();
        for (int i = 0; i < daftarLipstick.size(); i++) {
            if (daftarLipstick.get(i).id == idCari) {
                daftarLipstick.remove(i);
                System.out.println("Data Terhapus!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
}