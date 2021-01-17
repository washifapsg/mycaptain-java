package project;

import java.util.*;

public class Projectfour
{
	public static void main(String[] args)
	{
		int a[][]= { {1,3,4}, {2,4,3}, {3,4,5}};
		int b[][]= {{1,3,4},{2,4,3},{1,2,4}};
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
		System.out.println("matrix addition is :\n");
	

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int x=a[i][j]+b[i][j];
				
				c[i][j]=x;
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				d[i][j]=0;
				for (int k=0;k<3;k++)
				{
					
					d[i][j]=d[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("matrix multiplication is: \n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
	}		
}
			
		
	

		
