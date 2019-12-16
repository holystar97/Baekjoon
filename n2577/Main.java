package n2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result= a*b*c;
		int[] array= {0,1,2,3,4,5,6,7,8,9};

		for(int i=0;i<array.length;i++) {
			int cnt=0;
			int temp=result;
			
			while(temp !=0) {
				
				if(temp %10 == array[i]) {
					cnt++;
				}
				temp/=10;
			}
			System.out.println(cnt);
			
		}
		
		
		
	}

}
