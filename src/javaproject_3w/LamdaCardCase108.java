package javaproject_3w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//CardCase107과 동일 + 수정 추가


public class LamdaCardCase108 {
	//리스트에 저장할 타입은 Card로 한정하기 위해서 <Card>제너릭 사용.
		private List<Card105> cards= new ArrayList<Card105>();
		
		
		//기본 생성자
		public LamdaCardCase108() {
			//생성자가 호출되면 리스트를 깨끗이 청소한다.
			cards.clear();
		}
		
		//List 반환
		public List<Card105> getCards(){
			return cards;
		}
		
		//List에 저장된 Card의 개수
		public int count() {
			return cards.size(); //저장된 Card 개수
		}
		
		//List의 index번째 Card
		public Card105 getCard105(int index) {
			return cards.get(index); //index번째 Card
		}
		
		//서로 다른 카드 20장 만들기
		public void make() {
			cards.clear();
			int suit= CardUtil104.SUIT.length; //2
			int valu= CardUtil104.VALU.length; //10
			int count=0;
			
			//서로 다른 20개의 카드를 만든다.
			while(count!=suit*valu) { //20장이 될 때까지
				
				/*public Card105() {
					int deck= (int)(Math.random()*CardUtil104.SUIT.length);//0~1
					int suit=(int)(Math.random()*CardUtil104.VALU.length); //0~9
					
					//임의의 카드값을 갖는다.
					cardVal= CardUtil104.SUIT[deck] + CardUtil104.VALU[suit];
				}*/
				
				Card105 c= new Card105(); //임의의 카드를 만든다.
				//Card105 equals() 오버라이딩 했으므로 값은 값을 갖는 카드가 있다면 같은 객체다.
				if(!cards.contains(c)) { //contains -> equals()를 이용해 비교
					cards.add(c); //같은 객체가 아니라면 저장
					count++;
				}
			}
		}
		//카드 섞기
		public void shuffle() {
			Collections.shuffle(cards);
		}
		
		//리스트에 저장된 카드를 10장씩 출력한다.
		public void print() {
			int valu= CardUtil104.VALU.length; //10
			for(int i=0; i< cards.size(); i++) {
				Card105 c= cards.get(i);
				System.out.printf("%s",c);
				if((i+1)%valu==0) {
					System.out.println();
				}
			}
		}
		
		//CardComp 클래스가 없다
		public void sort() {
			Comparator<Card105> cmp= new Comparator<Card105>() {
				@Override
				public int compare(Card105 c1, Card105 c2) {
					// TODO Auto-generated method stub
					return c1.getCardVal().compareTo(c2.getCardVal());
				}	
			};
			//정렬 기준 객체를 넣어서 카드 리스트를 저장한다.
			cards.sort(cmp);
		}
		
		/*
		 * public void sort() { //cards 리스트를 cardComp에서 정한 순서대로 정렬한다. cards.sort(new
		 * CardComp107()); //Collections를 이용할 수도 있다. //Collections.sort(cards,new
		 * CardComp());
		 * 
		 * }
		 */
		public void rsort() {
			//이름(레퍼런스(cmp))없는 익명 내부 클래스를 만든다.
			cards.sort(new Comparator<Card105>() {
				@Override
				public int compare(Card105 c1, Card105 c2) {
					// TODO Auto-generated method stub
					return -c1.getCardVal().compareTo(c2.getCardVal());
				}		
			});
		}
		/*
		 * public void rsort() { cards.sort(new CardRomp107()); }
		 */
		
		//rsort를 Lamda로 표현
		//해당 클래스에 메서드가 한 개만 있다면 함수 형식(클래스와 메서드 없이 사용, 식별자 없이)을 이용하여 클래스 없이 비교 기준 제공하는 람다 사용 가능ㄴ
		public void lambdasort() {
			cards.sort(
				//sort 메서드 내부에 클래스 이름과 메서드 이름을 삭제하고 (아규먼트)->{메서드 바디}를 간략화해서 사용한다
				(c1,c2) ->{return c1.getCardVal().compareTo(c2.getCardVal());});
		}
		
		//rsort를 Lamda로 표현
		public void lambdarsort() {
			cards.sort(
				(c1,c2) ->{return -c1.getCardVal().compareTo(c2.getCardVal());});
		}
		
}
