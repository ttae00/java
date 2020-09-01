package javaproject_2w;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/* �ٽ� Ǯ���
 * Stream�� �̿��Ͽ� Ȧ���� �� ���ϱ�
 * Stream�� �̿��Ͽ� 1���� 100 ������ Ȧ���� ���� ���� ����.
 * ��Ʈ: Ȧ������ �Ǻ��ϰ� Ȧ���� ���� ���� ���Ѵ�.
 *
 */

public class ForCondition059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mlist= new ArrayList<>();
		int tot=0;
		for(int i=1; i<=100; i++) {
			mlist.add(i);
		}
		
		//�ʱⰪ 0
		tot= mlist.stream().reduce(0,Integer::sum);
		System.out.println("1~100�� ��: "+tot);
		tot=0;
		//1~100 ������ Ȧ���� ��
		//List�� ����� ������ �� ���ǿ� �´� ���� ã�� ��(filter ���ǿ� �´� ���� ��󳽴�) filter���
		//���� ���� ���� reduce ��� reduce(�ʱⰪ,Interger:sum)�� �����Ѵ�.
		tot= mlist.stream().filter(i->i%2==1).reduce(0, Integer::sum);
		System.out.println("1~100 ���� Ȧ���� ��: "+tot);
		//1~100������ Ȧ���� ��
		tot= mlist.stream().filter(i->i%2==1).reduce(0, (x,y)->x+y);
		System.out.println("1~100 ���� Ȧ���� ��: "+tot);
		
		//1~100 ������ Ȧ���� ��
		tot= mlist.stream().filter(i->i%2==1).reduce(0,
				new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		});
		System.out.println("1~100 ���� Ȧ���� ��: "+tot);
	}

}
