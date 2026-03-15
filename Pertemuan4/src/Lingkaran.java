public class Lingkaran extends BangunDatar{
    // Atribut
    private double jari;

    //Method

    // konstruktor tanpa parameter
    public Lingkaran(){

    }

    // konstruktor dengan parameter diameter, warna, dan border
    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
    }

    // mengembalikan nilai jari
    public double getJari (){
        return jari; 
    }

    // mengeset nilai jari
    public void setJari(double jari){
        this.jari = jari;
    }

    // mengembalikan nilai luas
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    // mengembalikan nilai keliling
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    // mencetak nilai jari dan nilai printInfo dari class BangunDatar
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari = " + jari);
    }
}
