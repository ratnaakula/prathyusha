import java.io.File;
import java.util.*;

public class HomeAssignment
{

	static Scanner scan;

	static int rows;

	static int columns;

	static char[][] maze;

	static int startrow;

	static int startcolumn;

	static char s;

	public static void readFile() throws Exception
	{

		scan = new Scanner(new File("C:\\Users\\prathyusha\\Desktop\\input.txt"));
	}

	public static void getArraySize()
	{

		String firstLine;
		firstLine = scan.nextLine();
		String[] firstLineArr = firstLine.split(",");
		rows = Integer.parseInt(firstLineArr[0]);
		columns = Integer.parseInt(firstLineArr[1]);
	}

	public static void declareArray()
	{

		maze = new char[rows][columns];
	}

	public static void loadArray()
	{

		int count = 0;
		while (scan.hasNext())
		{
			maze[count] = scan.nextLine().toCharArray();
			System.out.println(maze[count]);
			count++;
		}

	}

	public static void findStartPosition()
	{

		for (int i = 0; i < rows; i++)

			for (int j = 0; j < columns; j++)
			{

				if (maze[i][j] == 's')
				{
					startrow = i;
					startcolumn = j;
				}
			}
		System.out.println(startrow + " " + startcolumn);
	}

	public static void main(String[] args) throws Exception
	{

		readFile();
		getArraySize();
		declareArray();
		loadArray();
		findStartPosition();
	}
}
