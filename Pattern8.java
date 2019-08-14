public class Pattern8
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println();
			for(int j=5;j>(5-i);j--)
				System.out.print(j);
		}

	}
}
/*
C:\Users\USER\Desktop\Patterns>javac Pattern8.java

C:\Users\USER\Desktop\Patterns>java Pattern8

5
54
543
5432
54321
*/