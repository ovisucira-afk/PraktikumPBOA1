/* Nama File    : MGaris.java
 * Deskripsi    : berisi aplikasi method dalam class Garis
 * Pembuat      : Ovilia Suci Ramadhani
 * Tanggal      : 23 Februari 2026
 */

public class MGaris {
    public static void main(String[] args){
        System.out.println("GARIS");
        Titik T1 = new Titik(); 
        T1.setAbsis(3);
        T1.setOrdinat(4);
        Titik T2 = new Titik(3,5); 
        Titik T4 = T1.getRefleksiY();
        Garis G1 = new Garis();
        G1.setTitikAwal(T1);
        G1.setTitikAkhir(T2);
        Titik T7 = G1.getTitikAwal();
        T7.printTitik();
        Titik T8 = G1.getTitikAkhir();
        T8.printTitik();
        System.out.println("Panjang Garis = " + G1.getPanjang());
        System.out.println("Gradien Garis = " + G1.getGradien());
        Titik T6 =  G1.getTitikTengah();
        T6.printTitik();
        Garis G2 = new Garis();
        G2.setTitikAwal(T2);
        G2.setTitikAkhir(T4);
        System.out.println("Gradien Garis = " + G2.getGradien());
        System.out.println("Sejajar? " + G1.isSejajar(G2));
        System.out.println("Tegak Lurus? " + G1.isTegakLurus(G2));
        G1.awalAkhir();
        String pers = G2.persamaanGaris();
        System.out.println("Persamaan garis: " + pers);
        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());
    }
}