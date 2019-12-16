package n10952;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a[]=new int [10];
		int b[]=new int [10];
		int i=0;
		int sum=0;
		while(true) {
	            a[i]=sc.nextInt();
	            b[i]=sc.nextInt();
	            if(a[i]==0&&b[i]==0){
	                break;
	            }
	            i++;   
	      }
		
		for(int j=0; j<i ;j++) {
			sum=0;
			sum+=a[j]+b[j];
			System.out.println(sum);
		}	
		
	}

}
