import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] a = str.split(" ");

        switch (a[0]) {
            case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> RomanNumber.romanCalc(a[0], a[1], a[2]);
            default -> ArabicalNumber.arabCalc(a[0], a[1], a[2]);
        }
    }
}
