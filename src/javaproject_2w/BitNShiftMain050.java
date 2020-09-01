package javaproject_2w;
/* 다시 공부하기
 * shift 연산자를 이용하여 2진수 문자열로 바꾸기
 * shift 연산자를 이용하여 10진수 정수를 2진수 문자열로 변환해보자.
 * 힌트: 2에 대한 나머지를 이용한다. a>>=1은 a/=2와 같은 효과를 낸다.
 */

public class BitNShiftMain050 {
	//10진수 정수를 2진수 문자열(스트링)으로 변환
	public static String shifts(int a) {
		String st="";
		for(int i=0;i<31; i++) {
			//a%2 나머지를 int aa에 저장한다
			int aa= a%2;
			//aa>=0이면 aa에 st를 더한다. 아니라면 -aa에 st를 더한다.
			st=(aa>=0)?aa+st:(-aa)+st;
			//오른쪽으로 1칸 이동한다. 뒤는 제거.
			//a<<=1이면 왼쪽으로 1칸 이동. 첫 번째 자리는 0.
			a>>=1;      // a/=2;
		}
		return st;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNums1= 123;
		int intNums2= -123;
		System.out.printf("%d : %s%n", intNums1,shifts(intNums1));
	}

}
