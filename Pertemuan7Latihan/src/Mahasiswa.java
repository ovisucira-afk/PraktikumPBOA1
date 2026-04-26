/* Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class Mahasiswa extends CivitasAkademika {
    // atribut
    private String nim;
    private Dosen dosenWali;

    // operator
    // konstruktor tanpa parameter
    public Mahasiswa(){

    }

    // konstruktor dengan parameter
    public Mahasiswa(String nama, String nim, Dosen dosenWali){
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    // mengembalikan dosen wali
    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    // i. mengeset dosen wali
    public void setWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    // memgeset nim
    public void setNIP(String nim){
        this.nim = nim;
    }

    // mengembalikan nomor nim
    @Override
    public String getNomor(){
        return this.nim;
    }

    // j. menampilkan data mahasiswa berupa nim, nama mahasiswa, dan nama dosen wali
    public void tampilDataMahasiswa(){
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nama Doswal : " + dosenWali.getNama());
        System.out.println();
    }
}
