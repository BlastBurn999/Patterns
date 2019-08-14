//FLOYD'S TRIANGLE
public class Pattern10
{
	public static void main(String[] args)
	{
		int i=1,j=1,n=1;
		do
		{
			System.out.println();
			j=1;
			do
			{
				System.out.print(n+" ");
				n++;
				j++;
			}while(j<=i);
			i++;
		}while(i<=5);
	}
}
/*
C:\Users\USER\Desktop\Patterns>javac Pattern10.java

C:\Users\USER\Desktop\Patterns>java Pattern10

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/