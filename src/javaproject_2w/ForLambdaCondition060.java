package javaproject_2w;
/*
 * Stream과 map을 이용하여 홀수에 대한 제곱의 합 구하기 
 * stream과 map을 이용하여 1부터 10 사이의 홀수에 대한 제곱의 합을 구해 보자.
 * 힌트: 리스트의 filter는 조건을 판별하고, 조건에 해당되는 수를 "이렇게 처리"하려면 map을 사용한다.
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForLambdaCondition060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> mlist= new ArrayList<>();
		int tot=0;
		
		for(int i=1; i<=10; i++) {
			mlist.add(i);
		}
		System.out.println(mlist);
		
		//홀수의 합
		tot=mlist.stream().filter(i->i%2==1).reduce(0,Integer::sum);
		System.out.println(tot);
		
		//stream filter map collect
		mlist= mlist.stream()
				.filter(i->i%2==1)
				.map(i->i*i)
				//홀수를 제곱한 수는 모두 list에 저장된다.
				.collect(Collectors.toList());
		System.out.println(mlist);
		/* 
		 * tot= mlist.stream() .filter(i->i%2==1) .map(i->i*i) .reduce(0,Integer::sum);
		 */
		//람다식 출력
		mlist.forEach(i->{System.out.printf(i+"\t");});
		System.out.println();
		
		//stream reduce
		tot= mlist.stream().reduce(0,Integer::sum);
		System.out.println(tot);

	}

}
