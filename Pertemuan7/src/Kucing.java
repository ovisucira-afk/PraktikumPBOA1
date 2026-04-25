/* Nama File    : Kucing.java
 * Deskripsi    : Berisi atribut dan method dalam class Kucing
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class Kucing extends Anabul{
    // atribut

    // operator
    // konstruktor
    public Kucing(String nama){
        super(nama);
    }

    // operator gerak
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak melata");
    }

    // operator bersuara
    @Override
    public void bersuara(){
        System.out.println(nama + " bersuara meong");
    }
}
