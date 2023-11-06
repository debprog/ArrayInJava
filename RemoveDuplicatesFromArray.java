import java.util.HashSet;

class RemoveDuplicatesFromJava {

    static int[] removeDuplicates(int arr[]) {

        int uniqueIndex__Recent_element = 1; // zero index a toh unique e ache

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[uniqueIndex__Recent_element - 1]) {
                arr[uniqueIndex__Recent_element] = arr[i];
                uniqueIndex__Recent_element++;
            }

        }
        System.out.println("uniqueIndex__Recent_element : " + uniqueIndex__Recent_element);
        return arr;

    }

    public static void main(String args[]) {
        int a[] = { 40, 40, 50, 50, 50, 100 };

        int[] resultarr = removeDuplicates(a);
        for (int i = 0; i < resultarr.length; i++) {
            System.out.print(resultarr[i] + "  ");
        }
    }
}