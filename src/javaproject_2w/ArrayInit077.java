package javaproject_2w;

import java.util.Arrays;

/*
 * 1차원 배열 이해히기
 * 힌트: 배열은 "배열 이름(인덱스)"와 같은 방법을 이용
 *  
 */
public class ArrayInit077 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 타입의 배열 사용 방법 
		//1. 선언
		int[] a; //(동적 배열)선언 
		//a= {1,2,3}; 선언하면서 초기화할 때만 사용
		//정의
		a= new int[5];
		//초기화
		a[0]=2; a[1]=5; a[2]=3; a[3]=9; a[4]=8;
		
		//방법2. 선언 정의 초기화
		int[] b= new int[] {2,5,3,9,8};
		
		//방법3. 선언 (정의) 초기화 (정적 배열)
		int[] c= {2,5,3,9,8};//크기(length)는 5, c[0]=1~c[4]=4
		//다시 대입 불가(다시 초기화 불가)
		//c= {2,5,3,9};
		
		int []e= new int[5];//크기(length)는 5
		Arrays.fill(e,-1); //-1로 초기화 한다.
		System.arraycopy(c, 0, e, 0, c.length);
		Arrays.sort(e);//증가순으로 정렬한다.
		print(e);
		e= new int[] {1,2,3,4,5,6}; //동적 배열 다시 초기화 가능
		print(e);
		//e배열에서 5가 있는 위치를 찾는다. e에서 5는(0부터 시작)에 있다.
		int index= Arrays.binarySearch(e, 5);
		System.out.println(index);
		
		
	}

	public static void print(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}

}
