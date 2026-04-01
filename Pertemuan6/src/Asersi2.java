/* Nama File    : Asersi2.java
 * Deskripsi    : program untuk demo Asersi2, yang akan menolak input jari-jari lingkaran yang bernilai 0
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 26 Maret 2026
 */

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari-jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* Pertanyaan :
Secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
Jelaskan pada lembar laporan praktikum!

Jawab :
    Pada baris 21, Asersi (assert) pada Java harusnya digunakan untuk debugging,
bukan untuk menangani kesalahan input dari pengguna dengan memastikan jariJari > 0 (validasi).
    Ketika program dijalankan tanpa flag -enableassertions, maka asersi tidak dijalankan. 
Jika asersi tidak aktif, maka nilai jariJari = 0 bisa tetap diproses tanpa error, 
ini salah karena validasi gagal.
    Untuk menangani masalah tersebut, validasi seharusnya dilakukan di class Lingkaran 
untuk memastikan objek lingkaran selalu valid.
    Validasi yang dilakukan di main tadi melanggar prinsip enkapsulasi karena class Lingkaran,
yang dimana objek dibuat, tidak menjaga konsistensi data, sehingga diperlukan solusi 
seperti yang sudah disebutkan sebelumnya. */