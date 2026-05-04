public class MTeman {
    public static void main(String[] args){
        // membuat objek
        Teman t = new Teman();
        t.addNama("Vine");
        t.addNama("Silvi");
        t.addNama("Viil");
        t.addNama("Vine");
        t.addNama("Silvi");
        t.addNama("Vine");
        
        // menampilkan banyak elemen
        System.out.println("Jumlah teman: " + t.getNbelm());
        // menampilkan isi Teman
        t.showTeman();
        // menampilkan nama indeks 0
        System.out.println("\nNama pertama: " + t.getNama(0));
        t.setNama(1, "Silva");
        System.out.println("\nKoleksi terbaru: ");
        t.showTeman();

        // menghapus "Silva"
        t.delNama("Silva");
        System.out.println("\nKoleksi terbaru: ");
        t.showTeman();

        // mengecek apakah member
        System.out.println("\nApakah Silvi adalah teman? " + t.isMember("Silvi"));

        // mengganti nama
        t.gantiNama("Viil", "Vio");
        t.showTeman();

        // menampilkan banyak nama
        System.out.println("\nBanyak nama Vine: " + t.countNama("Vine"));
        System.out.println("\nBanyak nama Silvi: " + t.countNama("Silvi"));
        System.out.println("\nBanyak nama Viil: " + t.countNama("Viil"));
    }
}
