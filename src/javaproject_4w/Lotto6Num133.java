package javaproject_4w;

import java.util.Arrays;

/*
 * ��ġ�� ���� ���� �ζ� �����
 * ��Ʈ: ���� ���ڸ� �迭�� �������� �ʴ´�. 
 * 
 */
public class Lotto6Num133 {
	
	private int[] lots;
	private int base; //45
	private int ballNum; //6
	

	
	
	
	public Lotto6Num133(int base, int ballNum) {
		this.base = base;
		this.ballNum = ballNum;
		
		//�迭 ����
		lots = new int[ballNum];
	}
	
	public Lotto6Num133() {
		this(45,6);
	}
	
	//������ �迭 ���
	public void print() {
		for(int i=0; i<lots.length; i++) {
			if(i==lots.length-1) {
				//6��°�� ,�� ������ �ʴ´�
				System.out.printf("%d",lots[i]);
			}else {
				//5�������� ,�� ���δ�.
				System.out.printf("%d,",lots[i]);
			}
		}
		System.out.println();
	}
	
	//1~45 ������ ������ ������ �����
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
		//�迭�� 0���� �ʱ�ȭ �Ѵ�.
		Arrays.fill(lots, 0);
		int count= 0;
		//�迭�� 6���� ���� �ٸ� ������ ä���� ������ �ݺ��Ѵ�.
		while(count!=ballNum) {
			//������ ������ �����
			int temp= rand(); //1~45
			//�� ������ �迭�� ���ԵǾ����� ������ �迭�� �����ϰ� ����� ������ ������Ų��.
			if(!contain(temp)) {
				lots[count++]= temp;
			}
		}
		//�迭�� ���������� �����Ѵ�.
		Arrays.sort(lots);
	}
	
	//�迭�� ��ȯ�Ѵ�.
	public int[] getLots() {
		return lots;
	}


}
