package javaproject_2w;
/*
 * Object 이해하고 사용하기
 * Object의 특징과 메서드를 이해하고 사용해 보자.
 * 힌트: Object는 자바의 최상위 클래스로 중요 메서드 네 가지를 제공한다. 
 * 
 */
public class UsingObject064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1= new Object();
		Object obj2= new Object();
		
		System.out.println("1 "+obj1.hashCode()); //native 10진수
		System.out.println("2 "+Integer.toHexString(obj1.hashCode())); //16진수
		
		//== 비교는 스택 영역의 레퍼런스를 비교한다. new 키워드로 생성하는 참조 타입의 래퍼런스는 객체 마다 고유하므로 항상 false
		System.out.println("3 "+obj1==obj2); //객체는 고유한 값을 가진다.
		
		//equal 비교는 1차 주소(해시코드)를 비교한다. 해시코드에 대한 오버라이딩과 equals 오버라이딩을 이용하면 equals로 비교할 수 있다.
		System.out.println("4 "+obj1.equals(obj2)); //객체는 고유하다.
		
		//참조 타입의 레퍼런스(obj1)를 출력하면 자동으로 레퍼런스.toString() 메서드가 된다.
		System.out.println("5 "+obj1);
		
		
		System.out.println("6 "+obj2.toString()); //Class@hashCode() = 타입@16진수 해시코드
		
		System.out.println("7 "+obj1.getClass().getName()); //클래스 이름
		String str= obj1.getClass().getName() + "@"
				+Integer.toHexString(obj1.hashCode()); //16 진수
		System.out.println("8 "+str); //클래스 이름@16진수 해시코드
 		
		//Object 타입으로 String 객체를 생성한다. "부모 이름으로 자식을 생성할 수 있다"는 레퍼런스의 다형성을 보여준다.
		//Object는 모든 참조 타입의 부모로, 객체를 생성할 때 항상 같이 생성된다.
		Object objstr= new String("Good"); //다형성
		System.out.println("9 "+objstr.toString());
		
		//instanceof는 생성된 객체 타입(인스턴스)을 확인한다.
		System.out.println("10 "+objstr instanceof Object);
		System.out.println("11 "+objstr instanceof String);
		
		String hello="hello";
		System.out.println("12 "+hello.getClass()); //클래스 이름
		
	}

}
