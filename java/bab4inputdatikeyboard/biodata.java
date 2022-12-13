/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4inputdatikeyboard;

/**
 *
 * @author Hp
 */
import javax.swing.JOptionPane;

public class biodata {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
        int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nim anda!"));
        String ttl = JOptionPane.showInputDialog("Masukkan ttl anda!");
        String alamat = JOptionPane.showInputDialog("Masukkan alamat anda!");
        String email = JOptionPane.showInputDialog("Masukkan email anda!");
        String fb = JOptionPane.showInputDialog("Masukkan fb anda!");
        String ig = JOptionPane.showInputDialog("Masukkan ig anda!");
        String pacar = JOptionPane.showInputDialog("Masukkan nama pacar anda!");
        System.out.println("===================================================================");
        System.out.println("| nama    : " + nama);
        System.out.println("| nim     : " + nim);
        System.out.println("| ttl     : " + ttl);
        System.out.println("| alamat  : " + alamat);
        System.out.println("| email   : " + email);
        System.out.println("| fb      : " + fb);
        System.out.println("| ig      : " + ig);
          System.out.println("pacar   : " + pacar);
        System.out.println("===================================================================");
        System.out.println("NAMA ");
    }
}