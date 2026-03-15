/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 15 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    // Atribut
    protected String fakultas;

    // Method

    // konstruktor tanpa parameter
    public Dosen(){

    }
    
    // konstruktor dengan parameter nip, nama, tanggalLahir, tmt, gajiPokok dan fakultas
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // mengembalikan nilai fakultas
    public String getFakultas(){
        return this.fakultas;
    }

    // mengeset nilai fakultas
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
}
