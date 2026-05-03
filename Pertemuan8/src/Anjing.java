/* Nama File    : Anjing.java
 * Deskripsi    : Berisi atribut dan method dalam class Anjing
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 3 Mei 2026 */

public class Anjing extends Anabul{
    // atribut

    // operator
    // konstruktor
    public Anjing(String nama){
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
        System.out.println(nama + " bersuara guk-guk");
    }
}
