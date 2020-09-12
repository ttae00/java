package javaproject_3w;
/*
 * 다시 해보기
 * 카드 게임(섯다) 족보 만들기 
 * 카드 게임을 위한 순위(족보)를 만들어 보자.
 * 힌트: 두 카드의 값이 같으면 한 카드에 100을 곱하고 카드값이 다르면 두 카드값의 합에 대한 일의 자리에 10을 곱한다.
 * 
 */
public class CardRule110 {
	
	public int toV(Card109 c) {
		int count= 0;
		switch(c.getCardVal().charAt(1)) {
		case 'A': count=1;break;
		case 'T': count=10;break;
		default: count=c.getCardVal().charAt(1)-'0'; break;// '7'-'0'
		}
		return count;
	}
	
	//광 SUIT C
	public boolean isLight(Card109 c) { //광 모든 SUIT가 C
		boolean isL= false;
		if(c.getCardVal().charAt(0)=='C') {
			isL = true;
		}
		return isL;
	}
	
	//광(C)이면서 밸류가 1,3,8 -> C1, C3, C8
	private boolean is138(Card109 c) {
		boolean isC= false;
		if(isLight(c)) {
			if(c.getCardVal().charAt(1)=='1'||
			c.getCardVal().charAt(1)=='3'||
			c.getCardVal().charAt(1)=='8'){
				isC= true;
			}	
		}
		return isC; 
	}
	//이차원 방정식을 이용: 더해서 11, 곱해서 24-> 3,8
	public int rule(Card109 c1, Card109 c2) {
		int count= 0;
		if(is138(c1) && is138(c2)) {
			// 광 처리 1,3,8
			if((toV(c1)*toV))
		}
	}
} 

