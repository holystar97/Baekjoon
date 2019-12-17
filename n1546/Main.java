package n1546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int score[]=new int[n];
		for(int i=0; i<n; i++) {
			score[i]=sc.nextInt();
		}
		
		int max=score[0];
		int maxInt=0;
		for(int i=0;i<n;i++) {
			if(max<score[i]) {
				max=score[i];
				maxInt=i;
			}
		}
		
		for(int i=0;i<n;i++) {
			
			if(maxInt==i) {
				continue;
			}
			score[i]=score[i]/max*100;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(score[i]);
		}
		
		
	}

}
