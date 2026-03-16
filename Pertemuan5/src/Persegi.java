/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 16 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize{
    // Atribut
    private double sisi;

    // Method

    // konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    // konstruktor dengan parameter sisi, warna, dan border
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    // mengembalikan nilai sisi
    public double getSisi(){
        return sisi;
    }

    // mengeset nilai sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // mengembalikan nilai luas
    public double getLuas(){
        return this.sisi * this.sisi;
    }

    // mengembalikan nilai keliling
    public double getKeliling(){
        return this.sisi * 4;
    }

    // mengembalikan nilai diagonal
    public double getDiagonal(){
        return this.sisi * Math.sqrt(2);
    }

    // menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    // menambah ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    // menambah ukuran sesuai dengan input percent yng diberikan
    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }

    // mencetak nilai sisi dan nilai printInfo dari class BangunDatar
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi = " + sisi);
    }
}
