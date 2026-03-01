/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 23 Februari 2026
 */

public class Titik {
    /******ATRIBUT******/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /******METHOD******/
    //konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    //konstruktor untuk membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    //mencetak counterTitik
    public void printCounterTitik(){
        System.out.println(counterTitik);
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return this.absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return this.ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        this.absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        this.ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        this.absis = absis + x;
        this.ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //menampilkan kuadran posisi titik berada
    public int getKuadran(){
        if (this.absis >= 1) {
            if (this.ordinat >= 1){
                return 1;
            } else {
                return 4;
            }
        } else {
            if (this.ordinat >= 1){
                return 2;
            } else {
                return 3;
            }
        }
    }

    //menampilkan jarak titik dengan titik pusat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(this.absis*this.absis + this.ordinat*this.ordinat);
    }

    //menampilkan jarak satu titik ke titik lainnya
    public double getJarak(Titik T){
        return Math.sqrt((T.getAbsis() - this.absis)*(T.getAbsis() - this.absis) + (T.getOrdinat() - this.ordinat)*(T.getOrdinat() - this.ordinat));
    }

    // mencerminkan titik berdasarkan sumbu x 
    public void refleksiX(){
        this.ordinat = ordinat * (-1);
    }

    // mencerminkan titik berdasarkan sumbu y  
    public void refleksiY(){
        this.absis = absis * (-1);
    }

    //menampilkan titik hasil refleksi terhadap sumbu x
    public Titik getRefleksiX(){
        Titik T = new Titik();
        T.setAbsis(this.absis);
        T.setOrdinat(this.ordinat * (-1));
        return T;
    }

    //menampilkan titik hasil refleksi terhadap sumbu y
    public Titik getRefleksiY(){
        Titik T = new Titik();
        T.setAbsis(this.absis * (-1));
        T.setOrdinat(this.ordinat);
        return T;
    }
}
