import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:
// * Starting with any positive integer, replace the number by the sum of the squares of its digits.
// * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// * Those numbers for which this process ends in 1 are happy.

// Return true if n is a happy number, and false if not.

class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> numSet = new HashSet();

        while(n != 1 && !numSet.contains(n)) {
            numSet.add(n);
            n = nextNum(n);

        }
        return n == 1;
    }

    private int nextNum(int n) {
    //** LOGIC TO SEPARATE INT TO INDIVIDUAL DIGITS**//
        int sum = 0;
        while (n > 0) {
            int d = (n % 10);
            n = n / 10;
            sum += d * d;
        }
        return sum;
    }
}