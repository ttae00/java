package javaproject_2w;
/*
 * String(문자열)을 이용해 도시 이름 비교하기
 * 문자열이 동일한지 판별해 보자
 * 힌트: String(문자열)은 new로 생성한 문자열과 new 없이 생성한 문자열이 있다.
 * 
 * 같은 문자열에 대해 new 예약어로 생성한 문자열은 스택 레퍼런스는 다르지만 heap의 해시코드는 동일하다(String은 pool을 이용하기 때문)
 * 같은 문자열에 대해 new 없이 생성한 문자열은 스택 레퍼런스와 heap 해시코드가 동일하다.
 * 예) String c1= "서울"; String c2="서울"
 * sysout(c1==c2) true값
 * 
 */

public class StringMain066 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c1= "서울";
		String c2="홍콩";
		String cc2="홍콩";
		String c3= new String("홍콩");
		
		System.out.println(c1.length());
		
		//== 는 스택의 레퍼런스를 비교한다.
		System.out.println(c1==c2);
		System.out.println("-----");
		System.out.println(c2==cc2);
		System.out.println(c2==c3);
		System.out.println("-----");
		System.out.println(c1.equals(c2));
		//new로 생성한 문자열과 없이 생성한 문자열 동일한지 비교하려면 equals()
		//equals()는 해시코드를 비교한다.
		System.out.println(c2.equals(c3));
		
		//원하는 포맷으로 문자열을 만든다.
		String c4= String.format("%s-%s", c1,c2);
		System.out.println(c4);
		
		//c1+c2 +는 concat으로, c1.concat(c2)와 동일하다. 문자열을 붙여서 하나의 문자열을 만든다.
		String c5= c1+"-"+c2+1+2;
		System.out.println(c5);
		String c6= 1+2+c1+"-"+c2;
		System.out.println(c6);
		}
	

}
