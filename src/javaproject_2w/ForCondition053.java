package javaproject_2w;
/*
 * for�� if�� �̿��Ͽ� Ȧ���� �� ���ϱ� 
 * 1���� 100 ������ Ȧ���� ���� ���� ����
 * ��Ʈ: for�� �̿��Ͽ� 1���� 100���� 1�� ������Ű�鼭 Ȧ�� ���θ� �Ǻ��Ѵ�.
 */
public class ForCondition053 {
	
	public static int sumOdd() {
		int tot= 0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				tot += i;
			}
			
		} return tot;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= sumOdd();
		System.out.println("1~100 ������ Ȧ���� ��: "+sum);
	}

}
