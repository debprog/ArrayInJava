public class EquilibriumPoint {
    static int findEquilibrium(int a[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        int l_sum = 0;
        for (int i = 0; i < n; i++) {
            if (l_sum == sum - a[i]) {
                return i + 1;
            }
            l_sum += a[i];
            sum -= a[i];
        }

        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 1, 3, 5, 2, 2 };

        int eq_pt = findEquilibrium(a, a.length);
        System.out.println(eq_pt);
    }
}
