/* *****************************************************************************
 *  Name:              Jacob Wilkens
 *  Coursera User ID:  jwilkens88
 *  Last modified:     March 30, 2024
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        String nameOne = args[0];
        String nameTwo = args[1];
        System.out.printf("Hello %s and %s.%n", nameOne, nameTwo);
        System.out.printf("Goodbye %s and %s.%n", nameTwo, nameOne);
    }
}
