/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Hp
 */
public class jam {
   public static void main (String[] args) {
       int jam = 10;
       int menit =37;
       int detik =30;
     int jumlah_detik=(jam*3600)+(menit*60)+(detik);
     System.out.println("jumlah detik dari jam 00" + jumlah_detik);
     
     int jam2= 8;
     int menit2=37;
     int detik2=12;
     int jumlah_detik2=(jam2*3600)+(menit2*60)+(detik2);
     System.out.println("jumlah detik dari jam 00" + jumlah_detik2);
     int selisih=(jumlah_detik-jumlah_detik2);
     System.out.println("Selisih waktu 1 dari 2 (dalam detik)" + selisih +"detik");
}
}
