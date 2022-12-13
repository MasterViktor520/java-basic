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

public class Kelulusan2 {
     public static void main(String[] args) {
         
Scanner l2 = new Scanner(System.in);
System.out.print("Masukkan nama anda = ");
String Nama = l2.nextLine();
System.out.print("Masukkan Jenis kelamin = ");
String Jenis_kelamin =l2.next();
System.out.print("Masukkan Tinggi Badan = ");
int nilai = l2.nextInt();
System.out.println(""    + Nama);
System.out.println(""    + Jenis_kelamin);

if("L".equals(Jenis_kelamin)) {
if(nilai >= 230) {
System.out.println("Anda lulus ");
} else {
System.out.println("Anda tidak lulus ");
}
} else if("P".equals(Jenis_kelamin)) {
if(nilai >= 210) {
System.out.println("Anda lulus ");
} else {
System.out.println("Anda tidak lulus ");
}
}
}
}
