package n15596;

import java.util.Scanner;

public class Test {

	public static long sum(int a[]) {

		int ans=0;
		for(int i=0; i<a.length;i++)
		{
			ans+=a[i];
		}
		
		return ans;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		
		long res=sum(a);
		
		System.out.println(res);
		
	}

}
