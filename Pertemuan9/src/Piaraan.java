/* Nama File    : Teman.java
 * Deskripsi    : Berisi atribut dan method dalam class Teman
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 10 Mei 2026 */

import java.util.ArrayList;
import java.util.List;

public class Piaraan {
    // atribut
    private int nbelm;
    private List<Anabul> Lanabul;

    // operator
    // konsturktor 
    public Piaraan(){
        Lanabul = new ArrayList<>();
        nbelm = 0;
    }

    // b. 
    // i. getNbelm
    public int getNbelm(){
        return this.nbelm;
    }

    // ii. enqueueAnabul
    public void enqueueAnabul(Anabul anabul){
        Lanabul.add(anabul);
        this.nbelm++;
    }

    // iii. isMember
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    // iv. getAnabul
    public Anabul getAnabul() {
        if (nbelm > 0) {
            return Lanabul.get(0);
        }
        return null;
    }

    // v. dequeueAnabul
    public Anabul dequeueAnabul() {
        if (nbelm > 0) {
            this.nbelm--;
            return Lanabul.remove(0);
        }
        return null;
    }

    // c. showAnabul
    public void showAnabul() {
        System.out.println("Daftar Anabul:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    // d. countKucing
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // e. bobotKucing
    public double bobotKucing() {
        double total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing)a).getBobot();
            }
        }
        return total;
    }

    // f. showJenisAnabul
    public void showJenisAnabul() {
        System.out.println("Daftar Jenis Anabul:");
        for (Anabul a : Lanabul) {
            System.out.println(
                a.getNama() + " - " +
                a.getClass().getName()
            );
        }
    }
}
