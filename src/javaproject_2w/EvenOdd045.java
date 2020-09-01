package javaproject_2w;
/*
 *for를 이용하여 1이 될 때까지 나누고 곱하기
 *입력된 수가 1이 될 때까지 홀수는 3배+1, 짝수는 2로 나누기
 *for,while,do~while과 같은 반복문은 동일한 기능을 실행한다. 
 *
 *for(초기값;조건;스텝;) 초기값, 조건, 스텝 모두 생략 가능
 *for(;true;){}가 되어 while(true)가 된다.
 */

public class EvenOdd045 {
	
	public static void showOddEvenW(int n) {
		int temp= n;
		for(;temp!=1;) {//for(초기값; 조건; 스텝;) 초기값, 스텝 생략 가능
			if(temp%2==1) {
				temp= temp*3+1;
			}else {
				temp= temp/2;
			}
			System.out.print("["+temp+"]");
		}
		System.out.println("\n-----------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showOddEvenW(122);
	}

}
