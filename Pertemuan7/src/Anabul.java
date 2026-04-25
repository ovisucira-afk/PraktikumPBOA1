/* Nama File    : Anabul.java
 * Deskripsi    : Berisi atribut dan method dalam class Anabul
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class Anabul {
    // atribut
    protected String nama;

    // operator
    // konstruktor tanpa parameter
    public Anabul(){

    }

    // konstruktor dengan parameter
    public Anabul(String nama){
        this.nama = nama;
    }

    // operator gerak
    public void gerak(){
        System.out.println(nama + " bergerak");
    }

    // operator bersuara
    public void bersuara(){
        System.out.println(nama + " bersuara");
    }
}
