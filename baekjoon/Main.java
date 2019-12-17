package baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int H= sc.nextInt();
		int M= sc.nextInt();
		
		
		if(M>=45) {
			M=M-45;
		}
		else {
		
			if(H==0) {
				H=24;
			}
			
			M=M-45+60;
			H=H-1;
		}
		
		System.out.print(H +" "+ M);
		
	}

}
