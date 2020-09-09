package javaproject_3w;
/*
 * equals overriding을 이용하여 카드값이 같으면 같은 객체로 만들기
 * 힌트: 카드값이 같으면 같은 객체로 만들기 위해 equals(), hashCode() 오버라이딩을 한다. 
 * 
 */
public class Card105 {
	private String cardVal; //H8

	public String getCardVal() {
		return cardVal;
	}
	
	//기본 생성자
	public Card105() {
		int deck= (int)(Math.random()*CardUtil104.SUIT.length);//0~1
		int suit=(int)(Math.random()*CardUtil104.VALU.length); //0~9
		
		//임의의 카드값을 갖는다.
		cardVal= CardUtil104.SUIT[deck] + CardUtil104.VALU[suit];
	}
	
	//테스트용
	public Card105(String ss) {
		this.cardVal = ss;
	}
	
	//복사 생성자
	public Card105(Card105 c) {
		this(c.getCardVal());
		//this.cardVal= c.getCardVal(); //동일
			
	}

	@Override
	public String toString() {
		return "["+ cardVal +"]";
	}

	//자동 생성 equals 오버라이딩과 마찬가지로 hashcode 오버라이딩을 해야 같은 객체로 만들 수 있다.
	@Override
	public int hashCode() {
		//형식적으로 2자리 이상의 소수(Prime Number)를 더한다.
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardVal == null) ? 0 : cardVal.hashCode());
		return result;
	}
	//소스를 정리하면 카드값과 카드값을 일대일로 비교한다.
	@Override
	//참조 타입은 기본적으로 같은 카드값을 가져도 같은 객체가 아니다. 같은 값을 갖는 경우에 같은 객체로 만들려면 equals() 오버라이딩한다.
	public boolean equals(Object obj) {
		
		//부모인 Object의 equals() 메서드가 equals(Object) 처럼 아규먼트를 Object로 받는다.
		//그러므로 오버라이딩도 equals(Object)이나, 카드로 변환하기 위해 (Card)로 캐스팅 하여 카드 타입으로 변환한다.
		Card105 cb= (Card105)obj;
		//카드값과 비교할 카드값이 같으면 true를 반환하여 같은 객체라 한다.
		if(cardVal.equals(cb.getCardVal())) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
