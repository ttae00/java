package javaproject_2w;
/* �ٽ� �����ϱ�
 * 
 * �������� �̿��Ͽ� �Ҽ� �Ǻ��ϱ�
 * �Է¹��� ���� �Ҽ����� �Ǻ��� ����.
 * ��Ʈ: �������� ���ϴ� Math.sqrt()�� �̿��ϸ� �ݺ� Ƚ���� ���� �� �ִ�.
 */

public class PrimMath049 {
	
	public static boolean isPrime(int n) {
		boolean isS= true;
		//�Է� ���� n�� �����ٱ��� for�� ����
		//n�� 2�� 3�̶�� for���� ������� �ʰ�, isS�� true�̹Ƿ� �Ҽ��̴�. n�� 4��� 4�� ������ 2�� ������ �������� ������ �Ҽ��� �ƴϴ�.
		for(int i=2; i<=(int)Math.sqrt(n); i++) {
			//�Ҽ��� �ƴϸ�
			if(n%2==0) {
				isS= false;
				//���� ��� 10�� 2�� ������ ������ �������� �� ������ �� �ʿ䰡 �����Ƿ� break�� ����� �ݺ��� for�� ������.
				break;
			}
		}
		return isS;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		//�Ҽ��ΰ� Ȯ��
		boolean isPrime =isPrime(num);
		if(isPrime) {
			System.out.printf("%d�� 1�� �ڽ����θ� ���� �������� �Ҽ��̴�.", num);
		}else {
			System.out.printf("%d�� �Ҽ��� �ƴϴ�.",num);
		}
	}

}
