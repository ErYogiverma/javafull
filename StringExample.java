// ...Given n and k, print a string that has n characters.
// string should have exactly k distinctf characters and no adjacent positions.
import java.util.*;

public class StringExample {
    public static void main(String[] args) {
        int n = 10; // Change n to the desired length of the string
        int k = 4;  // Change k to the desired number of distinct characters

        if (n < k || k <= 1 || n < 2 * k - 1) {
            System.out.println("Cannot create a valid string with the given values of n and k.");
        } else {
            StringBuilder result = new StringBuilder();
            Queue<Character> distinctChars = new LinkedList<>();

            // Initialize the queue with distinct characters
            for (char ch = 'a'; ch < 'a' + k; ch++) {
                distinctChars.offer(ch);
            }

            // Fill the string with distinct characters with no adjacent positions
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    char ch = distinctChars.poll();
                    result.append(ch);
                    distinctChars.offer(ch);
                } else {
                    char ch = distinctChars.poll();
                    char nextCh = distinctChars.poll();
                    result.append(ch);
                    result.append(nextCh);
                    distinctChars.offer(ch);
                    distinctChars.offer(nextCh);
                }
            }

            System.out.println(result.toString());
        }
    }
}
