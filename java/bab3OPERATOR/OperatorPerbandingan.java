/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab3OPERATOR;

/**
 *
 * @author Hp
 */
public class OperatorPerbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;
        boolean tes1 = a > b;
        boolean tes2 = b < c;
        boolean tes3 = (a * 2) >= (b + c);
        boolean tes4 = (a / d) <= (c - a);
        boolean tes5 = (a - d) == d;
        boolean tes6 = (a - b) != (b - d);
        boolean tes7 = a > 12;
        boolean tes8 = b <= 7;
        boolean tes9 = c == 10;
        boolean tes10 = d != 5;
        System.out.println("Tes ke 1 = " + tes1);
        System.out.println("Tes ke 2 = " + tes2);
        System.out.println("Tes ke 3 = " + tes3);
        System.out.println("Tes ke 4 = " + tes4);
        System.out.println("Tes ke 5 = " + tes5);
        System.out.println("Tes ke 6 = " + tes6);
        System.out.println("Tes ke 7 = " + tes7);
        System.out.println("Tes ke 8 = " + tes8);
        System.out.println("Tes ke 9 = " + tes9);
        System.out.println("Tes ke 10 = " + tes10);
        System.out.println("""
                           Mengapa hasil output menjadi seperti diatas?
                           Karena skrip diatas menggunakan tipe data boolean (nilainya hanya true atau false) dengan memasukkan operator perbandingan didalamnya.
                           boolean tes1 = a > b = 10 > 8. Karena benar,  maka hasilnya adalah True.
                           boolean tes2 = b < c =  8 < 12 . Karena benar,  maka hasilnya adalah True.
                           boolean tes3 = (a * 2) >= (b + c) =  20 >= 20. Karena benar, maka hasilnya adalah True.
                           boolean tes4 = (a / d) <= (c \u2013 a) = 2 <= 2. Karena benar, maka hasilnya adalah True.
                           boolean tes5 = (a \u2013 d) == d = 5 == 5. Karena benar, maka hasilnya adalah True.
                           boolean tes6 = (a \u2013 b) != (b \u2013 d) = 2 != 3. Seharusnya hasilnya adalah False, tetapi karena terdapat negasi (!) maka hasilnya berubah menjadi True.
                           boolean tes7 = a > 12 = 10 > 12. Karena salah, maka hasilnya adalah False.
                           boolean tes8 = b <= 7 = 8 <= 7. Karena salah, maka hasilnya adalah False.
                           boolean tes9 = c == 10 = 12 == 10. Karena salah, maka hasilnya adalah False.
                           boolean tes10 = d != 5 = 5 != 5. Seharusnya hasilnya adalah True, tetapi karena terdapat negasi (!) maka hasilnya berubah menjadi False.""");
}
}