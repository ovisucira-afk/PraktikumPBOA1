/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    // Atribut
    private String asal_kota;
    private static int counterPetani = 0;

    // Method
    // konstruktor tanpa parameter
    public Petani(){
        counterPetani++;
    }

    // konstruktor dengan tambahan parameter asal_kota
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota =  asal_kota;
        counterPetani++;
    }

    // mengembalikan nilai asal_kota
    public String getAsal_kota(){
        return this.asal_kota;
    }

    // mengeset nilai asal_kota
    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    // mengembalikan nilai counterPetani
    public static int getCounterPetani(){
        return counterPetani;
    }

    // menghitung Masa Kerja
    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.of(2026, 3, 22);
        Period masaKerja = Period.between(tgl_mulai_kerja, sekarang);
        return masaKerja.getYears() + 0; // digit 12 dari 24060124120040
    }

    // menghitung pajak
    public double hitungPajak(){
        return 0;
    }

    // mencetak nilai nama, tgl_mulai_kerja, alamat, pendapatan, masa kerja, asal_kota dan pajak
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal kota : " + asal_kota);
        System.out.println("Pajak : " + hitungPajak());
    }
}
