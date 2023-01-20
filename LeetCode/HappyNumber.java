import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class HappyNumber {

    public boolean isHappy(int n) {

        List<Integer> numList = new ArrayList();
        Set<Integer> numSet = new HashSet();

        //** LOGIC TO SEPARATE INT TO INDIVIDUAL DIGITS**//
        while (n > 0) {
            numList.add(n % 10);
            n = n / 10;
        }

        for (int num : numList) {
            int sum = 0;
            sum += num * num;
            numSet.add(sum);
        }

        return true;
    }
}