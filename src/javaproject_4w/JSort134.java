package javaproject_4w;
/*
 * ���� ���ķ� �����ϱ�
 * ��Ʈ: �� ���� ���ؼ� ū ���� ���������� �ű�� ������ �ݺ��Ѵ�.
 * 
 * */
public class JSort134 {

	public static void BubbleSort(int[] n) {
		
		//�� ���� ���ϱ� ������ �迭�� ũ�⿡�� -1 �Ѵ�.
		for(int i=0; i<n.length-1; i++) {
			//���� ū ���� ���� ���������� �ű��.������ ũ�⿡�� �Ѱ��� ������. �� ��°���� �������� ū ���� ���������� �ű�� ������ ũ�Ⱑ 2�� ������.
			//���� ������ i�� ������ ��ŭ(length-1-i)�� �� �� �񱳸� �ݺ��ϰ� ��.
			for(int j=0; j<n.length-1-i; j++) {
				if(n[j]>n[j+1]) {
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1]= temp;
				}
			}
		}
	}
	
	//���� ����
	public static void print(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}

}
