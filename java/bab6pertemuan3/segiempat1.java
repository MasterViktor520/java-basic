/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab6pertemuan3;

/**
 *
 * @author Hp
 */
public class segiempat1 {
    public static void main (String[] args){
    int i = 1, j;
		
		do
		{
			j = i ;
			
			do 	
			{
				System.out.printf("%d", j);

			} while ( ++j < i + 6 );
			
			System.out.println();

		} while(++i <= 4 );
	}
}
