package javaproject_4w;

import java.util.Arrays;

/*
 * 겹치는 수가 없는 로또 만들기
 * 힌트: 같은 숫자를 배열에 저장하지 않는다. 
 * 
 */
public class Lotto6Num133 {
	
	private int[] lots;
	private int base; //45
	private int ballNum; //6
	

	
	
	
	public Lotto6Num133(int base, int ballNum) {
		this.base = base;
		this.ballNum = ballNum;
		
		//배열 생성
		lots = new int[ballNum];
	}
	
	public Lotto6Num133() {
		this(45,6);
	}
	
	//일차원 배열 출력
	public void print() {
		for(int i=0; i<lots.length; i++) {
			if(i==lots.length-1) {
				//6번째는 ,를 붙이지 않는다
				System.out.printf("%d",lots[i]);
			}else {
				//5개까지는 ,를 붙인다.
				System.out.printf("%d,",lots[i]);
			}
		}
		System.out.println();
	}
	
	//1~45 사이의 임의의 정수를 만든다
	private int rand() {
		return (int)(Math.random()*base)+1;
		
	}
	
	public boolean contain(int n) {
		boolean isC= false;
		for(int i=0; i<lots.length; i++) {
			if(lots[i]==n) {
				isC= true;
				break;
			}
		}
		return isC;
	}
	
	public void make() {
		//배열을 0으로 초기화 한다.
		Arrays.fill(lots, 0);
		int count= 0;
		//배열에 6개의 서로 다른 정수가 채워질 때까지 반복한다.
		while(count!=ballNum) {
			//임의의 정수를 만든다
			int temp= rand(); //1~45
			//이 정수가 배열에 포함되어있지 않으면 배열에 저장하고 저장된 개수를 증가시킨다.
			if(!contain(temp)) {
				lots[count++]= temp;
			}
		}
		//배열을 증가순으로 정렬한다.
		Arrays.sort(lots);
	}
	
	//배열을 반환한다.
	public int[] getLots() {
		return lots;
	}


}
