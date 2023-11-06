public class LeftRotateByD_Places {

    static void reverseArray(int low, int high, int arr[]) {

        while (low <= high) {
            // swap
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
    }

    static void rotateLeftByDPlaces(int d, int arr[]) {
        reverseArray(0, d - 1, arr);
        reverseArray(d, 4, arr);
        reverseArray(0, 4, arr);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int d = 2;
        rotateLeftByDPlaces(d, arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");

        }

    }

}
