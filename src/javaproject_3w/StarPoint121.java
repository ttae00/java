package javaproject_3w;
/* 
 * ���� for������ ���ﰢ�� �׸���
 *  
 * 
 */
public class StarPoint121 {

	public static void printStar(int n){
		//for�� ���� for�������� �ٱ� for���� ������ ����� ������ ���� for���� ����ȴ�.
		
		//�ٱ� for��. n�ٿ� ���Ͽ� ���� for�� �����Ѵ�. i�� 0�� �� ���� for�� ���� j�� j<0�� �ǹǷ� ������ ����.
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(".");
		
			}
			 //i�� 0�� �� k<2*(5-0)�� �Ǿ� *�� 9�� ����Ѵ�.
			 for(int k=1; k<2*(n-i); k++) { 
				 System.out.print("*"); 
			 }
			 
			 System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		printStar(5);
	}
}
