/* Nama File    : MAnabul.java
 * Deskripsi    : berisi aplikasi method dalam class Anabul
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class MAnabul {
    public static void main(String[] args){
        // Objek Anabul
        Anabul[] daftar = {
            new Kucing("Ququ"), // objek kucing
            new Anjing("Guki"), // objek anjing
            new Burung("Cut") // objek burung
        };

        for (Anabul a : daftar){ // semua daftar Anabul
            a.bersuara();
            a.gerak();
            System.out.println();
        }
    }
}
