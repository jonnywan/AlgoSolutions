/*
 * Given an integer, convert it to a roman numeral.

 * Input is guaranteed to be within the range from 1 to 3999.
 * I = 1;
 * V = 5;
 * X = 10;
 * L = 50;
 * C = 100;
 * D = 500;
 * M = 1000;
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] huns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thos = {"", "M", "MM", "MMM", "", "", "", "", "", ""};

        String result = "";
        result += thos[num / 1000];
        result += huns[num % 1000 / 100];
        result += tens[num % 100 / 10];
        result += ones[num % 10];
        return result;
    }

/****************************** updated 2014.01.19 ***************************/

    public String intToRoman(int num) {
        String[] roman = {"I", "X", "C", "M", "V", "L", "D"};
        int i = 0;
        String res = "";
        while(num > 0) {
            int low = num % 10;
            if(low >= 1 && low <= 3)
                for(int j = 0; j < low; j++)
                    res = roman[i] + res;
            if(low == 4)
                res = roman[i] + roman[i + 4] + res;
            if(low == 5)
                res = roman[i + 4] + res;
            if(low >= 6 && low <= 8) {
                for(int j = 0; j < low - 5; j++)
                    res = roman[i] + res;
                res = roman[i + 4] + res;
            }
            if(low == 9)
                res = roman[i] + roman[i + 1] + res;
            num /= 10;
            i++;
        }
        return res;
    }
}
