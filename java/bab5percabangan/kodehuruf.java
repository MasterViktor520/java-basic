/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5percabangan;

/**
 *
 * @author Hp
 */
import java.util.Scanner;

public class kodehuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String huruf = "";
    System.out.println("Masukkan nilai huruf (A - E)");
    huruf = input.nextLine();
    
       switch (huruf){
        case "A":
            System.out.println("4");
            break;
        
            case "a":
            System.out.println("4");
            break;
            
            case "B":
            System.out.println("3");
            break;
            
            case "b":
            System.out.println("3");
            break;
            
            case "C":
            System.out.println("2");
            break;
            case "c":
            System.out.println("2");
            break;
            case "D":
            System.out.println("1");
            break;
            case "d":
            System.out.println("1");
            break;
            case "E":
            System.out.println("0");
            break;
            case "e":
            System.out.println("0");
            break;
            
        
        default:
            System.out.println("Huruf tidak terdaftar");
            break;
        
    }
    }    
}
