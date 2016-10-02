/**
 *
 */
public class NumberToWords {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 100000);
            System.out.println(n + " : " + toWords(n));
        }
    }

    private static String[] direct = {"zero", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thir", "four", "fif", "six", "seven",
            "eigh", "nine"};
    private static String[] tens = {"", "", "twen", "thir", "for", "fif", "six", "seven", "eigh",
            "nine"};


    public static String toWords(int num) {
        if (num < 0) {
            return "negative " + toWords(-num);
        }
        if (num < 13) {
            return direct[num];
        }
        if (num < 20) {
            return direct[num] + "teen";
        }
        if (num < 100) {
            int ten = num / 10;
            int one = num % 10;
            if (one != 0)
                return tens[ten] + "ty " + direct[one];
            else
                return tens[ten] + "ty";
        }
        if (num < 1000) {
            int hun = num / 100;
            int rem = num % 100;
            if (rem != 0)
                return direct[hun] + " hundred " + toWords(rem);
            else
                return direct[hun] + " hundred";
        }
        if (num < 1_00_000) {
            int tho = num / 1000;
            int rem = num % 1000;
            if (rem != 0)
                return toWords(tho) + " thousand " + toWords(rem);
            else
                return toWords(tho) + " thousand";
        }
        return "";
    }
}
