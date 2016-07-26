public class DiffPairs {

        public static int brute(int array[], int diff) {
                int count = 0;
                for (int i=0; i< array.length-1; i++)
                        for (int j=0; j < array.length-1; j++) {
                                if (array[i]+diff == array[j])
                                        count++;
                                if (array[i]-diff == array[j])
                                        count++;
                        }
                return count;
        }


        public static void main( String args[]) {

                int array[] = {1,7,5,9,2,12,3};
                int diff = 2;

                // Brute Force N^2
                System.out.println("Brute (N^2): " + brute(array, diff));

                // Sort First
                int sortedArray[] = QuickSort(array);
                System.out.println("Sort (N log N): " +
        }

}

