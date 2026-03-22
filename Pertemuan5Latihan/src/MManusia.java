/* Nama File    : MManusia.java
 * Deskripsi    : berisi aplikasi method dalam class MManusia
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        // membuat PNS p1
        PNS p1 = new PNS("Satriyo",LocalDate.of(2006, 4, 1),"Jl. Seroja",15000000,"198302032006041002");
        // membuat Pengusaha pe1
        Pengusaha pe1 = new Pengusaha("Adhy",LocalDate.of(2000, 1, 1),"Jl.Air",55000000,"000-556-773-212-000-5");
        // membuat Petani pt1
        Petani pt1 = new Petani("Nugraha",LocalDate.of(1977, 1, 9),"Jl. Bunga 9 Tembalang",5000000,"Wonogiri");
        // membuat PNS p2
        PNS p2 = new PNS("Panji",LocalDate.of(2010, 4, 1),"",10000000,"198004212010041002");
        // megeset alamat ke PNS p2
        p2.setAlamat("Jl. Panorama 111 Tembalang");
        // mencetak jumlah manusia
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("");
        // mencetak jumlah PNS
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("");
        // mencetak jumlah Pengusaha
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("");
        // mencetak jumlah Petani
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println("");
        // mencetak pajak PNS p1
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("");
        // mencetak pajak Pengusaha pe1
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("");
        // mencetak pajak Petani pt1
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("");
        // mencetak masa kerja PNS p1
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("");
        // mencetak masa kerja Pengusaha pe1
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("");
        // mencetak masa kerja Petani pt1
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("");
        // mencetak informasi PNS p1
        System.out.println("PNS p1 :");
        p1.cetakInfo();
        System.out.println("");
        // mencetak informasi Pengusaha pe1
        System.out.println("Pengusaha pe1 :");
        pe1.cetakInfo();
        System.out.println("");
        // mencetak informasi Petani pt1
        System.out.println("Petani pt1 :");
        pt1.cetakInfo();
        System.out.println("");

        // Tambahan
        PNS p3 = new PNS("Sita",LocalDate.of(2011, 8, 7),"Jl. Cipta",10500000,"182563017342865413");
        // membuat Pengusaha pe1
        Pengusaha pe2 = new Pengusaha("Rika",LocalDate.of(2009, 5, 12),"Jl.Lekas",43000000,"001-248-190-324-000-7");
        // membuat Petani pt1
        Petani pt2 = new Petani("Fitri",LocalDate.of(2010, 12, 21),"Jl. Anggrek",6500000,"Semarang");
        // mencetak informasi PNS p3
        System.out.println("PNS p3 :");
        p3.cetakInfo();
        System.out.println("");
        // mencetak informasi Pengusaha pe2
        System.out.println("Pengusaha pe2 :");
        pe2.cetakInfo();
        System.out.println("");
        // mencetak informasi Petani pt2
        System.out.println("Petani pt2 :");
        pt2.cetakInfo();
        System.out.println("");
        // mencetak jumlah manusia
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("");
        // mencetak jumlah PNS
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("");
        // mencetak jumlah Pengusaha
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("");
        // mencetak jumlah Petani
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
    }
}
