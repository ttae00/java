package javaproject_3w;

public class CardMain104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new로 생성한 객체는 해시코드가 같을 수 없다.
		Card104 c1 = new Card104("H4"); 
		Card104 c2 = new Card104("H4");
		Card104 c3= new Card104(c1);//복사 생성자.값은 동일하지만 해시코드는 다르다
		System.out.println(c1.hashCode()); //728890494
		System.out.println(c2.hashCode()); //1558600329
		System.out.println(c1.getCardVal());//값은 동일
		System.out.println(c2.getCardVal());
		System.out.println(c1.equals(c2)); //hashcode비교.해시값 다름
		System.out.println(c1.equals(c3)); //해시코드 비교. false
		
		/*2X10= 20개의 카드 객체를 생성하여 카드값 출력*/
		for(int i=0; i<CardUtil104.SUIT.length; i++) { //SUIT 2
			for(int j=0; j<CardUtil104.VALU.length; j++) { //VALU 10
				//값은 같을 수 있지만 해시코드는 고유하다(같을 수 없다)
				//new로 생성했으므로 모든 카드의 해시코드가 다른다. 서로 다른 객체 20개 생성. 중복값 발생할 수 있다.
				Card104 c= new Card104();
				System.out.printf("%s\t",c); //c.toString()
			}
			System.out.println(); //10개 출력(VALU값) 후 한 칸 아래
		}
	}

}
