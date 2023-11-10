public class SubarrayMaxSum {
    static int findMaxSubarray(int arr[], int sum) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;

    }

    public static void main(String[] args) {
        int a[] = { -3, 8, -2, 4, -5, 6 };

        int b = findMaxSubarray(a, 0);
        System.out.println(b);
    }

}
