/* Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class Mahasiswa {
    // atribut
    private String nim;
    private String nama;
    private String programStudi;

    // operator
    // c. konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // d. konstruktor dengan 3 parameter
    public Mahasiswa(String nim, String nama, String programStudi){
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // e. konstruktor cloning
    public Mahasiswa(Mahasiswa m){
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // overloading setProgramStudi
    // tanpa parameter
    public void setProgramStudi(){
        this.programStudi = "Kosong";
    }

    // dengan 1 parameter
    public void setProgramStudi(String programStudi){
        this.programStudi = programStudi;
    }

    // dengan 1 parameter objek Mahasiswa lain
    public void setProgramStudi(Mahasiswa m){
        this.programStudi = m.programStudi;
    }

    // mengembalikan nim
    public String getNIM(){
        return this.nim;
    }

    // mengeset nim
    public void setNIM(String nim){
        this.nim = nim;
    }

    // mengembalikan nama
    public String getNama(){
        return this.nama;
    }

    // mengeset nim
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengembalikan programStudi
    public String getProgramStudi(){
        return this.programStudi;
    }

    // mencetak nim, nama, dan programStudi
    public void tampilData(){
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + programStudi);
        System.out.println();
    }
}
