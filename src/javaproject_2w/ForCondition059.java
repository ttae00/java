package javaproject_2w;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/* 다시 풀어보기
 * Stream을 이용하여 홀수의 합 구하기
 * Stream을 이용하여 1부터 100 사이의 홀수의 합을 구해 보자.
 * 힌트: 홀수인지 판별하고 홀수에 대한 합을 구한다.
 *
 */

public class ForCondition059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mlist= new ArrayList<>();
		int tot=0;
		for(int i=1; i<=100; i++) {
			mlist.add(i);
		}
		
		//초기값 0
		tot= mlist.stream().reduce(0,Integer::sum);
		System.out.println("1~100의 합: "+tot);
		tot=0;
		//1~100 사이의 홀수의 합
		//List에 저장된 데이터 중 조건에 맞는 것을 찾을 때(filter 조건에 맞는 수를 골라낸다) filter사용
		//합을 구할 때는 reduce 사용 reduce(초기값,Interger:sum)로 산출한다.
		tot= mlist.stream().filter(i->i%2==1).reduce(0, Integer::sum);
		System.out.println("1~100 사이 홀수의 합: "+tot);
		//1~100사이의 홀수의 합
		tot= mlist.stream().filter(i->i%2==1).reduce(0, (x,y)->x+y);
		System.out.println("1~100 사이 홀수의 합: "+tot);
		
		//1~100 사이의 홀수의 합
		tot= mlist.stream().filter(i->i%2==1).reduce(0,
				new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		});
		System.out.println("1~100 사이 홀수의 합: "+tot);
	}

}
