package javaproject_5w;
/*
 * 1차원 배열로 거리 표시하기
 * 문자열 배열을 이용하고 향상된 for로 출력한다.
 * 
 */
public class Conversion176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names= {"CM","M","Inch", "Feet", "Yard","Mile"};
		//new String[]{} 만 재할당 가능하다
		for(int i=0; i<names.length; i++) {
			System.out.printf("%s\t\t\t",names[i]);
		}
		
		System.out.println();
		for(String ss: names) {
			System.out.printf("%s\t\t\t", ss);
		}
		System.out.println();
	}

}
