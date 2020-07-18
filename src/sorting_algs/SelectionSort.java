package sorting_algs;
import java.util.concurrent.TimeUnit;

/***
 * Using the Insertion Sort Algorithm 
 * @author mbdin
 *
 */
public class SelectionSort {
	public static void main (String args[]) {
		
		int[] array = {10,2,8,6,7,3};
		int temp, index;
		for(int i : array) {System.out.print(i + " ");}
		System.out.println();
		
		long start = System.nanoTime();
		
		for (int i = 0; i <= array.length-2; ++i) {
			index = i;
			
			for (int j = i + 1; j <= array.length-1; ++j) {
				if (array[j] < array[index]) 
					index = j;
			}
			
			temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}
		
		long end = System.nanoTime();
		
		long diff = end - start;
		for(int i : array) {System.out.print(i + " ");}
		System.out.println("\n"+diff*Math.pow(10,-9) + " seconds elapsed");
		
	}
}
