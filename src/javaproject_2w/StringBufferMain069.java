package javaproject_2w;
/*
 * StringBuffer로 문자열 수정,변경, 추가하기
 * String과 비슷하지만 다른 특징을 가진 StringBuffer를 익혀보자.
 * 힌트: String은 + 또는 concat 연산으로 새로운 문자열을 얻으면 새로운 주소를 받지만 StringBuffer의 주소는 동일하다
 */
public class StringBufferMain069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer 생성
		StringBuffer sb1= new StringBuffer();
		//바꾼 문자열을 다시 대입하지 않으면 원래 문자열이 되는 특징이 immutable
		//1. 계속 붙이는 함수 mutable(바꾼 문자열을 다시 대입하지 않아도 원래 문자열이 바뀜)
		sb1.append("안녕하세요")
			.append("또 만나요")
			.append("모두들!");
		System.out.println(sb1);
		System.out.println(sb1.toString()+sb1.hashCode());
		
		//2. replace
		//0번째부터 (2-1)번까지의 문자열 "안녕"을 제거하고 바꾼다.
		sb1.replace(0, 2, "나 보기가 역겨워");
		System.out.println(sb1.toString()+sb1.hashCode());
		
		//3. reverse
		sb1.reverse();
		System.out.println(sb1.toString()+sb1.hashCode());
		
		//4. delete
		//10번째부터 (15-1)까지의 문자열을 지운다. 자리는 0부터 시작한다.
		sb1.delete(10, 15);
		System.out.println(sb1.toString());
		
		//5. cal by reference, shallow copy
		replaces(sb1);
		System.out.println(sb1.toString());
	}

	public static void replaces(StringBuffer sb) {
		// TODO Auto-generated method stub
		sb.reverse();
		sb.replace(0,3,"GOGO");
		
	}
	

}
