/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 23 Februari 2026
 */

public class Garis {
    /******ATRIBUT******/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /******METHOD******/
    //konstruktor untuk membuat garis
    public Garis(){
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }
    
    //konstruktor untuk membuat garis dengan nilai titik awal dan titik akhir tertentu
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    //menampilkan titik awal dari garis
    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    //menampilkan titik awal dari garis
    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    //mengeset titik awal dengan titik t1
    public void setTitikAwal(Titik t1){
        this.titikAwal = t1;
    }

    //mengeset titik akhir dengan titik t2
    public void setTitikAkhir(Titik t2){
        this.titikAkhir = t2;
    }

    //mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    //mengembalikan panjang garis
    public double getPanjang(){
        return Math.sqrt((titikAkhir.getAbsis()-titikAwal.getAbsis())*(titikAkhir.getAbsis()-titikAwal.getAbsis())
        + (titikAkhir.getOrdinat()-titikAwal.getOrdinat())*(titikAkhir.getOrdinat()-titikAwal.getOrdinat()));
    }

    //mengembalikan gradien garis
    public double getGradien(){
        if (titikAkhir.getAbsis() - titikAwal.getAbsis() == 0) {
            return 0; 
        }
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    //mengembalikan titik tengah garis
    public Titik getTitikTengah(){
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x,y);
    }

    //mengecek apakah 2 garis sejajar
    public boolean isSejajar(Garis G){
        double m1 = this.getGradien();
        double m2 = G.getGradien();
        return m1 == m2;
    }

    //mengecek apakah 2 garis tegak lurus
    public boolean isTegakLurus(Garis G){
        double m1 = this.getGradien();
        double m2 = G.getGradien();
        if ((m1 == 0 && m2 != 0) || (m2 == 0 && m1 != 0)){
            return true;
        }
        return m1 * m2 == -1;
    }

    //mencetak titik awal dan titik akhir suatu garis
    public void awalAkhir(){
        System.out.println("Awal = ");
        titikAwal.printTitik();
        System.out.println("Akhir = ");
        titikAkhir.printTitik();
    }

    //mengemblikan string y = mx + c
    public String persamaanGaris(){
        double x1 = titikAwal.getAbsis();
        double y1 = titikAwal.getOrdinat();
        double x2 = titikAkhir.getAbsis();
        double y2 = titikAkhir.getOrdinat();
        if (x1 == x2){
            return "x = " + x1;
        }
        double m = (y2 - y1) / (x2 - x1);
        double c = y1 - m * x1;
        if (c >= 0){
            return "y = " + m + "x + " + c;
        } else {
            return "y = " + m + "x - " + (-c);
        }
    }
}
