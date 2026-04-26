/* Nama File    : MSminar.java
 * Deskripsi    : berisi aplikasi method dalam class Seminar
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class MSeminar {
    public static void main(String[] args) {
        // e. 2 dosen
        Dosen d1 = new Dosen("Sitha", "120261");
        Dosen d2 = new Dosen("Wildan", "120262");
        // 5 mahasiswa
        Mahasiswa m1 = new Mahasiswa("Putra", "220261", d1);
        Mahasiswa m2 = new Mahasiswa("Agra", "220262", d1);
        Mahasiswa m3 = new Mahasiswa("Sila", "220263", d2);
        Mahasiswa m4 = new Mahasiswa("Kana", "220264", d2);
        Mahasiswa m5 = new Mahasiswa("Eja", "220265", d1);

        // b. objek seminar
        Seminar seminar = new Seminar();

        // f. registrasi semua peserta
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(m4);
        seminar.registrasi(m5);

        // c. jumlah peserta
        System.out.println("Jumlah Peserta: " + seminar.countPeserta());

        // g. menampilkan peserta
        seminar.tampilPeserta();
        System.out.println();

        // h. jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa: " + seminar.countMahasiswa());

        // i. mengeset dosen wali
        System.out.println("Data Mahasiswa m1 sebelumnya: ");
        m1.tampilDataMahasiswa();
        System.out.println("Data Mahasiswa m1 setelah setWali: ");
        m1.setWali(d2);
        m1.tampilDataMahasiswa();

        // j. menampilkan data mahasiswa
        System.out.println("Data Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}

/* 
Cara kerja Polimorfisme:
Polimorfisme dalam Pemrograman Berorientasi Objek adalah suatu method yang 
bisa memiliki banyak peran. Maksudnya adalah method bisa memiliki perilaku 
yang berbeda walau namanya sama, method ini bisa berubah peran sesuai pemanggilannya.

Polimorfisme meliputi 3 jenis pada praktikum kali ini, yaitu :
1. Polimorfisme Coertion:
   Polimorfisme coertion terjadi ketika suatu nilai diubah formatnya menjadi
   jenis tipe data yang lain.

   Cara kerja:
   Polimorfisme ini bekerja ketika terdapat data yang perlu dioperasikan tetapi tipe
   datanya belum sesuai. Contoh string "4321" perlu dioperasikan penjumlahan dengan string
   "1234", tetapi karena string tidak bisa dijumlahkan, maka data tersebut perlu diubah/dikonversi 
   sesuai dengan definisi operator nya, misal perlu diubah ke integer, maka string tersebut
   harus diubah terlebih dahulu ke tipe data integer. Jenis Polimorfisme ini juga meliputi 
   pengubahan ke tipe data double. 
   Dalam java, tipe data primitif bisa langsung dipanggil tetepi untuk objek, perlu menggunakan
   fungsi parseiInt (untuk mengubah ke integer), parseDouble (untuk  mengubah ke double), dan 
   toString (untuk mengubah ke String).

2. Polimorfisme Overloading:
   Polimorfisme overloading terjadi ketika suatu method memiliki nama yang sama tetapi paramaternya
   berbeda.

   Cara Kerja:
   Overloading bekerja dengan cara memilih method yang dimaksud berdasarkan parameternya ketika
   dipanggil. Misal method konstruktor public Dosen() yang tidak memiliki parameter memiliki nama
   yang sama dengan method public Dosen(String nama, String nip) yang merupakan konstruktor dengan 
   parameter berupa atribut kelasnya. Dua method tersebut dapat dipanggil dengan perbedaan parameter 
   yang memungkinkan kompiler untuk memilih method yang dimaksud.

3. Polimorfisme Inclusion
   Polimorfisme inclusion terjadi ketika objek dari kelas turunan dapat diperlakukan sebagai objek 
   dari kelas induknya. Hal ini memungkinkan berbagai objek berbeda disimpan dalam satu tipe yang sama.

   Cara Kerja: 
   Inclusion bekerja berdasarkan inheritence/pewarisan yang dimana objek subclass dapat diperlakukan
   sebagai superclass. Contoh polimorfisme inclusion adalah atribut CivitasAkademika[] pesertas;
   dapat diisi dengan anak dari kelas CivitasAkademika yaitu kelas Dosen dan kelas Mahasiswa.
   Terdapat juga method yang bisa dioverride oleh kelas anak dari method induknya. Overriding memungkinkan 
   setiap objek menghasilkan perilaku yang berbeda sesuai dengan tipe objeknya, meskipun dipanggil melalui
   kelas induknya.
   Contoh override yaitu pada kelas Dosen, method getNomor() yang mengecu pada method getNomor()
   CivitasAkademika akan megembalikan nip milik dosen, begiti juga dengan kelas Mahasiswa yang method
   getNomor() nya akan megembalikan nim.
*/
