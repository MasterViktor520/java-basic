/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Hp
 */
import java.util.Scanner;

public class linkaranbulat {
    public static void main(String[] args) {
Scanner s2 = new Scanner(System.in);
System.out.print("Masukkan nilai1 = ");
double r = s2.nextDouble();
System.out.print("Masukkan nilai2 = ");
double phi = s2.nextDouble();
double hasil= (phi*r*r);
double hasil2= (2*phi*r);
        System.out.println("Luas lingkaran dengansd r=9.5 cm adalah" + hasil +"cm persegi");
        System.out.println("Keliling lingkaran adalah" + hasil2 +"cm");
}
}
