public class Pattern2
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
				System.out.print(i);
		}
	}
}
/*C:\Users\USER\Desktop>javac Pattern2.java

C:\Users\USER\Desktop>java Pattern2

1
22
333
4444
55555
*/