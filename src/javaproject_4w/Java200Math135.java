package javaproject_4w;
/*
 * 다시 해보기
 * 친화수 구하기(두 정수에 대하여 자신을 제외한 약수의 합이 서로 상대방의 수가 되는 수)
 * a의 약수 합(자신을 제외한) sum(a)이가 b이고, b의 약수합(자신을 제외한) sum(b)가 c일 때 a==c라면 ,a,b 두 수는 친화수.
 * 힌트: 약수의 합을 구한다. 
 * 
 */
public class Java200Math135 {
	public static void printAmicable(int t1, int t2) {
		for(int i= t1; i<t2; i++) {
			int a=i;
			int b= divide(a); //약수의 합
			int c= divide(b);
			
			if(a<b && a==c) { //같은 수 반복 금지
				System.out.printf("(%d,%d)는 친화수: ", a,b);
				printDivide(a);
				printDivide(b);
			}
		}
	}
	
	public static void main(String[] args) {
		printAmicable(2, 20000); //두 수 사이의 친화수
		//printPerfect(2,20000); //완전 수
		
		//printSociable(2,20000);//5개 사이의 친화수
	}

	public static void printDivide(int n) {
		// TODO Auto-generated method stub
		
		if(n==1) {
			System.out.println("[1]");
		} else {
			System.out.printf("[1,");
			for(int i=2; i<n; i++) {
				if(n%i ==0) {
					System.out.printf("%d,",i);
				}
			}
			System.out.println(n+"]");
		}
	}
	
	public static int divide(int num) {
		int tot=1;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				tot += i;
			}
		}
		return tot;
	}
}
