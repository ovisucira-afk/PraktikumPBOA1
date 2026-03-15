/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    // Atribut
    private String nidn;
    private final int BUP = 65;

    // Method

    // konstruktor tanpa parameter
    public DosenTetap(){

    }

    // konstruktor dengan parameter nip, nidn, nama, tanggalLahir, tmt, gajiPokok dan fakultas
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // mengembalikan nilai nidn
    public String getNIDN(){
        return this.nidn;
    }

    // mengeset nilai nidn
    public void setNIDN(String nidn){
        this.nidn = nidn;
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
        return 0.02 * tahun * gajiPokok;
    }

    // mencetak nip, nama, tanggalLahir, tmt, gajiPokok, jabatan, fakultas, masaKerja, tanggalPensiun, dan tunjangan
    @Override
    public void printInfo() {
        Period MasaKerja = masaKerja();
        super.printInfo();
        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kerja : " + MasaKerja.getYears() + " tahun " + MasaKerja.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + formatTanggal(tanggalPensiun()));
        System.out.println("Tunjangan : 2% x " + MasaKerja.getYears() + " x Rp " + gajiPokok + " = Rp " + tunjangan());
    }
}
