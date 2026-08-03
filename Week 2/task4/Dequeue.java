import java.util.*;

public class Dequeue {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            // Add new element to the window
            deque.addLast(num);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            // Remove the oldest element if window size exceeds k
            if (deque.size() > k) {
                int removed = deque.removeFirst();

                if (freqMap.get(removed) == 1) {
                    freqMap.remove(removed);
                } else {
                    freqMap.put(removed, freqMap.get(removed) - 1);
                }
            }

            // Update maximum number of unique elements
            if (deque.size() == k) {
                maxUnique = Math.max(maxUnique, freqMap.size());
            }
        }

        System.out.println(maxUnique);

        in.close();
    }
}