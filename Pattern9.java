public class Pattern9
{
	public static void main(String[] args)
	{
		int i=5,j=1;
		do
		{
			System.out.println();
			j=1;
			do
			{
				System.out.print(j);
				j++;
			}while(j<=i);
			i--;
		}while(i>0);
	}
}
/*
C:\Users\USER\Desktop\Patterns>javac Pattern9.java

C:\Users\USER\Desktop\Patterns>java Pattern9

12345
1234
123
12
1
*/