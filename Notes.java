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
}