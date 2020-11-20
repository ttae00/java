package recursion;
/*
 * baekjoon 6603
 * 2020.11.10
 * recursion
 */

import java.util.*;

public class lotto6603 {
	
	static int k; //집합 s의 k개 요소
	static int s[]; //집합 s 배열
	static int arr[]= new int[6];
	static int length= 6;

	
	public static void lotto(int start, int depth) {
		if(start==length) {
			for(int i=0; i<length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
			
			return;
		}
		
		for(int i=depth; i<k; i++) {
			arr[start]= s[i];
			lotto(start+1, i+1);
		}
	}
	
	
	
	
	
	/*
	 * public int selectNum(int n) {
	 * 
	 * Scanner sc= new Scanner(System.in);
	 * 
	 * //int k= sc.nextInt(); int num =sc.nextInt(); //int[] num1= new int[0];
	 * 
	 * int[] num1= new int[]{}; int[] temp= new int[]{};
	 * 
	 * for(int i=0; i < num1.length+1; i++) {
	 * 
	 * num1[i]= sc.nextInt();
	 * 
	 * }
	 * 
	 * for(int i=1; i< num1.length; i++) {
	 * 
	 * if(n==0) { return 0; }
	 * 
	 * }
	 * 
	 * 
	 * else { return selectNum(n-1); } }
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			k= sc.nextInt();
			if(k==0) break;
			
			s= new int[k];
			for(int i=0; i<k; i++) {
				s[i]= sc.nextInt();
			}
			
			lotto(0,0);
			System.out.println();
			
		}
	}
}
