package javaproject_2w;
import java.util.ArrayList;
import java.util.List;

/*
 * �迭���� ���� List����ϱ� 
 * ��Ʈ: add�� List�� �Է��ϰ�, get�� List���� �����´�.
 * 
 */
public class LottoList056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List �迭�� ArrayList�� �����Ѵ�. List�� ������ Ÿ���� int Ÿ�������� List��
		//�⺻ Ÿ�� ��� ���� Ŭ������ ����Ѵ�.
		List<Integer> ilist= new ArrayList<>();
		
		for(int i=0; i<=10; i++) {
		ilist.add(i);
		}
		System.out.println(ilist);
		
		for(int i=0; i<ilist.size(); i++) {
			int m= ilist.get(i);
			System.out.printf("%d\t",m);
		}
	}

}
