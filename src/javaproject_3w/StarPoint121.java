package javaproject_3w;
/* 
 * 이중 for문으로 역삼각형 그리기
 *  
 * 
 */
public class StarPoint121 {

	public static void printStar(int n){
		//for에 대한 for문에서는 바깥 for문의 스텝이 변경될 때마다 안쪽 for문이 실행된다.
		
		//바깥 for문. n줄에 대하여 내부 for를 실행한다. i가 0일 때 안쪽 for문 변수 j는 j<0이 되므로 공백이 없다.
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(".");
		
			}
			 //i가 0일 때 k<2*(5-0)가 되어 *를 9번 출력한다.
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
