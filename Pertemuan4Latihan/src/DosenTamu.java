/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class DosenTamu extends Dosen {
    // Atribut
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    // Method
    // konstruktor tanpa parameter
    public DosenTamu(){

    }

    // konstruktor dengan parameter nip, nidk, nama, tanggalLahir, tmt, gajiPokok, fakultas, dan tanggalAkhirKontrak
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalAkhirKontrak){
        super(nip,nama,tanggalLahir,tmt,gajiPokok,fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // mengembalikan nilai NIDK
    public String getNIDK(){
        return this.nidk;
    }

    // mengeset nilai NIDK
    public void setNIDK(String nidk){
        this.nidk = nidk;
    }

    // mengembalikan nilai tanggalAkhirKontrak
    public LocalDate getTanggalAkhirKontrak(){
        return this.tanggalAkhirKontrak;
    }

    // mengeset nilai tanggalAkhirKontrak
    public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak){
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // menghitung tunjangan
    @Override
    public double tunjangan(){
        return 0.025 * gajiPokok;
    }

    // menghitung sisaKontrak
    public long sisaKontrak(){
        LocalDate sekarang = LocalDate.of(2025,3,10);
        return ChronoUnit.MONTHS.between(sekarang,tanggalAkhirKontrak);
    }

    // mencetak nip, nidk, nama, tanggalLahir, tmt, gajiPokok, fakultas, dan tanggalAkhirKontrak
    public void printInfo(){
        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Masa Kontrak Berakhir : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Sisa Kontrak : " + sisaKontrak() + " bulan");
        System.out.println("Tunjangan : 2.5% x Rp " + gajiPokok + " = Rp " + tunjangan());
    }
}