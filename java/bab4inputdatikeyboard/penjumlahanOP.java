/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4inputdatikeyboard;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class penjumlahanOP {
     public static void main(String[] args) {
         int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai1 ="));
         int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai2 ="));
         int jumlah = nilai1 + nilai2;
         System.out.println("Jumlah = " + jumlah);
}
}
