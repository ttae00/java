package codingtest;

import java.util.Scanner;
/*
 * swea 2001. �ĸ� ��ġ
 * ���� Ž�� �̿�.. 
 * ����..
 * 
 */


public class GetRidOfFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("�׽�Ʈ ���̽� ���� �Է��ϼ���.");
		int T= sc.nextInt();
		
		
		
		for(int test_case = 1; test_case <=T; test_case++) {
			
			System.out.println("n ũ�⸦ �Է��ϼ���");
			int sizeN= sc.nextInt();
			System.out.println("m ũ�⸦ �Է��ϼ���");
			int sizeM= sc.nextInt();
			
			int[][] n= new int[sizeN][sizeN];
			for(int i=0; i<n.length; i++) {
				for(int j=0; j<n[i].length; j++) {
					if(sizeN>=5 && sizeN<=15) {
						//System.out.println(n.length + "���� �Է��ϼ���");
						n[i][j]= sc.nextInt();
					}
					else {
						System.out.println("n�� ���� Ȯ���ϼ���");
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
			
				
		
	

