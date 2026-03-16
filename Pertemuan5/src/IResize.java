/* Nama File    : IResize.java
 * Deskripsi    : berisi atribut dan method dalam interface IResize
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 16 Maret 2026
 */

public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // menambah ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menambah ukuran sesuai dengan input percent yng diberikan
    public void zoom(int percent);
}
