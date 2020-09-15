package javaproject_4w;

public class JSortMain134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m={67,700,735,287,830,360,753,332,899,616,990,890,933,975,275
    			,707,271,80,409,602,875,813,208,949,183,504,721,494,159,549,
    			95,818,85,444,703,961,928,193,846,660,433,253,547,436,467,751,
    			684,284,481,439,12,18,421,4,394,458,829,633,474,359,454,541,
    			601,471,326,889,345,555,710,614,540,353,795,116,119,133,859,280,413,
    			689,861,966,709,938,600,190,81,544,406,692,765,179,
    			32,629,437,804,911,42,836,770};  // 100°³
		
		int[] n= new int[m.length];
		System.arraycopy(m, 0, n, 0, m.length);
		JSort134.print(n);
		long a= System.nanoTime();
		JSort134.BubbleSort(n);
		
		long b= System.nanoTime();
		System.out.println((b-a)+"nano sec"); //10ÀÇ -9½Â
		JSort134.print(n);
	}

}
