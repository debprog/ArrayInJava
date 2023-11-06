public class LeftRotateArray {

    static void leftRotate(int arr[]) {

        int temp = arr[0];
        int l = arr.length;
        for (int i = 0; i <= l - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[l - 1] = temp;

    }

    public static void main(String[] args) {

        int inputArray[] = { 1, 2, 3, 4, 5 };

        leftRotate(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);

        }
    }

}
