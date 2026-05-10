/* Nama File    : Teman.java
 * Deskripsi    : Berisi atribut dan method dalam class Teman
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 10 Mei 2026 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    // atribut
    private int nbelm;
    private List<String> Lnama;

    // operator
    // konstruktor
    public Teman(){
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getNbelm, mengembalikan banyak elemen
    public int getNbelm(){
        return nbelm;
    }

    // b. getNama, mengembalikan nama
    public String getNama(int indeks){
        if (indeks >= 0 && indeks < Lnama.size()){
            return Lnama.get(indeks);
        }
        return null;
    }

    // c. setNama, mengeset nama
    public void setNama(int indeks, String nama){
        if (indeks >= 0 && indeks < Lnama.size()){
            Lnama.set(indeks, nama);
        }
    }

    // d. addNama, menambahkan nama
    public void addNama(String nama){
        Lnama.add(nama);
        this.nbelm++;
    } 

    // e. delNama, menghapus nama
    public void delNama(String nama){
        Lnama.remove(nama);
        this.nbelm--;
    }

    // f. isMember, mengecek apakah member
    public boolean isMember(String nama){
        return Lnama.contains(nama); 
    }

    // g. gantiNama, mengganti nama
    public void gantiNama(String nama, String namabaru){
        int x = Lnama.indexOf(nama);
        Lnama.set(x, namabaru);
    }

    // h. countNama, menghitung banyak kemunculan nama
    public int countNama(String nama){
        int count = 0;
        for (String n:Lnama){
            if(n.equals(nama)){
                count++;
            }
        }
        return count;
    }

    // i. showTeman, menampilkan semua nama teman dalam Lnama.
    public void showTeman(){
        System.out.println("Daftar Teman: ");
        for (String n:Lnama){
            System.out.println("-" + n);
        }
    }
}
