/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Hp
 */
public class Salam2 {
    public static void main(String[] args) {
        char c1 = 'S';
        char c2 = 'A';
        char c3 = 'L';
        char c4 = 'A';
        char c5 = 'M';
       System.out.println(""+c1+c2+c3+c4+c5);
       System.out.println(""+c5+c4+c3+c2+c1);
      String s = Character.toString(c1)+Character.toString(c2)+Character.toString(c3)+Character.toString(c4)+Character.toString(c5);
      String m = Character.toString(c5)+Character.toString(c4)+Character.toString(c3)+Character.toString(c2)+Character.toString(c1);
       System.out.println("String s :"+s);
       System.out.println("String m :"+m);
       c1=s.charAt(0);
    }
}
