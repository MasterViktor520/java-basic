/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class bilangangenap {
    public static void main(String[] args) {
Scanner lo = new Scanner(System.in);
System.out.print("tingi air = ");
float nilai = lo.nextFloat();

if(nilai <= 500.0) {
    System.out.println("aman");
} else if(nilai <= 600.0) {
    System.out.println("waspada");
  } else if(nilai <= 649.9) {
    System.out.println("SIAGA2");  
 } else if(nilai >= 650) {
    System.out.println("SIAGA1");   
}
}
}
