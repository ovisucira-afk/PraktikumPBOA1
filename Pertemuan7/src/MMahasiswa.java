/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi aplikasi method dalam class Mahasiswa
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class MMahasiswa {
    public static void main(String[] args){
        // b. aplikasi semua varian operator setProgramStudi
        Mahasiswa m1 = new Mahasiswa("240001", "Sela", "Informatika");
        Mahasiswa m2 = new Mahasiswa("240012", "Putra", "Teknik Komputer");
        Mahasiswa m3 = new Mahasiswa("240123", "Gisha", "Sistem Informasi");

        System.out.println("Data awal: ");
        m1.tampilData();
        m2.tampilData();
        m3.tampilData();

        System.out.println("Set program studi tanpa parameter: ");
        m1.setProgramStudi();
        m1.tampilData();

        System.out.println("Set program studi dengan String: ");
        m2.setProgramStudi("Teknologi Informasi");
        m2.tampilData();

        System.out.println("Set program studi dengan objek Mahasiswa: ");
        m3.setProgramStudi(m2);
        m3.tampilData();

        // c. konstruktor default 
        System.out.println("Objek default: ");
        Mahasiswa mDefault = new Mahasiswa();
        mDefault.tampilData();

        // d. konstruktor 3 parameter
        System.out.println("Objek 3 parameter: ");
        Mahasiswa mParameter = new Mahasiswa("240002", "Wila", "Ilmu Komputer");
        mParameter.tampilData();

        // e. konstruktor cloning
        System.out.println("Objek Cloning: ");
        Mahasiswa mClone = new Mahasiswa(mParameter);
        mClone.tampilData();
    }
}
