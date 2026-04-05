POSTTEST 3
Nama    : Andi Nurfadillah Hasan  
NIM     : 2409106087  
Kelas   : Informatika B2 '24


Judul Program
Sistem Manajemen Produk Lipstick Berdasarkan Undertone Kulit


Latar Belakang
Program ini merupakan aplikasi berbasis Java yang dirancang untuk mengelola data katalog produk lipstick secara terorganisir.
Sistem memungkinkan pengguna untuk memetakan produk berdasarkan kecocokan rona kulit (undertone).
Pada tahap pengembangan ini, arsitektur program telah ditingkatkan dengan menerapkan prinsip Inheritance (Pewarisan) dan Polymorphism.
Produk kini dikelompokkan ke dalam kategori yang lebih spesifik, yaitu Matte Lipstick dan Lip Tint, di mana masing-masing memiliki atribut unik yang membedakannya satu sama lain.
Seluruh data dikelola melalui operasi CRUD (Create, Read, Update, Delete) yang dijalankan melalui terminal.


Struktur Proyek dan Package
Kode program dibagi ke dalam tiga package utama untuk menjaga modularitas dan memudahkan proses pemeliharaan kode:
1. com.lipstick.main, Berisi class `Main` sebagai titik masuk (entry point) aplikasi.
2. com.lipstick.model, Berisi model data utama seperti `Item`, `Lipstick`, `MatteLipstick`, `LipTint`, dan `Undertone`.
3. com.lipstick.service, Berisi class `LipstickManager` yang menangani seluruh logika operasional dan manipulasi data dalam ArrayList.


Penjelasan Class yang Digunakan
Struktur program menerapkan konsep Object-Oriented Programming (OOP) sebagai berikut:
1. Class Item (Superclass)
   Berfungsi sebagai entitas dasar yang memegang atribut umum.
   Atribut `id` menggunakan modifier `protected` agar dapat diwariskan dan diakses langsung oleh semua subclass di bawahnya.

2. Class Lipstick (Parent Class)
   Turunan dari class `Item` yang mendefinisikan atribut dasar lipstick seperti `namaProduk`, `brand`, `warna`, `undertone`, dan `harga`. 
   Penggunaan modifier `protected` pada atribut ini memungkinkan subclass spesifik untuk mengakses data secara langsung namun tetap aman dari akses class luar package.

3. Subclass, MatteLipstick dan LipTint (Inheritance)
   Kedua class ini mewarisi seluruh sifat dari class `Lipstick` melalui keyword extends.
   Selain atribut warisan, keduanya memiliki karakteristik unik:

- MatteLipstick, Memiliki atribut tambahan `ketahananJam` (integer) untuk menyimpan durasi ketahanan produk pada bibir.
- LipTint, Memiliki atribut tambahan `bahanDasar` (String) untuk mendefinisikan formula produk (seperti Water atau Oil base).

4. Class LipstickManager (Logic Layer)
   Mengelola `ArrayList<Lipstick>` yang mampu menampung berbagai objek baik itu Matte maupun LipTint secara bersamaan.
   Manager ini menangani proses validasi input, pencarian data berdasarkan ID, serta pengaturan alur keluar-masuk data.


Penjelasan Code
Beberapa poin teknis utama dalam pengembangan sistem ini antara lain:
1. Implementasi Inheritance
   Menggunakan keyword `extends` untuk menghubungkan class spesifik dengan parent class-nya, sehingga struktur kode lebih ringkas dan tidak terjadi duplikasi atribut.

2. Penggunaan Instanceof
   Pada fitur "Lihat Data", sistem menggunakan operator `instanceof` untuk mengenali tipe objek secara dinamis saat program berjalan (runtime), sehingga atribut unik dari masing-masing jenis lipstick dapat ditampilkan dengan benar.

3. Access Control dan Encapsulation
   Atribut sensitif tetap terlindungi. Interaksi data dilakukan melalui method getter dan setter untuk menjaga integritas nilai, misalnya mencegah harga bernilai negatif.

4. Upcasting dan Downcasting
   Objek dari subclass (`MatteLipstick`/`LipTint`) disimpan ke dalam list bertipe `Lipstick` (Upcasting). Saat dibutuhkan untuk akses atribut spesifik, sistem melakukan Downcasting secara aman.

5. Manajemen Buffer
   Menggunakan kombinasi `input.nextInt()` dan `input.nextLine()` secara cermat untuk memastikan proses input data string tidak terlewati oleh karakter newline sisa dari input angka.

6. Penggunaan Keyword super()
   Dalam konstruktor class MatteLipstick dan LipTint, keyword super() digunakan untuk memanggil konstruktor dari parent class (Lipstick).
   Hal ini memastikan bahwa atribut bersama seperti id, namaProduk, brand, warna, undertone, dan harga diinisialisasi secara terpusat di class induk sebelum atribut unik milik subclass ditambahkan.


Fitur dan Tampilan Program
1. Menu Utama
   Tampilan awal saat program dijalankan.
   ![Menu Utama](assets/menu.png)

2. Tambah Data
   Input data produk baru ke dalam sistem. 
   ![Tambah Data](assets/tambah.png)

3. Lihat Data
   Menampilkan daftar lengkap produk yang tersimpan.
   ![Lihat Data](assets/lihat.png)

4. Update Data
   Memperbarui informasi produk berdasarkan ID.
   ![Update Data](assets/update.png)

5. Hapus Data
   Menghapus produk dari daftar berdasarkan ID unik.
   ![Hapus Data](assets/hapus.png)

6. Keluar
   Mengakhiri sesi program dengan aman.
   ![Keluar](assets/keluar.png)
