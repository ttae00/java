package javaproject_2w;

public class EvenOddIfCondition034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp= 99;
		if (temp%2==1) { //홀수
			temp= temp*3+1;
		}else {
			temp= temp/2;
			
		}
		System.out.printf("계산 후= %d\n", temp); //d는 정수
	}
}
