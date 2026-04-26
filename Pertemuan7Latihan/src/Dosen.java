/* Nama File    : Dosen.java
 * Deskripsi    : Berisi atribut dan method dalam class Dosen
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class Dosen extends CivitasAkademika {
    // atribut
    private String nip;

    // operator
    // konstruktor tanpa parameter
    public Dosen(){

    }

    // konstruktor dengan parameter
    public Dosen(String nama, String nip){
        super(nama);
        this.nip = nip;
    }

    // memgeset nip
    public void setNIP(String nip){
        this.nip = nip;
    }

    // mengembalikan nomor nip
    @Override
    public String getNomor(){
        return this.nip;
    }
}
