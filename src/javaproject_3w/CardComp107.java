package javaproject_3w;

import java.util.Comparator;

/*
 * ��ü �񱳸� �̿��Ͽ� ī�� �����ϱ�
 * ī�带 ������� �����ϴ� ����� ��������
 * ��Ʈ: ��ü�� ��Ҹ� ���ϱ� ���� ������ �����ϴ� Ŭ������ �����.( Comparator �������̽� Ȱ��) 
 * Card105 Ȱ��
 * 
 */

public class CardComp107 implements Comparator<Card105> {
	
	//��ü�� ��Ҹ� ���� ������. java.util.Comparator �������̽��� ������ ��ü�� �� ����
	//compare() �޼��带 �����ϸ� �� �����ϴ�.
	
	@Override
	public int compare(Card105 c1, Card105 c2) {
		// TODO Auto-generated method stub
		//���ڿ� compareTo() - ������ ��
		//c1 : "H3", c2: "CA" , H�� 72, C�� 67 72> 67
		if(c1.getCardVal().charAt(0)>c2.getCardVal().charAt(0)) {
			//������ �ٲ۴ٴ� �ǹ�: 1 (������ ������)
			return 1;
		}else if(c1.getCardVal().charAt(0)<c2.getCardVal().charAt(0)) {
			//���� �״��: -1
			return -1;
			
		//���� ��Ʈ(suit)�� �� charAt(0)�� ���� ��?
		//"H3"�� "HA"�� ���� suit("H")�̹Ƿ� value�� ���ؾ��Ѵ�.
		}else {
			if(CardUtil104.toVal(c1.getCardVal().charAt(1))>
			CardUtil104.toVal(c2.getCardVal().charAt(1))) {
				return 1;
			}else if(CardUtil104.toVal(c1.getCardVal().charAt(1))<
					CardUtil104.toVal(c2.getCardVal().charAt(1))) {
				return -1;
			//���� ����.	
			}else return 0;
		}
		
	}	

}
