package javaproject_3w;
/* 다시 해보기
 * 이중 for문으로 다이아몬드 만들기 
 *
 */
public class stepDia122 {

	
	public static void stepDia(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<Math.abs(i-n/2); j++) {
				System.out.print(".");
			}
			
			for(int k=0; k<n-2*Math.abs(i-n/2); k++) { 
				System.out.print("*");
			}
			 
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stepDia(9);
	}

}
