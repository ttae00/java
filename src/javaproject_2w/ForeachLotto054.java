package javaproject_2w;
/*
 * 향상된 for(foreach)로 배열 출력하기 
 * 향상된 for를 이용하여 배열을 출력해보자.
 * 힌트: 향상된 for는 index 없이도 순서대로 배열값을 사용할 수 있다.
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
