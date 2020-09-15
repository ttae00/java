package javaproject_4w;
/*
 * 버블 정렬로 정렬하기
 * 힌트: 두 수를 비교해서 큰 수를 오른쪽으로 옮기는 과정을 반복한다.
 * 
 * */
public class JSort134 {

	public static void BubbleSort(int[] n) {
		
		//두 수를 비교하기 때문에 배열의 크기에서 -1 한다.
		for(int i=0; i<n.length-1; i++) {
			//가장 큰 수를 가장 오른쪽으로 옮긴다.정렬할 크기에서 한개가 빠진다. 두 번째에서 다음으로 큰 수를 오른쪽으로 옮기면 정렬할 크기가 2개 빠진다.
			//같은 원리로 i번 정렬한 만큼(length-1-i)번 두 수 비교를 반복하게 됨.
			for(int j=0; j<n.length-1-i; j++) {
				if(n[j]>n[j+1]) {
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1]= temp;
				}
			}
		}
	}
	
	//버블 정렬
	public static void print(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}

}
