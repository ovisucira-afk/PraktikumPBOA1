/* Nama File    : Data.java
 * Deskripsi    : Berisi atribut dan method dalam class generik Data
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 3 Mei 2026 */

class Data<T> {
    // a. 
    // atribut
    private Object[] ruang;
    private int banyak;

    // method
    // konstruktor
    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    // b. mengeset isi
    public void setIsi(int posisi, T nilai) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = nilai;
            if (posisi > banyak) {
                banyak = posisi;
            }
        }
    }

    // c. mengembalikan isi
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return (T) ruang[posisi - 1];
        }
        return null;
    }

    // d. mengembalikan size
    public int getSize() {
        return banyak;
    }
}
