package javaproject_3w;

public class CardCaseMain109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdaCardCase108 c1= new LamdaCardCase108();
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
		System.out.println("-------���� ������ ����----------");
		c1.lambdasort();
		c1.print();
		System.out.println("--------���� ���Ҽ� ����---------");
		c1.lambdarsort();
		c1.print();
	}

}
