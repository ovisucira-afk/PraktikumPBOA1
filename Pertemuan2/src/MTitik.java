/* Nama File    : MTitik.java
 * Deskripsi    : berisi aplikasi method dalam class Titik
 * Pembuat      : Ovilia Suci Ramadhani
 * Tanggal      : 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args){
        System.out.println("TITIK");
        Titik T1 = new Titik(); 
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println("Absis = " + T1.getAbsis());
        System.out.println("Ordinat = " + T1.getOrdinat());
        Titik T2 = new Titik(3,5); 
        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek Titik = " + T2.getCounterTitik());
        System.out.println("Kuadran = " + T1.getKuadran());
        T1.refleksiY();
        T1.printTitik();
        System.out.println("Kuadran = " + T1.getKuadran());
        T1.refleksiX();
        T1.printTitik();
        System.out.println("Kuadran = " + T1.getKuadran());
        System.out.println("Jarak Pusat = " + T1.getJarakPusat());
        System.out.println("Jarak Titik = " + T1.getJarak(T2));
        Titik T4 = T1.getRefleksiY();
        T4.printTitik();
        Titik T5 = T4.getRefleksiX();
        T5.printTitik();
        Titik T3 = T1;
        T3.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T3.printTitik();
        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
    }
}