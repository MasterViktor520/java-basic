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

public class biodata {

    public static void main(String[] args) {
Scanner s1 = new Scanner(System.in);
String nama,kelas,alamat;

System.out.print("nama = ");
 nama = s1.nextLine();

System.out.println("kelas = ");
 kelas = s1.nextLine();

System.out.print("alamat = ");
 alamat = s1.nextLine();

System.out.println("nim = ");
int nim = s1.nextInt();

System.out.println("nama = " + nama);
System.out.println("kelas = " + kelas);
System.out.println("alamat =" + alamat);
System.out.println("nim =" + nim);
}
}
