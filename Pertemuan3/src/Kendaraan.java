/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 2 Maret 2026
 */

public class Kendaraan {
    //Atribut 
    private String noPlat;
    private String jenis;

    //Method
    public Kendaraan(){
        //konstruktor tanpa parameter
    }

    //Konstruktor dengan parameter noPlat dan jenis
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Mengembalikan nilai noPlat
    public String getnoPlat(){
        return this.noPlat;
    }

    //Mengembalikan nilai jenis
    public String getJenis(){
        return this.jenis;
    }

    //Mengeset nilai noPlat
    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    //Mengeset nilai jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    //mencetak nilai noPlat dan jenis
    public void printKendaraan(){
        System.out.println("noPlat = " + noPlat);
        System.out.println("jenis = " + jenis);
    }
}
