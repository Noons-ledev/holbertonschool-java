import java.util.Locale;
public class PrintFormattingNumbers {
    public static void main(String[] args) {
        float tax = 0.2456f;
        float value = 7654.321f;
        Locale.setDefault(Locale.US);
        System.out.printf("Value: $%,.2f%n", value);
        System.out.printf("Tax: %.2f%%%n", tax);
    }
}