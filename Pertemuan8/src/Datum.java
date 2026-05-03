/* Nama File    : Datum.java
 * Deskripsi    : Berisi atribut dan method dalam class generik Datum
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 3 Mei 2026 */

public class Datum<T> {
    // atribut
    private T isi;

    // method
    // mengembalikan isi
    public T getIsi(){
        return isi;
    }

    // mengeset isi
    public void setIsi(T isiBaru){
        this.isi = isiBaru;
    }
}
