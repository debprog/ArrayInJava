public class MoveZeroesToEnd {

    static void swapElements(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
    }

    static void moveZero(int arr[]) {

        int index_Of_last_non_zero_element = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swapElements
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[index_Of_last_non_zero_element];
                arr[index_Of_last_non_zero_element] = temp;

                index_Of_last_non_zero_element++; /* eta 1 kore increase hobe becoz non zero gulo por por thakebe */
            }
        }

    }

    public static void main(String[] args) {
        int inputArray[] = { 10, 0, 20, 9, 0 };
        moveZero(inputArray);
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");

        }
    }
}
