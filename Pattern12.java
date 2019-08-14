
public class Pattern12
{
	public static void main(String[] args)
	{
		int i=1,j=1,n=1;
		do
		{
			System.out.println();
			j=1;
			n=i;
			do
			{
				System.out.print(n+" ");
				n+=5;
				j++;
			}while(j<=i);
			i++;
		}while(i<=5);
	}
}
/*
C:\Users\USER\Desktop\Patterns>javac Pattern12.java

C:\Users\USER\Desktop\Patterns>java Pattern12

1
2 7
3 8 13
4 9 14 19
5 10 15 20 25
*/