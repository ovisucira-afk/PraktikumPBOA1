/* Nama File    : Coercion.java
 * Deskripsi    : Program yang mengilustrasikan polimorfisme coercion
 * Pembuat      : Ovilia Suci Ramadhani / 24060124120040
 * Tanggal      : 25 April 2026 */

public class Coercion {
    public static void main(String[] args){
       // a. coercion
       int nilaiInteger = 65;
       System.out.println("Integer : " + nilaiInteger);
       char karakter = (char) nilaiInteger;
       System.out.println("Karakter : " + karakter);
       double nilaiDouble = (double) nilaiInteger;
       System.out.println("Real : " + nilaiDouble);

       // b. mengembalikan real ke integer
       int nilaiIntLagi = (int) nilaiDouble;
       System.out.println("Integer dari real : " + nilaiIntLagi);

       // c. 
       String X = "1234";
       String Y = "5678";
       String S = X + Y;
       Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);

       System.out.println("S (konkatenasi) : " + S);
       System.out.println("Z (penjumlahan) : " + Z);

       // d. 
       String P = "12.34";
       String Q = "56.78";
       String R = P + Q;
       Double D = Double.parseDouble(P) + Double.parseDouble(Q);

       System.out.println("R (konkatenasi) : " + R);
       System.out.println("D (penjumlahan) : " + D);

       // e. S ke Integer A
       Integer A = Integer.parseInt(S);
       System.out.println("A : " + A);

       // f. A ke String T
       String T = A.toString();
       System.out.println("T : " + T);
    }
}