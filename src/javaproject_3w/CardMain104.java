package javaproject_3w;

public class CardMain104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new�� ������ ��ü�� �ؽ��ڵ尡 ���� �� ����.
		Card104 c1 = new Card104("H4"); 
		Card104 c2 = new Card104("H4");
		Card104 c3= new Card104(c1);//���� ������.���� ���������� �ؽ��ڵ�� �ٸ���
		System.out.println(c1.hashCode()); //728890494
		System.out.println(c2.hashCode()); //1558600329
		System.out.println(c1.getCardVal());//���� ����
		System.out.println(c2.getCardVal());
		System.out.println(c1.equals(c2)); //hashcode��.�ؽð� �ٸ�
		System.out.println(c1.equals(c3)); //�ؽ��ڵ� ��. false
		
		/*2X10= 20���� ī�� ��ü�� �����Ͽ� ī�尪 ���*/
		for(int i=0; i<CardUtil104.SUIT.length; i++) { //SUIT 2
			for(int j=0; j<CardUtil104.VALU.length; j++) { //VALU 10
				//���� ���� �� ������ �ؽ��ڵ�� �����ϴ�(���� �� ����)
				//new�� ���������Ƿ� ��� ī���� �ؽ��ڵ尡 �ٸ���. ���� �ٸ� ��ü 20�� ����. �ߺ��� �߻��� �� �ִ�.
				Card104 c= new Card104();
				System.out.printf("%s\t",c); //c.toString()
			}
			System.out.println(); //10�� ���(VALU��) �� �� ĭ �Ʒ�
		}
	}

}
