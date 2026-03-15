public class BangunDatar {
    // Atribut
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    // Method

    // konstruktor tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    // konstruktor dengan parameter jmlSisi, warna, dan border
    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // mencetak nilai counterBangunDatar
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // mengembalikan nilai jmlSisi
    public int getJmlsisi(){
        return jmlSisi;
    }

    // mengeset nilai jmlSisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    // mengembalikan nilai warna
    public String getWarna(){
        return warna;
    }

    // mengeset nilai warna
    public void setWarna(String warna){
        this.warna = warna;
    }

    // mengembalikan nilai border
    public String getBorder(){
        return border;
    }

    // mengeset nilai border
    public void setBorder(String border){
        this.border = border;
    }

    // mencetak nilai jmlSisi, warna, dan border
    public void printInfo(){
        System.out.println("Jumlah sisi = " + jmlSisi);
        System.out.println("Warna = " + warna);
        System.out.println("Border = " + border);
    }
}
