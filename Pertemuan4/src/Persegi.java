public class Persegi extends BangunDatar {
    // Atribut
    private double sisi;

    // Method

    // konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    // konstruktor dengan parameter sisi, warna, dan border
    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    // mengembalikan nilai sisi
    public double getSisi(){
        return sisi;
    }

    // mengeset nilai sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // mengembalikan nilai luas
    public double getLuas(){
        return this.sisi * this.sisi;
    }

    // mengembalikan nilai keliling
    public double getKeliling(){
        return this.sisi * 4;
    }

    // mengembalikan nilai diagonal
    public double getDiagonal(){
        return this.sisi * Math.sqrt(2);
    }

    // mencetak nilai sisi dan nilai printInfo dari class BangunDatar
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi = " + sisi);
    }
}
