package codingtest;

import java.util.Scanner;

/*
 * 2020.11.06
 * swea 1986. 지그재그 숫자
 * 
 */

public class Zigzag {
	
	static Scanner sc= new Scanner(System.in);
	static int T= sc.nextInt();
	//private static int sum;
	//private static int test_case;
	
	
	
	public static int cal() {
		
		for(int test_case = 1; test_case <=T; test_case++) {
			
			int n= sc.nextInt();
			int sum=0;
			
			if(n>0) {
				for(int i=1; i<=n; i++) {
					if(i%2==1) {//홀수라면
						sum = sum + i;
					}
					else if(i%2==0) { //짝수라면
						sum = sum - i;
					}
					else{
						System.out.println("에러");
					}
				}
			}
			System.out.println("#"+test_case+"\t"+sum);
		}
		
		return 0;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		cal();
		
	
	}

}
