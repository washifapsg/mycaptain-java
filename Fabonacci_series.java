package project7;

import java.util.*;

public class project7 {
	static int n=0;	
	public static int fibonacci(int n) 
	{
		if (n==0)
			return 0;
			else if(n==1)
				return 1;
				else 
				{
					int a=fibonacci(n-1);
					int b=fibonacci(n-2);
					int c=a+b;
					return c;
				}
					
					
	}
	public static void main (String[] args)
	{	
		System.out.println("series limit");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int i=0;
		for(i=0;i<=n;i++)
		{
			int a=fibonacci(i);
			System.out.println(a);
		}
	}
}
