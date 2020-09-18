package javaproject_4w;

import java.util.Comparator;


/*
 * 객체 비교는 양수, 음수, 0을 반환하는 방법을 이용. 
 * "Go"와 "Ho" 문자열 비교는 사전식 비교 이용. 
 * 숫자 비교는 8-7>0로 8이 뒤에 있다. 두 수의 차가 음이면 뒤의 문자나 숫자가 큰 것.
 * 
 * */

//두 객체를 비교하기 위해 비교 기준은 인터페이스 Comparator의 compare()을 구현해야 한다.
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
		if(pMoney1>pMoney2) { //Comparable 구현 x
			return -1; //내림차순
		}else if(pMoney1==pMoney2) {
			if(pPoint1>pPoint2) {
				return -1; //내림차순
			}else if(prodNum1==prodNum2) {
				if(prodNum1>prodNum2) {
					return 1; //오름차순
				}else if(prodNum1==prodNum2) {
					return 0; //프라이머리 키니까 이런 일은 없을 것
				}else {
					return -1; //내림차순
				}
			}else {
				return 1; //오름차순
			}
		}else {
			return 1; //오름차순
		}
		
		
		
		return 0;
	}

}
