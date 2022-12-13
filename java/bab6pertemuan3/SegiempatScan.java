/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab6pertemuan3;

/**
 *
 * @author Hp
 */
import java.util.Scanner;

public class SegiempatScan {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);	
		
		System.out.print("Enter Numbers of Rows and Columns = ");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		System.out.println("Printing Same Numbers in Rows and Columns");
		int i = 1, j;
		
		do
		{
			j = i ;
			
			do 	
			{
				System.out.printf("%d", j);

			} while ( ++j < i + columns );
			
			System.out.println();

		} while(++i <= rows );
	}
}
