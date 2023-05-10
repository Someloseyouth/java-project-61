package hexlet.code;

public class Utils {
    static final int R_MIN = 1;
    static final int R_MAX = 99;

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int getMaxRandomNumber() {
        return getRandomNumber(R_MIN, R_MAX);
    }
}
