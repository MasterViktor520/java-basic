/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Hp
 */
import javax.swing.JOptionPane;

public class kerucut {
     public static void main(String[] args) {
  double phi=3.14;
  double Luas;
  double r=Double.parseDouble(JOptionPane.showInputDialog(null,"inputkan jari-jari ="));
   double s=Double.parseDouble(JOptionPane.showInputDialog(null,"inputkan garis pelukis kerucut ="));
  Luas = (phi*r*r)+(phi*r*s);
    JOptionPane.showMessageDialog(null, "Luas alas kerucut =");
    double phi1=3.14;
  double Luas1;
  double r1=Double.parseDouble(JOptionPane.showInputDialog(null,"inputkan jari-jari ="));
   double s1=Double.parseDouble(JOptionPane.showInputDialog(null,"inputkan garis pelukis kerucut ="));
  Luas1 = phi1*r1 * (r1+s1);
    JOptionPane.showMessageDialog(null, "Luas selimut kerucut =" + Luas1);
     }
     }
