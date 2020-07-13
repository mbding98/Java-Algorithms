package sorting_algs;
import java.util.concurrent.TimeUnit;

public class InsertionSort {
	
	public static void main(String args[]) {
		int[] array = {5,2,8,12,7};
		
		for(int i : array) {System.out.print(i + " ");}
		System.out.println();
		
		long start = System.nanoTime();
		
		for(int i = 0 ; i <= array.length-1; ++i) {
			int current = array[i];
			int j = i-1;
			while( j >= 0 && array[j] > current) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = current;
		}
		
		long end = System.nanoTime();
		
		for(int i : array) {System.out.print(i + " ");}
		long diff = end - start;
		System.out.println("\n" + diff*Math.pow(10,-9) + " seconds elapsed");
	}
}
