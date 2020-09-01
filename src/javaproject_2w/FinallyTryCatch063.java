package javaproject_2w;
/*
 * 수학 연산에서 발생하는 예외 처리하기
 * 힌트: 수학 관련 예외 처리는 ArithmeticException 사용 
 * 
 */
public class FinallyTryCatch063 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//0으로 나눈다.
			int x= 5;
			int y= 20 / (5-x); // 예외 던지는 부분.
			System.out.println(y);
		}catch(ArithmeticException ee) { //run time 
			System.out.println("0으로 나누지 않았니???!");
		}finally {
			System.out.println("난 수행되어야만 해!!");
		}
	}

}
