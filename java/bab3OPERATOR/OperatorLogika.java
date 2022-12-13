/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab3OPERATOR;

/**
 *
 * @author Hp
 */
public class OperatorLogika {
    public static void main(String[] args) {
// Buat variabel
boolean b1 = 5 < 10;
boolean b2 = 9 > 11;
boolean b3 = !b1;
boolean b4 = !b2;
// Tes Logika AND
boolean TesAND1 = b1 & b2;
boolean TesAND2 = b1 && b2;
boolean TesAND3 = b1 && b3;
boolean TesAND4 = b1 && b4;
// Tes Logika OR
boolean TesOR1 = b1 | b2;
boolean TesOR2 = b1 || b2;
boolean TesOR3 = b1 || b3;
boolean TesOR4 = b1 || b4;
// Tes Logika XOR
boolean TesXOR1 = b1 ^ b2;
boolean TesXOR2 = b1 ^ b3;
boolean TesXOR3 = b1 ^ b4;
// Print
System.out.println("Tes AND 1 = " + TesAND1);
System.out.println("Tes AND 2 = " + TesAND2);
System.out.println("Tes AND 3 = " + TesAND3);
System.out.println("Tes AND 4 = " + TesAND4);
System.out.println("Tes OR 1 = " + TesOR1);
System.out.println("Tes OR 2 = " + TesOR2);
System.out.println("Tes OR 3 = " + TesOR3);
System.out.println("Tes OR 4 = " + TesOR4);
System.out.println("Tes XOR 1 = " + TesXOR1);
System.out.println("Tes XOR 2 = " + TesXOR2);
System.out.println("Tes XOR 3 = " + TesXOR3);
System.out.println("""
                   Skrip diatas menggunakan variabel bertipe data boolean dengan memasukkan operasi perbandingan di dalamnya.
                   Mengapa outputnya seperti itu?
                   Dikarenakan skrip diatas mengapliaksikan operator logika AND, OR, XOR, dan NOT. AND akan bernilai True jika b1 dan b2 bernilai True. OR akan bernilai False jika b1 dan b2 bernilai False. XOR akan bernilai True jika b1 \u2260 b2. NOT merupakan kebalikan dari b1.
                   
                   b1 = 5 < 10 \t: True
                   b2 = 9 > 11\t: False
                   b3 = !b1\t: False
                   b4 = !b2\t: True
                   
                   Logika AND :
                   boolean TesAND1 = b1 & b2\t: True & False = False
                   boolean TesAND2 = b1 && b2\t: True && False = False
                   boolean TesAND3 = b1 && b3\t: True && False = False
                   boolean TesAND4 = b1 && b4\t: True && True = True
                   
                   Logika OR:
                   boolean TesOR1 = b1 | b2 \t: True | False = True
                   boolean TesOR2 = b1 || b2\t: True || False = True
                   boolean TesOR3 = b1 || b3\t: True || False = True
                   boolean TesOR4 = b1 || b4\t: True || True = True
                   
                   Logika XOR:
                   boolean TesXOR1 = b1 ^ b2\t: True ^ False = True
                   boolean TesXOR2 = b1 ^ b3\t: True ^ False = True
                   boolean TesXOR3 = b1 ^ b4\t: True ^ True = False""");
}
}