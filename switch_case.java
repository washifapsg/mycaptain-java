package project;

import java.util.*;

public class Projectthree {
	public static void main (String[] args) 
	{
	System.out.println("choose any one \n1:hai\n2.Hey\n3.hello ");
	Scanner a=new Scanner(System.in);
	int choice = a.nextInt();
	switch(choice)
	{
	case 1: System.out.println("choosed as Hai");
	break;
	case 2: System.out.println("choosed as Hey");
	break;
	case 3: System.out.println("choosed as Hello");
	break;
	default: System.out.println("choose 1 or 2 or 3");
	}
	}
}
