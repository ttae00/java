package javaproject_2w;
/*
 * Stream�� map�� �̿��Ͽ� Ȧ���� ���� ������ �� ���ϱ� 
 * stream�� map�� �̿��Ͽ� 1���� 10 ������ Ȧ���� ���� ������ ���� ���� ����.
 * ��Ʈ: ����Ʈ�� filter�� ������ �Ǻ��ϰ�, ���ǿ� �ش�Ǵ� ���� "�̷��� ó��"�Ϸ��� map�� ����Ѵ�.
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondition060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mlist= new ArrayList<>();
		int tot=0;
		
		for(int i=1; i<=10; i++) {
			mlist.add(i);
		}
		System.out.println(mlist);
		
		//Ȧ���� ��
		tot=mlist.stream().filter(i->i%2==1).reduce(0,Integer::sum);
		System.out.println(tot);
		
		//stream filter map collect
		mlist= mlist.stream()
				.filter(i->i%2==1)
				.map(i->i*i)
				//Ȧ���� ������ ���� ��� list�� ����ȴ�.
				.collect(Collectors.toList());
		System.out.println(mlist);
		/* 
		 * tot= mlist.stream() .filter(i->i%2==1) .map(i->i*i) .reduce(0,Integer::sum);
		 */
		//���ٽ� ���
		mlist.forEach(i->{System.out.printf(i+"\t");});
		System.out.println();
		
		//stream reduce
		tot= mlist.stream().reduce(0,Integer::sum);
		System.out.println(tot);

	}

}
