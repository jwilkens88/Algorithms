/* *****************************************************************************
 *  Name:              Jacob Wilkens
 *  Coursera User ID:  jwilkens88
 *  Last modified:     March 30, 2024
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int count = 0;
        String selected = "";
        String current;
        while (!StdIn.isEmpty()) {
            count++;
            current = StdIn.readString();
            if (StdRandom.bernoulli((1.0 / count))) {
                selected = current;
            }
        }
        System.out.println(selected);
    }
}
