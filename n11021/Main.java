package n11021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int sum[]=new int[n];
		int a[][]=new int[n][2];
		
		for(int i=0; i<n; i++) {
			
			a[i][0]=sc.nextInt();
			a[i][1]=sc.nextInt();
			sum[i]=a[i][0]+a[i][1];
			
		}
		
		
		for(int i=1; i<=n; i++) {
			System.out.println("Case #"+i+":"+" "+a[i-1][0]+" " +"+"+" "+a[i-1][1]+" "+"="+" "+sum[i-1]);		
		}
	
	}

}
