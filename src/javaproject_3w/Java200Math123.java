package javaproject_3w;
/* 
 * �����!
 * ����� ���μ� �����ϱ�
 * ����� ���ϰ� ������ ���μ� �����غ���
 * ��Ʈ: ����� ������ �������� ���̰�, �Ҽ��� ������ ���� ���μ� ���ض�� �Ѵ�.
 *  
 */
public class Java200Math123 {
	
	public static void printDivide(int n) {
		if(n==1) {
			System.out.println("[1]");
		}else {
			//2 �̻� ���� �ݵ�� 1�� �����ϱ� ������ "[1,"�� ����Ѵ�.
			System.out.print("[1,");
			//���� n�� 2~n-1�� ������ �������� ����̴�
			for(int i=2; i< n; i++) {
				//������
				if(n%i==0) {
					System.out.printf("%d,", i);
				}
			}
			//���� n �ڽŵ� ����̴�
			System.out.println(n+"]");
		}
	}
	
	public static void printPrimeDivide(int n) {
		
		//2���� ������ ����
		int a= 2;
		
		//n�� 1�� �� ������ �ݺ��Ѵ�
		while(n!=1) {
			//n�� a�� ������ �������� �Ҽ��� ������ �������Ƿ� ���μ� ���� ������ �ȴ�.
			if(n%a==0) {
				//���� 1�̸� n�� a�� ����. ���μ� ������ ������ ���� �ȴ�. ���� 5���� 5�� ���� 1
				if(n/a==1){
				System.out.println(a);
				}else {
				System.out.print(a+"x");
				}
				//�Ҽ��� ������. 10�� 2�� ������ ���� 5, �ٽ� 5�� 5�� ������ ���� 1�� �Ǿ� ���μ� ���� ��.
				n/=a;
			//n�� a�� ������ �������� ������	
			}else {
			//a�� ���� 1 ������Ų��. 5�� 2�� ������ �������� �����Ƿ�, 3,4,5���� 1�� ������Ų��.
			a++;
			}
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDivide(194560);
		printPrimeDivide(194560);
	}

}
