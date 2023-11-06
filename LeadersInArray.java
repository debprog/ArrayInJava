public class LeadersInArray {
    static void findLeaders(int arr[]) {
        int len = arr.length;
        int current_Leader = arr[len - 1];
        System.out.print(current_Leader + " ");
        for (int i = len - 2; i >= 0; i--) {

            if (arr[i] > current_Leader) {

                current_Leader = arr[i];
                System.out.print(current_Leader + " ");
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 30, 20, 10 };

        findLeaders(a);
    }
}
