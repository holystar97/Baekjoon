package n2920;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];

		for(int i=0 ;i<a.length;i++) {

			a[i]=sc.nextInt();		
		}
		
		String output="";
		
		for(int i=0; i<a.length-1;i++) {
		
				if(a[i]-a[i+1]==-1) {
					output="ascending";
				}	
				else if (a[i]-a[i+1]==1) {
					output="decsending";
				}
				else {
					output="mixed";
					break;
				}
		}
		
		System.out.println(output);	
	}
}
