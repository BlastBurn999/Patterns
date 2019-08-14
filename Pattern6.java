public class Pattern6
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println();
			for(int s=1;s<=(5-i);s++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
		}

	}
}
/*
C:\Users\USER\Desktop\Patterns>javac Pattern6.java

C:\Users\USER\Desktop\Patterns>java Pattern6

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
*/