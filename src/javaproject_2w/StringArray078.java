package javaproject_2w;
/*
 * ���ڿ� 1���� �迭 �����ϱ�
 * ��Ʈ: �Ϲ� �迭ó�� ���ڿ� �迭[index]�� ����Ѵ�
 * 
 */
public class StringArray078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myNum= new String[] {"2016-08-17","2016-09-17","2016-03-17"};
		//myNum2 ���� �迭�� �ٽ� �ʱ�ȭ �Ұ�
		String[] myNum2= {"2016-08-17","2016-09-17","2016-03-17"};
		System.out.println(myNum2[0]);
		print(myNum);
		
		myNum = new String[] {"2016-08-17","2016-09-17","2016-03-17","2016-04-17"};
		//myNum�� �迭 ũ��� ���� ���ڿ� �迭�� ����, �����Ѵ�. ���� Ÿ���� �迭�� �ڵ� �ʱ�ȭ�� ���� �ʾƼ� tos�� ��� null
		String[] tos= new String[myNum.length];
		
		//myNum�� ���ڿ� �迭 �߿��� tos�� 0 ��°���� 3��°���� �� 4���� �����Ѵ�.
		System.arraycopy(myNum, 0, tos, 0, myNum.length);
		print(tos);
		
		
	}

	public static void print(String[] tos) {
		// TODO Auto-generated method stub
		for(String ss:tos) {
			System.out.printf(ss+"\t");
		}
		System.out.println();
	}
	

}
