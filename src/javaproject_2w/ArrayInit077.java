package javaproject_2w;

import java.util.Arrays;

/*
 * 1���� �迭 ��������
 * ��Ʈ: �迭�� "�迭 �̸�(�ε���)"�� ���� ����� �̿�
 *  
 */
public class ArrayInit077 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻ Ÿ���� �迭 ��� ��� 
		//1. ����
		int[] a; //(���� �迭)���� 
		//a= {1,2,3}; �����ϸ鼭 �ʱ�ȭ�� ���� ���
		//����
		a= new int[5];
		//�ʱ�ȭ
		a[0]=2; a[1]=5; a[2]=3; a[3]=9; a[4]=8;
		
		//���2. ���� ���� �ʱ�ȭ
		int[] b= new int[] {2,5,3,9,8};
		
		//���3. ���� (����) �ʱ�ȭ (���� �迭)
		int[] c= {2,5,3,9,8};//ũ��(length)�� 5, c[0]=1~c[4]=4
		//�ٽ� ���� �Ұ�(�ٽ� �ʱ�ȭ �Ұ�)
		//c= {2,5,3,9};
		
		int []e= new int[5];//ũ��(length)�� 5
		Arrays.fill(e,-1); //-1�� �ʱ�ȭ �Ѵ�.
		System.arraycopy(c, 0, e, 0, c.length);
		Arrays.sort(e);//���������� �����Ѵ�.
		print(e);
		e= new int[] {1,2,3,4,5,6}; //���� �迭 �ٽ� �ʱ�ȭ ����
		print(e);
		//e�迭���� 5�� �ִ� ��ġ�� ã�´�. e���� 5��(0���� ����)�� �ִ�.
		int index= Arrays.binarySearch(e, 5);
		System.out.println(index);
		
		
	}

	public static void print(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}

}
