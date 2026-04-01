/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri
 *                Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 26 Maret 2026 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase){
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*Pertanyaan :
1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Jelaskan pada lembar praktikum anda!

Jawab :
1. Baris : 
   System.out.println(angka + " bukan angka sial"); 
        Tidak akan dieksekusi ketika terjadi eksepsi karena saat angka 13 muncul,
   program akan masuk ke :
   throw new AngkaSialException();
   dimana ketika baris ini dijalankan, method akan langsung berhenti di sini,
   sehingga semua kode setelah baris tersebut tidak akan dijalankan.
2. Baris:
   } catch(AngkaSialException ase){
        Akan dieksekusi karena eksepsi yang terjadi pada cobaAngka(13)
   dilempar ke main dan ditangkap oleh blok try-catch. Setelah
   eksepsi ditangkap, program akan masuk ke dalam blok catch dan menjalankan
   seluruh perintah yang ada di dalamnya.
*/