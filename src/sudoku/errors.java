/**
 * 
 */
package sudoku;

/**
 * @author Fahad
 *
 */
public class errors {
	grid grid= new grid();
	public boolean valid_value(int val)
	{
		if(val < 1 || val > 4)
		{
			System.out.print("Value should be between 1 and 4, Try again!!!\n");
			return false;
		}
		else if(val < 0 )
		{
			System.out.print("Value cant be negative, Try again!!!\n");
			return false;
		}		
		else if (grid.has_duplicates(val) == true)
		{
			System.out.print("Values can not be repeated, Try again!!!\n");
			return false;
		}
		else
			return true;
	}
	public boolean valid_position(int pos)
	{
		if(pos < 1 || pos > 16)
		{
			System.out.println("Position not valid, Try again!!!");
			return false;
		}
		else
			return true;
	}
	
}
