package javaproject_2w;
/*
 * for�� if�� �̿��Ͽ� Ȧ���� ���� ������ �� ���ϱ�
 * 1���� 10 ������ Ȧ���� ���� ������ ���� ���� ����.
 * ��Ʈ: Ȧ���� �Ǻ��ϰ� Ȧ���� ���� ������ ���� ���Ѵ�.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForCondition058 {
	
	public static int isOdd(){
		int tot=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
			tot	+=i*i;
			}	
		}
		return tot;
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * int n= isOdd(); System.out.println(n);
		 */
		List<Integer> mlist= new ArrayList<>();
		int tot=0;
		for(int i=1; i<=10; i++) {
			mlist.add(i);
		}
		for(int m:mlist) {
			if(m%2==1) {
				tot +=m*m;
				System.out.printf("%d\t",m*m);
			}
		}
		System.out.println();
		System.out.print("1~10 ������ Ȧ���� ���� ������: "+tot);
		
	}
	
}
