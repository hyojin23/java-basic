package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {

    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int num : values) {
            sum += num;
        }
        return sum;
    }

    public static int average(int[] values) {
        return sum(values) / values.length;
    }
}
