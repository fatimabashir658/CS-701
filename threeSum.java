import java.util.Arrays;

public class ThreeSum {

    public static int threeSum_counter(int[] a) {
        int count = 0;
        int n = a.length;
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] a = { 10, 20, 30, -10, -60, -20, -50, 40, 10, -30, 30 };
        int counter = threeSum_counter(a);
        System.out.println(counter);
    }
}
