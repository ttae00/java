package javaproject_2w;
/*
 * 2���� �迭 �����ϱ�
 * ��Ʈ: �迭�� ���� �迭��, ��� ���� ä���� �ִ� ������ å���� �����Ѵ�
 * 
 */
public class ArrayTwoInit079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("// 2���� �迭 ��� 1");
		int[][] a= new int[4][3]; //4X3
		a[0][0]=1;
		a[0][1]=2;
		println(a);
		
		System.out.println("//2���� �迭 ��� 2(JigJagged�� ����)");
		int[][] b= new int[3][];
		//���� ������ �������� �ʾұ� ������ ���� ���� �����ϴ� �κ��� �ʿ��ϴ�
		//0���� 4��, 1���� 5��, 2���� 3���� �����ϸ鼭 �����Ѵ�.
		b[0]=new int[4];
		b[1]=new int[5];
		b[2]=new int[3];
		println(b);
		
		System.out.println("//2���� �迭 3");
		//2���� ���� �迭�� �����ϸ鼭 �ʱ�ȭ�Ѵ�
		int[][] c= new int[][]{{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		println(c);
		
		System.out.println("//2���� �迭 ��� 4");
		int [][]g= {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		println(g);
		
		System.out.println("copy 1");
		int [][]d= new int[c.length][c[0].length]; //3x5
		for(int i=0; i<c.length; i++) {
			//�迭�� ���� �迭�̹Ƿ� 1���� �迭�� �����ϴ� System.arraycopy()�� �̿��� 2���� �迭�� �����Ѵ�.
			System.arraycopy(c[i], 0, d[i], 0, d[i].length);
		}
		println(d);
		
	}

	public static void println(int[][] p) {
		// TODO Auto-generated method stub
		
		//2���� �迭�̸�.length�� ���� �����̰�, 2���� �迭�̸�[���� ��ġ].length�� ���� �����̴�.
		for(int i=0; i<p.length; i++) {
			for(int j=0; j<p[i].length; j++) {
				System.out.print("["+p[i][j]+"]");
			}
			System.out.println();
		}
	}

}
