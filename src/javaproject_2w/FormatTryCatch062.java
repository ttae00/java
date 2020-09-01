package javaproject_2w;
/*
 * 정수를 입력 받을 때 발생 할 수 있는 예외 처리하기
 * 정수 타입 문자열을 입력 받아 정수로 변환할 때 발생할 수 있는 예외를 처리해보자
 * try{}catch{}를 이용하여 예외를 처리한다 
 * 
 *  문자열을 기본 타입으로 변환 시 잘못된 변환을 사용하면 NumberFormatException이 발생한다.
 */
public class FormatTryCatch062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num= "1234";
		
		try {
		//문자열을 기본 타입으로 변환 할 때는 랩퍼 클래스를 사용한다.
		//정수형 문자-> 정수 : Integer.parseInt()
		//실수형 문자-> 실수: Double.parseDouble()
		int n= Integer.parseInt(num);
		System.out.println(n);
		}catch(NumberFormatException ee) {
			System.out.println("int가 아닌거 같음!!!");
			System.out.println(ee.getMessage());
		
		//위의 예외처리를 처리하지 못하면 Exception이 처리한다. 순서 중요!	먼저 작성하게 되면 unreachable catch block error 발생
		}catch(Exception ee) {
			System.out.println("잘 넣어봐");
		}finally {
			System.out.println("난 수행되어야만 해!");
		}
	}

}
