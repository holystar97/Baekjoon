package n2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int b1=b/100;
		b=b%100;
		int b2= b/10;
		b=b%10;
		int b3= b/1;
		b=b%1;
		
		System.out.println(a*b3);
		System.out.println(a*b2);
		System.out.println(a*b1);
		
		System.out.println((a*b3)+(a*b2*10)+(a*b1*100));
		
	}

}
