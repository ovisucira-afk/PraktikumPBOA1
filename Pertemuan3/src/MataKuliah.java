/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 2 Maret 2026
 */

public class MataKuliah{
    //Atribut 
    private String idMatkul;
    private String Nama;
    private int sks;

    //Method
    public MataKuliah(){
        //konstruktor tanpa parameter
    }

    //konstruktor dengan parameter idMatkul, Nama, dan sks
    public MataKuliah(String idMatkul, String Nama, int sks){
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.sks = sks;
    }

    //mengembalikan nilai idMatkul
    public String getIdMatkul(){
        return this.idMatkul;
    }

    //mengembalikan nilai Nama
    public String getNama(){
        return this.Nama;
    }

    //mengembalikan nilai SKs
    public int getSks(){
        return this.sks;
    }

    //mengeset nila idMatkul
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    //mengeset nilai Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //mengeset nilai sks
    public void setSks(int sks){
        this.sks = sks;
    }

    //mencetak nilai idMatkul, nama, dan sks
    public void printMataKuliah(){
        System.out.println("idMatkul = " + idMatkul);
        System.out.println("Nama = " + Nama);
        System.out.println("SKS = " + sks);
    }
}