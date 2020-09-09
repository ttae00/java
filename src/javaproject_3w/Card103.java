package javaproject_3w;
/*
 * 객체와 은닉화(Encapsulation) 이해하기
 * 힌트: 객체는 데이터를 저장하는 멤버필드와 데이터를 가공하기 위한 메서드를 갖는다. 데이터를 보호하기 위한 은닉화도 필요하다
 * 
 */

//1. 클래스를 만든다
public class Card103 {
	//데이터 보호- 은닉화 - 접근 제한자 private
	//2. 멤버필드를 접근제한자로 보호한다.
	private String cardVal;
	
	//멤버 접근 메서드
	//카드값을 외부로 반환하는 메서드를 선언한다.
	public String getCardVal() {
		return cardVal;
	}
	
	//기본 생성자- 멤버 초기화
	public Card103() {
		//28라인을 호출한다. 다른 생성자를 호출하면서 중요 데이터인 멤버필드를 "H2"로 초기화한다.
		this("H2");//아래와 동일
		//this.cardVal= "H2";
	}
	
	//테스트용
	//카드값을 입력받는 생성자를 선언한다. 이미 존재하는 생성자에 대해 아규먼트 개수나 타입이 다른 것을 생성자 오버로딩이라고 한다.
	public Card103(String s) {
		// TODO Auto-generated constructor stub
		this.cardVal=s;
	}
	
	//복사 생성자
	/*카드생성자에 아규먼트로 카드 객체를 받는 것을 복사 생성자라고 한다. 입력받은 다른 카드의 값만 받아 카드값을 초기화한다. 
	 값은 같지만 다른 객체를 만들 때 사용한다.*/
	public Card103(Card103 c) {
		this(c.getCardVal()); //문자열은 값 복사
		//this.cardVal= c.getCardVal(); //동일
	}
	
	//멤버필드의 값을 수정하지 않고 살펴볼 수 있는 toString() 메서드를 오버라이딩한다.
	@Override
	public String toString() {
		return "["+ cardVal + "]";
	}
	
}
