package codingtest;

import java.util.Scanner;
/*
 * 2020.11.05
 * swea 1989. 초심자의 회문
 * 
 */

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int T= sc.nextInt();
		
		for(int test_case = 1; test_case <=T; test_case++) {
			String text= sc.next();
			int flag=1;
			
			for(int i=0; i<text.length()/2; i++) {
				if(text.charAt(i) != text.charAt(text.length()-1-i)) {
					flag=0;
					break;
				}
			}
			System.out.println("#"+test_case+" "+flag);
		}
	}

}
