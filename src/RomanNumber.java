public class RomanNumber {
    public static void romanCalc(String a, String b, String c) {

        char znak = b.charAt(0);
        int one;
        int two;
        int result;

        switch (a) {
            case "I" -> one = 1;
            case "II" -> one = 2;
            case "III" -> one = 3;
            case "IV" -> one = 4;
            case "V" -> one = 5;
            case "VI" -> one = 6;
            case "VII" -> one = 7;
            case "VIII" -> one = 8;
            case "IX" -> one = 9;
            case "X" -> one = 10;
            default -> throw new IllegalStateException("Не корректно введено число");
        }

        switch (c) {
            case "I" -> two = 1;
            case "II" -> two = 2;
            case "III" -> two = 3;
            case "IV" -> two = 4;
            case "V" -> two = 5;
            case "VI" -> two = 6;
            case "VII" -> two = 7;
            case "VIII" -> two = 8;
            case "IX" -> two = 9;
            case "X" -> two = 10;
            default -> throw new IllegalStateException("Не корректно введено число");
        }

        while (true) {
            switch (znak) {
                case '+' -> result = (one + two);
                case '-' -> result = (one - two);
                case '/' -> result = (one / two);
                case '*' -> result = (one * two);
                default -> throw new IllegalStateException("Не корректно введен знак");
            }
            break;
        }
        System.out.println(IntegerToRomanNumeral(result));

    }

    public static String IntegerToRomanNumeral(int input) {
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}
