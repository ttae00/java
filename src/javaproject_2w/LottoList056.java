package javaproject_2w;
import java.util.ArrayList;
import java.util.List;

/*
 * 배열보다 편리한 List사용하기 
 * 힌트: add는 List에 입력하고, get은 List에서 가져온다.
 * 
 */
public class LottoList056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List 계열의 ArrayList를 생성한다. List에 저장할 타입은 int 타입이지만 List는
		//기본 타입 대신 랩퍼 클래스를 사용한다.
		List<Integer> ilist= new ArrayList<>();
		
		for(int i=0; i<=10; i++) {
		ilist.add(i);
		}
		System.out.println(ilist);
		
		for(int i=0; i<ilist.size(); i++) {
			int m= ilist.get(i);
			System.out.printf("%d\t",m);
		}
	}

}
