package project;

import java.util.Scanner;

public class Project3 {
	public static void main(String[] args) {
		System.out.println("please enter the number to check");
		Scanner sc= new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i,m=0,flag=0;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+"is not a prime number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+"is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n+"is a prime number");
			}
		}
	}
}
