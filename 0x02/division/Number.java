public class Number{
    public static void todivide(int a, int b){
        int result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("It is not possible to divide by zero.");
        } finally {
            System.out.println(String.format("%d / %d = %d", a, b, result));;
        }
    }
}
