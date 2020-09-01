package javaproject_2w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 *foreach�� lambda������ �̿��Ͽ� List ����ϱ�
 *List�� ����� �����͸� foreach�� Lambda ������ �̿��Ͽ� List�� ����� ����
 *��Ʈ:���� for�� ����� ���·�, �ε��� ���� ������� ����ϴ� ����� �̿��Ѵ�.
 */
public class ForeachLamdaLotto057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nlists= Arrays.asList(1,10,30,40,50);//new ArrayList<Integer>();��� ���
		//asList�� List�� �����ϸ� add()��� �Ұ�.
		
		//foreach�� list ����ϱ�.
		//���� for���� ������� ���� ������ ����Ϸ��� forEach(m -> {m ���}) ������ �̿��Ѵ�.
		//List<Integer>�� �����ߴٸ� m�� int(Integer)�̴�.
		for(int mm1:nlists) {
			System.out.print(mm1+"\t");
		}
		System.out.println("\n-------");
		
		//List�� forEach�޼��� �̿� + lambda ���� ���
		nlists.forEach(
				mm2 -> {System.out.print(mm2 + "\t");}
		);
		
		System.out.println("\n-------");
		
		//���� �۵� ������ �����ִ� �ڵ�.
		Consumer<Integer> consume= (Integer m) ->{System.out.print(m+"\t");};
		nlists.forEach(consume);
	}
	

}
