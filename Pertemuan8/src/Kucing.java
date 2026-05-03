/* Nama File    : Kucing.java
 * Deskripsi    : Berisi atribut dan method dalam class Kucing
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 3 Mei 2026 */

public class Kucing extends Anabul{
    // atribut
    protected double bobot;

    // operator
    // konstruktor
    public Kucing(String nama, double bobot){
        super(nama);
        this.bobot = bobot;
    }

    // mengembalikan bobot kucing
    public double getBobot(){
        return bobot;
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
