/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    // Atribut
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    // Method

    // konstruktor tanpa parameter
    public Pegawai(){

    };

    // konstruktor dengan parameter nip, nama, tanggalLahir, tmt, dan gajiPokok
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // mengembalikan nilai nip
    public String getNIP(){
        return this.nip;
    }

    // mengeset nilai nip
    public void setNIP(String nip){
        this.nip = nip;
    }

    // mengembalikan nilai nama
    public String getNama(){
        return this.nama;
    }

    // mengeset nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengembalikan nilai tanggalLahir
    public LocalDate getTanggalLahir(){
        return this.tanggalLahir;
    }

    // mengeset nilai tanggalLahir
    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    // mengembalikan nilai tmt
    public LocalDate getTMT(){
        return this.tmt;
    }

    // mengeset nilai tmt
    public void setTMT(LocalDate tmt){
        this.tmt = tmt;
    }
    
    // mengembalikan nilai gajiPokok
    public double getGajiPokok(){
        return this.gajiPokok;
    }

    // mengeset nilai gajiPokok
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    // menghitung masa kerja pegawai
    public Period masaKerja(){
        LocalDate sekarang = LocalDate.of(2025,3,10);
        return Period.between(tmt, sekarang);
    }

    // format tanggal
    public String formatTanggal(LocalDate tanggal){
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("d MMMM yyyy", new java.util.Locale("id","ID"));
        return tanggal.format(format);
    }

    // menghitung tunjangan pegawai
    public double tunjangan(){
        return 0;
    }

    // mencetak nip, nama, tanggalLahir, tmt, dan gajiPokok
    public void printInfo(){
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT : " + formatTanggal(tmt));
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }
}
