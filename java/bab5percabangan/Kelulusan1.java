/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5percabangan;

import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Kelulusan1 {
    public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
System.out.print("Masukkan nama anda = ");
String Nama = inp.next();
System.out.print("Masukkan nim = ");
String nim = inp.next();
System.out.print("Masukkan Nilai = ");
int nilai = inp.nextInt();
System.out.println(""    + Nama);
System.out.println(""    + nim);
if(nilai > 55) {
System.out.println("Anda lulus ");
    } else {
    System.out.println("Anda tidak lulus ");
}
}
}
