package javaproject_2w;
/*
 * ���� ���꿡�� �߻��ϴ� ���� ó���ϱ�
 * ��Ʈ: ���� ���� ���� ó���� ArithmeticException ��� 
 * 
 */
public class FinallyTryCatch063 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//0���� ������.
			int x= 5;
			int y= 20 / (5-x); // ���� ������ �κ�.
			System.out.println(y);
		}catch(ArithmeticException ee) { //run time 
			System.out.println("0���� ������ �ʾҴ�???!");
		}finally {
			System.out.println("�� ����Ǿ�߸� ��!!");
		}
	}

}
