package javaproject_3w;

public class CardCaseMain107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCase107 c1= new CardCase107();
		c1.make();
		c1.print();
		System.out.println("-----------------");
		
		c1.shuffle(); //카드섞기
		c1.print();
		System.out.println("-----------------");
		c1.shuffle(); //카드섞기
		c1.print();
		System.out.println("-------증가순 정렬----------");
		c1.sort();
		c1.print();
		System.out.println("--------감소순 정렬---------");
		c1.rsort();
		c1.print();
	}

}
