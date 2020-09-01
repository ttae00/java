package javaproject_2w;
/*
 * StringBuilder로 문자열 수정,변경,추가하기
 * String과 비슷하지만 다른 특징을 가진 StringBuilder를 익혀 보자.
 * 힌트: StringBuider는 동기화하지 않은 StringBuffer이다.
 * 
 */
public class StringBuilderMain070 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//synchronized 하지 않은 StringBuffer
		StringBuilder sb= new StringBuilder();
		sb.append("I")
			.append(" go")
			.append(" to school");
		
		//= System.out.println(sb.toString());
		System.out.println(sb);
		sb.replace(7, 11, "");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//0번 부터 시작.2번째 삭제
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//1,2번째 삭제
		sb.delete(1, 3);
		System.out.println(sb);
		
		String ss= sb.substring(0);
		System.out.println(ss);
		System.out.println(sb);
		
		String st= sb.substring(0,4);
		System.out.println(st);
		System.out.println(sb);
	}

}
