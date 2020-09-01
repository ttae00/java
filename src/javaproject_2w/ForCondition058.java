package javaproject_2w;
/*
 * for와 if를 이용하여 홀수에 대한 제곱의 합 구하기
 * 1부터 10 사이의 홀수에 대한 제곱의 합을 구해 보자.
 * 힌트: 홀수를 판별하고 홀수에 대한 제곱의 합을 구한다.
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForCondition058 {
	
	public static int isOdd(){
		int tot=0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
			tot	+=i*i;
			}	
		}
		return tot;
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * int n= isOdd(); System.out.println(n);
		 */
		List<Integer> mlist= new ArrayList<>();
		int tot=0;
		for(int i=1; i<=10; i++) {
			mlist.add(i);
		}
		for(int m:mlist) {
			if(m%2==1) {
				tot +=m*m;
				System.out.printf("%d\t",m*m);
			}
		}
		System.out.println();
		System.out.print("1~10 사이의 홀수에 대한 제곱합: "+tot);
		
	}
	
}
