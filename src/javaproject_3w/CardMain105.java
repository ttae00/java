package javaproject_3w;

public class CardMain105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card105 c1 = new Card105("H4"); //생성자(String 아규먼트)
		Card105 c2 = new Card105("H4");
		
		System.out.println(c1.hashCode()); //
		System.out.println(c2.hashCode()); //
		System.out.println(c1.getCardVal());//값은 동일
		System.out.println(c2.getCardVal());
		//원래 new로 생성한 객체는 해시코드가 같을 수 없지만, 오버라이딩 했기 때문에 내용이 같으면 equals()는 true
		System.out.println(c1.equals(c2)); //hashcode비교- 오버라이딩
		
		//같은 값을 가질 때 같은 객체로 정의하고 싶다면, hashCode(),equals()를 오버라이딩하자!
		
		}

}
