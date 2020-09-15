package javaproject_4w;
/*
 * �ٽ� �غ���
 * ģȭ�� ���ϱ�(�� ������ ���Ͽ� �ڽ��� ������ ����� ���� ���� ������ ���� �Ǵ� ��)
 * a�� ��� ��(�ڽ��� ������) sum(a)�̰� b�̰�, b�� �����(�ڽ��� ������) sum(b)�� c�� �� a==c��� ,a,b �� ���� ģȭ��.
 * ��Ʈ: ����� ���� ���Ѵ�. 
 * 
 */
public class Java200Math135 {
	public static void printAmicable(int t1, int t2) {
		for(int i= t1; i<t2; i++) {
			int a=i;
			int b= divide(a); //����� ��
			int c= divide(b);
			
			if(a<b && a==c) { //���� �� �ݺ� ����
				System.out.printf("(%d,%d)�� ģȭ��: ", a,b);
				printDivide(a);
				printDivide(b);
			}
		}
	}
	
	public static void main(String[] args) {
		printAmicable(2, 20000); //�� �� ������ ģȭ��
		//printPerfect(2,20000); //���� ��
		
		//printSociable(2,20000);//5�� ������ ģȭ��
	}

	public static void printDivide(int n) {
		// TODO Auto-generated method stub
		
		if(n==1) {
			System.out.println("[1]");
		} else {
			System.out.printf("[1,");
			for(int i=2; i<n; i++) {
				if(n%i ==0) {
					System.out.printf("%d,",i);
				}
			}
			System.out.println(n+"]");
		}
	}
	
	public static int divide(int num) {
		int tot=1;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				tot += i;
			}
		}
		return tot;
	}
}
