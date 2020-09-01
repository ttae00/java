package javaproject_2w;
/*
 * for와 if를 이용하여 홀수의 합 구하기 
 * 1부터 100 사이의 홀수의 합을 구해 보자
 * 힌트: for를 이용하여 1부터 100까지 1씩 증가시키면서 홀수 여부를 판별한다.
 */
public class ForCondition053 {
	
	public static int sumOdd() {
		int tot= 0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				tot += i;
			}
			
		} return tot;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= sumOdd();
		System.out.println("1~100 사이의 홀수의 합: "+sum);
	}

}
