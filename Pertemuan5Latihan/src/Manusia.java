/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam class Manusia
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    // Atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Method
    // konstruktor tanpa parameter
    public Manusia(){
        counterMns++;
    }

    // konstruktor dengan parameter nama, tgl_mulai_kerja, alamat, dan pendapatan
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // mengembalikan nilai nama
    public String getNama(){
        return this.nama;
    }

    // mengeset nilai nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengembalikan nilai tgl_mulai_kerja
    public LocalDate getTgl_mulai_kerja(){
        return this.tgl_mulai_kerja;
    }

    // mengeset nilai tgl_mulai_kerja
    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // mengembalikan nilai alamat
    public String getAlamat(){
        return this.alamat;
    }

    // mengeset nilai alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    // mengembalikan nilai pendapatan
    public double getPendapatan(){
        return this.pendapatan;
    }

    // mengeset nilai pendapatan
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    // mengembalikan nilai counterMns
    public static int getCounterMns(){
        return counterMns;
    }

    // abstract method hitungMasaKerja
    public abstract int hitungMasaKerja();

    // mencetak nilai nama, tgl_mulai_kerja, alamat, pendapatan dan masa kerja
    public void cetakInfo(){
        System.out.println("Nama = " + nama);
        System.out.println("Tanggal mulai kerja = " + tgl_mulai_kerja);
        System.out.println("Alamat = " + alamat);
        System.out.println("Pendapatan : Rp " + pendapatan);
        System.out.println("Masa kerja : " + hitungMasaKerja() + " tahun");
    }
}