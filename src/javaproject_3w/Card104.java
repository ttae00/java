package javaproject_3w;

public class Card104 {
	private String cardVal; 
	
	public String getCardVal() {
		return cardVal;
	}

	//기본(디폴트) 생성자
	public Card104() {
		//0~1 사이
		int suit=(int)(Math.random()*CardUtil104.SUIT.length);
		
		//0~9 사이?
		int valu= (int)(Math.random()*CardUtil104.VALU.length);
		
		//임의의 카드값을 갖는다.
		cardVal = CardUtil104.SUIT[suit]+ CardUtil104.VALU[valu];
		
	}
	
	//테스트용
	public Card104(String s) {
		this.cardVal = s; //문자열값 복사
	}
	//복사 생성자
	/*카드생성자에 아규먼트로 카드 객체를 받는 것을 복사 생성자라고 한다. 입력받은 다른 카드의 값만 받아 카드값을 초기화한다. 
	 값은 같지만 다른 객체를 만들 때 사용한다.*/
	public Card104(Card104 c) {
		this(c.getCardVal()); //문자열은 값 복사
		//this.cardVal= c.getCardVal(); //동일
	}
	
	//멤버필드의 값을 수정하지 않고 살펴볼 수 있는 toString() 메서드를 오버라이딩한다.
	@Override
	public String toString() {
		return "["+ cardVal + "]";
	}

}
