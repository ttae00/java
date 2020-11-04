package codingtest;

import java.util.Scanner;

/*
 * 20.11.04
 * SWEC 
 * 2005. 파스칼의 삼각형
 * 입력 한꺼번에 하고 값만 받는 게 안됨
 * 
 */


public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		
		
		for(int test_case = 1; test_case <=T; test_case++) {
			
			int size=sc.nextInt();
			int[][] a= new int[size][size];
			
			for(int i=0; i<size; i++) {
				for(int j=0; j<=i; j++) {
					if(j==0) {
						a[i][j]= 1;
						//a[i+1][j]= 1;
					}
					else if(i==j) {
						a[i][j]= 1;
						//a[i+1][j+1]= 1;
					}
					else {
						a[i][j]= a[i-1][j-1]+a[i-1][j];
					}
				}
			}

			System.out.println("#"+test_case);
			
			for(int i=0; i<size; i++) {
				for(int j=0; j<=i; j++) {
				System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
	
		
	}
}


