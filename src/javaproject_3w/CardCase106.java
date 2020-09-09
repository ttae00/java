package javaproject_3w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * �����
 * ����Ʈ�� ���� �ٸ� ī�� 20�� �����ϱ�
 * List�� �̿��Ͽ� ���� �ٸ� ī�� 20���� ������ ����.
 * ��Ʈ: List�� contains() �޼��带 �̿��Ͽ� ���� ī�尡 List�� �̹� �����ϴ� �� Ȯ���Ѵ�.
 * 
 * Card105, CardUtil104 Ȱ��.
 */

public class CardCase106 {
	
	//����Ʈ�� ������ Ÿ���� Card�� �����ϱ� ���ؼ� <Card>���ʸ� ���.
	private List<Card105> cards= new ArrayList<Card105>();
	
	
	//�⺻ ������
	public CardCase106() {
		//�����ڰ� ȣ��Ǹ� ����Ʈ�� ������ û���Ѵ�.
		cards.clear();
	}
	
	//List ��ȯ
	public List<Card105> getCards(){
		return cards;
	}
	
	//List�� ����� Card�� ����
	public int count() {
		return cards.size(); //����� Card ����
	}
	
	//List�� index��° Card
	public Card105 getCard105(int index) {
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
			
			Card105 c= new Card105(); //������ ī�带 �����.
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
			Card105 c= cards.get(i);
			System.out.printf("%s",c);
			if((i+1)%valu==0) {
				System.out.println();
			}
		}
	}
	
}
