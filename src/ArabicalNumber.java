public class ArabicalNumber {
    public static void arabCalc(String a, String b, String c) {
        try {
            int one = Integer.parseInt(a);
            char znak = b.charAt(0);
            int two = Integer.parseInt(c);
            if (one >= 11 || one < 1 || two >= 11 || two < 1) {
                throw new Exception("Не корректно введено число");
            }
            while (true) {
                switch (znak) {
                    case '+' -> System.out.println(one + two);
                    case '-' -> System.out.println(one - two);
                    case '/' -> System.out.println(one / two);
                    case '*' -> System.out.println(one * two);
                    default -> throw new Exception("Не корректно введен знак");
                }
                break;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
