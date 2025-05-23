public class Square {
    public static double area(double side) throws Exception{
        if (side < 0) {
            throw new IllegalArgumentException("Side must have a positive value");
        }
        return side * side;
    }
}