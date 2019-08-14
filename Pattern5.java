public class Pattern5
{
	public static void main(String[] args)
	{
		for(int i=5;i>0;i--)
		{
			System.out.println();	
			for(int j=i;j>0;j--)
				System.out.print(j);
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
				System.out.print(j);
		}

	}
}
/*
C:\Users\USER\Desktop\Patterns>javac Pattern5.java

C:\Users\USER\Desktop\Patterns>java Pattern5

54321
4321
321
21
1
1
12
123
1234
12345
*/