public class Pattern1
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
				System.out.print(j);
		}
		for(i=4;i>0;i--)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
				System.out.print(j);
		}
	}
}
/*
C:\Users\USER\Desktop>javac Pattern1.java

C:\Users\USER\Desktop>java Pattern1

1
12
123
1234
12345
*/