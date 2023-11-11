public class LongestSubarrayOddEven {
    static int findLongOddEven(int arr[]) {

        int prev_flag = arr[0] % 2 == 0 ? 1 : 0; // 0:even 1:odd
        int current_flag = 0, length = 1, high_length = 1;

        for (int i = 1; i <= arr.length - 1; i++) {
            current_flag = arr[i] % 2 == 0 ? 1 : 0;

            if (current_flag != prev_flag) {
                length++;
                high_length = Math.max(length, high_length);
            } else {
                length = 1;
            }
            prev_flag = current_flag;

        }
        return high_length;

    }

    public static void main(String[] args) {

        // int a[] = { 10, 12, 14, 7, 8 };
        // int a[] = { 7, 10, 13, 14 };
        int a[] = { 10, 12, 8, 4 };

        int y = findLongOddEven(a);

        System.out.println(y);

    }

}
