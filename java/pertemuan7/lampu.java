/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Hp
 */
import java.util.Scanner;

public class lampu {
      public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
System.out.print("Masukkan Angka = ");
int nilai = inp.nextInt();

if(nilai < 1) {
    System.out.println("hidup");
} else if(nilai < 2) {
    System.out.println("mati");
} else if(nilai > 2) {
    System.out.println("EROR 404");
}
}
}
