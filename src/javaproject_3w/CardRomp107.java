package javaproject_3w;

import java.util.Comparator;


//CardComp의 역순으로 정리한다.
public class CardRomp107 implements Comparator<Card105> {

	@Override
	public int compare(Card105 c1, Card105 c2) {
		// TODO Auto-generated method stub
		
		if(c1.getCardVal().charAt(0)> c2.getCardVal().charAt(0)) {
			return -1;
		}else if(c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)) {
			return 1;
			
		//suit 값이 같다면
		}else {
			if(CardUtil104.toVal(c1.getCardVal().charAt(1))>
			CardUtil104.toVal(c2.getCardVal().charAt(1))) {
				return -1;
			}else if(CardUtil104.toVal(c1.getCardVal().charAt(1))<
					CardUtil104.toVal(c2.getCardVal().charAt(1))) {
				return 1;
				
			}else return 0;
		}
		
	}

}
