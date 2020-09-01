package javaproject_2w;
/*
 * 문자열 1차원 배열 이해하기
 * 힌트: 일반 배열처럼 문자열 배열[index]을 사용한다
 * 
 */
public class StringArray078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] myNum= new String[] {"2016-08-17","2016-09-17","2016-03-17"};
		//myNum2 정적 배열은 다시 초기화 불가
		String[] myNum2= {"2016-08-17","2016-09-17","2016-03-17"};
		System.out.println(myNum2[0]);
		print(myNum);
		
		myNum = new String[] {"2016-08-17","2016-09-17","2016-03-17","2016-04-17"};
		//myNum의 배열 크기와 같은 문자열 배열을 선언, 생성한다. 참조 타입의 배열은 자동 초기화가 되지 않아서 tos는 모두 null
		String[] tos= new String[myNum.length];
		
		//myNum의 문자열 배열 중에서 tos에 0 번째부터 3번째까지 총 4개를 복사한다.
		System.arraycopy(myNum, 0, tos, 0, myNum.length);
		print(tos);
		
		
	}

	public static void print(String[] tos) {
		// TODO Auto-generated method stub
		for(String ss:tos) {
			System.out.printf(ss+"\t");
		}
		System.out.println();
	}
	

}
