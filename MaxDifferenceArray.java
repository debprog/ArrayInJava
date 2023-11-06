public class MaxDifferenceArray {
    static int findMaxDifference(int arr[]) {

        int len = arr.length;
        int minValue = arr[0]; // assume first is min
        int Max_difference = arr[1] - arr[0]; // assume max diff is 2nd-1st element

        for (int i = 1; i < len; i++) {
            Max_difference = Math.max(Max_difference, arr[i] - minValue); // new max is current - min
            minValue = Math.min(minValue, arr[i]);

        }
        return Max_difference;
    }

    public static void main(String[] args) {

        int a[] = { 2, 3, 10, 6, 4, 8, 1 };
        int a1[] = { 7, 9, 5, 6, 3, 2 };
        System.out.println(findMaxDifference(a1));
    }

}
