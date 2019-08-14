public class Pattern7
{
	public static void main(String[] args)
	{
		for(int i=5;i>0;i--)
		{
			System.out.println();
			for(int j=5;j>(5-i);j--)
				System.out.print(j);
		}

	}
}
/*
C:\Users\USER\Desktop\Patterns>javac Pattern7.java

C:\Users\USER\Desktop\Patterns>java Pattern7

54321
5432
543
54
5
*/