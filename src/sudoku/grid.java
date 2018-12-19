/**
 * 
 */
package sudoku;

/**
 * @author Fahad
 *
 */
public class grid {
	public static int[][] grid = new int[4][4];
	public void display_empty()
	{
		for (int i= 0; i < 4 ; i++)
		{
			System.out.print("_ _ _ _\n");			
		}	
	}
	public boolean is_full()
	{
		boolean flag = false;
		for(int x = 0; x < grid.length ; x++)
		{	
			for(int y =0 ; y < grid[x].length ; y++)
			{
				if (grid[x][y] == 0) 
				{
					flag = false;	
				}
				else
				{
					flag = true;
				}
			}
		}
		return flag;
	}
	
	public int count_elements()
	{
		int count = 0;
		for(int x = 0; x < grid.length ; x++)
		{	
			for(int y =0 ; y < grid[x].length ; y++)
			{
				if (grid[x][y] != 0) 
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public void put_value(int val , int pos)
	{
		try
		{
		if (has_errors(val, pos) == true)
			{	
				if (pos <= 4)
				{
					grid[0][pos-1] = val;
				}
				else if (pos <= 8 && pos > 4)
				{
					grid[1][pos-5] = val;
				}
				else if (pos <= 12 && pos > 8)
				{
					grid[2][pos-9] = val;
				}
				else
				{
					grid[3][pos-13] = val;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown!!!");
		}

	}
	public static boolean has_errors(int val, int pos)
	{
		errors err = new errors();
		if (err.valid_position(pos) && err.valid_value(val))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void display()
	{
		for(int x = 0; x < grid.length ; x++)
		{	
			for(int y =0 ; y < grid[x].length ; y++)
			{
				System.out.print(grid[x][y] + "  ");
			}
			System.out.println();
		}
	}
	public static boolean has_duplicates(int num)
	{
		boolean flag = false;
		for(int x = 0; x < grid.length ; x++)
		{	
			for(int y =0 ; y < grid[x].length ; y++)
			{
				if(grid[x][y] == num)
				{
					flag = true;
				}
			}
		}
		return flag;
	}
}
























