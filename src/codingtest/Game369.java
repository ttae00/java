package codingtest;

import java.util.Scanner;
import java.io.FileInputStream;

/*
����ϴ� Ŭ�������� Solution �̾�� �ϹǷ�, ������ Solution.java �� ����� ���� �����մϴ�.
�̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� �����غ� �� �ֽ��ϴ�.
*/
class Solution
{
	public static void main(String args[]) throws Exception{
/*
�Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
�������� �ۼ��� �ڵ带 �׽�Ʈ �� ��, ���Ǹ� ���ؼ� input.txt�� �Է��� ������ ��,
�� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ �� ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�.
���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
*/
//System.setIn(new FileInputStream("res/input.txt"));

/*
ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
*/
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
/*
���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int ill = test_case % 10;
			int sib= test_case / 10;
		
			if(sib ==3 || sib ==6 || sib == 9){
				if( ill == 3  || ill == 6 || ill == 9){
		
					System.out.print("-- ");
					continue;
				}
				System.out.print("- ");
		
			}else if(ill == 3  || ill == 6 || ill == 9){
		
				System.out.print("- ");
		
			}else{
		
				System.out.print(test_case+ " ");
			}
		}
		
	}
}
