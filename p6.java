import java.util.*;
class  p6
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter rows");
		int rows =input.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows;j>=i;j--)
			{
				System.out.print(" ");
	}
	for(int k=1;k<rows;k++)
			{
    System.out.print("*");
		}
	System.out.println();
		}
	}
} 