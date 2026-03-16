/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi aplikasi method dalam class MBangunDatar
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 16 Maret 2026
 */

public class MBangunDatar {
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam"); // membuat persegi dengan sisi = 4, warna biru, border hitam
        System.out.println("Persegi1 : ");
        Persegi1.printInfo(); // mencetak info dari Persegi1
        System.out.println("");

        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam"); // membuat lingkaran dengan diameter = 17, warna pink, border hitam
        System.out.println("Lingkaran1 : ");
        Lingkaran1.printInfo(); // mencetak info dari Lingkaran1
        System.out.println("");

        BangunDatar Persegi2 = new Persegi(10, "putih", "hitam"); // membuat persegi dengan sisi = 10, warna putih, border hitam
        System.out.println("Persegi2 : ");
        Persegi2.printInfo(); // mencetak info dari Persegi2
        System.out.println("");

        BangunDatar Lingkaran2 = new Lingkaran(7, "hitam", "hijau"); // membuat lingkaran dengan diameter = 7, warna hitam, border hijau
        System.out.println("Lingkaran2 : ");
        Lingkaran2.printInfo(); // mencetak info dari Lingkaran2
        System.out.println("");

        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling()); // menampilkan keliling dari Persegi1
        System.out.println("Luas Persegi1 : " + Persegi1.getLuas()); // menampilkan luas dari Persegi1
        System.out.println("");

        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling()); // menampilkan keliling dari Lingkaran1
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas()); // menampilkan luas dari Lingkaran1
        System.out.println("");

        System.out.println("Keliling Persegi2 : " + Persegi2.getKeliling()); // menampilkan keliling dari Persegi2
        System.out.println("Luas Persegi2 : " + Persegi2.getLuas()); // menampilkan luas dari Persegi2
        System.out.println("");

        System.out.println("Keliling Lingkaran2 : " + Lingkaran2.getKeliling()); // menampilkan keliling dari Lingkaran2
        System.out.println("Luas Lingkaran2 : " + Lingkaran2.getLuas()); // menampilkan luas dari Lingkaran2
        System.out.println("");

        System.out.println("Apakah luas Persegi1 dan Persegi2 sama? " + Persegi1.IsEqualLuas(Persegi2)); // mengecek apakah Luas Persegi1 sama dengan Persegi2 
        System.out.println("Apakah keliling Persegi1 dan Lingkaran2 sama? " + Persegi1.IsEqualKeliling(Lingkaran2)); // mengecek apakah Keliling Persegi1 sama dengan Lingkaran2 
        System.out.println("");

        System.out.println("Apakah luas Lingkaran1 dan Persegi2 sama? " + Lingkaran1.IsEqualLuas(Persegi2)); // mengecek apakah Luas lingkaran1 sama dengan Persegi2 
        System.out.println("Apakah keliling Lingkaran1 dan Lingkaran2 sama? " + Lingkaran1.IsEqualKeliling(Lingkaran2)); // mengecek apakah Keliling Persegi1 sama dengan Persegi2 
        System.out.println("");

        // IResize
        // Persegi
        System.out.println("Persegi :");
        System.out.println("Panjang sisi awal : " + Persegi1.getSisi()); // menampilkan panjang sisi dari Persegi1
        Persegi1.zoomIn();
        System.out.println("Panjang sisi setelah zoomIn : " + Persegi1.getSisi()); // menampilkan panjang sisi dari Persegi1 setelah zoomIn
        Persegi1.zoomOut();
        System.out.println("Panjang sisi setelah zoomOut : " + Persegi1.getSisi()); // menampilkan panjang sisi dari Persegi1 setelah zoomOut
        Persegi1.zoom(50);
        System.out.println("Panjang sisi setelah zoom dengan skala 50% : " + Persegi1.getSisi()); // menampilkan panjang sisi dari Persegi1 setelah zoom dengan skala 50% 
        System.out.println("");
        
        // Lingkaran
        System.out.println("Lingkaran :");
        System.out.println("Panjang jari awal : " + Lingkaran1.getJari()); // menampilkan panjang jari-jari dari Lingkaran1 
        Lingkaran1.zoomIn();
        System.out.println("Panjang jari setelah zoomIn : " + Lingkaran1.getJari()); // menampilkan panjang jari-jari dari Lingkaran1 setelah zoomIn
        Lingkaran1.zoomOut();
        System.out.println("Panjang jari setelah zoomOut : " + Lingkaran1.getJari()); // menampilkan panjang jari-jari dari Lingkaran1 setelah zoomOut
        Lingkaran1.zoom(50);
        System.out.println("Panjang jari setelah zoom dengan skala 50% : " + Lingkaran1.getJari()); // menampilkan panjang jari-jari dari Lingkaran1 setelah zoom dengan skala 50%
    }
}