package javaproject_2w;
/*
 *while조건을 이용하여 서로 다른 세 정수 만들기
 *!의 사용법을 익히자 
 * 힌트:!true는 false, !false는 true가 된다.
 */
public class BioRandom047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0,c=0;
		
		//a와 b가 같거나 b와 c가 같거나 c와 a가 같으면 while문 반복
		//서로 다른 수가 될 때까지 반복한다. 서로 다른 세 수가 되면 끝난다.
		while(a==b||b==c||c==a) {
		//while( !(a!=b && b!=c && c!=a))
			a=(int)(Math.random()*10+1);
			b=(int)(Math.random()*10+1);
			c=(int)(Math.random()*10+1);
			
		}
		System.out.printf("%d\t%d\t%d\t",a,b,c);
	}

}
