/* Nama File    : MPegawai.java
 * Deskripsi    : berisi aplikasi method dalam class MPegawai
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 15 Maret 2026
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // Membuat dosen tetap
        DosenTetap d1 = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990,5,7), LocalDate.of(2015,1,1), 5000000, "Fakultas Sains dan Matematika");
        System.out.println("Dosen Tetap :");
        d1.printInfo(); // mencetak d1
        System.out.println("");

        // Membuat dosen tamu
        DosenTamu dt1 = new DosenTamu("7856309755", "93217688", "Santi", LocalDate.of(1988,9,2), LocalDate.of(2012,7,3), 5500000, "Fakultas Teknik", LocalDate.of(2026, 8, 10));
        System.out.println("Dosen Tamu :");
        dt1.printInfo(); // mencetak dt1
        System.out.println("");

        // Membuat tendik
        Tendik t1 = new Tendik( "1185498670",  "Putra", LocalDate.of(1993,1,22), LocalDate.of(2019,6,30), 3550000, "Akademik");
        System.out.println("Tendik :");
        t1.printInfo(); // mencetak t1
    }
}
