/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5percabangan;

/**
 *
 * @author Hp
 */
import java.util.Scanner;

    public class nilaihuruf {
        public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    String Nama;
    int Nim;
    System.out.print("Masukkan nama anda = ");
    Nama = inp.nextLine();
System.out.print("Masukkan Nim = ");
    Nim = inp.nextInt();
System.out.print("Masukkan Nilai = ");
int nilai = inp.nextInt();
System.out.println(""    + Nama);
System.out.println(""    + Nim);
     if(nilai < 55) {
System.out.println("E");
} else if(nilai < 65) {
System.out.println("D");
} else if(nilai < 75) {
    System.out.println("C");
} else if(nilai < 85) {
    System.out.println("B");
} else if(nilai < 100) {
    System.out.println("A");
} else if(nilai > 100) {
    System.out.println("EROR 404");
} else {
    System.out.println("Nilai Sempurna ");
}
}
        }