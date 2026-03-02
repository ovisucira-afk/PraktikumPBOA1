public class Dosen {
    //Atribut
    private String NIP;
    private String Nama;
    private String Prodi;

    //Method
    public Dosen(){
        //konstruktor tanpa parameter
    }

    // Konstruktor dengan parameter nip, nama, dan prodi
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    //Mengembalikan nilai NIP
    public String getNIP(){
        return this.NIP;
    }

    //Mengembalikan nilai Nama
    public String getNama(){
        return this.Nama;
    }

    //Mengembalikan nilai Prodi
    public String getProdi(){
        return this.Prodi;
    }

    //Mengeset nilai NIP
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    //Mengeset nilai Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //Mengeset nilai Prodi
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    //mencetak nilai NIP, Nama, dan Prodi
    public void printDosen(){
        System.out.println("NIP = " + NIP);
        System.out.println("Nama = " + Nama);
        System.out.println("Prodi = " + Prodi);
    }
}
