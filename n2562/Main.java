package n2562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a[]=new int[9];
		int max=0;
		int rank=0;
		for(int i=0 ;i<a.length;i++) {

			a[i]=sc.nextInt();		
		}
		
		for(int i=0 ;i<a.length;i++) {

			if(max<a[i]) {
				max=a[i];
				rank=i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(rank);
		
	}
}
