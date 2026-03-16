/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 16 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize{
    // Atribut
    private double jari;

    //Method

    // konstruktor tanpa parameter
    public Lingkaran(){

    }

    // konstruktor dengan parameter diameter, warna, dan border
    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
    }

    // mengembalikan nilai jari
    public double getJari (){
        return jari; 
    }

    // mengeset nilai jari
    public void setJari(double jari){
        this.jari = jari;
    }

    // mengembalikan nilai luas
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    // mengembalikan nilai keliling
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    // menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    // menambah ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    // menambah ukuran sesuai dengan input percent yng diberikan
    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }

    // mencetak nilai jari dan nilai printInfo dari class BangunDatar
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari = " + jari);
    }
}
