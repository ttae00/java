package javaproject_3w;
/*
 * static 사용법 익히기
 * 힌트: static 메서드를 이용하여 카드값을 만들고 static 배열로 크기를 확인한다. 
 * static 변수, 메서드- 객체 생성 없이 사용 가능하다. 
 */
public class CardUtil104 {
	public static final int SUTDA= 2;
	
	//SUIT의 크기 SUIT.length는 2이다
	public static final String[] SUIT= {"H","C"};
	//VALU의 크기 VALU.length는 10이다
	public static final String[] VALU= {"A","2","3","4","5","6","7","8","9","T"};
	
	public static int toVal(Card103 c) {
		//카드값의 1번째 값을 정수값으로 변환한다. "H6"일 때 '6'을 6으로 변환하여 정수값을 얻는다.
		return toVal(c.getCardVal().charAt(1));
	}
	
	public static int toVal(Card103 c, int index) {
		//카드값의 index값을 얻는다. "H6"일 때 index가 0이면 'H'를, index가 1이면 '6'이고 정수값으로 변환
		return toVal(c.getCardVal().charAt(index));
	}
	
	//입력받은  밸류값은 char 타입이다.
	public static int toVal(char cc) {
		int tot= 0;
		switch(cc) {
		case'A': tot=1; break;
		case'T': tot=10; break;
		case'J': tot=11; break;
		case'Q': tot=12; break;
		case'K': tot=13; break;
		default: tot=cc-'0'; break;
		}
		return tot;
	}

}
