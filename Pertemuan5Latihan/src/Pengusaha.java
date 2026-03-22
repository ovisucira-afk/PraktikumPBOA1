/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    // Atribut 
    private String npwp;
    private static int counterPengusaha = 0;

    // Method
    // konstruktor tanpa parameter
    public Pengusaha(){
        counterPengusaha++;
    }

    // konstruktor dengan tambahan parameter npwp
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp =  npwp;
        counterPengusaha++;
    }

    // mengembalikan nilai npwp
    public String getNPWP(){
        return this.npwp;
    }

    // mengeset nilai npwp
    public void setNPWP(String npwp){
        this.npwp = npwp;
    }

    // mengembalikan nilai counterPengusaha
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    // menghitung Masa Kerja
    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.of(2026, 3, 22);
        Period masaKerja = Period.between(tgl_mulai_kerja, sekarang);
        return masaKerja.getYears() + 4; // digit 13 dari 24060124120040
    }

    // menghitung pajak
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    // mencetak nilai nama, tgl_mulai_kerja, alamat, pendapatan, masa kerja, npwp dan pajak
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP : " + npwp);
        System.out.println("Pajak : " + hitungPajak());
    }
}
