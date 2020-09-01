package javaproject_2w;
/*
 * 2차원 배열 이해하기
 * 힌트: 배열에 대한 배열로, 행과 열로 채워져 있는 교실의 책상을 연상한다
 * 
 */
public class ArrayTwoInit079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("// 2차원 배열 방법 1");
		int[][] a= new int[4][3]; //4X3
		a[0][0]=1;
		a[0][1]=2;
		println(a);
		
		System.out.println("//2차원 배열 방법 2(JigJagged도 가능)");
		int[][] b= new int[3][];
		//열의 개수가 결정되지 않았기 때문에 열의 수를 결정하는 부분이 필요하다
		//0행을 4열, 1행을 5열, 2행을 3열로 선언하면서 생성한다.
		b[0]=new int[4];
		b[1]=new int[5];
		b[2]=new int[3];
		println(b);
		
		System.out.println("//2차원 배열 3");
		//2차원 동적 배열을 선언하면서 초기화한다
		int[][] c= new int[][]{{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		println(c);
		
		System.out.println("//2차원 배열 방법 4");
		int [][]g= {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		println(g);
		
		System.out.println("copy 1");
		int [][]d= new int[c.length][c[0].length]; //3x5
		for(int i=0; i<c.length; i++) {
			//배열에 대한 배열이므로 1차원 배열을 복사하는 System.arraycopy()를 이용해 2차원 배열을 복사한다.
			System.arraycopy(c[i], 0, d[i], 0, d[i].length);
		}
		println(d);
		
	}

	public static void println(int[][] p) {
		// TODO Auto-generated method stub
		
		//2차원 배열이름.length는 행의 개수이고, 2차원 배열이름[행의 위치].length는 열의 개수이다.
		for(int i=0; i<p.length; i++) {
			for(int j=0; j<p[i].length; j++) {
				System.out.print("["+p[i][j]+"]");
			}
			System.out.println();
		}
	}

}
