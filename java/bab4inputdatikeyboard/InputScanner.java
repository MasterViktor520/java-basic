/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4inputdatikeyboard; 

/**
 *
 * @author Hp
 */
import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
Scanner s1 = new Scanner(System.in);
System.out.print("Masukkan nilai1 = ");
int nilai1 = s1.nextInt();
System.out.print("Masukkan nilai2 = ");
int nilai2 = s1.nextInt();
int jumlah = nilai1 + nilai2;
System.out.println("Jumlah = " + jumlah);
}
}
