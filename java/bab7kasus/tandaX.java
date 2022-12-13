/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7kasus;

/**
 *
 * @author ILHAM
 */
public class tandaX {
    public static void main(String[] args) {
        int d1,d2;
        //
        for(d1=1;d1<=5;d1++)
        {
        for(d2=1;d2<=5;d2++)
        {
         if(d1==d2|d1+d2==5+1)
         {
             System.out.print("@");
         }
         else
         {
             System.out.print("=");
         }
         }
        System.out.println();
        }
        } 
    }
