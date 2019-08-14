
public class Pattern14
{
	public static void main(String[] args)
	{
		int i=1,j,k;
		do
		{
			System.out.println();
			j=1;
			do
			{
				System.out.print(j);
				j++;
			}while(j<=i);//prints upto number equal to i
			j--;		//to decrease the extra incremented value
			if(j!=1)
			{	
				j--;	//to start again from 1 less than central value
				do
				{	
					System.out.print(j);
					j--;
				}while(j>0);
			}
			i++;
		}while(i<=5);
	}
}
/*C:\Users\USER\Desktop\Patterns>javac Pattern14.java

C:\Users\USER\Desktop\Patterns>java Pattern14

1
121
12321
1234321
123454321
*/