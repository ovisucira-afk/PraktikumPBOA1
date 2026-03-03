/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi aplikasi method dalam class Mahasiswa
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 2 Maret 2026
 */

public class MMahasiswa { //class main Mahasiswa
    public static void main(String[] args){
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Barorientasi Objek", 3); //menetapkan nilai Mata Kuliah PBO
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3); //menetapkan nilai Mata Kuliah MBD
        Mahasiswa M1 = new Mahasiswa("234", "Citra","Informatika"); //menetapkan nilai Mahasiswa
        Dosen D1 = new Dosen("123", "Andi", "Informatika"); //menetapkan nilai Dosen
        Kendaraan K1 = new Kendaraan("H1234AB", "motor"); //menetapkan nilai Kendaraan
        M1.setDosenWali(D1); //mengeset nilai DosenWali
        M1.setKendaraan(K1); //mengeset nilai Kendaraan
        M1.addMatKul(PBO); //menambahkan Mata Kuliah
        M1.addMatKul(MBD); //menambahkan Mata Kuliah ke atribut listMatKul
        System.out.println("Detail Mahasiswa : ");
        M1.printDetailMhs(); //mencetak detail mahasiswa berupa NIM, Nama, Prodi dan Mata Kuliah
        System.out.println(); //memberikan spasi kebawah
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlaMatKul()); //menampilkan Jumlah Mata Kuliah
        System.out.println(); //memberikan spasi kebawah
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS()); //menampilkan jumlah SKS
        System.out.println(); //memberikan spasi kebawah
        System.out.println("Dosen : ");
        D1.printDosen(); //mencetak NIP, Nama, dan Prodi dosen
        System.out.println(); //memberikan spasi kebawah
        System.out.println("Kendaraan : ");
        K1.printKendaraan(); //mencetak noPlat dan jenis Kendaraan
        System.out.println(); //memberikan spasi kebawah
        System.out.println("Mata Kuliah : ");
        PBO.printMataKuliah(); //mencetak idMatkul, Nama, dan SKS
        System.out.println(); //memberikan spasi kebawah
        System.out.println("Mahasiswa : ");
        M1.printMhs(); //mencetak NIM, Nama, dan Prodi
    }
    
}
