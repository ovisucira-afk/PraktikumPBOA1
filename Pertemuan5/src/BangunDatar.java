/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 16 Maret 2026
 */

public abstract class BangunDatar {
    // Atribut
    private int jmlSisi;
    private String warna;
    private String border;

    // Method

    // konstruktor tanpa parameter
    public BangunDatar(){
    }

    // konstruktor dengan parameter jmlSisi, warna, dan border
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    // mengembalikan nilai jmlSisi
    public int getJmlsisi(){
        return jmlSisi;
    }

    // mengeset nilai jmlSisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // mengembalikan nilai warna
    public String getWarna(){
        return warna;
    }

    // mengeset nilai warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    // mengembalikan nilai border
    public String getBorder(){
        return border;
    }

    // mengeset nilai border
    public void setBorder(String border){
        this.border = border;
    }

    // abstract method getLuas
    public abstract double getLuas();

    // abstract method getKeliling
    public abstract double getKeliling();

    // mengecek apakah sebuah bangun datar memiliki luas yang sama dengan bangun datar lainnya
    public boolean IsEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    // mengecek apakah sebuah bangun datar memiliki keliling yang sama dengan bangun datar lainnya
    public boolean IsEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    // mencetak nilai jmlSisi, warna, dan border
    public void printInfo(){
        System.out.println("Jumlah sisi = " + jmlSisi);
        System.out.println("Warna = " + warna);
        System.out.println("Border = " + border);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}
