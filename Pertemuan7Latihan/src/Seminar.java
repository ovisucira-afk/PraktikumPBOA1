/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Berisi atribut dan method dalam class CivitasAkademika
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class Seminar {
    // atribut
    private CivitasAkademika[] pesertas;
    private int banyakPeserta;

    // operator
    // konstruktor
    public Seminar(){
        pesertas = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // c. menghitung banyak peserta seminar
    public int countPeserta(){
        return this.banyakPeserta;
    }

    // d. menambahkan peserta
    public void registrasi(CivitasAkademika p) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = p;
            banyakPeserta++;
        } else {
            System.out.println("Seminar penuh!");
        }
    }

     // g. menampilkan daftar nomor dan nama peserta
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }

    // h. count mahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
