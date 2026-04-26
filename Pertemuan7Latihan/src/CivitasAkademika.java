/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Berisi atribut dan method dalam class CivitasAkademika
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public abstract class CivitasAkademika{
    // atribut
    protected String nama;

    // operator
    // konstruktor tanpa parameter
    public CivitasAkademika(){

    }

    // konstruktor dengan parameter
    public CivitasAkademika(String nama){
        this.nama = nama;
    }

    // mengembalikan Nama
    public String getNama(){
        return this.nama;
    }

    // mengembalikan Nomor
    public abstract String getNomor();
}
