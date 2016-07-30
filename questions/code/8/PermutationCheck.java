import java.util.Arrays;

class PermutationCheck {

	public static boolean Brute (String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
	
		// Loop C1
		for (int i=0; i<c1.length; i++) {
			// Check c2
			for (int j=0; j<c2.length; j++) {
				// Find Match
				if (c1[i] == c2[j]) {
					// Remove Character
					c2[j] = '\0';
					break;
				}
				// Not Found
				if (j == c2.length)
					return false;
			}
		}
		return true;
	}

	public static boolean Sort (String s1, String s2) {
		// Create Arrays
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		// Check Size
		if (c1.length != c2.length)
			return false;

		// Sort
		Arrays.sort(c1);
		Arrays.sort(c2);
		// Check
		for (int i=0; i<c1.length; i++)
			if (c1[i] != c2[i])
				return false;

		return true;
	}


	public static void main( String[] args ) {
		String s1 = "example e";
		String s2 = "meeple xa";

		System.out.println("Brute O(N^2)    : " + Brute(s1, s2));
		System.out.println("Sort  O(N log N): " + Sort(s1, s2));
	}
}
