package javaproject_3w;

public class CardMain103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csuit1= "H", cvalu1="6";
		String csuit2= "H", cvalu2="3";
		
		//객체 생성. 카드 레퍼런스= new 카드(); 형태로 객체 생성
		//앞의 카드는 클래스 뒤의 카드는 힙 메모리에 생성된 객체, 카드()는 초기화하는 생성자.
		//new 키워드는 해시코드와 레퍼런스를 모두 다르게 만든다.
		Card103 c1= new Card103("H6");
		Card103 c2= new Card103(csuit1+cvalu1);
		Card103 c3= new Card103();
		Card103 c4= new Card103(csuit2+cvalu2);
		
		System.out.printf("%s,%s,%s,%s\n",c1,c2,c3,c4);
		System.out.println(c1.equals(c2)); //해시코드는 다름. 값은 같지만.
		System.out.println(c1.getCardVal().equals(c2.getCardVal())); //값 동일
		//참조 타입은 equals()로 비교
		
	}

}
