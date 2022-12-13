/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Hp
 */
import javax.swing.JOptionPane;

public class iloveyoupakeko {
    public static void main(String[] args) {
  double phi=3.14;
  double Luas;
  double r=Double.parseDouble(JOptionPane.showInputDialog(null,"inputkan jari-jari ="));
  Luas = (phi*r)+(r*r);
          JOptionPane.showMessageDialog(null, "Luas lingkaran luar =" + Luas); 
  double phi1=3.14;
  double Luas1;
  double r1=Double.parseDouble(JOptionPane.showInputDialog(null,"inputkan jari-jari ="));
  Luas1 = (phi1*r1)+(r1*r1);
          JOptionPane.showMessageDialog(null, "Luas lingkaran dalam =" + Luas1);
  double arsir;
  arsir= (373.66-109.9);
         JOptionPane.showMessageDialog(null, "hasil daerah yang di arsir =" + arsir);
          }
}
