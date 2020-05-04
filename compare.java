package testasd;

public class compare {
    //...表示省略多个参数值
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v : values) {
            if (v > largest) largest = v;
        }
        return largest;
    }
}
