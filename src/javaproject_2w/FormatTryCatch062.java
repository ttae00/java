package javaproject_2w;
/*
 * ������ �Է� ���� �� �߻� �� �� �ִ� ���� ó���ϱ�
 * ���� Ÿ�� ���ڿ��� �Է� �޾� ������ ��ȯ�� �� �߻��� �� �ִ� ���ܸ� ó���غ���
 * try{}catch{}�� �̿��Ͽ� ���ܸ� ó���Ѵ� 
 * 
 *  ���ڿ��� �⺻ Ÿ������ ��ȯ �� �߸��� ��ȯ�� ����ϸ� NumberFormatException�� �߻��Ѵ�.
 */
public class FormatTryCatch062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num= "1234";
		
		try {
		//���ڿ��� �⺻ Ÿ������ ��ȯ �� ���� ���� Ŭ������ ����Ѵ�.
		//������ ����-> ���� : Integer.parseInt()
		//�Ǽ��� ����-> �Ǽ�: Double.parseDouble()
		int n= Integer.parseInt(num);
		System.out.println(n);
		}catch(NumberFormatException ee) {
			System.out.println("int�� �ƴѰ� ����!!!");
			System.out.println(ee.getMessage());
		
		//���� ����ó���� ó������ ���ϸ� Exception�� ó���Ѵ�. ���� �߿�!	���� �ۼ��ϰ� �Ǹ� unreachable catch block error �߻�
		}catch(Exception ee) {
			System.out.println("�� �־��");
		}finally {
			System.out.println("�� ����Ǿ�߸� ��!");
		}
	}

}
