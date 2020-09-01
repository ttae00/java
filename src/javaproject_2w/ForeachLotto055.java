package javaproject_2w;
/*
 * varargs(variable arguments)를 이용하여 배열 출력하기
 * varargs(가변인자- 임의의 개수로 사용할 수 있는 아규먼트)를 이용해 배열을 출력하자
 * 힌트: varargs는 아규먼트의 개수가 1개,2개 이상,심지어 배열로도 사용할 수 있다.
 * 
 */
public class ForeachLotto055 {
	
	/* 반환타입 int인 경우, return 값 필요. 오류.
	public static int print2(int ...mm) {
		int m=0;
		for(int n:mm) {
			System.out.print(m+"\t");
		}
		return m;
	}
	*/
	//반환 타입이 void, return x
	public static void print(int ...mm) {
		for(int m:mm) {
			System.out.print(m+"\t");
		}
		System.out.println();
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []mm= {10,20,30,40};
		print(mm); // 배열
		System.out.println("-----------");
		int a=1,b=6,c=16;
		print(a);
		System.out.println("-----------");
		print(a,b);
		System.out.println("-----------");
		//print2(mm);
	}

}
