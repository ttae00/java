package javaproject_2w;
/*
 * ���� for(foreach)�� �迭 ����ϱ� 
 * ���� for�� �̿��Ͽ� �迭�� ����غ���.
 * ��Ʈ: ���� for�� index ���̵� ������� �迭���� ����� �� �ִ�.
 */
public class ForeachLotto054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []mm={10,20,30,40,50};
		for(int m:mm) {
			System.out.printf(m+"\t");
		}
		System.out.println();
		
		for(int i=0; i<mm.length; i++) {
			int m= mm[i];
			System.out.printf(m+"\t");
		}
		
	}

}
