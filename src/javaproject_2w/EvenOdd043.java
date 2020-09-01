package javaproject_2w;
/*
 * while을 이용하여 1이 될 때까지 나누고 곱하기
 * 입력된 수가 1이 될 때까지 홀수는 3배+1, 짝수는 2로 나누기
 * 힌트: 반복문에서 끝나는 조건이 명확할 때는  while을 사용한다
 */

public class EvenOdd043 {
	
	public static void showOddEvenW(int n) {
		int temp =n;
		while (temp !=1) {
			if(temp%2==1) { //홀수
				temp= temp*3+1;
			}else {
				temp= temp/2; //짝수
			}
			System.out.print("["+temp+"]");
			//System.out.println("["+temp+"]");
		}
		System.out.println("\n---------------"); //1 만들기를 끝내면 출력
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showOddEvenW(122);
	}

}
