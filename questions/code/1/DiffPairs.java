import java.util.Arrays;

public class DiffPairs {
	// Brute Force
        public static int Brute(int array[], int diff) {
                int count = 0;
		// Find 
                for (int i=0; i<array.length; i++)
                        for (int j=0; j<array.length; j++) {
                                if (array[i]+diff == array[j])
                                        count++;
                        }
                return count;
        }
	// Sort
	public static int Sorted(int array[], int diff) {
		int count = 0;
		// Sort Array
		Arrays.sort(array);
		// Find 
		for (int i=0; i<array.length-2; i++) {
			if (array[i]+diff == array[i+1])
				count++;
			if (array[i]+diff == array[i+2])
				count++;
		}
		return count;
	}

        public static void main( String args[] ) {

                int array[] = {1,7,5,9,2,12,3};
                int diff = 2;

                // Brute Force N^2
                System.out.println("Brute (N^2)   : " + Brute(array, diff));

                // Sort First
                System.out.println("Sort (N log N): " + Sorted(array, diff));
        }
}

