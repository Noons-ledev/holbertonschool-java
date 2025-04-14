public class Character {
    public static boolean IsUpper(char c) {
        if ((int) c < 91 && (int) c >= 65)
            return true;
        else
            return false;
    }
}