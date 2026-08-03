import java.io.*;
import java.util.*;

public class Hashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> set = new HashSet<>(t);

        for (int i = 0; i < t; i++) {
            // create unique key for the pair
            String pair = pair_left[i] + " " + pair_right[i];
            set.add(pair);
            System.out.println(set.size());
        }
        s.close();
    }
}