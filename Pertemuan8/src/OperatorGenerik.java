/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Berisi atribut dan method dalam class OperatorGenerik
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 3 Mei 2026 */

// kelas bantuan agar nilai objek bisa ditukar referensinya
class Ref<T> {
    public T val;
    public Ref(T val) {this.val = val;}
}

public class OperatorGenerik {
    // prosedur generik tukar untuk menukar dua parameter generik
    public static <T> void Tukar(Ref<T> a, Ref<T> b){
        T temp = a.val;
        a.val = b.val;
        b.val = temp;
    }

    // menggunakan bounded type parameter <T extends Kucing>
    public static <T extends Kucing, U extends Kucing> double Bobot2(T a, U b){
        // mengembalikan jumlah bobot keduanya
        return a.getBobot() + b.getBobot();
    }
}
