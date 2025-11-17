import java.util.Scanner;
public class Notes {

	public static void main(String[] args) {
		new Notes();
	}

	public Notes()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the width and height you would like for your square array: ");
		int arr[][] = createArr(reader.nextInt());
	}

	public int[][] createArr(int x)
	{
		int arr[][] = new int [x][x];
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < x; j++)
			{
				arr[i][j] = (int)(Math.random()*10)+1;
			}
		}
		return arr;
	}

	public int returnFirst(int[][] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[0].length; j++)
			{
				if(arr[i][j] % 2 == 0)
					return arr[i][j];
			}
		}

		return 0;
	}

	public int first17(int[][] arr)
		{
			for(int i = 0; i < arr.length; i++)
			{
				for(int j = 1; j < arr[0].length-1; j++)
				{
					if((arr[i][j] % 2 == 0) && ((arr[i][j-1] + arr[i][j+1]) > 17))
						return arr[i][j];
				}
			}

			return 0;
	}
}