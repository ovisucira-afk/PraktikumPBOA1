/* Nama File    : MAnabul.java
 * Deskripsi    : berisi aplikasi method dalam class Anabul
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 3 Mei 2026 */

public class MAnabul {
    public static void main(String[] args){
        // aplikasi anggora dan kembangtelon
        System.out.println("\nAPLIKASI ANGGORA DAN KEMBANGTELON");
        Datum<Anabul> dataAnabul = new Datum<>();

        // membuat objek
        Anggora anggora = new Anggora("Milo", 4.2);
        Kembangtelon kembangtelon = new Kembangtelon("Luna", 3.5);

        // aplikasi setIsi dan getIsi
        dataAnabul.setIsi(anggora);
        dataAnabul.getIsi().gerak();
        dataAnabul.getIsi().bersuara();

        dataAnabul.setIsi(kembangtelon);
        dataAnabul.getIsi().gerak();
        dataAnabul.getIsi().bersuara();

        // aplikasi class OperatorGenerik
        System.out.println("\nAPLIKASI TUKAR DAN BOBOT2");
        // aplikasi prosedur generik Tukar untuk sesama integer
        Ref<Integer> aInt = new Ref<>(3);
        Ref<Integer> bInt = new Ref<>(6);
        System.out.println("Sebelum Tukar: a = " + aInt.val + ", b = " + bInt.val);
        OperatorGenerik.Tukar(aInt, bInt);
        System.out.println("Sesudah Tukar: a = " + aInt.val + ", b = " + bInt.val);

        // aplikasi prosedur generik Tukar untuk sesama String
        Ref<String> aStr = new Ref<>("Halo");
        Ref<String> bStr = new Ref<>("Dunia");
        System.out.println("Sebelum Tukar: a = " + aStr.val + ", b = " + bStr.val);
        OperatorGenerik.Tukar(aStr, bStr);
        System.out.println("Sesudah Tukar: a = " + aStr.val + ", b = " + bStr.val);

        // aplikasi prosedur generik Tukar untuk keluarga Anabul
        Ref<Anabul> aAnabul = new Ref<>(new Anjing ("Saga"));
        Ref<Anabul> bAnabul = new Ref<>(new Kucing ("Jiri", 3.0));
        System.out.println("Sebelum Tukar: a = " + aAnabul.val.getClass().getSimpleName() + ", b = " + bAnabul.val.getClass().getSimpleName());
        OperatorGenerik.Tukar(aAnabul, bAnabul);
        System.out.println("Sesudah Tukar: a = " + aAnabul.val.getClass().getSimpleName() + ", b = " + bAnabul.val.getClass().getSimpleName());

        // aplikasi fungsi generik Bobot2
        Anggora kucingA = new Anggora("Gora", 5.0);
        Kembangtelon kucingB = new Kembangtelon("Capi", 4.2);
        double totalBobot = OperatorGenerik.Bobot2(kucingA, kucingB);
        System.out.println("Total bobot 2 kucing keturunan: " + totalBobot + " kg");

        // a. aplikasi class Data
        System.out.println("\nAPLIKASI CLASS DATA");
        Data<Anabul> data = new Data<>();

        // membuat objek
        Anabul a1 = new Kucing("Siko", 4.3);
        Anabul a2 = new Anjing("Kugi");
        Anabul a3 = new Burung("Lipu");

        // b. aplikasi setIsi
        data.setIsi(1, a1);
        data.setIsi(2, a2);
        data.setIsi(3, a3);

        // c. aplikasi getIsi
        data.getIsi(1).gerak();
        data.getIsi(1).bersuara();

        data.getIsi(2).gerak();
        data.getIsi(2).bersuara();

        data.getIsi(3).gerak();
        data.getIsi(3).bersuara();

        // d. menampilkan banyak data
        System.out.println("Banyak data: " + data.getSize());
    }
}

/*
Renungan :
Cara kerja konsep Generik

    Konsep generik bekerja untuk membuat kelas atau method yang bisa digunakan untuk berbagai 
tipe data. Konsep ini membuat kelas generik tidak perlu menulis ulang code dari tipe data yang 
dipilih. Tipe data yang dimasukkan bergantung pada saat objek dibuat sehingga lebih fleksibel untuk
berbagai tipe data.
    Misal kelas generik dengan parameter T yang belum diketahui tipe datanya. Saat objek dibuat,
parameter T akan berganti menjadi tipe data dari objek tersebut.
*/