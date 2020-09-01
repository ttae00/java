package javaproject_2w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 *foreach와 lambda형식을 이용하여 List 출력하기
 *List에 저장된 데이터를 foreach와 Lambda 형식을 이용하여 List를 출력해 보자
 *힌트:향상된 for와 비슷한 형태로, 인덱스 없이 순서대로 출력하는 방법을 이용한다.
 */
public class ForeachLamdaLotto057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nlists= Arrays.asList(1,10,30,40,50);//new ArrayList<Integer>();대신 사용
		//asList로 List를 생성하면 add()사용 불가.
		
		//foreach로 list 출력하기.
		//향상된 for에서 순서대로 수를 가져와 출력하려면 forEach(m -> {m 출력}) 형식을 이용한다.
		//List<Integer>로 선언했다면 m은 int(Integer)이다.
		for(int mm1:nlists) {
			System.out.print(mm1+"\t");
		}
		System.out.println("\n-------");
		
		//List의 forEach메서드 이용 + lambda 형식 출력
		nlists.forEach(
				mm2 -> {System.out.print(mm2 + "\t");}
		);
		
		System.out.println("\n-------");
		
		//위의 작동 원리를 보여주는 코드.
		Consumer<Integer> consume= (Integer m) ->{System.out.print(m+"\t");};
		nlists.forEach(consume);
	}
	

}
