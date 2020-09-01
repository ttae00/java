package javaproject_2w;
/*
 *do~while을 이용하여 1이 될 때까지 나누고 곱하기
 *입력된 수가 1이 될 때까지 홀수는 3배*1, 짝수는 2로 나누기
 *힌트: 적어도 한 번 실행하는 반복문은 do~ while을 사용. while은 조건이 명확할 때 사용한다.
 */
public class EvenOdd044 {
	
	public static void showOddEvenW(int n) {
		int temp =n;
		do {
			if(temp%2==1) {
				temp= temp*3+1;
			}else {
				temp= temp/2;
			}
		System.out.print("["+temp+"]");
		}while(temp !=1);
		System.out.println("\n------------");
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showOddEvenW(122);
		//showOddEvenW(1);
	}

}
