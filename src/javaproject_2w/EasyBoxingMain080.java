package javaproject_2w;

import java.util.ArrayList;

/*
 * 박싱, 언박싱으로 기본 타입을 참조 타입으로 변환하기
 * 힌트: 기본 타입과 랩퍼 클래스는 자동으로 서로 변환된다. 
 * 
 */
public class EasyBoxingMain080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNm1= 123;
		long longNum1=345L;
		double doubleNum=123.123;
		Integer intWrap1= intNm1; // new Integer(intNm1);
		Long longWrap1= longNum1;
		Double doubleWrap1=doubleNum;
		
		//랩퍼 클래스를 기본 타입으로 저장(박싱한다)
		double dd= doubleWrap1;
		
		//기본 타입<->Wrapper는 캐스팅 없이 사용 가능
		Integer intWrap2=intNm1; // Boxing
		
		//랩퍼 클래스에 기본 타입의 값을 저장(언박싱)한다.
		intNm1= intWrap2; //Unboxing
		System.out.println(intNm1);
		
		
		//List<>의 제너릭은 "참초 타입만 사용할 수 있다"는 문법 때문에 List<Integer>를 사용한다.
		ArrayList<Integer> illists= new ArrayList<>();
		//3을 저장하는 것과 같다.
		illists.add(new Integer(3));
		illists.add(5);
		
		//0번 값을 반환한다. illist.get(0)은 3, .get(1)은 5를 반환한다.
		int a= illists.get(0); //<Integer>
		System.out.println(a);
		
		//숫자 타입 문자열 "123"을 123으로 변환한다.
		int b= Integer.parseInt("123");
		System.out.println(b);
		System.out.println(illists);
		

	}

}
