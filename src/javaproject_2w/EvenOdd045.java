package javaproject_2w;
/*
 *for�� �̿��Ͽ� 1�� �� ������ ������ ���ϱ�
 *�Էµ� ���� 1�� �� ������ Ȧ���� 3��+1, ¦���� 2�� ������
 *for,while,do~while�� ���� �ݺ����� ������ ����� �����Ѵ�. 
 *
 *for(�ʱⰪ;����;����;) �ʱⰪ, ����, ���� ��� ���� ����
 *for(;true;){}�� �Ǿ� while(true)�� �ȴ�.
 */

public class EvenOdd045 {
	
	public static void showOddEvenW(int n) {
		int temp= n;
		for(;temp!=1;) {//for(�ʱⰪ; ����; ����;) �ʱⰪ, ���� ���� ����
			if(temp%2==1) {
				temp= temp*3+1;
			}else {
				temp= temp/2;
			}
			System.out.print("["+temp+"]");
		}
		System.out.println("\n-----------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showOddEvenW(122);
	}

}
