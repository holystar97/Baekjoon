package n10950;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[][]=new int[n][2];
		int sum[]=new int[n];
		for(int i=0; i<n;i++) {
			
			a[i][0]=sc.nextInt();
			a[i][1]=sc.nextInt();
			sum[i]=a[i][0]+a[i][1];
		}
		
		for(int i=0; i<n; i++) {
			
			System.out.println(sum[i]);
			
		}
		
		
	}

}
