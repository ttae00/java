package javaproject_3w;

public class CardCaseMain107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardCase107 c1= new CardCase107();
		c1.make();
		c1.print();
		System.out.println("-----------------");
		
		c1.shuffle(); //ī�弯��
		c1.print();
		System.out.println("-----------------");
		c1.shuffle(); //ī�弯��
		c1.print();
		System.out.println("-------������ ����----------");
		c1.sort();
		c1.print();
		System.out.println("--------���Ҽ� ����---------");
		c1.rsort();
		c1.print();
	}

}
