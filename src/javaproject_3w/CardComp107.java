package javaproject_3w;

import java.util.Comparator;

/*
 * 객체 비교를 이용하여 카드 정렬하기
 * 카드를 순서대로 정렬하는 방법을 익혀보자
 * 힌트: 객체의 대소를 비교하기 위해 기준을 제공하는 클래스를 만든다.( Comparator 인터페이스 활용) 
 * Card105 활용
 * 
 */

public class CardComp107 implements Comparator<Card105> {
	
	//객체는 대소를 비교할 수없다. java.util.Comparator 인터페이스를 구현한 객체는 비교 가능
	//compare() 메서드를 구현하면 비교 가능하다.
	
	@Override
	public int compare(Card105 c1, Card105 c2) {
		// TODO Auto-generated method stub
		//문자열 compareTo() - 사전식 비교
		//c1 : "H3", c2: "CA" , H는 72, C는 67 72> 67
		if(c1.getCardVal().charAt(0)>c2.getCardVal().charAt(0)) {
			//순서를 바꾼다는 의미: 1 (작은게 앞으로)
			return 1;
		}else if(c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)) {
			//순서 그대로: -1
			return -1;
			
		//같은 슈트(suit)일 때 charAt(0)이 같을 때?
		//"H3"과 "HA"는 같은 suit("H")이므로 value를 비교해야한다.
		}else {
			if(CardUtil104.toVal(c1.getCardVal().charAt(1))>
			CardUtil104.toVal(c2.getCardVal().charAt(1))) {
				return 1;
			}else if(CardUtil104.toVal(c1.getCardVal().charAt(1))<
					CardUtil104.toVal(c2.getCardVal().charAt(1))) {
				return -1;
			//값이 같다.	
			}else return 0;
		}
		
	}	

}
