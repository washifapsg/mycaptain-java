package project;
import java.util.*;
public class Projecttwo {
	
	public static void main(String[] args) {
		System.out.println("enter minutes");
		Scanner sc =new Scanner(System.in);
		float a= sc.nextFloat();
		float b=(float) (a/(60*24*365));
		int c= (int) b;
		float d=(b-c)*365;
		int e= (int) d;
		System.out.println(c+"year and "+ e +" days");
		}
}
