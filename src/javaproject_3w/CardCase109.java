package javaproject_3w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//LambdaCardCase108�� ���� + ���� �߰�


public class CardCase109 {
	//����Ʈ�� ������ Ÿ���� Card�� �����ϱ� ���ؼ� <Card>���ʸ� ���.
		private List<Card109> cards= new ArrayList<Card109>();
		
		
		//�⺻ ������
		public CardCase109() {
			//�����ڰ� ȣ��Ǹ� ����Ʈ�� ������ û���Ѵ�.
			cards.clear();
		}
		
		//List ��ȯ
		public List<Card109> getCards(){
			return cards;
		}
		
		//List�� ����� Card�� ����
		public int count() {
			return cards.size(); //����� Card ����
		}
		
		//List�� index��° Card
		public Card109 getCard109(int index) {
			return cards.get(index); //index��° Card
		}
		
		//���� �ٸ� ī�� 20�� �����
		public void make() {
			cards.clear();
			int suit= CardUtil104.SUIT.length; //2
			int valu= CardUtil104.VALU.length; //10
			int count=0;
			
			//���� �ٸ� 20���� ī�带 �����.
			while(count!=suit*valu) { //20���� �� ������
				
				/*public Card105() {
					int deck= (int)(Math.random()*CardUtil104.SUIT.length);//0~1
					int suit=(int)(Math.random()*CardUtil104.VALU.length); //0~9
					
					//������ ī�尪�� ���´�.
					cardVal= CardUtil104.SUIT[deck] + CardUtil104.VALU[suit];
				}*/
				
				Card109 c= new Card109(); //������ ī�带 �����.
				//Card105 equals() �������̵� �����Ƿ� ���� ���� ���� ī�尡 �ִٸ� ���� ��ü��.
				if(!cards.contains(c)) { //contains -> equals()�� �̿��� ��
					cards.add(c); //���� ��ü�� �ƴ϶�� ����
					count++;
				}
			}
		}
		//ī�� ����
		public void shuffle() {
			Collections.shuffle(cards);
		}
		
		//����Ʈ�� ����� ī�带 10�徿 ����Ѵ�.
		public void print() {
			int valu= CardUtil104.VALU.length; //10
			for(int i=0; i< cards.size(); i++) {
				Card109 c= cards.get(i);
				System.out.printf("%s",c);
				if((i+1)%valu==0) {
					System.out.println();
				}
			}
		}
		
		//CardComp Ŭ������ ����
		public void sort() {
			Comparator<Card109> cmp= new Comparator<Card109>() {
				@Override
				public int compare(Card109 c1, Card109 c2) {
					// TODO Auto-generated method stub
					return c1.getCardVal().compareTo(c2.getCardVal());
				}	
			};
			//���� ���� ��ü�� �־ ī�� ����Ʈ�� �����Ѵ�.
			cards.sort(cmp);
		}
		
		/*
		 * public void sort() { //cards ����Ʈ�� cardComp���� ���� ������� �����Ѵ�. cards.sort(new
		 * CardComp107()); //Collections�� �̿��� ���� �ִ�. //Collections.sort(cards,new
		 * CardComp());
		 * 
		 * }
		 */
		public void rsort() {
			//�̸�(���۷���(cmp))���� �͸� ���� Ŭ������ �����.
			cards.sort(new Comparator<Card109>() {
				@Override
				public int compare(Card109 c1, Card109 c2) {
					// TODO Auto-generated method stub
					return -c1.getCardVal().compareTo(c2.getCardVal());
				}		
			});
		}
		/*
		 * public void rsort() { cards.sort(new CardRomp107()); }
		 */
		
		//rsort�� Lamda�� ǥ��
		//�ش� Ŭ������ �޼��尡 �� ���� �ִٸ� �Լ� ����(Ŭ������ �޼��� ���� ���, �ĺ��� ����)�� �̿��Ͽ� Ŭ���� ���� �� ���� �����ϴ� ���� ��� ���ɤ�
		public void lambdasort() {
			cards.sort(
				//sort �޼��� ���ο� Ŭ���� �̸��� �޼��� �̸��� �����ϰ� (�ƱԸ�Ʈ)->{�޼��� �ٵ�}�� ����ȭ�ؼ� ����Ѵ�
				(c1,c2) ->{return c1.getCardVal().compareTo(c2.getCardVal());});
		}
		
		//:: ���
		public void lambdasort2() {
			cards.sort(Comparator.comparing(Card109::getCardVal));
		}
		
		public void lambdasort3() {
			cards.sort(Card109::compareCard);
			
		}
		
		//rsort�� Lamda�� ǥ��
		public void lambdarsort() {
			cards.sort(
				(c1,c2) ->{return -c1.getCardVal().compareTo(c2.getCardVal());});
		}
		
		public void lambdarsort2() {
			Comparator<Card109> mycard= (c1,c2)->{return c1.getCardVal().compareTo(c2.getCardVal());};
			cards.sort(mycard.reversed());
			
		}
		
		//Comparator�� Compare �޼��� �̸�(�ĺ���)�� �����Ͽ� �����Ѵ�.
		public void lambdarsort3() { 
			cards.sort(Card109::compareRCard); //static �� �޼��� 
		}
		
		/* �� ���ٸ� �̿��� ������� �����ϴ�.
		 * Comparator<Card109> mycard1= new Comparator<Card109>() {
		 * 
		 * @Override public int compare(Card109 c1, Card109 c2) { return
		 * c1.getCardVal().compareTo(c2.getCardVal()); } };
		 */
		
		
}
