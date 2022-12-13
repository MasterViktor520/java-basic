/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab6pertemuan3;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class lulus3 {
    public static void main(String[] args) {
   int i = 1;
    while(i < 5){
    Scanner p = new Scanner(System.in);
        System.out.print("Masukkan nama anda = ");
        String nama = p.nextLine();
        System.out.print("Masukkan Jenis kelamin = ");
        String Jenis_kelamin =p.next();
        System.out.print("Masukkan Tinggi Badan = ");
        int nilai = p.nextInt();
        
       if("L".equals(Jenis_kelamin)) {
if(nilai >= 230) {
System.out.println("Anda lulus ");
} else {
System.out.println("Anda tidak lulus ");
}
         System.out.println("\n");
         System.out.println("---- Data kelulusan ke -"+i+" ----");
         System.out.println("Nama = " + nama);
         System.out.println("Jenis Kelamin = " + Jenis_kelamin); 
         System.out.println("Anda tidak lulus ");
         System.out.println("\n");
         
         } else {
       if("P".equals(Jenis_kelamin)) {
if(nilai >= 210) {
    
System.out.println("Anda lulus ");
}
         System.out.println("\n");
         System.out.println("---- Data Kelulusan ke -"+i+" ----");
         System.out.println("Nama = " + nama);
         System.out.println("Jumlah Kehadiran = " + Jenis_kelamin); 
         System.out.println("Anda tidak lulus ");
         System.out.println("\n");
         }
        
i++;
}
}
}
    }
