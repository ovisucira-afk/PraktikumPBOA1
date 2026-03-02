import java.util.ArrayList;

public class Mahasiswa {
    //Atribut
    private String NIM;
    private String Nama;
    private String Prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //Method
    //konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    //konstruktor dengan parameter nim, nama prodi
    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatKul = new ArrayList<>();
    }

    //Mengembalikan nilai NIM
    public String getNIM(){
        return this.NIM;
    }

    //Mengembalikan nilai Nama
    public String getNama(){
        return this.Nama;
    }

    //Mengembalikan nilai Prodi
    public String getProdi(){
        return this.Prodi;
    }

    //Mengembalikan nilai listMatKul
    public ArrayList<MataKuliah> getMatKul(ArrayList<MataKuliah> listMatKul){
        return this.listMatKul;
    }

    //Mengembalikan nilai dosenWali
    public Dosen getDosenWali(){
        return this.dosenWali;
    }

    //Mengembalikan nilai kendaraan
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    //Mengeset nilai NIM
    public void setNIP(String NIM){
        this.NIM = NIM;
    }

    //Mengeset nilai Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //Mengeset nilai Prodi
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    //Mengeset nilai listMatKul
    public void setMatKul(ArrayList<MataKuliah> listMatKul){
        this.listMatKul = listMatKul;
    }

    //Mengeset nilai dosenWali
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    //Mengeset nilai kendaraan
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //mendambahkan sebuah mata kuliah ke atribut listMatKul
    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    //mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa.
    public int getJumlahSKS(){
        int total = 0;
        for (MataKuliah M : listMatKul){
            total += M.getSks();
        }
        return total;
    }

    //mendapatkan jumlah mata kuliah yang diambil mahasiswa.
    public int getJumlaMatKul(){
        return listMatKul.size();
    }

    //mencetak nilai NIM, Nama, dan Prodi
    public void printMhs(){
        System.out.println("NIM = " + NIM);
        System.out.println("Nama = " + Nama);
        System.out.println("Prodi = " + Prodi);
    }

    //menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa.
    public void printDetailMhs(){
        System.out.println("NIM = " + NIM);
        System.out.println("Nama = " + Nama);
        System.out.println("Prodi = " + Prodi);
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
    }
}
