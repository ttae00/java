package codingtest;

import java.util.Scanner;
/*
 * swea 2001. 파리 퇴치
 * 완전 탐색 이용.. 
 * 오류..
 * 
 */


public class GetRidOfFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("테스트 케이스 갯수 입력하세요.");
		int T= sc.nextInt();
		
		
		
		for(int test_case = 1; test_case <=T; test_case++) {
			
			System.out.println("n 크기를 입력하세요");
			int sizeN= sc.nextInt();
			System.out.println("m 크기를 입력하세요");
			int sizeM= sc.nextInt();
			
			int[][] n= new int[sizeN][sizeN];
			for(int i=0; i<n.length; i++) {
				for(int j=0; j<n[i].length; j++) {
					if(sizeN>=5 && sizeN<=15) {
						//System.out.println(n.length + "개를 입력하세요");
						n[i][j]= sc.nextInt();
					}
					else {
						System.out.println("n의 값을 확인하세요");
					}
				}
			}
			
			int max = 0;
			
			
			for(int i=0; i<n.length; i++) {
				for(int j=0; j<n[i].length; j++) {
				
					int sum = 0;
					for(int k=0; k<sizeM; k++) {
						for(int s= 0; s<sizeM; s++) {
							if(i+k>=sizeN || j+s >=sizeN) {
								sum += n[i+k][j+s];
								continue;
								
							}
						}
						max= Math.max(max, sum);
					}
					
				}
				System.out.println("#"+ test_case+ " "+ max);
			}
		}
			
	}
}
			
				
		
	

