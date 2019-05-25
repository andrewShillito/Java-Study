package main;

import java.util.HashMap;
import java.util.Map;

public class NumberToWords {

    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        } else {
            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(0, "Zero");
            map.put(1, "One");
            map.put(2, "Two");
            map.put(3, "Three");
            map.put(4, "Four");
            map.put(5, "Five");
            map.put(6, "Six");
            map.put(7, "Seven");
            map.put(8, "Eight");
            map.put(9, "Nine");

            String ans = "";
            int reversed = reverse(num);
            int length = getDigitCount(num);
            int reversedLength = getDigitCount(reversed);
            int digit;
            if (reversed < 0) {
                // for indexing correctly in map without adding neg keys
                reversed = Math.abs(reversed);
            }
            for (int i = 0; i < length; i++) {
                if (i >= reversedLength) {
                    ans = ans.concat(map.get(0) + " ");
                } else {
                    digit = reversed % 10;
                    reversed /= 10;
                    ans = ans.concat(map.get(digit) + " ");
                }
            }
            System.out.println(ans.trim());
        }
    }

    public static int reverse(int num){
        boolean isNegative = num < 0;
        int reversed = 0;
        num = Math.abs(num);
        while (num > 0) {
            reversed *= 10;
            reversed += num%10;
            num /= 10;
        }
        return isNegative ? reversed*-1 : reversed;
    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }
        return Integer.toString(num).length();
    }
}
