package javaproject_2w;
/*
 *do~while�� �̿��Ͽ� 1�� �� ������ ������ ���ϱ�
 *�Էµ� ���� 1�� �� ������ Ȧ���� 3��*1, ¦���� 2�� ������
 *��Ʈ: ��� �� �� �����ϴ� �ݺ����� do~ while�� ���. while�� ������ ��Ȯ�� �� ����Ѵ�.
 */
public class EvenOdd044 {
	
	public static void showOddEvenW(int n) {
		int temp =n;
		do {
			if(temp%2==1) {
				temp= temp*3+1;
			}else {
				temp= temp/2;
			}
		System.out.print("["+temp+"]");
		}while(temp !=1);
		System.out.println("\n------------");
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showOddEvenW(122);
		//showOddEvenW(1);
	}

}
