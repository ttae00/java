package javaproject_3w;

public class CardCaseMain106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//20개의 카드를 만들어서 저장할 케이스를 생성한다.
		CardCase106 cc= new CardCase106();
		cc.make(); //서로 다른 카드 20장 만들기
		cc.print();
		System.out.println("---------------");
		cc.shuffle(); //카드 섞기
		cc.print();
		System.out.println("---------------");
		cc.shuffle(); //카드 섞기
		cc.print();
	}

}
