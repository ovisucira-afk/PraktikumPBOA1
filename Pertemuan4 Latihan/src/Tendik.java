/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    // Atribut
    private String bidang;
    private final int BUP = 55;

    // Method

    // konstruktor tanpa parameter
    public Tendik(){

    }
    
    // konstruktor dengan parameter nip, nama, tanggalLahir, tmt, gajiPokok dan bidang
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang){
        super(nip,nama,tanggalLahir,tmt,gajiPokok);
        this.bidang = bidang;
    }

    // mengembalikan nilai bidang
    public String getBidang(){
        return this.bidang;
    }

    // mengeset nilai bidang
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    // menghitung tanggal pensiun
    public LocalDate tanggalPensiun(){
        LocalDate pensiun = tanggalLahir.plusYears(BUP);
        return LocalDate.of(pensiun.getYear(), pensiun.getMonth().plus(1),1);
    }

    // menghitung tunjangan
    @Override
    public double tunjangan(){
        int tahun = masaKerja().getYears();
        return 0.01 * tahun * gajiPokok;
    }

    // mencetak nip, nama, tanggalLahir, tmt, gajiPokok, jabatan, bidang, masaKerja, tanggalPensiun, dan tunjangan
    @Override
    public void printInfo(){
        Period MasaKerja = masaKerja();
        super.printInfo();
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + MasaKerja.getYears() + " tahun " + MasaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(tanggalPensiun()));
        System.out.println("Tunjangan : 1% x " + MasaKerja.getYears() + " x Rp " + gajiPokok + " = Rp " + tunjangan());
    }
}
