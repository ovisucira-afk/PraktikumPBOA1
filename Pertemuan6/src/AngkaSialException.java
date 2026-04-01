/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 26 Maret 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
