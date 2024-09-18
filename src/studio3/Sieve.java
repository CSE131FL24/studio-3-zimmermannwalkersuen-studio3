package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("What number do you want to start with?: ");
		int N = in.nextInt(); 
	
		
		int[] values;
		values = new int[N];
		
		for (int m = 2; m < Math.sqrt(N); m++) {
		
		for (int i = 2; i < Math.sqrt(N); i++) {
			
			values[m*i]++;
		
		}
		}
		
		for (int j = 0; j<N; j++) {
			if (values[j] == 0) {
				System.out.println(j);
			}
		}
		
	}

}
