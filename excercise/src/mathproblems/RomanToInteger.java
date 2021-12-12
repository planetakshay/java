package mathproblems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prev = map.get(s.charAt(0));

        for(int i=0; i < s.length(); i++) {
            total += map.get(s.charAt(i));
            if(prev < map.get(s.charAt(i))) {
                total = total - 2 * prev;
            }
            prev = map.get(s.charAt(i));
        }
        return total;
    }

    public static void main(String[] args){
        String[] romanNumbers = new String[]{"MCMXCIV","LVIII","I","IV","VI","XII","XL","XC"};
        for(String number: romanNumbers){
            System.out.println(romanToInt(number));
        }
    }

}
