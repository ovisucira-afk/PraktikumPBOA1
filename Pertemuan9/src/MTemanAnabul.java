/* Nama File    : MTemanAnabul.java
 * Deskripsi    : berisi aplikasi method dalam class Teman dan Anabul
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 10 Mei 2026 */


public class MTemanAnabul {
    public static void main(String[] args){
        // KELAS TEMAN
        System.out.println("KELAS TEMAN: ");
        // membuat objek
        Teman t = new Teman();
        t.addNama("Vine");
        t.addNama("Silvi");
        t.addNama("Viil");
        t.addNama("Vine");
        t.addNama("Silvi");
        t.addNama("Vine");
        
        // menampilkan banyak elemen
        System.out.println("Jumlah teman: " + t.getNbelm());
        
        // menampilkan isi Teman
        t.showTeman();
        
        // menampilkan nama indeks 0
        System.out.println("\nNama pertama: " + t.getNama(0));
        t.setNama(1, "Silva");
        System.out.println("\nKoleksi terbaru: ");
        t.showTeman();

        // menghapus "Silva"
        t.delNama("Silva");
        System.out.println("\nKoleksi terbaru: ");
        t.showTeman();

        // mengecek apakah member
        System.out.println("\nApakah Silvi adalah teman? " + t.isMember("Silvi"));

        // mengganti nama
        t.gantiNama("Viil", "Vio");
        t.showTeman();

        // menampilkan banyak nama
        System.out.println("\nBanyak nama Vine: " + t.countNama("Vine"));
        System.out.println("\nBanyak nama Silvi: " + t.countNama("Silvi"));
        System.out.println("\nBanyak nama Viil: " + t.countNama("Viil"));
        System.out.println();

        // KELAS ANABUL
        System.out.println("KELAS ANABUL: ");
        
        // membuat objek 
        Piaraan p = new Piaraan();
        Anabul a1 = new Kucing("Siko", 4.3);
        Anabul a2 = new Anjing("Kugi");
        Anabul a3 = new Burung("Lipu");
        Anggora anggora = new Anggora("Milo", 4.2);
        Kembangtelon kembangtelon = new Kembangtelon("Luna", 3.5);

        // menambahkan antrean
        p.enqueueAnabul(a1);
        p.enqueueAnabul(a2);
        p.enqueueAnabul(a3);
        p.enqueueAnabul(anggora);
        p.enqueueAnabul(kembangtelon);

        // menampilkan anabul
        p.showAnabul();
        System.out.println();

        // menampilkan banyak elemen
        System.out.println("Banyak anabul: " + p.getNbelm());

        // mengecek member
        System.out.println("Apakah Kugi anabul? " + p.isMember(a2));

        // menampilkan anabul antrean pertama 
        System.out.println("Anabul pertama: " + p.getAnabul().getNama());

        // menampilkan banyak kucing
        System.out.println("Jumlah kucing: " + p.countKucing());

        // menghapus anabul antrean pertama (dequeue)
        System.out.println("Dequeue: " + p.dequeueAnabul().getNama());
        System.out.println();
        System.out.println("Setelah dequeue: ");
        p.showAnabul();
        System.out.println();

        // menampilkan banyak kucing
        System.out.println("Jumlah kucing: " + p.countKucing());

        // menampilkan bobot kucing
        System.out.println("Total bobot kucing: " + p.bobotKucing());
        System.out.println();

        // show jenis
        p.showJenisAnabul(); 
    }
}

/*
    Koleksi digunakan sebagai wadah yang menyimpan banyak objek, sehingga data dapat dikelola 
dengan lebih mudah. Dengan koleksi, proses penambahan, penghapusan, dan pencarian lebih mudah 
dioperasikan karena sudah mencakup semua objek tanpa membuat variabel satu per satu. Contohnya 
pada kelas anabul yang dimasukkan ke dalam List<Anabul> dapat menyimpan semua objek turunan anabul 
yaitu Anjing, Burung, dan Kucing yang meliputi Anggora dan Kembangtelon menjadi satu antrean. 
Jadi pemanggilan fungsinya bisa meliputi semua yang termasuk anabul.
 */