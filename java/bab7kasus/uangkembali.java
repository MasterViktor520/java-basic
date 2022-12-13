/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7kasus;

/**
 *
 * @author ILHAM
 */

public class uangkembali {
     public static void main(String[] args) {
      int a,b,c,d,e,f,g,h,i;
      int kembalian;
       kembalian =37500;
       System.out.println("jumlah uang kembalian =" + kembalian);
   a=kembalian / 100000;
    b=(kembalian - (a * 100000)) / 50000;
    c=(kembalian - ((a * 100000) + ( b * 50000))) / 20000;
    d=(kembalian - ((a * 100000) + ( b * 50000) + (c * 20000))) / 10000;
    e=(kembalian - ((a * 100000) + ( b * 50000) + (c * 20000) + ( d * 10000)))/5000;
    f=(kembalian - ((a * 100000) + ( b * 50000) + (c * 20000) + ( d * 10000) + ( e*5000)))/1000;
    g=(kembalian - ((a * 100000) + ( b * 50000) + (c * 20000) + ( d * 10000) + ( e*5000) + ( f*1000)))/500;
    h=(kembalian - ((a * 100000) + ( b * 50000) + (c * 20000) + ( d * 10000) + ( e*5000) + ( f*1000) + ( g * 500)))/200;
    i=(kembalian - ((a * 100000) + ( b * 50000) + (c * 20000) + ( d * 10000) + ( e*5000) + ( f*1000) + ( g * 500) + ( h * 200)))/100;

    
        System.out.println(a+" "+"lembar Rp. 100.000,-");
        System.out.println(b+" "+"lembar Rp. 50.000,-");
        System.out.println(c+" "+"lembar Rp. 20.000,-");
        System.out.println(d+" "+"lembar Rp. 10.000,-");
        System.out.println(e+" "+"lembar Rp. 5.000,-");
        System.out.println(f+" "+"lembar Rp. 1.000,-");
        System.out.println(g+" "+"lembar Rp. 500,-");
        System.out.println(h+" "+"lembar Rp. 200,-");
        System.out.println(i+" "+"lembar Rp. 100,-");
        System.out.println(" ___  ___       ___  ___  ________  _____ ______      ");
System.out.println("|\\  \\|\\  \\     |\\  \\|\\  \\|\\   __  \\|\\   _ \\  _   \\    ");
System.out.println("\\ \\  \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\   ");
System.out.println(" \\ \\  \\ \\  \\    \\ \\   __  \\ \\   __  \\ \\  \\\\|__| \\  \\  ");
System.out.println("  \\ \\  \\ \\  \\____\\ \\  \\ \\  \\ \\  \\ \\  \\ \\  \\    \\ \\  \\ ");
System.out.println("   \\ \\__\\ \\_______\\ \\__\\ \\__\\ \\__\\ \\__\\ \\__\\    \\ \\__\\");
System.out.println("    \\|__|\\|_______|\\|__|\\|__|\\|__|\\|__|\\|__|     \\|__|");
                                                      
    }
    }    
