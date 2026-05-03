/* Nama File    : Burung.java
 * Deskripsi    : Berisi atribut dan method dalam class Burung
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 3 Mei 2026 */

public class Burung extends Anabul{
    // atribut

    // operator
    // konstruktor
    public Burung(String nama){
        super(nama);
    }

    // operator gerak
    @Override
    public void gerak(){
        System.out.println(nama + " bergerak terbang");
    }

    // operator bersuara
    @Override
    public void bersuara(){
        System.out.println(nama + " bersuara cuit");
    }
}
