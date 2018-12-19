/**
 * 
 */
package sudoku;

import java.util.*;

/**
 * @author Fahad
 *
 */
public class sudoku_main {
/*	private static int[][] grid = new int[4][4];
*/	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner value = new Scanner(System.in);
		grid grid = new grid();
		while(grid.is_full() == false)
		{
			System.out.print("Enter a value: ");
			int number = value.nextInt(); 
			System.out.print("Enter position: ");
			int pos = value.nextInt(); 
			grid.put_value(number, pos);
			grid.display();
		}
		value.close();
	}
}
