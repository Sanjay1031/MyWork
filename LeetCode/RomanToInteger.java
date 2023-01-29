import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> converter = new HashMap<>();
        converter.put('I', 1);
        converter.put('V', 5);
        converter.put('X', 10);
        converter.put('L', 50);
        converter.put('C', 100);
        converter.put('D', 500);
        converter.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            // Checks to see if previous character is smaller than the current character, if so we have to subtract.
            if (i > 0 && converter.get(s.charAt(i)) > converter.get(s.charAt(i -1))) {
                // Have to multiply the previous value by two because it has already been added to result.
                result += converter.get(s.charAt(i)) - 2 * (converter.get(s.charAt(i-1)));
            } else {
                result += converter.get(s.charAt(i));
            }
        }

        return result;
    }
}
