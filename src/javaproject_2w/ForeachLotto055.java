package javaproject_2w;
/*
 * varargs(variable arguments)�� �̿��Ͽ� �迭 ����ϱ�
 * varargs(��������- ������ ������ ����� �� �ִ� �ƱԸ�Ʈ)�� �̿��� �迭�� �������
 * ��Ʈ: varargs�� �ƱԸ�Ʈ�� ������ 1��,2�� �̻�,������ �迭�ε� ����� �� �ִ�.
 * 
 */
public class ForeachLotto055 {
	
	/* ��ȯŸ�� int�� ���, return �� �ʿ�. ����.
	public static int print2(int ...mm) {
		int m=0;
		for(int n:mm) {
			System.out.print(m+"\t");
		}
		return m;
	}
	*/
	//��ȯ Ÿ���� void, return x
	public static void print(int ...mm) {
		for(int m:mm) {
			System.out.print(m+"\t");
		}
		System.out.println();
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []mm= {10,20,30,40};
		print(mm); // �迭
		System.out.println("-----------");
		int a=1,b=6,c=16;
		print(a);
		System.out.println("-----------");
		print(a,b);
		System.out.println("-----------");
		//print2(mm);
	}

}
