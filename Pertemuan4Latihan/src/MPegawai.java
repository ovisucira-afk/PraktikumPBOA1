/* Nama File    : MPegawai.java
 * Deskripsi    : berisi aplikasi method dalam class MPegawai
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 15 Maret 2026
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // membuat DosenTetap
        DosenTetap d1 = new DosenTetap("9545647548", "78647324", "Andi", LocalDate.of(1990,5,5), LocalDate.of(2015,1,1), 5000000, "Fakultas Sains dan Matematika");
        System.out.println("Dosen Tetap :");
        d1.printInfo(); // mencetak DosenTetap d1
        System.out.println("");

        // membuat DosenTamu
        DosenTamu dt1 = new DosenTamu("7629483510", "18462057", "Sinta", LocalDate.of(1988,8,7), LocalDate.of(2014,4,14), 5500000, "Fakultas Teknik", LocalDate.of(2025, 7, 12));
        System.out.println("Dosen Tamu:");
        dt1.printInfo(); // mencetak DosenTamu dt1
        System.out.println("");

        // membuat Tendik
        Tendik t1 = new Tendik("8834562709","Dias", LocalDate.of(1993,9,30), LocalDate.of(2019,2,21), 4000000, "Akademik");
        System.out.println("Tendik :");
        t1.printInfo(); // mencetak Tendik t1
        System.out.println("");
    }
}