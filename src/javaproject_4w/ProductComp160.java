package javaproject_4w;

import java.util.Comparator;


/*
 * ��ü �񱳴� ���, ����, 0�� ��ȯ�ϴ� ����� �̿�. 
 * "Go"�� "Ho" ���ڿ� �񱳴� ������ �� �̿�. 
 * ���� �񱳴� 8-7>0�� 8�� �ڿ� �ִ�. �� ���� ���� ���̸� ���� ���ڳ� ���ڰ� ū ��.
 * 
 * */

//�� ��ü�� ���ϱ� ���� �� ������ �������̽� Comparator�� compare()�� �����ؾ� �Ѵ�.
public class ProductComp160 implements Comparator<Product> {
	
	@Override
	public int compare(Product sg1, Product sg2) {
		// TODO Auto-generated method stub
		int pMoney1= sg1.getPMoney();
		int pMoney2= sg2.getPMoney();
		int pPoint1= sg1.getPPoint();
		int pPoint2= sg2.getPPoint();
		int prodNum1= sg1.getProdNum();
		int prodNum2= sg2.getProdNum();
		if(pMoney1>pMoney2) { //Comparable ���� x
			return -1; //��������
		}else if(pMoney1==pMoney2) {
			if(pPoint1>pPoint2) {
				return -1; //��������
			}else if(prodNum1==prodNum2) {
				if(prodNum1>prodNum2) {
					return 1; //��������
				}else if(prodNum1==prodNum2) {
					return 0; //�����̸Ӹ� Ű�ϱ� �̷� ���� ���� ��
				}else {
					return -1; //��������
				}
			}else {
				return 1; //��������
			}
		}else {
			return 1; //��������
		}
		
		
		
		return 0;
	}

}
