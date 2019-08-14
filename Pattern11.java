
public class Pattern11
{
	public static void main(String[] args)
	{
		int i=1,j=1,n=1;
		do
		{
			System.out.println();
			j=i;
			do
			{
				System.out.print(j);
				j--;
			}while(j>0);
			i++;
		}while(i<=5);
	}
}
/*
C:\Users\USER\Desktop\Patterns>javac Pattern11.java

C:\Users\USER\Desktop\Patterns>java Pattern11

1
21
321
4321
54321
*/