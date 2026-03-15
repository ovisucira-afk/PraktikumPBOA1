/* Nama File    : MBangunDatar.java
 * Deskripsi    : berisi aplikasi method dalam class MBangunDatar
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 11 Maret 2026
 */

public class MBangunDatar {
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam"); // membuat persegi dengan sisi = 4, warna biru, border hitam
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam"); // membuat lingkaran dengan diameter = 17, warna pink, border hitam
        System.out.println("Persegi1 : ");
        Persegi1.printInfo(); // mencetak info dari Persegi1
        System.out.println("Lingkaran1 : ");
        Lingkaran1.printInfo(); // mencetak info dari Lingkaran1

        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling()); // menampilkan keliling dari Persegi1
        System.out.println("Luas Persegi : " + Persegi1.getLuas()); // menampilkan luas dari Persegi1

        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling()); // menampilkan keliling dari Lingkaran1
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas()); // menampilkan luas dari Lingkaran1

        BangunDatar.printCounterBangunDatar(); // mencetak jumlah bangun datar yang telah dibuat
    }
}

// /* Nama File    : Dosen.java
//  * Deskripsi    : berisi atribut dan method dalam class Dosen
//  * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
//  * Tanggal      : 15 Maret 2026
//  */

// import java.time.LocalDate;

// public class Dosen extends Pegawai {
//     // Atribut
//     protected String fakultas;

//     // Method

//     // konstruktor tanpa parameter
//     public Dosen(){

//     }
    
//     // konstruktor dengan parameter nip, nama, tanggalLahir, tmt, gajiPokok dan fakultas
//     public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
//         super(nip, nama, tanggalLahir, tmt, gajiPokok);
//         this.fakultas = fakultas;
//     }

//     // mengembalikan nilai fakultas
//     public String getFakultas(){
//         return this.fakultas;
//     }

//     // mengeset nilai fakultas
//     public void setFakultas(String fakultas){
//         this.fakultas = fakultas;
//     }
// }