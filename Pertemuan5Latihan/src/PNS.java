/* Nama File    : PNS.java
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    // Atribut
    private String nip;
    private static int counterPNS = 0;

    // Method
    // konstruktor tanpa parameter
    public PNS(){
        counterPNS++;
    }

    // konstruktor dengan tambahan parameter nip
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip =  nip;
        counterPNS++;
    }

    // mengembalikan nilai nip
    public String getNIP(){
        return this.nip;
    }

    // mengeset nilai nip
    public void setNIP(String nip){
        this.nip = nip;
    }

    // mengembalikan nilai counterPNS
    public static int getCounterPNS(){
        return counterPNS;
    }

    // menghitung Masa Kerja
    public int hitungMasaKerja(){
        LocalDate sekarang = LocalDate.of(2026, 3, 22);
        Period masaKerja = Period.between(tgl_mulai_kerja, sekarang);
        return masaKerja.getYears() + 0; // digit 14 dari 24060124120040
    }

    // menghitung pajak
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    // mencetak nilai nama, tgl_mulai_kerja, alamat, pendapatan, masa kerja, nip dan pajak
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP : " + nip);
        System.out.println("Pajak : " + hitungPajak());
    }
}
