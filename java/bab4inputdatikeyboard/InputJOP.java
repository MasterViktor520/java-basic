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

public class InputJOP {
public static void main(String[] args) {
String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda!"));
System.out.println("Hai " + nama + ", apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
}
}